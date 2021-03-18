/**
 */
package sql.impl;

import org.eclipse.emf.ecore.EClass;

import sql.GreaterThan;
import sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Greater Than</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GreaterThanImpl extends ComparisonOperatorImpl implements GreaterThan {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GreaterThanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.GREATER_THAN;
	}

} //GreaterThanImpl
