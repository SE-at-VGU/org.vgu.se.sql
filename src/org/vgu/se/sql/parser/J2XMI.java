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

public class J2XMI {

    public static net.sf.jsqlparser.statement.Statement transform(sql.Statement statementXMI) {
        if (statementXMI == null)
            return null;
        Select select = transformSelect((sql.Select) statementXMI);
        return select;
    }

    private static Select transformSelect(sql.Select selectXMI) {
        if (selectXMI == null)
            return null;
        Select select = new Select();
        select.setSelectBody(transformSelectBody(selectXMI.getSelectBody()));
        return select;
    }

    private static SelectBody transformSelectBody(sql.SelectBody selectBodyXMI) {
        if (selectBodyXMI == null)
            return null;
        PlainSelect plainSelect = transformPlainSelect(
            (sql.PlainSelect) selectBodyXMI);
        return plainSelect;
    }

    private static PlainSelect transformPlainSelect(
    		sql.PlainSelect plainSelectXMI) {
        if (plainSelectXMI == null)
            return null;
        PlainSelect plainSelect = new PlainSelect();
        plainSelect
            .setDistinct(transformDistinct(plainSelectXMI.getDistinct()));
        plainSelect.setSelectItems(transformSelectItems(plainSelectXMI.getSelectItems()));
        plainSelect.setJoins(transformJoins(plainSelectXMI.getJoins()));
        plainSelect
            .setFromItem(transformFromItem(plainSelectXMI.getFromItem()));
        plainSelect.setWhere(transformExpression(plainSelectXMI.getWhere()));
        plainSelect.setGroupByElement(
            transformGroupByElement(plainSelectXMI.getGroupBy()));
        plainSelect.setHaving(transformExpression(plainSelectXMI.getHaving()));
        return plainSelect;
    }

    private static GroupByElement transformGroupByElement(
    		sql.GroupByElement groupByXMI) {
        if (groupByXMI == null)
            return null;
        GroupByElement groupByElement = new GroupByElement();
        groupByElement.setGroupByExpressions(transformExpressions(groupByXMI.getGroupByExpressions()));
        return groupByElement;
    }

    private static List<Join> transformJoins(
        List<sql.Join> joinsXMI) {
        List<Join> joins = new ArrayList<Join>();
        for (sql.Join joinXMI : joinsXMI) {
            Join join = transformJoin(joinXMI);
            joins.add(join);
        }
        return joins;
    }

    private static Join transformJoin(sql.Join joinXMI) {
        if (joinXMI == null)
            return null;
        Join join = new Join();
        join.setOuter(joinXMI.isOuter());
        join.setRight(joinXMI.isRight());
        join.setLeft(joinXMI.isLeft());
        join.setNatural(joinXMI.isNatural());
        join.setFull(joinXMI.isFull());
        join.setInner(joinXMI.isInner());
        join.setSimple(joinXMI.isSimple());
        join.setCross(joinXMI.isCross());
        join.setSemi(joinXMI.isSemi());
        join.setRightItem(transformFromItem(joinXMI.getRightItem()));
        join.setOnExpression(transformExpression(joinXMI.getOnExpression()));
        return join;
    }

    private static FromItem transformFromItem(sql.FromItem fromItemXMI) {
        if (fromItemXMI == null)
            return null;
        if (fromItemXMI instanceof sql.Table) {
            return transformTable((sql.Table) fromItemXMI);
        } else {
            return transformSubSelect((sql.SubSelect) fromItemXMI);
        }
    }

    private static List<SelectItem> transformSelectItems(
        List<sql.SelectItem> selectItemsXMI) {
        List<SelectItem> selectItems = new ArrayList<SelectItem>();
        for (sql.SelectItem selectItemXMI : selectItemsXMI) {
            SelectItem selectItem = transformSelectItem(selectItemXMI);
            selectItems.add(selectItem);
        }
        return selectItems;
    }

    private static SelectItem transformSelectItem(sql.SelectItem selectItemXMI) {
        if (selectItemXMI == null)
            return null;
        if (selectItemXMI instanceof sql.AllColumns) {
            return transformAllColumns((sql.AllColumns) selectItemXMI);
        } else {
            return transformSelectExpressionItem(
                (sql.SelectExpressionItem) selectItemXMI);
        }
    }

    private static AllColumns transformAllColumns(sql.AllColumns allColumnsXMI) {
        if (allColumnsXMI == null)
            return null;
        return new AllColumns();
    }

    private static SelectItem transformSelectExpressionItem(
    		sql.SelectExpressionItem selectExpressionItemXMI) {
        if (selectExpressionItemXMI == null)
            return null;
        SelectExpressionItem selectExpressionItem = new SelectExpressionItem();
        selectExpressionItem
            .setAlias(transformAlias(selectExpressionItemXMI.getAlias()));
        selectExpressionItem.setExpression(
            transformExpression(selectExpressionItemXMI.getExpression()));
        return selectExpressionItem;
    }

    private static Expression transformExpression(sql.Expression expressionXMI) {
        if (expressionXMI == null)
            return null;
        if (expressionXMI instanceof sql.StringValue) {
            return transformStringValue((sql.StringValue) expressionXMI);
        } else if (expressionXMI instanceof sql.LongValue) {
            return transformLongValue((sql.LongValue) expressionXMI);
        } else if (expressionXMI instanceof sql.BinaryExpression) {
            return transformBinaryExpression((sql.BinaryExpression) expressionXMI);
        } else if (expressionXMI instanceof sql.SubSelect) {
            return transformSubSelect((sql.SubSelect) expressionXMI);
        } else if (expressionXMI instanceof sql.NullValue) {
            return transformNullValue((sql.NullValue) expressionXMI);
        } else if (expressionXMI instanceof sql.IsNullExpression) {
            return transformIsNullExpression((sql.IsNullExpression) expressionXMI);
        } else if (expressionXMI instanceof sql.Function) {
            return transformFunction((sql.Function) expressionXMI);
        } else if (expressionXMI instanceof sql.Column) {
            return transformColumn((sql.Column) expressionXMI);
        } else if (expressionXMI instanceof sql.CaseExpression) {
            return transformCaseExpression((sql.CaseExpression) expressionXMI);
        } else {
            return transformWhenClause((sql.WhenClause) expressionXMI);
        }
    }

    private static CaseExpression transformCaseExpression(
    		sql.CaseExpression caseExpressionXMI) {
        if (caseExpressionXMI == null)
            return null;
        CaseExpression caseExpression = new CaseExpression();
        caseExpression.setSwitchExpression(
            transformExpression(caseExpressionXMI.getSwitchExpression()));
        caseExpression.setElseExpression(
            transformExpression(caseExpressionXMI.getElseExpression()));
        caseExpression.setWhenClauses(transformWhenClauses(caseExpressionXMI.getWhenClauses()));
        return caseExpression;
    }

    private static List<WhenClause> transformWhenClauses(
        List<sql.WhenClause> whenClausesXMI) {
        List<WhenClause> whenClauses = new ArrayList<WhenClause>();
        for (sql.WhenClause whenClauseXMI : whenClausesXMI) {
            WhenClause whenClause = transformWhenClause(whenClauseXMI);
            whenClauses.add(whenClause);
        }
        return whenClauses;
    }

    private static WhenClause transformWhenClause(sql.WhenClause whenClauseXMI) {
        if (whenClauseXMI == null)
            return null;
        WhenClause whenClause = new WhenClause();
        whenClause.setWhenExpression(
            transformExpression(whenClauseXMI.getWhenExpression()));
        whenClause.setThenExpression(
            transformExpression(whenClauseXMI.getThenExpression()));
        return whenClause;
    }

    private static Column transformColumn(sql.Column columnXMI) {
        if (columnXMI == null)
            return null;
        Column column = new Column();
        column.setColumnName(columnXMI.getColumnName());
        column.setTable(transformTable(columnXMI.getTable()));
        return column;
    }

    private static Table transformTable(sql.Table tableXMI) {
        if (tableXMI == null)
            return null;
        Table table = new Table();
        table.setAlias(transformAlias(tableXMI.getAlias()));
        table.setName(tableXMI.getName());
        return table;
    }

