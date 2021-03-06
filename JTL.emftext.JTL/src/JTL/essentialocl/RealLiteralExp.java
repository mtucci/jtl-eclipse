/**
 */
package JTL.essentialocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JTL.essentialocl.RealLiteralExp#getRealSymbol <em>Real Symbol</em>}</li>
 * </ul>
 *
 * @see JTL.essentialocl.EssentialoclPackage#getRealLiteralExp()
 * @model
 * @generated
 */
public interface RealLiteralExp extends NumericLiteralExp {
	/**
	 * Returns the value of the '<em><b>Real Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Symbol</em>' attribute.
	 * @see #setRealSymbol(float)
	 * @see JTL.essentialocl.EssentialoclPackage#getRealLiteralExp_RealSymbol()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	float getRealSymbol();

	/**
	 * Sets the value of the '{@link JTL.essentialocl.RealLiteralExp#getRealSymbol <em>Real Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Symbol</em>' attribute.
	 * @see #getRealSymbol()
	 * @generated
	 */
	void setRealSymbol(float value);

} // RealLiteralExp
