/**
 */
package metamodel360;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panorama</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel360.Panorama#getName <em>Name</em>}</li>
 *   <li>{@link metamodel360.Panorama#getHotspots <em>Hotspots</em>}</li>
 *   <li>{@link metamodel360.Panorama#getImagen <em>Imagen</em>}</li>
 * </ul>
 *
 * @see metamodel360.Metamodel360Package#getPanorama()
 * @model
 * @generated
 */
public interface Panorama extends EObject {
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
	 * @see metamodel360.Metamodel360Package#getPanorama_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel360.Panorama#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hotspots</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel360.Hotspot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hotspots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hotspots</em>' containment reference list.
	 * @see metamodel360.Metamodel360Package#getPanorama_Hotspots()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Hotspot> getHotspots();

	/**
	 * Returns the value of the '<em><b>Imagen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imagen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imagen</em>' attribute.
	 * @see #setImagen(String)
	 * @see metamodel360.Metamodel360Package#getPanorama_Imagen()
	 * @model
	 * @generated
	 */
	String getImagen();

	/**
	 * Sets the value of the '{@link metamodel360.Panorama#getImagen <em>Imagen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imagen</em>' attribute.
	 * @see #getImagen()
	 * @generated
	 */
	void setImagen(String value);

} // Panorama
