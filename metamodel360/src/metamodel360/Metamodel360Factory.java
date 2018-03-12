/**
 */
package metamodel360;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see metamodel360.Metamodel360Package
 * @generated
 */
public interface Metamodel360Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Metamodel360Factory eINSTANCE = metamodel360.impl.Metamodel360FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Proyecto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proyecto</em>'.
	 * @generated
	 */
	Proyecto createProyecto();

	/**
	 * Returns a new object of class '<em>Tour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tour</em>'.
	 * @generated
	 */
	Tour createTour();

	/**
	 * Returns a new object of class '<em>Panorama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Panorama</em>'.
	 * @generated
	 */
	Panorama createPanorama();

	/**
	 * Returns a new object of class '<em>Hotspot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotspot</em>'.
	 * @generated
	 */
	Hotspot createHotspot();

	/**
	 * Returns a new object of class '<em>Posicion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Posicion</em>'.
	 * @generated
	 */
	Posicion createPosicion();

	/**
	 * Returns a new object of class '<em>Rotacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotacion</em>'.
	 * @generated
	 */
	Rotacion createRotacion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Metamodel360Package getMetamodel360Package();

} //Metamodel360Factory
