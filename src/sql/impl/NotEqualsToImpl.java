/**
 */
package sql.impl;

import org.eclipse.emf.ecore.EClass;

import sql.NotEqualsTo;
import sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Equals To</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NotEqualsToImpl extends ComparisonOperatorImpl implements NotEqualsTo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotEqualsToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.NOT_EQUALS_TO;
	}

} //NotEqualsToImpl
