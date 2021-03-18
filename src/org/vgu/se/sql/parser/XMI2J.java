/**************************************************************************
Copyright 2019 Vietnamese-German-University

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

@author: ngpbh
***************************************************************************/


package org.vgu.se.sql.parser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.sf.jsqlparser.expression.Alias;
import net.sf.jsqlparser.expression.BinaryExpression;
import net.sf.jsqlparser.expression.CaseExpression;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.Function;
import net.sf.jsqlparser.expression.LongValue;
import net.sf.jsqlparser.expression.NullValue;
import net.sf.jsqlparser.expression.StringValue;
import net.sf.jsqlparser.expression.WhenClause;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.expression.operators.conditional.OrExpression;
import net.sf.jsqlparser.expression.operators.relational.ComparisonOperator;
import net.sf.jsqlparser.expression.operators.relational.EqualsTo;
import net.sf.jsqlparser.expression.operators.relational.ExpressionList;
import net.sf.jsqlparser.expression.operators.relational.GreaterThan;
import net.sf.jsqlparser.expression.operators.relational.GreaterThanEquals;
import net.sf.jsqlparser.expression.operators.relational.IsNullExpression;
import net.sf.jsqlparser.expression.operators.relational.MinorThan;
import net.sf.jsqlparser.expression.operators.relational.MinorThanEquals;
import net.sf.jsqlparser.expression.operators.relational.NotEqualsTo;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.select.AllColumns;
import net.sf.jsqlparser.statement.select.Distinct;
import net.sf.jsqlparser.statement.select.FromItem;
import net.sf.jsqlparser.statement.select.GroupByElement;
import net.sf.jsqlparser.statement.select.Join;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectBody;
import net.sf.jsqlparser.statement.select.SelectExpressionItem;
import net.sf.jsqlparser.statement.select.SelectItem;
import net.sf.jsqlparser.statement.select.SubSelect;
import sql.SqlFactory;

public class XMI2J {
    private static SqlFactory factory = SqlFactory.eINSTANCE;
    
    private static sql.Select transformSelect(Select select) {
        if (select == null)
            return null;
        sql.Select selectXMI = factory.createSelect();
        selectXMI.setSelectBody(transformSelectBody(select.getSelectBody()));
        return selectXMI;
    }

    private static sql.SelectBody transformSelectBody(SelectBody selectBody) {
        if (selectBody == null)
            return null;
        sql.PlainSelect plainSelectXMI = transformPlainSelect(
            (PlainSelect) selectBody);
        return plainSelectXMI;
    }

    private static sql.PlainSelect transformPlainSelect(PlainSelect plainSelect) {
        if (plainSelect == null)
            return null;
        sql.PlainSelect plainSelectXMI = factory.createPlainSelect();
        plainSelectXMI
            .setDistinct(transformDistinct(plainSelect.getDistinct()));
        plainSelectXMI.getSelectItems()
            .addAll(transformSelectItems(plainSelect.getSelectItems()));
        plainSelectXMI.getJoins()
            .addAll(transformJoins(plainSelect.getJoins()));
        plainSelectXMI
            .setFromItem(transformFromItem(plainSelect.getFromItem()));
        plainSelectXMI.setWhere(transformExpression(plainSelect.getWhere()));
        plainSelectXMI
            .setGroupBy(transformGroupByElement(plainSelect.getGroupBy()));
        plainSelectXMI.setHaving(transformExpression(plainSelect.getHaving()));
        return plainSelectXMI;
    }

    private static sql.GroupByElement transformGroupByElement(
        GroupByElement groupBy) {
        if (groupBy == null)
            return null;
        sql.GroupByElement groupByElementXMI = factory.createGroupByElement();
        groupByElementXMI.getGroupByExpressions()
            .addAll(transformExpressions(groupBy.getGroupByExpressions()));
        return groupByElementXMI;
    }

    private static Collection<? extends sql.Join> transformJoins(
        List<Join> joins) {
        List<sql.Join> joinsXMI = new ArrayList<sql.Join>();
        if(joins != null) {
            for (Join join : joins) {
            	sql.Join joinXMI = transformJoin(join);
                joinsXMI.add(joinXMI);
            }
        }
        return joinsXMI;
    }

    private static sql.Join transformJoin(Join join) {
        if (join == null)
            return null;
        sql.Join joinXMI = factory.createJoin();
        joinXMI.setOuter(join.isOuter());
        joinXMI.setRight(join.isRight());
        joinXMI.setLeft(join.isLeft());
        joinXMI.setNatural(join.isNatural());
        joinXMI.setFull(join.isFull());
        joinXMI.setInner(join.isInner());
        joinXMI.setSimple(join.isSimple());
        joinXMI.setCross(join.isCross());
        joinXMI.setSemi(join.isSemi());
        joinXMI.setRightItem(transformFromItem(join.getRightItem()));
        joinXMI.setOnExpression(transformExpression(join.getOnExpression()));
        return joinXMI;
    }

    private static sql.FromItem transformFromItem(FromItem fromItem) {
        if (fromItem == null)
            return null;
        if (fromItem instanceof Table) {
            return transformTable((Table) fromItem);
        } else {
            return transformSubSelect((SubSelect) fromItem);
        }
    }

    private static Collection<? extends sql.SelectItem> transformSelectItems(
        List<SelectItem> selectItems) {
        List<sql.SelectItem> selectItemsXMI = new ArrayList<sql.SelectItem>();
        if(selectItems != null) { 
            for (SelectItem selectItem : selectItems) {
            	sql.SelectItem selectItemXMI = transformSelectItem(selectItem);
                selectItemsXMI.add(selectItemXMI);
            }
        }
        return selectItemsXMI;
    }

    private static sql.SelectItem transformSelectItem(SelectItem selectItem) {
        if (selectItem == null)
            return null;
        if (selectItem instanceof AllColumns) {
            return transformAllColumns((AllColumns) selectItem);
        } else {
            return transformSelectExpressionItem(
                (SelectExpressionItem) selectItem);
        }
    }

    private static sql.AllColumns transformAllColumns(AllColumns allColumns) {
        if (allColumns == null)
            return null;
        return factory.createAllColumns();
    }

    private static sql.SelectItem transformSelectExpressionItem(
        SelectExpressionItem selectExpressionItem) {
        if (selectExpressionItem == null)
            return null;
        sql.SelectExpressionItem selectExpressionItemXMI = factory
            .createSelectExpressionItem();
        selectExpressionItemXMI
            .setAlias(transformAlias(selectExpressionItem.getAlias()));
        selectExpressionItemXMI.setExpression(
            transformExpression(selectExpressionItem.getExpression()));
        return selectExpressionItemXMI;
    }

    private static sql.Expression transformExpression(Expression expression) {
        if (expression == null)
            return null;
        if (expression instanceof StringValue) {
            return transformStringValue((StringValue) expression);
        } else if (expression instanceof LongValue) {
            return transformLongValue((LongValue) expression);
        } else if (expression instanceof BinaryExpression) {
            return transformBinaryExpression((BinaryExpression) expression);
        } else if (expression instanceof SubSelect) {
            return transformSubSelect((SubSelect) expression);
        } else if (expression instanceof NullValue) {
            return transformNullValue((NullValue) expression);
        } else if (expression instanceof IsNullExpression) {
            return transformIsNullExpression((IsNullExpression) expression);
        } else if (expression instanceof Function) {
            return transformFunction((Function) expression);
        } else if (expression instanceof Column) {
            return transformColumn((Column) expression);
        } else if (expression instanceof CaseExpression) {
            return transformCaseExpression((CaseExpression) expression);
        } else {
            return transformWhenClause((WhenClause) expression);
        }
    }

    private static sql.CaseExpression transformCaseExpression(
        CaseExpression caseExpression) {
        if (caseExpression == null)
            return null;
        sql.CaseExpression caseExpressionXMI = factory.createCaseExpression();
        caseExpressionXMI.setSwitchExpression(
            transformExpression(caseExpression.getSwitchExpression()));
        caseExpressionXMI.setElseExpression(
            transformExpression(caseExpression.getElseExpression()));
        caseExpressionXMI.getWhenClauses()
            .addAll(transformWhenClauses(caseExpression.getWhenClauses()));
        return caseExpressionXMI;
    }

    private static Collection<? extends sql.WhenClause> transformWhenClauses(
        List<WhenClause> whenClauses) {
        List<sql.WhenClause> whenClausesXMI = new ArrayList<sql.WhenClause>();
        if(whenClauses != null) {
            for (WhenClause whenClause : whenClauses) {
            	sql.WhenClause whenClauseXMI = transformWhenClause(whenClause);
                whenClausesXMI.add(whenClauseXMI);
            }
        }
        return whenClausesXMI;
    }

    private static sql.WhenClause transformWhenClause(WhenClause whenClause) {
        if (whenClause == null)
            return null;
        sql.WhenClause whenClauseXMI = factory.createWhenClause();
        whenClauseXMI.setWhenExpression(
            transformExpression(whenClause.getWhenExpression()));
        whenClauseXMI.setThenExpression(
            transformExpression(whenClause.getThenExpression()));
        return whenClauseXMI;
    }

