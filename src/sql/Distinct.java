/**
 */
package sql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distinct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.Distinct#isUseUnique <em>Use Unique</em>}</li>
 *   <li>{@link sql.Distinct#getOnSelectItems <em>On Select Items</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getDistinct()
 * @model
 * @generated
 */
public interface Distinct extends EObject {
	/**
	 * Returns the value of the '<em><b>Use Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Unique</em>' attribute.
	 * @see #setUseUnique(boolean)
	 * @see sql.SqlPackage#getDistinct_UseUnique()
	 * @model
	 * @generated
	 */
	boolean isUseUnique();

	/**
	 * Sets the value of the '{@link sql.Distinct#isUseUnique <em>Use Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Unique</em>' attribute.
	 * @see #isUseUnique()
	 * @generated
	 */
	void setUseUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>On Select Items</b></em>' containment reference list.
	 * The list contents are of type {@link sql.SelectItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Select Items</em>' containment reference list.
	 * @see sql.SqlPackage#getDistinct_OnSelectItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<SelectItem> getOnSelectItems();

} // Distinct
