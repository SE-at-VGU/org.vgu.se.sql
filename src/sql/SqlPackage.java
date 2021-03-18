/**
 */
package sql;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sql.SqlFactory
 * @model kind="package"
 * @generated
 */
public interface SqlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sql";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sql";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sql";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SqlPackage eINSTANCE = sql.impl.SqlPackageImpl.init();

	/**
	 * The meta object id for the '{@link sql.Statement <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.Statement
	 * @see sql.impl.SqlPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.SelectImpl
	 * @see sql.impl.SqlPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 1;

	/**
	 * The feature id for the '<em><b>Select Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__SELECT_BODY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.SelectBody <em>Select Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.SelectBody
	 * @see sql.impl.SqlPackageImpl#getSelectBody()
	 * @generated
	 */
	int SELECT_BODY = 2;

	/**
	 * The number of structural features of the '<em>Select Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BODY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Select Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql.impl.PlainSelectImpl <em>Plain Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.PlainSelectImpl
	 * @see sql.impl.SqlPackageImpl#getPlainSelect()
	 * @generated
	 */
	int PLAIN_SELECT = 3;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SELECT__DISTINCT = SELECT_BODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Select Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SELECT__SELECT_ITEMS = SELECT_BODY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SELECT__FROM_ITEM = SELECT_BODY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Joins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SELECT__JOINS = SELECT_BODY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SELECT__WHERE = SELECT_BODY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Group By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SELECT__GROUP_BY = SELECT_BODY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Having</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SELECT__HAVING = SELECT_BODY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Plain Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SELECT_FEATURE_COUNT = SELECT_BODY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Plain Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SELECT_OPERATION_COUNT = SELECT_BODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.DistinctImpl <em>Distinct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.DistinctImpl
	 * @see sql.impl.SqlPackageImpl#getDistinct()
	 * @generated
	 */
	int DISTINCT = 4;

	/**
	 * The feature id for the '<em><b>Use Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT__USE_UNIQUE = 0;

	/**
	 * The feature id for the '<em><b>On Select Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT__ON_SELECT_ITEMS = 1;

	/**
	 * The number of structural features of the '<em>Distinct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Distinct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql.impl.GroupByElementImpl <em>Group By Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.GroupByElementImpl
	 * @see sql.impl.SqlPackageImpl#getGroupByElement()
	 * @generated
	 */
	int GROUP_BY_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Group By Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS = 0;

	/**
	 * The number of structural features of the '<em>Group By Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BY_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Group By Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_BY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.JoinImpl
	 * @see sql.impl.SqlPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 6;

	/**
	 * The feature id for the '<em><b>Outer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__OUTER = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__LEFT = 2;

	/**
	 * The feature id for the '<em><b>Natural</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NATURAL = 3;

	/**
	 * The feature id for the '<em><b>Full</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__FULL = 4;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__INNER = 5;

	/**
	 * The feature id for the '<em><b>Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__SIMPLE = 6;

	/**
	 * The feature id for the '<em><b>Cross</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__CROSS = 7;

	/**
	 * The feature id for the '<em><b>Semi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__SEMI = 8;

	/**
	 * The feature id for the '<em><b>Straight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__STRAIGHT = 9;

	/**
	 * The feature id for the '<em><b>Apply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__APPLY = 10;

	/**
	 * The feature id for the '<em><b>Right Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__RIGHT_ITEM = 11;

	/**
	 * The feature id for the '<em><b>On Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ON_EXPRESSION = 12;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql.impl.AliasImpl <em>Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.AliasImpl
	 * @see sql.impl.SqlPackageImpl#getAlias()
	 * @generated
	 */
	int ALIAS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.Expression
	 * @see sql.impl.SqlPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 8;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.BinaryExpressionImpl
	 * @see sql.impl.SqlPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.AndExpressionImpl <em>And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.AndExpressionImpl
	 * @see sql.impl.SqlPackageImpl#getAndExpression()
	 * @generated
	 */
	int AND_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__LEFT_EXPRESSION = BINARY_EXPRESSION__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__RIGHT_EXPRESSION = BINARY_EXPRESSION__RIGHT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.OrExpressionImpl <em>Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.OrExpressionImpl
	 * @see sql.impl.SqlPackageImpl#getOrExpression()
	 * @generated
	 */
	int OR_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__LEFT_EXPRESSION = BINARY_EXPRESSION__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__RIGHT_EXPRESSION = BINARY_EXPRESSION__RIGHT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.ComparisonOperatorImpl <em>Comparison Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.ComparisonOperatorImpl
	 * @see sql.impl.SqlPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 12;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR__LEFT_EXPRESSION = BINARY_EXPRESSION__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR__RIGHT_EXPRESSION = BINARY_EXPRESSION__RIGHT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.EqualsToImpl <em>Equals To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.EqualsToImpl
	 * @see sql.impl.SqlPackageImpl#getEqualsTo()
	 * @generated
	 */
	int EQUALS_TO = 13;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_TO__LEFT_EXPRESSION = COMPARISON_OPERATOR__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_TO__RIGHT_EXPRESSION = COMPARISON_OPERATOR__RIGHT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_TO__OPERATOR = COMPARISON_OPERATOR__OPERATOR;

	/**
	 * The number of structural features of the '<em>Equals To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_TO_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equals To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_TO_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.GreaterThanImpl
	 * @see sql.impl.SqlPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 14;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__LEFT_EXPRESSION = COMPARISON_OPERATOR__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__RIGHT_EXPRESSION = COMPARISON_OPERATOR__RIGHT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__OPERATOR = COMPARISON_OPERATOR__OPERATOR;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.GreaterThanEqualsImpl <em>Greater Than Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.GreaterThanEqualsImpl
	 * @see sql.impl.SqlPackageImpl#getGreaterThanEquals()
	 * @generated
	 */
	int GREATER_THAN_EQUALS = 15;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_EQUALS__LEFT_EXPRESSION = COMPARISON_OPERATOR__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_EQUALS__RIGHT_EXPRESSION = COMPARISON_OPERATOR__RIGHT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_EQUALS__OPERATOR = COMPARISON_OPERATOR__OPERATOR;

	/**
	 * The number of structural features of the '<em>Greater Than Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_EQUALS_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater Than Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_EQUALS_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.MinorThanImpl <em>Minor Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.MinorThanImpl
	 * @see sql.impl.SqlPackageImpl#getMinorThan()
	 * @generated
	 */
	int MINOR_THAN = 16;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_THAN__LEFT_EXPRESSION = COMPARISON_OPERATOR__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_THAN__RIGHT_EXPRESSION = COMPARISON_OPERATOR__RIGHT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_THAN__OPERATOR = COMPARISON_OPERATOR__OPERATOR;

	/**
	 * The number of structural features of the '<em>Minor Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_THAN_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minor Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_THAN_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.MinorThanEqualsImpl <em>Minor Than Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.MinorThanEqualsImpl
	 * @see sql.impl.SqlPackageImpl#getMinorThanEquals()
	 * @generated
	 */
	int MINOR_THAN_EQUALS = 17;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_THAN_EQUALS__LEFT_EXPRESSION = COMPARISON_OPERATOR__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_THAN_EQUALS__RIGHT_EXPRESSION = COMPARISON_OPERATOR__RIGHT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_THAN_EQUALS__OPERATOR = COMPARISON_OPERATOR__OPERATOR;

	/**
	 * The number of structural features of the '<em>Minor Than Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_THAN_EQUALS_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minor Than Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_THAN_EQUALS_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.NotEqualsToImpl <em>Not Equals To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.NotEqualsToImpl
	 * @see sql.impl.SqlPackageImpl#getNotEqualsTo()
	 * @generated
	 */
	int NOT_EQUALS_TO = 18;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_TO__LEFT_EXPRESSION = COMPARISON_OPERATOR__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_TO__RIGHT_EXPRESSION = COMPARISON_OPERATOR__RIGHT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_TO__OPERATOR = COMPARISON_OPERATOR__OPERATOR;

	/**
	 * The number of structural features of the '<em>Not Equals To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_TO_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Equals To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUALS_TO_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.SelectItem <em>Select Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.SelectItem
	 * @see sql.impl.SqlPackageImpl#getSelectItem()
	 * @generated
	 */
	int SELECT_ITEM = 19;

	/**
	 * The number of structural features of the '<em>Select Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Select Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql.impl.AllColumnsImpl <em>All Columns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.AllColumnsImpl
	 * @see sql.impl.SqlPackageImpl#getAllColumns()
	 * @generated
	 */
	int ALL_COLUMNS = 20;

	/**
	 * The number of structural features of the '<em>All Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_COLUMNS_FEATURE_COUNT = SELECT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>All Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_COLUMNS_OPERATION_COUNT = SELECT_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.SelectExpressionItemImpl <em>Select Expression Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.SelectExpressionItemImpl
	 * @see sql.impl.SqlPackageImpl#getSelectExpressionItem()
	 * @generated
	 */
	int SELECT_EXPRESSION_ITEM = 21;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EXPRESSION_ITEM__ALIAS = SELECT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EXPRESSION_ITEM__EXPRESSION = SELECT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Select Expression Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EXPRESSION_ITEM_FEATURE_COUNT = SELECT_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Select Expression Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_EXPRESSION_ITEM_OPERATION_COUNT = SELECT_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.FromItem <em>From Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.FromItem
	 * @see sql.impl.SqlPackageImpl#getFromItem()
	 * @generated
	 */
	int FROM_ITEM = 22;

	/**
	 * The number of structural features of the '<em>From Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>From Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sql.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.TableImpl
	 * @see sql.impl.SqlPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 23;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ALIAS = FROM_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = FROM_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = FROM_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = FROM_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.SubSelectImpl <em>Sub Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.SubSelectImpl
	 * @see sql.impl.SqlPackageImpl#getSubSelect()
	 * @generated
	 */
	int SUB_SELECT = 24;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SELECT__ALIAS = FROM_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Select Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SELECT__SELECT_BODY = FROM_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SELECT_FEATURE_COUNT = FROM_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sub Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SELECT_OPERATION_COUNT = FROM_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.NotExpressionImpl <em>Not Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.NotExpressionImpl
	 * @see sql.impl.SqlPackageImpl#getNotExpression()
	 * @generated
	 */
	int NOT_EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.LongValueImpl <em>Long Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.LongValueImpl
	 * @see sql.impl.SqlPackageImpl#getLongValue()
	 * @generated
	 */
	int LONG_VALUE = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Long Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Long Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.NullValueImpl <em>Null Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.NullValueImpl
	 * @see sql.impl.SqlPackageImpl#getNullValue()
	 * @generated
	 */
	int NULL_VALUE = 27;

	/**
	 * The number of structural features of the '<em>Null Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.IsNullExpressionImpl <em>Is Null Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.IsNullExpressionImpl
	 * @see sql.impl.SqlPackageImpl#getIsNullExpression()
	 * @generated
	 */
	int IS_NULL_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NULL_EXPRESSION__NOT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NULL_EXPRESSION__LEFT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Is Null Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NULL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Is Null Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NULL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.FunctionImpl
	 * @see sql.impl.SqlPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ALL_COLUMNS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DISTINCT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.ColumnImpl
	 * @see sql.impl.SqlPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 30;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.CaseExpressionImpl
	 * @see sql.impl.SqlPackageImpl#getCaseExpression()
	 * @generated
	 */
	int CASE_EXPRESSION = 31;

	/**
	 * The feature id for the '<em><b>Switch Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION__SWITCH_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION__ELSE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>When Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION__WHEN_CLAUSES = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Case Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Case Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.WhenClauseImpl <em>When Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.WhenClauseImpl
	 * @see sql.impl.SqlPackageImpl#getWhenClause()
	 * @generated
	 */
	int WHEN_CLAUSE = 32;

	/**
	 * The feature id for the '<em><b>When Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CLAUSE__WHEN_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CLAUSE__THEN_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>When Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CLAUSE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>When Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CLAUSE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.StringValueImpl
	 * @see sql.impl.SqlPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sql.impl.ExpressionListImpl <em>Expression List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sql.impl.ExpressionListImpl
	 * @see sql.impl.SqlPackageImpl#getExpressionList()
	 * @generated
	 */
	int EXPRESSION_LIST = 34;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST__EXPRESSIONS = 0;

	/**
	 * The number of structural features of the '<em>Expression List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link sql.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see sql.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link sql.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see sql.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for the containment reference '{@link sql.Select#getSelectBody <em>Select Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select Body</em>'.
	 * @see sql.Select#getSelectBody()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_SelectBody();

	/**
	 * Returns the meta object for class '{@link sql.SelectBody <em>Select Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Body</em>'.
	 * @see sql.SelectBody
	 * @generated
	 */
	EClass getSelectBody();

	/**
	 * Returns the meta object for class '{@link sql.PlainSelect <em>Plain Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Select</em>'.
	 * @see sql.PlainSelect
	 * @generated
	 */
	EClass getPlainSelect();

	/**
	 * Returns the meta object for the containment reference '{@link sql.PlainSelect#getDistinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distinct</em>'.
	 * @see sql.PlainSelect#getDistinct()
	 * @see #getPlainSelect()
	 * @generated
	 */
	EReference getPlainSelect_Distinct();

	/**
	 * Returns the meta object for the containment reference list '{@link sql.PlainSelect#getSelectItems <em>Select Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Select Items</em>'.
	 * @see sql.PlainSelect#getSelectItems()
	 * @see #getPlainSelect()
	 * @generated
	 */
	EReference getPlainSelect_SelectItems();

	/**
	 * Returns the meta object for the containment reference '{@link sql.PlainSelect#getFromItem <em>From Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Item</em>'.
	 * @see sql.PlainSelect#getFromItem()
	 * @see #getPlainSelect()
	 * @generated
	 */
	EReference getPlainSelect_FromItem();

	/**
	 * Returns the meta object for the containment reference list '{@link sql.PlainSelect#getJoins <em>Joins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joins</em>'.
	 * @see sql.PlainSelect#getJoins()
	 * @see #getPlainSelect()
	 * @generated
	 */
	EReference getPlainSelect_Joins();

	/**
	 * Returns the meta object for the containment reference '{@link sql.PlainSelect#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see sql.PlainSelect#getWhere()
	 * @see #getPlainSelect()
	 * @generated
	 */
	EReference getPlainSelect_Where();

	/**
	 * Returns the meta object for the containment reference '{@link sql.PlainSelect#getGroupBy <em>Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group By</em>'.
	 * @see sql.PlainSelect#getGroupBy()
	 * @see #getPlainSelect()
	 * @generated
	 */
	EReference getPlainSelect_GroupBy();

	/**
	 * Returns the meta object for the containment reference '{@link sql.PlainSelect#getHaving <em>Having</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Having</em>'.
	 * @see sql.PlainSelect#getHaving()
	 * @see #getPlainSelect()
	 * @generated
	 */
	EReference getPlainSelect_Having();

	/**
	 * Returns the meta object for class '{@link sql.Distinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distinct</em>'.
	 * @see sql.Distinct
	 * @generated
	 */
	EClass getDistinct();

	/**
	 * Returns the meta object for the attribute '{@link sql.Distinct#isUseUnique <em>Use Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Unique</em>'.
	 * @see sql.Distinct#isUseUnique()
	 * @see #getDistinct()
	 * @generated
	 */
	EAttribute getDistinct_UseUnique();

	/**
	 * Returns the meta object for the containment reference list '{@link sql.Distinct#getOnSelectItems <em>On Select Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Select Items</em>'.
	 * @see sql.Distinct#getOnSelectItems()
	 * @see #getDistinct()
	 * @generated
	 */
	EReference getDistinct_OnSelectItems();

	/**
	 * Returns the meta object for class '{@link sql.GroupByElement <em>Group By Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group By Element</em>'.
	 * @see sql.GroupByElement
	 * @generated
	 */
	EClass getGroupByElement();

	/**
	 * Returns the meta object for the containment reference list '{@link sql.GroupByElement#getGroupByExpressions <em>Group By Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group By Expressions</em>'.
	 * @see sql.GroupByElement#getGroupByExpressions()
	 * @see #getGroupByElement()
	 * @generated
	 */
	EReference getGroupByElement_GroupByExpressions();

	/**
	 * Returns the meta object for class '{@link sql.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see sql.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the attribute '{@link sql.Join#isOuter <em>Outer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer</em>'.
	 * @see sql.Join#isOuter()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Outer();

	/**
	 * Returns the meta object for the attribute '{@link sql.Join#isRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see sql.Join#isRight()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Right();

	/**
	 * Returns the meta object for the attribute '{@link sql.Join#isLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see sql.Join#isLeft()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Left();

	/**
	 * Returns the meta object for the attribute '{@link sql.Join#isNatural <em>Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Natural</em>'.
	 * @see sql.Join#isNatural()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Natural();

	/**
	 * Returns the meta object for the attribute '{@link sql.Join#isFull <em>Full</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full</em>'.
	 * @see sql.Join#isFull()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Full();

	/**
	 * Returns the meta object for the attribute '{@link sql.Join#isInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner</em>'.
	 * @see sql.Join#isInner()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Inner();

	/**
	 * Returns the meta object for the attribute '{@link sql.Join#isSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple</em>'.
	 * @see sql.Join#isSimple()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Simple();

	/**
	 * Returns the meta object for the attribute '{@link sql.Join#isCross <em>Cross</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cross</em>'.
	 * @see sql.Join#isCross()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Cross();

	/**
	 * Returns the meta object for the attribute '{@link sql.Join#isSemi <em>Semi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semi</em>'.
	 * @see sql.Join#isSemi()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Semi();

	/**
	 * Returns the meta object for the attribute '{@link sql.Join#isStraight <em>Straight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Straight</em>'.
	 * @see sql.Join#isStraight()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Straight();

	/**
	 * Returns the meta object for the attribute '{@link sql.Join#isApply <em>Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply</em>'.
	 * @see sql.Join#isApply()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Apply();

	/**
	 * Returns the meta object for the containment reference '{@link sql.Join#getRightItem <em>Right Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Item</em>'.
	 * @see sql.Join#getRightItem()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_RightItem();

	/**
	 * Returns the meta object for the containment reference '{@link sql.Join#getOnExpression <em>On Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Expression</em>'.
	 * @see sql.Join#getOnExpression()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_OnExpression();

	/**
	 * Returns the meta object for class '{@link sql.Alias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias</em>'.
	 * @see sql.Alias
	 * @generated
	 */
	EClass getAlias();

	/**
	 * Returns the meta object for the attribute '{@link sql.Alias#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sql.Alias#getName()
	 * @see #getAlias()
	 * @generated
	 */
	EAttribute getAlias_Name();

	/**
	 * Returns the meta object for class '{@link sql.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see sql.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link sql.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see sql.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link sql.BinaryExpression#getLeftExpression <em>Left Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Expression</em>'.
	 * @see sql.BinaryExpression#getLeftExpression()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_LeftExpression();

	/**
	 * Returns the meta object for the containment reference '{@link sql.BinaryExpression#getRightExpression <em>Right Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Expression</em>'.
	 * @see sql.BinaryExpression#getRightExpression()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_RightExpression();

	/**
	 * Returns the meta object for class '{@link sql.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expression</em>'.
	 * @see sql.AndExpression
	 * @generated
	 */
	EClass getAndExpression();

	/**
	 * Returns the meta object for class '{@link sql.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Expression</em>'.
	 * @see sql.OrExpression
	 * @generated
	 */
	EClass getOrExpression();

	/**
	 * Returns the meta object for class '{@link sql.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Operator</em>'.
	 * @see sql.ComparisonOperator
	 * @generated
	 */
	EClass getComparisonOperator();

	/**
	 * Returns the meta object for the attribute '{@link sql.ComparisonOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see sql.ComparisonOperator#getOperator()
	 * @see #getComparisonOperator()
	 * @generated
	 */
	EAttribute getComparisonOperator_Operator();

	/**
	 * Returns the meta object for class '{@link sql.EqualsTo <em>Equals To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals To</em>'.
	 * @see sql.EqualsTo
	 * @generated
	 */
	EClass getEqualsTo();

	/**
	 * Returns the meta object for class '{@link sql.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see sql.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for class '{@link sql.GreaterThanEquals <em>Greater Than Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Equals</em>'.
	 * @see sql.GreaterThanEquals
	 * @generated
	 */
	EClass getGreaterThanEquals();

	/**
	 * Returns the meta object for class '{@link sql.MinorThan <em>Minor Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minor Than</em>'.
	 * @see sql.MinorThan
	 * @generated
	 */
	EClass getMinorThan();

	/**
	 * Returns the meta object for class '{@link sql.MinorThanEquals <em>Minor Than Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minor Than Equals</em>'.
	 * @see sql.MinorThanEquals
	 * @generated
	 */
	EClass getMinorThanEquals();

	/**
	 * Returns the meta object for class '{@link sql.NotEqualsTo <em>Not Equals To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Equals To</em>'.
	 * @see sql.NotEqualsTo
	 * @generated
	 */
	EClass getNotEqualsTo();

	/**
	 * Returns the meta object for class '{@link sql.SelectItem <em>Select Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Item</em>'.
	 * @see sql.SelectItem
	 * @generated
	 */
	EClass getSelectItem();

	/**
	 * Returns the meta object for class '{@link sql.AllColumns <em>All Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Columns</em>'.
	 * @see sql.AllColumns
	 * @generated
	 */
	EClass getAllColumns();

	/**
	 * Returns the meta object for class '{@link sql.SelectExpressionItem <em>Select Expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Expression Item</em>'.
	 * @see sql.SelectExpressionItem
	 * @generated
	 */
	EClass getSelectExpressionItem();

	/**
	 * Returns the meta object for the containment reference '{@link sql.SelectExpressionItem#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias</em>'.
	 * @see sql.SelectExpressionItem#getAlias()
	 * @see #getSelectExpressionItem()
	 * @generated
	 */
	EReference getSelectExpressionItem_Alias();

	/**
	 * Returns the meta object for the containment reference '{@link sql.SelectExpressionItem#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see sql.SelectExpressionItem#getExpression()
	 * @see #getSelectExpressionItem()
	 * @generated
	 */
	EReference getSelectExpressionItem_Expression();

	/**
	 * Returns the meta object for class '{@link sql.FromItem <em>From Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Item</em>'.
	 * @see sql.FromItem
	 * @generated
	 */
	EClass getFromItem();

	/**
	 * Returns the meta object for class '{@link sql.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see sql.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference '{@link sql.Table#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias</em>'.
	 * @see sql.Table#getAlias()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Alias();

	/**
	 * Returns the meta object for the attribute '{@link sql.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sql.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for class '{@link sql.SubSelect <em>Sub Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Select</em>'.
	 * @see sql.SubSelect
	 * @generated
	 */
	EClass getSubSelect();

	/**
	 * Returns the meta object for the containment reference '{@link sql.SubSelect#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias</em>'.
	 * @see sql.SubSelect#getAlias()
	 * @see #getSubSelect()
	 * @generated
	 */
	EReference getSubSelect_Alias();

	/**
	 * Returns the meta object for the containment reference '{@link sql.SubSelect#getSelectBody <em>Select Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select Body</em>'.
	 * @see sql.SubSelect#getSelectBody()
	 * @see #getSubSelect()
	 * @generated
	 */
	EReference getSubSelect_SelectBody();

	/**
	 * Returns the meta object for class '{@link sql.NotExpression <em>Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Expression</em>'.
	 * @see sql.NotExpression
	 * @generated
	 */
	EClass getNotExpression();

	/**
	 * Returns the meta object for the containment reference '{@link sql.NotExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see sql.NotExpression#getExpression()
	 * @see #getNotExpression()
	 * @generated
	 */
	EReference getNotExpression_Expression();

	/**
	 * Returns the meta object for class '{@link sql.LongValue <em>Long Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Value</em>'.
	 * @see sql.LongValue
	 * @generated
	 */
	EClass getLongValue();

	/**
	 * Returns the meta object for the attribute '{@link sql.LongValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sql.LongValue#getValue()
	 * @see #getLongValue()
	 * @generated
	 */
	EAttribute getLongValue_Value();

	/**
	 * Returns the meta object for class '{@link sql.NullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Value</em>'.
	 * @see sql.NullValue
	 * @generated
	 */
	EClass getNullValue();

	/**
	 * Returns the meta object for class '{@link sql.IsNullExpression <em>Is Null Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Null Expression</em>'.
	 * @see sql.IsNullExpression
	 * @generated
	 */
	EClass getIsNullExpression();

	/**
	 * Returns the meta object for the attribute '{@link sql.IsNullExpression#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see sql.IsNullExpression#isNot()
	 * @see #getIsNullExpression()
	 * @generated
	 */
	EAttribute getIsNullExpression_Not();

	/**
	 * Returns the meta object for the containment reference '{@link sql.IsNullExpression#getLeftExpression <em>Left Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Expression</em>'.
	 * @see sql.IsNullExpression#getLeftExpression()
	 * @see #getIsNullExpression()
	 * @generated
	 */
	EReference getIsNullExpression_LeftExpression();

	/**
	 * Returns the meta object for class '{@link sql.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see sql.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link sql.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sql.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link sql.Function#isAllColumns <em>All Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Columns</em>'.
	 * @see sql.Function#isAllColumns()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_AllColumns();

	/**
	 * Returns the meta object for the attribute '{@link sql.Function#isDistinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct</em>'.
	 * @see sql.Function#isDistinct()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Distinct();

	/**
	 * Returns the meta object for the containment reference '{@link sql.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see sql.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for class '{@link sql.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see sql.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link sql.Column#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see sql.Column#getColumnName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ColumnName();

	/**
	 * Returns the meta object for the containment reference '{@link sql.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see sql.Column#getTable()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Table();

	/**
	 * Returns the meta object for class '{@link sql.CaseExpression <em>Case Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Expression</em>'.
	 * @see sql.CaseExpression
	 * @generated
	 */
	EClass getCaseExpression();

	/**
	 * Returns the meta object for the containment reference '{@link sql.CaseExpression#getSwitchExpression <em>Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch Expression</em>'.
	 * @see sql.CaseExpression#getSwitchExpression()
	 * @see #getCaseExpression()
	 * @generated
	 */
	EReference getCaseExpression_SwitchExpression();

	/**
	 * Returns the meta object for the containment reference '{@link sql.CaseExpression#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see sql.CaseExpression#getElseExpression()
	 * @see #getCaseExpression()
	 * @generated
	 */
	EReference getCaseExpression_ElseExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link sql.CaseExpression#getWhenClauses <em>When Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When Clauses</em>'.
	 * @see sql.CaseExpression#getWhenClauses()
	 * @see #getCaseExpression()
	 * @generated
	 */
	EReference getCaseExpression_WhenClauses();

	/**
	 * Returns the meta object for class '{@link sql.WhenClause <em>When Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Clause</em>'.
	 * @see sql.WhenClause
	 * @generated
	 */
	EClass getWhenClause();

	/**
	 * Returns the meta object for the containment reference '{@link sql.WhenClause#getWhenExpression <em>When Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When Expression</em>'.
	 * @see sql.WhenClause#getWhenExpression()
	 * @see #getWhenClause()
	 * @generated
	 */
	EReference getWhenClause_WhenExpression();

	/**
	 * Returns the meta object for the containment reference '{@link sql.WhenClause#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expression</em>'.
	 * @see sql.WhenClause#getThenExpression()
	 * @see #getWhenClause()
	 * @generated
	 */
	EReference getWhenClause_ThenExpression();

	/**
	 * Returns the meta object for class '{@link sql.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see sql.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link sql.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sql.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link sql.ExpressionList <em>Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression List</em>'.
	 * @see sql.ExpressionList
	 * @generated
	 */
	EClass getExpressionList();

	/**
	 * Returns the meta object for the containment reference list '{@link sql.ExpressionList#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see sql.ExpressionList#getExpressions()
	 * @see #getExpressionList()
	 * @generated
	 */
	EReference getExpressionList_Expressions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SqlFactory getSqlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sql.Statement <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.Statement
		 * @see sql.impl.SqlPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link sql.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.SelectImpl
		 * @see sql.impl.SqlPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '<em><b>Select Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__SELECT_BODY = eINSTANCE.getSelect_SelectBody();

		/**
		 * The meta object literal for the '{@link sql.SelectBody <em>Select Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.SelectBody
		 * @see sql.impl.SqlPackageImpl#getSelectBody()
		 * @generated
		 */
		EClass SELECT_BODY = eINSTANCE.getSelectBody();

		/**
		 * The meta object literal for the '{@link sql.impl.PlainSelectImpl <em>Plain Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.PlainSelectImpl
		 * @see sql.impl.SqlPackageImpl#getPlainSelect()
		 * @generated
		 */
		EClass PLAIN_SELECT = eINSTANCE.getPlainSelect();

		/**
		 * The meta object literal for the '<em><b>Distinct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_SELECT__DISTINCT = eINSTANCE.getPlainSelect_Distinct();

		/**
		 * The meta object literal for the '<em><b>Select Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_SELECT__SELECT_ITEMS = eINSTANCE.getPlainSelect_SelectItems();

		/**
		 * The meta object literal for the '<em><b>From Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_SELECT__FROM_ITEM = eINSTANCE.getPlainSelect_FromItem();

		/**
		 * The meta object literal for the '<em><b>Joins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_SELECT__JOINS = eINSTANCE.getPlainSelect_Joins();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_SELECT__WHERE = eINSTANCE.getPlainSelect_Where();

		/**
		 * The meta object literal for the '<em><b>Group By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_SELECT__GROUP_BY = eINSTANCE.getPlainSelect_GroupBy();

		/**
		 * The meta object literal for the '<em><b>Having</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_SELECT__HAVING = eINSTANCE.getPlainSelect_Having();

		/**
		 * The meta object literal for the '{@link sql.impl.DistinctImpl <em>Distinct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.DistinctImpl
		 * @see sql.impl.SqlPackageImpl#getDistinct()
		 * @generated
		 */
		EClass DISTINCT = eINSTANCE.getDistinct();

		/**
		 * The meta object literal for the '<em><b>Use Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTINCT__USE_UNIQUE = eINSTANCE.getDistinct_UseUnique();

		/**
		 * The meta object literal for the '<em><b>On Select Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTINCT__ON_SELECT_ITEMS = eINSTANCE.getDistinct_OnSelectItems();

		/**
		 * The meta object literal for the '{@link sql.impl.GroupByElementImpl <em>Group By Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.GroupByElementImpl
		 * @see sql.impl.SqlPackageImpl#getGroupByElement()
		 * @generated
		 */
		EClass GROUP_BY_ELEMENT = eINSTANCE.getGroupByElement();

		/**
		 * The meta object literal for the '<em><b>Group By Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS = eINSTANCE.getGroupByElement_GroupByExpressions();

		/**
		 * The meta object literal for the '{@link sql.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.JoinImpl
		 * @see sql.impl.SqlPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Outer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__OUTER = eINSTANCE.getJoin_Outer();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__RIGHT = eINSTANCE.getJoin_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__LEFT = eINSTANCE.getJoin_Left();

		/**
		 * The meta object literal for the '<em><b>Natural</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__NATURAL = eINSTANCE.getJoin_Natural();

		/**
		 * The meta object literal for the '<em><b>Full</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__FULL = eINSTANCE.getJoin_Full();

		/**
		 * The meta object literal for the '<em><b>Inner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__INNER = eINSTANCE.getJoin_Inner();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__SIMPLE = eINSTANCE.getJoin_Simple();

		/**
		 * The meta object literal for the '<em><b>Cross</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__CROSS = eINSTANCE.getJoin_Cross();

		/**
		 * The meta object literal for the '<em><b>Semi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__SEMI = eINSTANCE.getJoin_Semi();

		/**
		 * The meta object literal for the '<em><b>Straight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__STRAIGHT = eINSTANCE.getJoin_Straight();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__APPLY = eINSTANCE.getJoin_Apply();

		/**
		 * The meta object literal for the '<em><b>Right Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__RIGHT_ITEM = eINSTANCE.getJoin_RightItem();

		/**
		 * The meta object literal for the '<em><b>On Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__ON_EXPRESSION = eINSTANCE.getJoin_OnExpression();

		/**
		 * The meta object literal for the '{@link sql.impl.AliasImpl <em>Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.AliasImpl
		 * @see sql.impl.SqlPackageImpl#getAlias()
		 * @generated
		 */
		EClass ALIAS = eINSTANCE.getAlias();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS__NAME = eINSTANCE.getAlias_Name();

		/**
		 * The meta object literal for the '{@link sql.Expression <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.Expression
		 * @see sql.impl.SqlPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link sql.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.BinaryExpressionImpl
		 * @see sql.impl.SqlPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT_EXPRESSION = eINSTANCE.getBinaryExpression_LeftExpression();

		/**
		 * The meta object literal for the '<em><b>Right Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT_EXPRESSION = eINSTANCE.getBinaryExpression_RightExpression();

		/**
		 * The meta object literal for the '{@link sql.impl.AndExpressionImpl <em>And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.AndExpressionImpl
		 * @see sql.impl.SqlPackageImpl#getAndExpression()
		 * @generated
		 */
		EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

		/**
		 * The meta object literal for the '{@link sql.impl.OrExpressionImpl <em>Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.OrExpressionImpl
		 * @see sql.impl.SqlPackageImpl#getOrExpression()
		 * @generated
		 */
		EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

		/**
		 * The meta object literal for the '{@link sql.impl.ComparisonOperatorImpl <em>Comparison Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.ComparisonOperatorImpl
		 * @see sql.impl.SqlPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EClass COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_OPERATOR__OPERATOR = eINSTANCE.getComparisonOperator_Operator();

		/**
		 * The meta object literal for the '{@link sql.impl.EqualsToImpl <em>Equals To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.EqualsToImpl
		 * @see sql.impl.SqlPackageImpl#getEqualsTo()
		 * @generated
		 */
		EClass EQUALS_TO = eINSTANCE.getEqualsTo();

		/**
		 * The meta object literal for the '{@link sql.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.GreaterThanImpl
		 * @see sql.impl.SqlPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '{@link sql.impl.GreaterThanEqualsImpl <em>Greater Than Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.GreaterThanEqualsImpl
		 * @see sql.impl.SqlPackageImpl#getGreaterThanEquals()
		 * @generated
		 */
		EClass GREATER_THAN_EQUALS = eINSTANCE.getGreaterThanEquals();

		/**
		 * The meta object literal for the '{@link sql.impl.MinorThanImpl <em>Minor Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.MinorThanImpl
		 * @see sql.impl.SqlPackageImpl#getMinorThan()
		 * @generated
		 */
		EClass MINOR_THAN = eINSTANCE.getMinorThan();

		/**
		 * The meta object literal for the '{@link sql.impl.MinorThanEqualsImpl <em>Minor Than Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.MinorThanEqualsImpl
		 * @see sql.impl.SqlPackageImpl#getMinorThanEquals()
		 * @generated
		 */
		EClass MINOR_THAN_EQUALS = eINSTANCE.getMinorThanEquals();

		/**
		 * The meta object literal for the '{@link sql.impl.NotEqualsToImpl <em>Not Equals To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.NotEqualsToImpl
		 * @see sql.impl.SqlPackageImpl#getNotEqualsTo()
		 * @generated
		 */
		EClass NOT_EQUALS_TO = eINSTANCE.getNotEqualsTo();

		/**
		 * The meta object literal for the '{@link sql.SelectItem <em>Select Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.SelectItem
		 * @see sql.impl.SqlPackageImpl#getSelectItem()
		 * @generated
		 */
		EClass SELECT_ITEM = eINSTANCE.getSelectItem();

		/**
		 * The meta object literal for the '{@link sql.impl.AllColumnsImpl <em>All Columns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.AllColumnsImpl
		 * @see sql.impl.SqlPackageImpl#getAllColumns()
		 * @generated
		 */
		EClass ALL_COLUMNS = eINSTANCE.getAllColumns();

		/**
		 * The meta object literal for the '{@link sql.impl.SelectExpressionItemImpl <em>Select Expression Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.SelectExpressionItemImpl
		 * @see sql.impl.SqlPackageImpl#getSelectExpressionItem()
		 * @generated
		 */
		EClass SELECT_EXPRESSION_ITEM = eINSTANCE.getSelectExpressionItem();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_EXPRESSION_ITEM__ALIAS = eINSTANCE.getSelectExpressionItem_Alias();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_EXPRESSION_ITEM__EXPRESSION = eINSTANCE.getSelectExpressionItem_Expression();

		/**
		 * The meta object literal for the '{@link sql.FromItem <em>From Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.FromItem
		 * @see sql.impl.SqlPackageImpl#getFromItem()
		 * @generated
		 */
		EClass FROM_ITEM = eINSTANCE.getFromItem();

		/**
		 * The meta object literal for the '{@link sql.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.TableImpl
		 * @see sql.impl.SqlPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ALIAS = eINSTANCE.getTable_Alias();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '{@link sql.impl.SubSelectImpl <em>Sub Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.SubSelectImpl
		 * @see sql.impl.SqlPackageImpl#getSubSelect()
		 * @generated
		 */
		EClass SUB_SELECT = eINSTANCE.getSubSelect();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SELECT__ALIAS = eINSTANCE.getSubSelect_Alias();

		/**
		 * The meta object literal for the '<em><b>Select Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SELECT__SELECT_BODY = eINSTANCE.getSubSelect_SelectBody();

		/**
		 * The meta object literal for the '{@link sql.impl.NotExpressionImpl <em>Not Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.NotExpressionImpl
		 * @see sql.impl.SqlPackageImpl#getNotExpression()
		 * @generated
		 */
		EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EXPRESSION__EXPRESSION = eINSTANCE.getNotExpression_Expression();

		/**
		 * The meta object literal for the '{@link sql.impl.LongValueImpl <em>Long Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.LongValueImpl
		 * @see sql.impl.SqlPackageImpl#getLongValue()
		 * @generated
		 */
		EClass LONG_VALUE = eINSTANCE.getLongValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_VALUE__VALUE = eINSTANCE.getLongValue_Value();

		/**
		 * The meta object literal for the '{@link sql.impl.NullValueImpl <em>Null Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.NullValueImpl
		 * @see sql.impl.SqlPackageImpl#getNullValue()
		 * @generated
		 */
		EClass NULL_VALUE = eINSTANCE.getNullValue();

		/**
		 * The meta object literal for the '{@link sql.impl.IsNullExpressionImpl <em>Is Null Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.IsNullExpressionImpl
		 * @see sql.impl.SqlPackageImpl#getIsNullExpression()
		 * @generated
		 */
		EClass IS_NULL_EXPRESSION = eINSTANCE.getIsNullExpression();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_NULL_EXPRESSION__NOT = eINSTANCE.getIsNullExpression_Not();

		/**
		 * The meta object literal for the '<em><b>Left Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_NULL_EXPRESSION__LEFT_EXPRESSION = eINSTANCE.getIsNullExpression_LeftExpression();

		/**
		 * The meta object literal for the '{@link sql.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.FunctionImpl
		 * @see sql.impl.SqlPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>All Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__ALL_COLUMNS = eINSTANCE.getFunction_AllColumns();

		/**
		 * The meta object literal for the '<em><b>Distinct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__DISTINCT = eINSTANCE.getFunction_Distinct();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '{@link sql.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.ColumnImpl
		 * @see sql.impl.SqlPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__COLUMN_NAME = eINSTANCE.getColumn_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__TABLE = eINSTANCE.getColumn_Table();

		/**
		 * The meta object literal for the '{@link sql.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.CaseExpressionImpl
		 * @see sql.impl.SqlPackageImpl#getCaseExpression()
		 * @generated
		 */
		EClass CASE_EXPRESSION = eINSTANCE.getCaseExpression();

		/**
		 * The meta object literal for the '<em><b>Switch Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_EXPRESSION__SWITCH_EXPRESSION = eINSTANCE.getCaseExpression_SwitchExpression();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_EXPRESSION__ELSE_EXPRESSION = eINSTANCE.getCaseExpression_ElseExpression();

		/**
		 * The meta object literal for the '<em><b>When Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_EXPRESSION__WHEN_CLAUSES = eINSTANCE.getCaseExpression_WhenClauses();

		/**
		 * The meta object literal for the '{@link sql.impl.WhenClauseImpl <em>When Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.WhenClauseImpl
		 * @see sql.impl.SqlPackageImpl#getWhenClause()
		 * @generated
		 */
		EClass WHEN_CLAUSE = eINSTANCE.getWhenClause();

		/**
		 * The meta object literal for the '<em><b>When Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN_CLAUSE__WHEN_EXPRESSION = eINSTANCE.getWhenClause_WhenExpression();

		/**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN_CLAUSE__THEN_EXPRESSION = eINSTANCE.getWhenClause_ThenExpression();

		/**
		 * The meta object literal for the '{@link sql.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.StringValueImpl
		 * @see sql.impl.SqlPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link sql.impl.ExpressionListImpl <em>Expression List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sql.impl.ExpressionListImpl
		 * @see sql.impl.SqlPackageImpl#getExpressionList()
		 * @generated
		 */
		EClass EXPRESSION_LIST = eINSTANCE.getExpressionList();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LIST__EXPRESSIONS = eINSTANCE.getExpressionList_Expressions();

	}

} //SqlPackage
