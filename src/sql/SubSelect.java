/**
 */
package sql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.SubSelect#getAlias <em>Alias</em>}</li>
 *   <li>{@link sql.SubSelect#getSelectBody <em>Select Body</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getSubSelect()
 * @model
 * @generated
 */
public interface SubSelect extends FromItem, Expression {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference.
	 * @see #setAlias(Alias)
	 * @see sql.SqlPackage#getSubSelect_Alias()
	 * @model containment="true"
	 * @generated
	 */
	Alias getAlias();

	/**
	 * Sets the value of the '{@link sql.SubSelect#getAlias <em>Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' containment reference.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(Alias value);

	/**
	 * Returns the value of the '<em><b>Select Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Body</em>' containment reference.
	 * @see #setSelectBody(SelectBody)
	 * @see sql.SqlPackage#getSubSelect_SelectBody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SelectBody getSelectBody();

	/**
	 * Sets the value of the '{@link sql.SubSelect#getSelectBody <em>Select Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Body</em>' containment reference.
	 * @see #getSelectBody()
	 * @generated
	 */
	void setSelectBody(SelectBody value);

} // SubSelect
