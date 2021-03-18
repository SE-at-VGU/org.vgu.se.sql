/**
 */
package sql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.Select#getSelectBody <em>Select Body</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends Statement {
	/**
	 * Returns the value of the '<em><b>Select Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Body</em>' containment reference.
	 * @see #setSelectBody(SelectBody)
	 * @see sql.SqlPackage#getSelect_SelectBody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SelectBody getSelectBody();

	/**
	 * Sets the value of the '{@link sql.Select#getSelectBody <em>Select Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Body</em>' containment reference.
	 * @see #getSelectBody()
	 * @generated
	 */
	void setSelectBody(SelectBody value);

} // Select
