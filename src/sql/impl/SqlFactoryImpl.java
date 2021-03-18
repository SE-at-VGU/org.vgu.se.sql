/**
 */
package sql.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sql.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlFactoryImpl extends EFactoryImpl implements SqlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SqlFactory init() {
		try {
			SqlFactory theSqlFactory = (SqlFactory)EPackage.Registry.INSTANCE.getEFactory(SqlPackage.eNS_URI);
			if (theSqlFactory != null) {
				return theSqlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SqlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SqlPackage.SELECT: return createSelect();
			case SqlPackage.PLAIN_SELECT: return createPlainSelect();
			case SqlPackage.DISTINCT: return createDistinct();
			case SqlPackage.GROUP_BY_ELEMENT: return createGroupByElement();
			case SqlPackage.JOIN: return createJoin();
			case SqlPackage.ALIAS: return createAlias();
			case SqlPackage.AND_EXPRESSION: return createAndExpression();
			case SqlPackage.OR_EXPRESSION: return createOrExpression();
			case SqlPackage.EQUALS_TO: return createEqualsTo();
			case SqlPackage.GREATER_THAN: return createGreaterThan();
			case SqlPackage.GREATER_THAN_EQUALS: return createGreaterThanEquals();
			case SqlPackage.MINOR_THAN: return createMinorThan();
			case SqlPackage.MINOR_THAN_EQUALS: return createMinorThanEquals();
			case SqlPackage.NOT_EQUALS_TO: return createNotEqualsTo();
			case SqlPackage.ALL_COLUMNS: return createAllColumns();
			case SqlPackage.SELECT_EXPRESSION_ITEM: return createSelectExpressionItem();
			case SqlPackage.TABLE: return createTable();
			case SqlPackage.SUB_SELECT: return createSubSelect();
			case SqlPackage.NOT_EXPRESSION: return createNotExpression();
			case SqlPackage.LONG_VALUE: return createLongValue();
			case SqlPackage.NULL_VALUE: return createNullValue();
			case SqlPackage.IS_NULL_EXPRESSION: return createIsNullExpression();
			case SqlPackage.FUNCTION: return createFunction();
			case SqlPackage.COLUMN: return createColumn();
			case SqlPackage.CASE_EXPRESSION: return createCaseExpression();
			case SqlPackage.WHEN_CLAUSE: return createWhenClause();
			case SqlPackage.STRING_VALUE: return createStringValue();
			case SqlPackage.EXPRESSION_LIST: return createExpressionList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Select createSelect() {
		SelectImpl select = new SelectImpl();
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlainSelect createPlainSelect() {
		PlainSelectImpl plainSelect = new PlainSelectImpl();
		return plainSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Distinct createDistinct() {
		DistinctImpl distinct = new DistinctImpl();
		return distinct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupByElement createGroupByElement() {
		GroupByElementImpl groupByElement = new GroupByElementImpl();
		return groupByElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alias createAlias() {
		AliasImpl alias = new AliasImpl();
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndExpression createAndExpression() {
		AndExpressionImpl andExpression = new AndExpressionImpl();
		return andExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrExpression createOrExpression() {
		OrExpressionImpl orExpression = new OrExpressionImpl();
		return orExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EqualsTo createEqualsTo() {
		EqualsToImpl equalsTo = new EqualsToImpl();
		return equalsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GreaterThan createGreaterThan() {
		GreaterThanImpl greaterThan = new GreaterThanImpl();
		return greaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GreaterThanEquals createGreaterThanEquals() {
		GreaterThanEqualsImpl greaterThanEquals = new GreaterThanEqualsImpl();
		return greaterThanEquals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinorThan createMinorThan() {
		MinorThanImpl minorThan = new MinorThanImpl();
		return minorThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinorThanEquals createMinorThanEquals() {
		MinorThanEqualsImpl minorThanEquals = new MinorThanEqualsImpl();
		return minorThanEquals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotEqualsTo createNotEqualsTo() {
		NotEqualsToImpl notEqualsTo = new NotEqualsToImpl();
		return notEqualsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllColumns createAllColumns() {
		AllColumnsImpl allColumns = new AllColumnsImpl();
		return allColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectExpressionItem createSelectExpressionItem() {
		SelectExpressionItemImpl selectExpressionItem = new SelectExpressionItemImpl();
		return selectExpressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubSelect createSubSelect() {
		SubSelectImpl subSelect = new SubSelectImpl();
		return subSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotExpression createNotExpression() {
		NotExpressionImpl notExpression = new NotExpressionImpl();
		return notExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongValue createLongValue() {
		LongValueImpl longValue = new LongValueImpl();
		return longValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullValue createNullValue() {
		NullValueImpl nullValue = new NullValueImpl();
		return nullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsNullExpression createIsNullExpression() {
		IsNullExpressionImpl isNullExpression = new IsNullExpressionImpl();
		return isNullExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseExpression createCaseExpression() {
		CaseExpressionImpl caseExpression = new CaseExpressionImpl();
		return caseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenClause createWhenClause() {
		WhenClauseImpl whenClause = new WhenClauseImpl();
		return whenClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionList createExpressionList() {
		ExpressionListImpl expressionList = new ExpressionListImpl();
		return expressionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqlPackage getSqlPackage() {
		return (SqlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SqlPackage getPackage() {
		return SqlPackage.eINSTANCE;
	}

} //SqlFactoryImpl
