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

import sql.CaseExpression;
import sql.Expression;
import sql.SqlPackage;
import sql.WhenClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql.impl.CaseExpressionImpl#getSwitchExpression <em>Switch Expression</em>}</li>
 *   <li>{@link sql.impl.CaseExpressionImpl#getElseExpression <em>Else Expression</em>}</li>
 *   <li>{@link sql.impl.CaseExpressionImpl#getWhenClauses <em>When Clauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseExpressionImpl extends MinimalEObjectImpl.Container implements CaseExpression {
	/**
	 * The cached value of the '{@link #getSwitchExpression() <em>Switch Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression switchExpression;

	/**
	 * The cached value of the '{@link #getElseExpression() <em>Else Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression elseExpression;

	/**
	 * The cached value of the '{@link #getWhenClauses() <em>When Clauses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenClauses()
	 * @generated
	 * @ordered
	 */
	protected EList<WhenClause> whenClauses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.CASE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getSwitchExpression() {
		return switchExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitchExpression(Expression newSwitchExpression, NotificationChain msgs) {
		Expression oldSwitchExpression = switchExpression;
		switchExpression = newSwitchExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.CASE_EXPRESSION__SWITCH_EXPRESSION, oldSwitchExpression, newSwitchExpression);
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
	public void setSwitchExpression(Expression newSwitchExpression) {
		if (newSwitchExpression != switchExpression) {
			NotificationChain msgs = null;
			if (switchExpression != null)
				msgs = ((InternalEObject)switchExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.CASE_EXPRESSION__SWITCH_EXPRESSION, null, msgs);
			if (newSwitchExpression != null)
				msgs = ((InternalEObject)newSwitchExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.CASE_EXPRESSION__SWITCH_EXPRESSION, null, msgs);
			msgs = basicSetSwitchExpression(newSwitchExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.CASE_EXPRESSION__SWITCH_EXPRESSION, newSwitchExpression, newSwitchExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getElseExpression() {
		return elseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseExpression(Expression newElseExpression, NotificationChain msgs) {
		Expression oldElseExpression = elseExpression;
		elseExpression = newElseExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.CASE_EXPRESSION__ELSE_EXPRESSION, oldElseExpression, newElseExpression);
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
	public void setElseExpression(Expression newElseExpression) {
		if (newElseExpression != elseExpression) {
			NotificationChain msgs = null;
			if (elseExpression != null)
				msgs = ((InternalEObject)elseExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.CASE_EXPRESSION__ELSE_EXPRESSION, null, msgs);
			if (newElseExpression != null)
				msgs = ((InternalEObject)newElseExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.CASE_EXPRESSION__ELSE_EXPRESSION, null, msgs);
			msgs = basicSetElseExpression(newElseExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.CASE_EXPRESSION__ELSE_EXPRESSION, newElseExpression, newElseExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WhenClause> getWhenClauses() {
		if (whenClauses == null) {
			whenClauses = new EObjectContainmentEList<WhenClause>(WhenClause.class, this, SqlPackage.CASE_EXPRESSION__WHEN_CLAUSES);
		}
		return whenClauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SqlPackage.CASE_EXPRESSION__SWITCH_EXPRESSION:
				return basicSetSwitchExpression(null, msgs);
			case SqlPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
				return basicSetElseExpression(null, msgs);
			case SqlPackage.CASE_EXPRESSION__WHEN_CLAUSES:
				return ((InternalEList<?>)getWhenClauses()).basicRemove(otherEnd, msgs);
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
			case SqlPackage.CASE_EXPRESSION__SWITCH_EXPRESSION:
				return getSwitchExpression();
			case SqlPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
				return getElseExpression();
			case SqlPackage.CASE_EXPRESSION__WHEN_CLAUSES:
				return getWhenClauses();
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
			case SqlPackage.CASE_EXPRESSION__SWITCH_EXPRESSION:
				setSwitchExpression((Expression)newValue);
				return;
			case SqlPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
				setElseExpression((Expression)newValue);
				return;
			case SqlPackage.CASE_EXPRESSION__WHEN_CLAUSES:
				getWhenClauses().clear();
				getWhenClauses().addAll((Collection<? extends WhenClause>)newValue);
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
			case SqlPackage.CASE_EXPRESSION__SWITCH_EXPRESSION:
				setSwitchExpression((Expression)null);
				return;
			case SqlPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
				setElseExpression((Expression)null);
				return;
			case SqlPackage.CASE_EXPRESSION__WHEN_CLAUSES:
				getWhenClauses().clear();
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
			case SqlPackage.CASE_EXPRESSION__SWITCH_EXPRESSION:
				return switchExpression != null;
			case SqlPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
				return elseExpression != null;
			case SqlPackage.CASE_EXPRESSION__WHEN_CLAUSES:
				return whenClauses != null && !whenClauses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CaseExpressionImpl
