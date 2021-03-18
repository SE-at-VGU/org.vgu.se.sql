/**
 */
package sql.impl;

import org.eclipse.emf.ecore.EClass;

import sql.OrExpression;
import sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OrExpressionImpl extends BinaryExpressionImpl implements OrExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.OR_EXPRESSION;
	}

} //OrExpressionImpl
