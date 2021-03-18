/**
 */
package sql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.WhenClause#getWhenExpression <em>When Expression</em>}</li>
 *   <li>{@link sql.WhenClause#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getWhenClause()
 * @model
 * @generated
 */
public interface WhenClause extends Expression {
	/**
	 * Returns the value of the '<em><b>When Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Expression</em>' containment reference.
	 * @see #setWhenExpression(Expression)
	 * @see sql.SqlPackage#getWhenClause_WhenExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getWhenExpression();

	/**
	 * Sets the value of the '{@link sql.WhenClause#getWhenExpression <em>When Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Expression</em>' containment reference.
	 * @see #getWhenExpression()
	 * @generated
	 */
	void setWhenExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Expression</em>' containment reference.
	 * @see #setThenExpression(Expression)
	 * @see sql.SqlPackage#getWhenClause_ThenExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getThenExpression();

	/**
	 * Sets the value of the '{@link sql.WhenClause#getThenExpression <em>Then Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expression</em>' containment reference.
	 * @see #getThenExpression()
	 * @generated
	 */
	void setThenExpression(Expression value);

} // WhenClause
