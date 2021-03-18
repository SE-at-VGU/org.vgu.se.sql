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
import sql.Expression;
import sql.FromItem;
import sql.GroupByElement;
import sql.Join;
import sql.PlainSelect;
import sql.SelectItem;
import sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plain Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sql.impl.PlainSelectImpl#getDistinct <em>Distinct</em>}</li>
 *   <li>{@link sql.impl.PlainSelectImpl#getSelectItems <em>Select Items</em>}</li>
 *   <li>{@link sql.impl.PlainSelectImpl#getFromItem <em>From Item</em>}</li>
 *   <li>{@link sql.impl.PlainSelectImpl#getJoins <em>Joins</em>}</li>
 *   <li>{@link sql.impl.PlainSelectImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link sql.impl.PlainSelectImpl#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link sql.impl.PlainSelectImpl#getHaving <em>Having</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlainSelectImpl extends MinimalEObjectImpl.Container implements PlainSelect {
	/**
	 * The cached value of the '{@link #getDistinct() <em>Distinct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistinct()
	 * @generated
	 * @ordered
	 */
	protected Distinct distinct;

	/**
	 * The cached value of the '{@link #getSelectItems() <em>Select Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectItems()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectItem> selectItems;

	/**
	 * The cached value of the '{@link #getFromItem() <em>From Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromItem()
	 * @generated
	 * @ordered
	 */
	protected FromItem fromItem;

	/**
	 * The cached value of the '{@link #getJoins() <em>Joins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoins()
	 * @generated
	 * @ordered
	 */
	protected EList<Join> joins;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected Expression where;

	/**
	 * The cached value of the '{@link #getGroupBy() <em>Group By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupBy()
	 * @generated
	 * @ordered
	 */
	protected GroupByElement groupBy;

	/**
	 * The cached value of the '{@link #getHaving() <em>Having</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaving()
	 * @generated
	 * @ordered
	 */
	protected Expression having;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlainSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.PLAIN_SELECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Distinct getDistinct() {
		return distinct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistinct(Distinct newDistinct, NotificationChain msgs) {
		Distinct oldDistinct = distinct;
		distinct = newDistinct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.PLAIN_SELECT__DISTINCT, oldDistinct, newDistinct);
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
	public void setDistinct(Distinct newDistinct) {
		if (newDistinct != distinct) {
			NotificationChain msgs = null;
			if (distinct != null)
				msgs = ((InternalEObject)distinct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.PLAIN_SELECT__DISTINCT, null, msgs);
			if (newDistinct != null)
				msgs = ((InternalEObject)newDistinct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.PLAIN_SELECT__DISTINCT, null, msgs);
			msgs = basicSetDistinct(newDistinct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.PLAIN_SELECT__DISTINCT, newDistinct, newDistinct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SelectItem> getSelectItems() {
		if (selectItems == null) {
			selectItems = new EObjectContainmentEList<SelectItem>(SelectItem.class, this, SqlPackage.PLAIN_SELECT__SELECT_ITEMS);
		}
		return selectItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromItem getFromItem() {
		return fromItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromItem(FromItem newFromItem, NotificationChain msgs) {
		FromItem oldFromItem = fromItem;
		fromItem = newFromItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.PLAIN_SELECT__FROM_ITEM, oldFromItem, newFromItem);
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
	public void setFromItem(FromItem newFromItem) {
		if (newFromItem != fromItem) {
			NotificationChain msgs = null;
			if (fromItem != null)
				msgs = ((InternalEObject)fromItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.PLAIN_SELECT__FROM_ITEM, null, msgs);
			if (newFromItem != null)
				msgs = ((InternalEObject)newFromItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.PLAIN_SELECT__FROM_ITEM, null, msgs);
			msgs = basicSetFromItem(newFromItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.PLAIN_SELECT__FROM_ITEM, newFromItem, newFromItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Join> getJoins() {
		if (joins == null) {
			joins = new EObjectContainmentEList<Join>(Join.class, this, SqlPackage.PLAIN_SELECT__JOINS);
		}
		return joins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Expression newWhere, NotificationChain msgs) {
		Expression oldWhere = where;
		where = newWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.PLAIN_SELECT__WHERE, oldWhere, newWhere);
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
	public void setWhere(Expression newWhere) {
		if (newWhere != where) {
			NotificationChain msgs = null;
			if (where != null)
				msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.PLAIN_SELECT__WHERE, null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.PLAIN_SELECT__WHERE, null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.PLAIN_SELECT__WHERE, newWhere, newWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupByElement getGroupBy() {
		return groupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupBy(GroupByElement newGroupBy, NotificationChain msgs) {
		GroupByElement oldGroupBy = groupBy;
		groupBy = newGroupBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.PLAIN_SELECT__GROUP_BY, oldGroupBy, newGroupBy);
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
	public void setGroupBy(GroupByElement newGroupBy) {
		if (newGroupBy != groupBy) {
			NotificationChain msgs = null;
			if (groupBy != null)
				msgs = ((InternalEObject)groupBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.PLAIN_SELECT__GROUP_BY, null, msgs);
			if (newGroupBy != null)
				msgs = ((InternalEObject)newGroupBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.PLAIN_SELECT__GROUP_BY, null, msgs);
			msgs = basicSetGroupBy(newGroupBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.PLAIN_SELECT__GROUP_BY, newGroupBy, newGroupBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getHaving() {
		return having;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHaving(Expression newHaving, NotificationChain msgs) {
		Expression oldHaving = having;
		having = newHaving;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.PLAIN_SELECT__HAVING, oldHaving, newHaving);
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
	public void setHaving(Expression newHaving) {
		if (newHaving != having) {
			NotificationChain msgs = null;
			if (having != null)
				msgs = ((InternalEObject)having).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.PLAIN_SELECT__HAVING, null, msgs);
			if (newHaving != null)
				msgs = ((InternalEObject)newHaving).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.PLAIN_SELECT__HAVING, null, msgs);
			msgs = basicSetHaving(newHaving, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.PLAIN_SELECT__HAVING, newHaving, newHaving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SqlPackage.PLAIN_SELECT__DISTINCT:
				return basicSetDistinct(null, msgs);
			case SqlPackage.PLAIN_SELECT__SELECT_ITEMS:
				return ((InternalEList<?>)getSelectItems()).basicRemove(otherEnd, msgs);
			case SqlPackage.PLAIN_SELECT__FROM_ITEM:
				return basicSetFromItem(null, msgs);
			case SqlPackage.PLAIN_SELECT__JOINS:
				return ((InternalEList<?>)getJoins()).basicRemove(otherEnd, msgs);
			case SqlPackage.PLAIN_SELECT__WHERE:
				return basicSetWhere(null, msgs);
			case SqlPackage.PLAIN_SELECT__GROUP_BY:
				return basicSetGroupBy(null, msgs);
			case SqlPackage.PLAIN_SELECT__HAVING:
				return basicSetHaving(null, msgs);
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
			case SqlPackage.PLAIN_SELECT__DISTINCT:
				return getDistinct();
			case SqlPackage.PLAIN_SELECT__SELECT_ITEMS:
				return getSelectItems();
			case SqlPackage.PLAIN_SELECT__FROM_ITEM:
				return getFromItem();
			case SqlPackage.PLAIN_SELECT__JOINS:
				return getJoins();
			case SqlPackage.PLAIN_SELECT__WHERE:
				return getWhere();
			case SqlPackage.PLAIN_SELECT__GROUP_BY:
				return getGroupBy();
			case SqlPackage.PLAIN_SELECT__HAVING:
				return getHaving();
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
			case SqlPackage.PLAIN_SELECT__DISTINCT:
				setDistinct((Distinct)newValue);
				return;
			case SqlPackage.PLAIN_SELECT__SELECT_ITEMS:
				getSelectItems().clear();
				getSelectItems().addAll((Collection<? extends SelectItem>)newValue);
				return;
			case SqlPackage.PLAIN_SELECT__FROM_ITEM:
				setFromItem((FromItem)newValue);
				return;
			case SqlPackage.PLAIN_SELECT__JOINS:
				getJoins().clear();
				getJoins().addAll((Collection<? extends Join>)newValue);
				return;
			case SqlPackage.PLAIN_SELECT__WHERE:
				setWhere((Expression)newValue);
				return;
			case SqlPackage.PLAIN_SELECT__GROUP_BY:
				setGroupBy((GroupByElement)newValue);
				return;
			case SqlPackage.PLAIN_SELECT__HAVING:
				setHaving((Expression)newValue);
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
			case SqlPackage.PLAIN_SELECT__DISTINCT:
				setDistinct((Distinct)null);
				return;
			case SqlPackage.PLAIN_SELECT__SELECT_ITEMS:
				getSelectItems().clear();
				return;
			case SqlPackage.PLAIN_SELECT__FROM_ITEM:
				setFromItem((FromItem)null);
				return;
			case SqlPackage.PLAIN_SELECT__JOINS:
				getJoins().clear();
				return;
			case SqlPackage.PLAIN_SELECT__WHERE:
				setWhere((Expression)null);
				return;
			case SqlPackage.PLAIN_SELECT__GROUP_BY:
				setGroupBy((GroupByElement)null);
				return;
			case SqlPackage.PLAIN_SELECT__HAVING:
				setHaving((Expression)null);
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
			case SqlPackage.PLAIN_SELECT__DISTINCT:
				return distinct != null;
			case SqlPackage.PLAIN_SELECT__SELECT_ITEMS:
				return selectItems != null && !selectItems.isEmpty();
			case SqlPackage.PLAIN_SELECT__FROM_ITEM:
				return fromItem != null;
			case SqlPackage.PLAIN_SELECT__JOINS:
				return joins != null && !joins.isEmpty();
			case SqlPackage.PLAIN_SELECT__WHERE:
				return where != null;
			case SqlPackage.PLAIN_SELECT__GROUP_BY:
				return groupBy != null;
			case SqlPackage.PLAIN_SELECT__HAVING:
				return having != null;
		}
		return super.eIsSet(featureID);
	}

} //PlainSelectImpl
