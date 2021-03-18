/**
 */
package sql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sql.Expression;
import sql.GroupByElement;
import sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group By Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql.impl.GroupByElementImpl#getGroupByExpressions <em>Group By Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupByElementImpl extends MinimalEObjectImpl.Container implements GroupByElement {
	/**
	 * The cached value of the '{@link #getGroupByExpressions() <em>Group By Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupByExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> groupByExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupByElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.GROUP_BY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getGroupByExpressions() {
		if (groupByExpressions == null) {
			groupByExpressions = new EObjectContainmentEList<Expression>(Expression.class, this, SqlPackage.GROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS);
		}
		return groupByExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SqlPackage.GROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS:
				return ((InternalEList<?>)getGroupByExpressions()).basicRemove(otherEnd, msgs);
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
			case SqlPackage.GROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS:
				return getGroupByExpressions();
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
			case SqlPackage.GROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS:
				getGroupByExpressions().clear();
				getGroupByExpressions().addAll((Collection<? extends Expression>)newValue);
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
			case SqlPackage.GROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS:
				getGroupByExpressions().clear();
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
			case SqlPackage.GROUP_BY_ELEMENT__GROUP_BY_EXPRESSIONS:
				return groupByExpressions != null && !groupByExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupByElementImpl
