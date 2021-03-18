/**
 */
package sql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sql.Distinct;
import sql.SelectItem;
import sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distinct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql.impl.DistinctImpl#isUseUnique <em>Use Unique</em>}</li>
 *   <li>{@link sql.impl.DistinctImpl#getOnSelectItems <em>On Select Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistinctImpl extends MinimalEObjectImpl.Container implements Distinct {
	/**
	 * The default value of the '{@link #isUseUnique() <em>Use Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseUnique() <em>Use Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean useUnique = USE_UNIQUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnSelectItems() <em>On Select Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnSelectItems()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectItem> onSelectItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistinctImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.DISTINCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseUnique() {
		return useUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseUnique(boolean newUseUnique) {
		boolean oldUseUnique = useUnique;
		useUnique = newUseUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.DISTINCT__USE_UNIQUE, oldUseUnique, useUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelectItem> getOnSelectItems() {
		if (onSelectItems == null) {
			onSelectItems = new EObjectContainmentEList<SelectItem>(SelectItem.class, this, SqlPackage.DISTINCT__ON_SELECT_ITEMS);
		}
		return onSelectItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SqlPackage.DISTINCT__ON_SELECT_ITEMS:
				return ((InternalEList<?>)getOnSelectItems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SqlPackage.DISTINCT__USE_UNIQUE:
				return isUseUnique();
			case SqlPackage.DISTINCT__ON_SELECT_ITEMS:
				return getOnSelectItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SqlPackage.DISTINCT__USE_UNIQUE:
				setUseUnique((Boolean)newValue);
				return;
			case SqlPackage.DISTINCT__ON_SELECT_ITEMS:
				getOnSelectItems().clear();
				getOnSelectItems().addAll((Collection<? extends SelectItem>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SqlPackage.DISTINCT__USE_UNIQUE:
				setUseUnique(USE_UNIQUE_EDEFAULT);
				return;
			case SqlPackage.DISTINCT__ON_SELECT_ITEMS:
				getOnSelectItems().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SqlPackage.DISTINCT__USE_UNIQUE:
				return useUnique != USE_UNIQUE_EDEFAULT;
			case SqlPackage.DISTINCT__ON_SELECT_ITEMS:
				return onSelectItems != null && !onSelectItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (useUnique: ");
		result.append(useUnique);
		result.append(')');
		return result.toString();
	}

} //DistinctImpl
