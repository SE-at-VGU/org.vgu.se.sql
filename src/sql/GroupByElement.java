/**
 */
package sql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group By Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.GroupByElement#getGroupByExpressions <em>Group By Expressions</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getGroupByElement()
 * @model
 * @generated
 */
public interface GroupByElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Group By Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link sql.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group By Expressions</em>' containment reference list.
	 * @see sql.SqlPackage#getGroupByElement_GroupByExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getGroupByExpressions();

} // GroupByElement
