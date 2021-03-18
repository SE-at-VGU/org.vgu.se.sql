/**
 */
package sql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.CaseExpression#getSwitchExpression <em>Switch Expression</em>}</li>
 *   <li>{@link sql.CaseExpression#getElseExpression <em>Else Expression</em>}</li>
 *   <li>{@link sql.CaseExpression#getWhenClauses <em>When Clauses</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getCaseExpression()
 * @model
 * @generated
 */
public interface CaseExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Switch Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Expression</em>' containment reference.
	 * @see #setSwitchExpression(Expression)
	 * @see sql.SqlPackage#getCaseExpression_SwitchExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSwitchExpression();

	/**
	 * Sets the value of the '{@link sql.CaseExpression#getSwitchExpression <em>Switch Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Expression</em>' containment reference.
	 * @see #getSwitchExpression()
	 * @generated
	 */
	void setSwitchExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expression</em>' containment reference.
	 * @see #setElseExpression(Expression)
	 * @see sql.SqlPackage#getCaseExpression_ElseExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getElseExpression();

	/**
	 * Sets the value of the '{@link sql.CaseExpression#getElseExpression <em>Else Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expression</em>' containment reference.
	 * @see #getElseExpression()
	 * @generated
	 */
	void setElseExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>When Clauses</b></em>' containment reference list.
	 * The list contents are of type {@link sql.WhenClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Clauses</em>' containment reference list.
	 * @see sql.SqlPackage#getCaseExpression_WhenClauses()
	 * @model containment="true"
	 * @generated
	 */
	EList<WhenClause> getWhenClauses();

} // CaseExpression
