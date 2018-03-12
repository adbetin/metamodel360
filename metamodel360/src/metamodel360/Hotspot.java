/**
 */
package metamodel360;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotspot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel360.Hotspot#getName <em>Name</em>}</li>
 *   <li>{@link metamodel360.Hotspot#getPosicion <em>Posicion</em>}</li>
 *   <li>{@link metamodel360.Hotspot#getRotacion <em>Rotacion</em>}</li>
 *   <li>{@link metamodel360.Hotspot#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @see metamodel360.Metamodel360Package#getHotspot()
 * @model
 * @generated
 */
public interface Hotspot extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodel360.Metamodel360Package#getHotspot_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel360.Hotspot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Posicion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posicion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posicion</em>' containment reference.
	 * @see #setPosicion(Posicion)
	 * @see metamodel360.Metamodel360Package#getHotspot_Posicion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Posicion getPosicion();

	/**
	 * Sets the value of the '{@link metamodel360.Hotspot#getPosicion <em>Posicion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posicion</em>' containment reference.
	 * @see #getPosicion()
	 * @generated
	 */
	void setPosicion(Posicion value);

	/**
	 * Returns the value of the '<em><b>Rotacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotacion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotacion</em>' containment reference.
	 * @see #setRotacion(Rotacion)
	 * @see metamodel360.Metamodel360Package#getHotspot_Rotacion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rotacion getRotacion();

	/**
	 * Sets the value of the '{@link metamodel360.Hotspot#getRotacion <em>Rotacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotacion</em>' containment reference.
	 * @see #getRotacion()
	 * @generated
	 */
	void setRotacion(Rotacion value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Panorama)
	 * @see metamodel360.Metamodel360Package#getHotspot_Destino()
	 * @model required="true"
	 * @generated
	 */
	Panorama getDestino();

	/**
	 * Sets the value of the '{@link metamodel360.Hotspot#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Panorama value);

} // Hotspot
