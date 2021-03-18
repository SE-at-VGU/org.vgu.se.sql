/**
 */
package sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sql.Join#isOuter <em>Outer</em>}</li>
 *   <li>{@link sql.Join#isRight <em>Right</em>}</li>
 *   <li>{@link sql.Join#isLeft <em>Left</em>}</li>
 *   <li>{@link sql.Join#isNatural <em>Natural</em>}</li>
 *   <li>{@link sql.Join#isFull <em>Full</em>}</li>
 *   <li>{@link sql.Join#isInner <em>Inner</em>}</li>
 *   <li>{@link sql.Join#isSimple <em>Simple</em>}</li>
 *   <li>{@link sql.Join#isCross <em>Cross</em>}</li>
 *   <li>{@link sql.Join#isSemi <em>Semi</em>}</li>
 *   <li>{@link sql.Join#isStraight <em>Straight</em>}</li>
 *   <li>{@link sql.Join#isApply <em>Apply</em>}</li>
 *   <li>{@link sql.Join#getRightItem <em>Right Item</em>}</li>
 *   <li>{@link sql.Join#getOnExpression <em>On Expression</em>}</li>
 * </ul>
 *
 * @see sql.SqlPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends EObject {
	/**
	 * Returns the value of the '<em><b>Outer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer</em>' attribute.
	 * @see #setOuter(boolean)
	 * @see sql.SqlPackage#getJoin_Outer()
	 * @model
	 * @generated
	 */
	boolean isOuter();

	/**
	 * Sets the value of the '{@link sql.Join#isOuter <em>Outer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer</em>' attribute.
	 * @see #isOuter()
	 * @generated
	 */
	void setOuter(boolean value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' attribute.
	 * @see #setRight(boolean)
	 * @see sql.SqlPackage#getJoin_Right()
	 * @model
	 * @generated
	 */
	boolean isRight();

	/**
	 * Sets the value of the '{@link sql.Join#isRight <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' attribute.
	 * @see #isRight()
	 * @generated
	 */
	void setRight(boolean value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' attribute.
	 * @see #setLeft(boolean)
	 * @see sql.SqlPackage#getJoin_Left()
	 * @model
	 * @generated
	 */
	boolean isLeft();

	/**
	 * Sets the value of the '{@link sql.Join#isLeft <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' attribute.
	 * @see #isLeft()
	 * @generated
	 */
	void setLeft(boolean value);

	/**
	 * Returns the value of the '<em><b>Natural</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Natural</em>' attribute.
	 * @see #setNatural(boolean)
	 * @see sql.SqlPackage#getJoin_Natural()
	 * @model
	 * @generated
	 */
	boolean isNatural();

	/**
	 * Sets the value of the '{@link sql.Join#isNatural <em>Natural</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Natural</em>' attribute.
	 * @see #isNatural()
	 * @generated
	 */
	void setNatural(boolean value);

	/**
	 * Returns the value of the '<em><b>Full</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full</em>' attribute.
	 * @see #setFull(boolean)
	 * @see sql.SqlPackage#getJoin_Full()
	 * @model
	 * @generated
	 */
	boolean isFull();

	/**
	 * Sets the value of the '{@link sql.Join#isFull <em>Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full</em>' attribute.
	 * @see #isFull()
	 * @generated
	 */
	void setFull(boolean value);

	/**
	 * Returns the value of the '<em><b>Inner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner</em>' attribute.
	 * @see #setInner(boolean)
	 * @see sql.SqlPackage#getJoin_Inner()
	 * @model
	 * @generated
	 */
	boolean isInner();

	/**
	 * Sets the value of the '{@link sql.Join#isInner <em>Inner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner</em>' attribute.
	 * @see #isInner()
	 * @generated
	 */
	void setInner(boolean value);

	/**
	 * Returns the value of the '<em><b>Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple</em>' attribute.
	 * @see #setSimple(boolean)
	 * @see sql.SqlPackage#getJoin_Simple()
	 * @model
	 * @generated
	 */
	boolean isSimple();

	/**
	 * Sets the value of the '{@link sql.Join#isSimple <em>Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple</em>' attribute.
	 * @see #isSimple()
	 * @generated
	 */
	void setSimple(boolean value);

	/**
	 * Returns the value of the '<em><b>Cross</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross</em>' attribute.
	 * @see #setCross(boolean)
	 * @see sql.SqlPackage#getJoin_Cross()
	 * @model
	 * @generated
	 */
	boolean isCross();

	/**
	 * Sets the value of the '{@link sql.Join#isCross <em>Cross</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross</em>' attribute.
	 * @see #isCross()
	 * @generated
	 */
	void setCross(boolean value);

	/**
	 * Returns the value of the '<em><b>Semi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semi</em>' attribute.
	 * @see #setSemi(boolean)
	 * @see sql.SqlPackage#getJoin_Semi()
	 * @model
	 * @generated
	 */
	boolean isSemi();

	/**
	 * Sets the value of the '{@link sql.Join#isSemi <em>Semi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semi</em>' attribute.
	 * @see #isSemi()
	 * @generated
	 */
	void setSemi(boolean value);

	/**
	 * Returns the value of the '<em><b>Straight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Straight</em>' attribute.
	 * @see #setStraight(boolean)
	 * @see sql.SqlPackage#getJoin_Straight()
	 * @model
	 * @generated
	 */
	boolean isStraight();

	/**
	 * Sets the value of the '{@link sql.Join#isStraight <em>Straight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Straight</em>' attribute.
	 * @see #isStraight()
	 * @generated
	 */
	void setStraight(boolean value);

	/**
	 * Returns the value of the '<em><b>Apply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply</em>' attribute.
	 * @see #setApply(boolean)
	 * @see sql.SqlPackage#getJoin_Apply()
	 * @model
	 * @generated
	 */
	boolean isApply();

	/**
	 * Sets the value of the '{@link sql.Join#isApply <em>Apply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply</em>' attribute.
	 * @see #isApply()
	 * @generated
	 */
	void setApply(boolean value);

	/**
	 * Returns the value of the '<em><b>Right Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Item</em>' containment reference.
	 * @see #setRightItem(FromItem)
	 * @see sql.SqlPackage#getJoin_RightItem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FromItem getRightItem();

	/**
	 * Sets the value of the '{@link sql.Join#getRightItem <em>Right Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Item</em>' containment reference.
	 * @see #getRightItem()
	 * @generated
	 */
	void setRightItem(FromItem value);

	/**
	 * Returns the value of the '<em><b>On Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Expression</em>' containment reference.
	 * @see #setOnExpression(Expression)
	 * @see sql.SqlPackage#getJoin_OnExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOnExpression();

	/**
	 * Sets the value of the '{@link sql.Join#getOnExpression <em>On Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Expression</em>' containment reference.
	 * @see #getOnExpression()
	 * @generated
	 */
	void setOnExpression(Expression value);

} // Join
