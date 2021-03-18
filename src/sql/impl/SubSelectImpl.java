/**
 */
package sql.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sql.Alias;
import sql.SelectBody;
import sql.SqlPackage;
import sql.SubSelect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql.impl.SubSelectImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link sql.impl.SubSelectImpl#getSelectBody <em>Select Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubSelectImpl extends MinimalEObjectImpl.Container implements SubSelect {
	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected Alias alias;

	/**
	 * The cached value of the '{@link #getSelectBody() <em>Select Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectBody()
	 * @generated
	 * @ordered
	 */
	protected SelectBody selectBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.SUB_SELECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alias getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlias(Alias newAlias, NotificationChain msgs) {
		Alias oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.SUB_SELECT__ALIAS, oldAlias, newAlias);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlias(Alias newAlias) {
		if (newAlias != alias) {
			NotificationChain msgs = null;
			if (alias != null)
				msgs = ((InternalEObject)alias).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.SUB_SELECT__ALIAS, null, msgs);
			if (newAlias != null)
				msgs = ((InternalEObject)newAlias).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.SUB_SELECT__ALIAS, null, msgs);
			msgs = basicSetAlias(newAlias, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.SUB_SELECT__ALIAS, newAlias, newAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectBody getSelectBody() {
		return selectBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectBody(SelectBody newSelectBody, NotificationChain msgs) {
		SelectBody oldSelectBody = selectBody;
		selectBody = newSelectBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.SUB_SELECT__SELECT_BODY, oldSelectBody, newSelectBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectBody(SelectBody newSelectBody) {
		if (newSelectBody != selectBody) {
			NotificationChain msgs = null;
			if (selectBody != null)
				msgs = ((InternalEObject)selectBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.SUB_SELECT__SELECT_BODY, null, msgs);
			if (newSelectBody != null)
				msgs = ((InternalEObject)newSelectBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.SUB_SELECT__SELECT_BODY, null, msgs);
			msgs = basicSetSelectBody(newSelectBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.SUB_SELECT__SELECT_BODY, newSelectBody, newSelectBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SqlPackage.SUB_SELECT__ALIAS:
				return basicSetAlias(null, msgs);
			case SqlPackage.SUB_SELECT__SELECT_BODY:
				return basicSetSelectBody(null, msgs);
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
			case SqlPackage.SUB_SELECT__ALIAS:
				return getAlias();
			case SqlPackage.SUB_SELECT__SELECT_BODY:
				return getSelectBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SqlPackage.SUB_SELECT__ALIAS:
				setAlias((Alias)newValue);
				return;
			case SqlPackage.SUB_SELECT__SELECT_BODY:
				setSelectBody((SelectBody)newValue);
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
			case SqlPackage.SUB_SELECT__ALIAS:
				setAlias((Alias)null);
				return;
			case SqlPackage.SUB_SELECT__SELECT_BODY:
				setSelectBody((SelectBody)null);
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
			case SqlPackage.SUB_SELECT__ALIAS:
				return alias != null;
			case SqlPackage.SUB_SELECT__SELECT_BODY:
				return selectBody != null;
		}
		return super.eIsSet(featureID);
	}

} //SubSelectImpl