    private static Function transformFunction(sql.Function functionXMI) {
        if (functionXMI == null)
            return null;
        Function function = new Function();
        function.setAllColumns(functionXMI.isAllColumns());
        function.setDistinct(functionXMI.isDistinct());
        function.setName(functionXMI.getName());
        function.setParameters(
            transformExpressionList(functionXMI.getParameters()));
        return function;
    }

    private static ExpressionList transformExpressionList(
    		sql.ExpressionList expressionListXMI) {
        if (expressionListXMI == null)
            return null;
        ExpressionList expressionList = new ExpressionList();
        expressionList.setExpressions(transformExpressions(expressionListXMI.getExpressions()));
        return expressionList;
    }

    private static List<Expression> transformExpressions(
        List<sql.Expression> expressionsXMI) {
        List<Expression> expressions = new ArrayList<Expression>();
        for (sql.Expression expressionXMI : expressionsXMI) {
            Expression expression = transformExpression(expressionXMI);
            expressions.add(expression);
        }
        return expressions;
    }

    private static IsNullExpression transformIsNullExpression(
    		sql.IsNullExpression isNullExpressionXMI) {
        if (isNullExpressionXMI == null)
            return null;
        IsNullExpression isNullExpression = new IsNullExpression();
        isNullExpression.setLeftExpression(
            transformExpression(isNullExpressionXMI.getLeftExpression()));
        isNullExpression.setNot(isNullExpressionXMI.isNot());
        return isNullExpression;
    }

    private static NullValue transformNullValue(sql.NullValue nullValueXMI) {
        if (nullValueXMI == null)
            return null;
        return new NullValue();
    }

    private static SubSelect transformSubSelect(sql.SubSelect subSelectXMI) {
        if (subSelectXMI == null)
            return null;
        SubSelect subSelect = new SubSelect();
        subSelect.setAlias(transformAlias(subSelectXMI.getAlias()));
        subSelect
            .setSelectBody(transformSelectBody(subSelectXMI.getSelectBody()));
        return subSelect;
    }

    private static ComparisonOperator transformComparisonOperator(
    		sql.ComparisonOperator comparisonOperatorXMI) {
        if (comparisonOperatorXMI == null)
            return null;
        if (comparisonOperatorXMI instanceof sql.EqualsTo) {
            return transformEqualsTo((sql.EqualsTo) comparisonOperatorXMI);
        } else if (comparisonOperatorXMI instanceof sql.GreaterThan) {
            return transformGreaterThan((sql.GreaterThan) comparisonOperatorXMI);
        } else if (comparisonOperatorXMI instanceof sql.GreaterThanEquals) {
            return transformGreateThanEquals(
                (sql.GreaterThanEquals) comparisonOperatorXMI);
        } else if (comparisonOperatorXMI instanceof sql.MinorThan) {
            return transformMinorThan((sql.MinorThan) comparisonOperatorXMI);
        } else if (comparisonOperatorXMI instanceof sql.MinorThanEquals) {
            return transformMinorThanEquals(
                (sql.MinorThanEquals) comparisonOperatorXMI);
        } else {
            return transformNotEqualsTo((sql.NotEqualsTo) comparisonOperatorXMI);
        }
    }

    private static NotEqualsTo transformNotEqualsTo(
    		sql.NotEqualsTo notEqualsToXMI) {
        if (notEqualsToXMI == null)
            return null;
        NotEqualsTo notEqualsTo = new NotEqualsTo();
        notEqualsTo.setLeftExpression(
            transformExpression(notEqualsToXMI.getLeftExpression()));
        notEqualsTo.setRightExpression(
            transformExpression(notEqualsToXMI.getRightExpression()));
        return notEqualsTo;
    }

    private static MinorThanEquals transformMinorThanEquals(
    		sql.MinorThanEquals minorThanEqualsXMI) {
        if (minorThanEqualsXMI == null)
            return null;
        MinorThanEquals minorThanEquals = new MinorThanEquals();
        minorThanEquals.setLeftExpression(
            transformExpression(minorThanEqualsXMI.getLeftExpression()));
        minorThanEquals.setRightExpression(
            transformExpression(minorThanEqualsXMI.getRightExpression()));
        return minorThanEquals;
    }

    private static MinorThan transformMinorThan(sql.MinorThan minorThanXMI) {
        if (minorThanXMI == null)
            return null;
        MinorThan minorThan = new MinorThan();
        minorThan.setLeftExpression(
            transformExpression(minorThanXMI.getLeftExpression()));
        minorThan.setRightExpression(
            transformExpression(minorThanXMI.getRightExpression()));
        return minorThan;
    }

    private static GreaterThanEquals transformGreateThanEquals(
    		sql.GreaterThanEquals greaterThanEqualsXMI) {
        if (greaterThanEqualsXMI == null)
            return null;
        GreaterThanEquals greaterThanEquals = new GreaterThanEquals();
        greaterThanEquals.setLeftExpression(
            transformExpression(greaterThanEqualsXMI.getLeftExpression()));
        greaterThanEquals.setRightExpression(
            transformExpression(greaterThanEqualsXMI.getRightExpression()));
        return greaterThanEquals;
    }

    private static GreaterThan transformGreaterThan(
    		sql.GreaterThan greaterThanXMI) {
        if (greaterThanXMI == null)
            return null;
        GreaterThan greaterThan = new GreaterThan();
        greaterThan.setLeftExpression(
            transformExpression(greaterThanXMI.getLeftExpression()));
        greaterThan.setRightExpression(
            transformExpression(greaterThanXMI.getRightExpression()));
        return greaterThan;
    }

    private static EqualsTo transformEqualsTo(sql.EqualsTo equalsToXMI) {
        if (equalsToXMI == null)
            return null;
        EqualsTo equalsTo = new EqualsTo();
        equalsTo.setLeftExpression(
            transformExpression(equalsToXMI.getLeftExpression()));
        equalsTo.setRightExpression(
            transformExpression(equalsToXMI.getRightExpression()));
        return equalsTo;
    }

    private static BinaryExpression transformBinaryExpression(
    		sql.BinaryExpression binaryExpressionXMI) {
        if (binaryExpressionXMI == null)
            return null;
        if (binaryExpressionXMI instanceof sql.AndExpression) {
            return transformAndExpression((sql.AndExpression) binaryExpressionXMI);
        } else if (binaryExpressionXMI instanceof sql.ComparisonOperator) {
            return transformComparisonOperator(
                (sql.ComparisonOperator) binaryExpressionXMI);
        } else {
            return transformOrExpression((sql.OrExpression) binaryExpressionXMI);
        }
    }

    private static OrExpression transformOrExpression(
    		sql.OrExpression orExpressionXMI) {
        if (orExpressionXMI == null)
            return null;
        OrExpression orExpression = new OrExpression(null, null);
        orExpression.setLeftExpression(
            transformExpression(orExpressionXMI.getLeftExpression()));
        orExpression.setRightExpression(
            transformExpression(orExpressionXMI.getRightExpression()));
        return orExpression;
    }

    private static AndExpression transformAndExpression(
    		sql.AndExpression andExpressionXMI) {
        if (andExpressionXMI == null)
            return null;
        AndExpression andExpression = new AndExpression(null, null);
        andExpression.setLeftExpression(
            transformExpression(andExpressionXMI.getLeftExpression()));
        andExpression.setRightExpression(
            transformExpression(andExpressionXMI.getRightExpression()));
        return andExpression;
    }

    private static StringValue transformStringValue(
    		sql.StringValue stringValueXMI) {
        if (stringValueXMI == null)
            return null;
        StringValue stringValue = new StringValue(stringValueXMI.getValue());
        return stringValue;
    }

    private static LongValue transformLongValue(sql.LongValue longValueXMI) {
        if (longValueXMI == null)
            return null;
        LongValue longValue = new LongValue(longValueXMI.getValue());
        return longValue;
    }

    private static Alias transformAlias(sql.Alias aliasXMI) {
        if (aliasXMI == null)
            return null;
        Alias alias = new Alias(aliasXMI.getName());
        return alias;
    }

    private static Distinct transformDistinct(sql.Distinct distinctXMI) {
        if (distinctXMI == null)
            return null;
        Distinct distinct = new Distinct();
        distinct.setUseUnique(distinctXMI.isUseUnique());
        distinct.setOnSelectItems(transformSelectItems(distinctXMI.getOnSelectItems()));
        return distinct;
    }

}