    private static sql.Column transformColumn(Column column) {
        if (column == null)
            return null;
        sql.Column columnXMI = factory.createColumn();
        columnXMI.setColumnName(column.getColumnName());
        columnXMI.setTable(transformTable(column.getTable()));
        return columnXMI;
    }

    private static sql.Table transformTable(Table table) {
        if (table == null)
            return null;
        sql.Table tableXMI = factory.createTable();
        tableXMI.setAlias(transformAlias(table.getAlias()));
        tableXMI.setName(table.getName());
        return tableXMI;
    }

    private static sql.Function transformFunction(Function function) {
        if (function == null)
            return null;
        sql.Function functionXMI = factory.createFunction();
        functionXMI.setAllColumns(function.isAllColumns());
        functionXMI.setDistinct(function.isDistinct());
        functionXMI.setName(function.getName());
        functionXMI
            .setParameters(transformExpressionList(function.getParameters()));
        return functionXMI;
    }

    private static sql.ExpressionList transformExpressionList(
        ExpressionList expressionList) {
        if (expressionList == null)
            return null;
        sql.ExpressionList expressionListXMI = factory.createExpressionList();
        expressionListXMI.getExpressions()
            .addAll(transformExpressions(expressionList.getExpressions()));
        return expressionListXMI;
    }

    private static Collection<? extends sql.Expression> transformExpressions(
        List<Expression> expressions) {
        List<sql.Expression> expressionsXMI = new ArrayList<sql.Expression>();
        if(expressions != null) {    
            for (Expression expression : expressions) {
            	sql.Expression expressionXMI = transformExpression(expression);
                expressionsXMI.add(expressionXMI);
            }
        }
        return expressionsXMI;
    }

    private static sql.IsNullExpression transformIsNullExpression(
        IsNullExpression isNullExpression) {
        if (isNullExpression == null)
            return null;
        sql.IsNullExpression isNullExpressionXMI = factory
            .createIsNullExpression();
        isNullExpressionXMI.setLeftExpression(
            transformExpression(isNullExpression.getLeftExpression()));
        isNullExpressionXMI.setNot(isNullExpression.isNot());
        return isNullExpressionXMI;
    }

    private static sql.NullValue transformNullValue(NullValue nullValue) {
        if (nullValue == null)
            return null;
        return factory.createNullValue();
    }

    private static sql.SubSelect transformSubSelect(SubSelect subSelect) {
        if (subSelect == null)
            return null;
        sql.SubSelect subSelectXMI = factory.createSubSelect();
        subSelectXMI.setAlias(transformAlias(subSelect.getAlias()));
        subSelectXMI
            .setSelectBody(transformSelectBody(subSelect.getSelectBody()));
        return subSelectXMI;
    }

    private static sql.ComparisonOperator transformComparisonOperator(
        ComparisonOperator comparisonOperator) {
        if (comparisonOperator == null)
            return null;
        if (comparisonOperator instanceof EqualsTo) {
            return transformEqualsTo((EqualsTo) comparisonOperator);
        } else if (comparisonOperator instanceof GreaterThan) {
            return transformGreaterThan((GreaterThan) comparisonOperator);
        } else if (comparisonOperator instanceof GreaterThanEquals) {
            return transformGreateThanEquals(
                (GreaterThanEquals) comparisonOperator);
        } else if (comparisonOperator instanceof MinorThan) {
            return transformMinorThan((MinorThan) comparisonOperator);
        } else if (comparisonOperator instanceof MinorThanEquals) {
            return transformMinorThanEquals(
                (MinorThanEquals) comparisonOperator);
        } else {
            return transformNotEqualsTo((NotEqualsTo) comparisonOperator);
        }
    }

    private static sql.NotEqualsTo transformNotEqualsTo(NotEqualsTo notEqualsTo) {
        if (notEqualsTo == null)
            return null;
        sql.NotEqualsTo notEqualsToXMI = factory.createNotEqualsTo();
        notEqualsToXMI.setLeftExpression(
            transformExpression(notEqualsTo.getLeftExpression()));
        notEqualsToXMI.setRightExpression(
            transformExpression(notEqualsTo.getRightExpression()));
        return notEqualsToXMI;
    }

    private static sql.MinorThanEquals transformMinorThanEquals(
        MinorThanEquals minorThanEquals) {
        if (minorThanEquals == null)
            return null;
        sql.MinorThanEquals minorThanEqualsXMI = factory.createMinorThanEquals();
        minorThanEqualsXMI.setLeftExpression(
            transformExpression(minorThanEquals.getLeftExpression()));
        minorThanEqualsXMI.setRightExpression(
            transformExpression(minorThanEquals.getRightExpression()));
        return minorThanEqualsXMI;
    }

