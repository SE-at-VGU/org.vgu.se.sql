/**
 */
package sql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.PlainSelect#getDistinct <em>Distinct</em>}</li>
 *   <li>{@link sql.PlainSelect#getSelectItems <em>Select Items</em>}</li>
 *   <li>{@link sql.PlainSelect#getFromItem <em>From Item</em>}</li>
 *   <li>{@link sql.PlainSelect#getJoins <em>Joins</em>}</li>
 *   <li>{@link sql.PlainSelect#getWhere <em>Where</em>}</li>
 *   <li>{@link sql.PlainSelect#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link sql.PlainSelect#getHaving <em>Having</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getPlainSelect()
 * @model
 * @generated
 */
public interface PlainSelect extends SelectBody {
	/**
	 * Returns the value of the '<em><b>Distinct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinct</em>' containment reference.
	 * @see #setDistinct(Distinct)
	 * @see sql.SqlPackage#getPlainSelect_Distinct()
	 * @model containment="true"
	 * @generated
	 */
	Distinct getDistinct();

	/**
	 * Sets the value of the '{@link sql.PlainSelect#getDistinct <em>Distinct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct</em>' containment reference.
	 * @see #getDistinct()
	 * @generated
	 */
	void setDistinct(Distinct value);

	/**
	 * Returns the value of the '<em><b>Select Items</b></em>' containment reference list.
	 * The list contents are of type {@link sql.SelectItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Items</em>' containment reference list.
	 * @see sql.SqlPackage#getPlainSelect_SelectItems()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SelectItem> getSelectItems();

	/**
	 * Returns the value of the '<em><b>From Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Item</em>' containment reference.
	 * @see #setFromItem(FromItem)
	 * @see sql.SqlPackage#getPlainSelect_FromItem()
	 * @model containment="true"
	 * @generated
	 */
	FromItem getFromItem();

	/**
	 * Sets the value of the '{@link sql.PlainSelect#getFromItem <em>From Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Item</em>' containment reference.
	 * @see #getFromItem()
	 * @generated
	 */
	void setFromItem(FromItem value);

	/**
	 * Returns the value of the '<em><b>Joins</b></em>' containment reference list.
	 * The list contents are of type {@link sql.Join}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joins</em>' containment reference list.
	 * @see sql.SqlPackage#getPlainSelect_Joins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Join> getJoins();

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Expression)
	 * @see sql.SqlPackage#getPlainSelect_Where()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWhere();

	/**
	 * Sets the value of the '{@link sql.PlainSelect#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Expression value);

	/**
	 * Returns the value of the '<em><b>Group By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group By</em>' containment reference.
	 * @see #setGroupBy(GroupByElement)
	 * @see sql.SqlPackage#getPlainSelect_GroupBy()
	 * @model containment="true"
	 * @generated
	 */
	GroupByElement getGroupBy();

	/**
	 * Sets the value of the '{@link sql.PlainSelect#getGroupBy <em>Group By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group By</em>' containment reference.
	 * @see #getGroupBy()
	 * @generated
	 */
	void setGroupBy(GroupByElement value);

	/**
	 * Returns the value of the '<em><b>Having</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Having</em>' containment reference.
	 * @see #setHaving(Expression)
	 * @see sql.SqlPackage#getPlainSelect_Having()
	 * @model containment="true"
	 * @generated
	 */
	Expression getHaving();

	/**
	 * Sets the value of the '{@link sql.PlainSelect#getHaving <em>Having</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Having</em>' containment reference.
	 * @see #getHaving()
	 * @generated
	 */
	void setHaving(Expression value);

} // PlainSelect
