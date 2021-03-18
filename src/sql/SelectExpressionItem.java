/**
 */
package sql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Expression Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.SelectExpressionItem#getAlias <em>Alias</em>}</li>
 *   <li>{@link sql.SelectExpressionItem#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getSelectExpressionItem()
 * @model
 * @generated
 */
public interface SelectExpressionItem extends SelectItem {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference.
	 * @see #setAlias(Alias)
	 * @see sql.SqlPackage#getSelectExpressionItem_Alias()
	 * @model containment="true"
	 * @generated
	 */
	Alias getAlias();

	/**
	 * Sets the value of the '{@link sql.SelectExpressionItem#getAlias <em>Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' containment reference.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(Alias value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see sql.SqlPackage#getSelectExpressionItem_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link sql.SelectExpressionItem#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // SelectExpressionItem