    private static sql.MinorThan transformMinorThan(MinorThan minorThan) {
        if (minorThan == null)
            return null;
        sql.MinorThan minorThanXMI = factory.createMinorThan();
        minorThanXMI.setLeftExpression(
            transformExpression(minorThan.getLeftExpression()));
        minorThanXMI.setRightExpression(
            transformExpression(minorThan.getRightExpression()));
        return minorThanXMI;
    }

    private static sql.GreaterThanEquals transformGreateThanEquals(
        GreaterThanEquals greaterThanEquals) {
        if (greaterThanEquals == null)
            return null;
        sql.GreaterThanEquals greaterThanEqualsXMI = factory
            .createGreaterThanEquals();
        greaterThanEqualsXMI.setLeftExpression(
            transformExpression(greaterThanEquals.getLeftExpression()));
        greaterThanEqualsXMI.setRightExpression(
            transformExpression(greaterThanEquals.getRightExpression()));
        return greaterThanEqualsXMI;
    }

    private static sql.GreaterThan transformGreaterThan(GreaterThan greaterThan) {
        if (greaterThan == null)
            return null;
        sql.GreaterThan greaterThanXMI = factory.createGreaterThan();
        greaterThanXMI.setLeftExpression(
            transformExpression(greaterThan.getLeftExpression()));
        greaterThanXMI.setRightExpression(
            transformExpression(greaterThan.getRightExpression()));
        return greaterThanXMI;
    }

    private static sql.EqualsTo transformEqualsTo(EqualsTo equalsTo) {
        if (equalsTo == null)
            return null;
        sql.EqualsTo equalsToXMI = factory.createEqualsTo();
        equalsToXMI.setLeftExpression(
            transformExpression(equalsTo.getLeftExpression()));
        equalsToXMI.setRightExpression(
            transformExpression(equalsTo.getRightExpression()));
        return equalsToXMI;
    }

    private static sql.BinaryExpression transformBinaryExpression(
        BinaryExpression binaryExpression) {
        if (binaryExpression == null)
            return null;
        if (binaryExpression instanceof AndExpression) {
            return transformAndExpression((AndExpression) binaryExpression);
        } else if (binaryExpression instanceof ComparisonOperator) {
            return transformComparisonOperator(
                (ComparisonOperator) binaryExpression);
        } else {
            return transformOrExpression((OrExpression) binaryExpression);
        }
    }

    private static sql.OrExpression transformOrExpression(
        OrExpression orExpression) {
        if (orExpression == null)
            return null;
        sql.OrExpression orExpressionXMI = factory.createOrExpression();
        orExpressionXMI.setLeftExpression(
            transformExpression(orExpression.getLeftExpression()));
        orExpressionXMI.setRightExpression(
            transformExpression(orExpression.getRightExpression()));
        return orExpressionXMI;
    }

    private static sql.AndExpression transformAndExpression(
        AndExpression andExpression) {
        if (andExpression == null)
            return null;
        sql.AndExpression andExpressionXMI = factory.createAndExpression();
        andExpressionXMI.setLeftExpression(
            transformExpression(andExpression.getLeftExpression()));
        andExpressionXMI.setRightExpression(
            transformExpression(andExpression.getRightExpression()));
        return andExpressionXMI;
    }

    private static sql.StringValue transformStringValue(StringValue stringValue) {
        if (stringValue == null)
            return null;
        sql.StringValue stringValueXMI = factory.createStringValue();
        stringValueXMI.setValue(stringValue.getValue());
        return stringValueXMI;
    }

    private static sql.LongValue transformLongValue(LongValue longValue) {
        if (longValue == null)
            return null;
        sql.LongValue longValueXMI = factory.createLongValue();
        longValueXMI.setValue(longValue.getValue());
        return longValueXMI;
    }

    private static sql.Alias transformAlias(Alias alias) {
        if (alias == null)
            return null;
        sql.Alias aliasXMI = factory.createAlias();
        aliasXMI.setName(alias.getName());
        return aliasXMI;
    }

    private static sql.Distinct transformDistinct(Distinct distinct) {
        if (distinct == null)
            return null;
        sql.Distinct distinctXMI = factory.createDistinct();
        distinctXMI.setUseUnique(distinct.isUseUnique());
        distinctXMI.getOnSelectItems()
            .addAll(transformSelectItems(distinct.getOnSelectItems()));
        return distinctXMI;
    }

    public static sql.Statement transform(Statement statement) {
        if (statement == null)
            return null;
        sql.Select selectXMI = transformSelect((Select) statement);
        return selectXMI;
    }
}
