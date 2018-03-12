/**
 */
package metamodel360;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metamodel360.Metamodel360Factory
 * @model kind="package"
 * @generated
 */
public interface Metamodel360Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodel360";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/metamodel360";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodel360";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Metamodel360Package eINSTANCE = metamodel360.impl.Metamodel360PackageImpl.init();

	/**
	 * The meta object id for the '{@link metamodel360.impl.ProyectoImpl <em>Proyecto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel360.impl.ProyectoImpl
	 * @see metamodel360.impl.Metamodel360PackageImpl#getProyecto()
	 * @generated
	 */
	int PROYECTO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Toures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO__TOURES = 1;

	/**
	 * The number of structural features of the '<em>Proyecto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Proyecto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROYECTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel360.impl.TourImpl <em>Tour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel360.impl.TourImpl
	 * @see metamodel360.impl.Metamodel360PackageImpl#getTour()
	 * @generated
	 */
	int TOUR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Panoramas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__PANORAMAS = 1;

	/**
	 * The number of structural features of the '<em>Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel360.impl.PanoramaImpl <em>Panorama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel360.impl.PanoramaImpl
	 * @see metamodel360.impl.Metamodel360PackageImpl#getPanorama()
	 * @generated
	 */
	int PANORAMA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Hotspots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA__HOTSPOTS = 1;

	/**
	 * The feature id for the '<em><b>Imagen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA__IMAGEN = 2;

	/**
	 * The number of structural features of the '<em>Panorama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Panorama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANORAMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel360.impl.HotspotImpl <em>Hotspot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel360.impl.HotspotImpl
	 * @see metamodel360.impl.Metamodel360PackageImpl#getHotspot()
	 * @generated
	 */
	int HOTSPOT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Posicion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__POSICION = 1;

	/**
	 * The feature id for the '<em><b>Rotacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__ROTACION = 2;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT__DESTINO = 3;

	/**
	 * The number of structural features of the '<em>Hotspot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Hotspot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTSPOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel360.impl.PuntoImpl <em>Punto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel360.impl.PuntoImpl
	 * @see metamodel360.impl.Metamodel360PackageImpl#getPunto()
	 * @generated
	 */
	int PUNTO = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNTO__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNTO__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNTO__Z = 2;

	/**
	 * The number of structural features of the '<em>Punto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Punto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel360.impl.PosicionImpl <em>Posicion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel360.impl.PosicionImpl
	 * @see metamodel360.impl.Metamodel360PackageImpl#getPosicion()
	 * @generated
	 */
	int POSICION = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSICION__X = PUNTO__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSICION__Y = PUNTO__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSICION__Z = PUNTO__Z;

	/**
	 * The number of structural features of the '<em>Posicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSICION_FEATURE_COUNT = PUNTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Posicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSICION_OPERATION_COUNT = PUNTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel360.impl.RotacionImpl <em>Rotacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel360.impl.RotacionImpl
	 * @see metamodel360.impl.Metamodel360PackageImpl#getRotacion()
	 * @generated
	 */
	int ROTACION = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTACION__X = PUNTO__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTACION__Y = PUNTO__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTACION__Z = PUNTO__Z;

	/**
	 * The number of structural features of the '<em>Rotacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTACION_FEATURE_COUNT = PUNTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rotacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTACION_OPERATION_COUNT = PUNTO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link metamodel360.Proyecto <em>Proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proyecto</em>'.
	 * @see metamodel360.Proyecto
	 * @generated
	 */
	EClass getProyecto();

	/**
	 * Returns the meta object for the attribute '{@link metamodel360.Proyecto#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel360.Proyecto#getName()
	 * @see #getProyecto()
	 * @generated
	 */
	EAttribute getProyecto_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel360.Proyecto#getToures <em>Toures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Toures</em>'.
	 * @see metamodel360.Proyecto#getToures()
	 * @see #getProyecto()
	 * @generated
	 */
	EReference getProyecto_Toures();

	/**
	 * Returns the meta object for class '{@link metamodel360.Tour <em>Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tour</em>'.
	 * @see metamodel360.Tour
	 * @generated
	 */
	EClass getTour();

	/**
	 * Returns the meta object for the attribute '{@link metamodel360.Tour#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel360.Tour#getName()
	 * @see #getTour()
	 * @generated
	 */
	EAttribute getTour_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel360.Tour#getPanoramas <em>Panoramas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Panoramas</em>'.
	 * @see metamodel360.Tour#getPanoramas()
	 * @see #getTour()
	 * @generated
	 */
	EReference getTour_Panoramas();

	/**
	 * Returns the meta object for class '{@link metamodel360.Panorama <em>Panorama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panorama</em>'.
	 * @see metamodel360.Panorama
	 * @generated
	 */
	EClass getPanorama();

	/**
	 * Returns the meta object for the attribute '{@link metamodel360.Panorama#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel360.Panorama#getName()
	 * @see #getPanorama()
	 * @generated
	 */
	EAttribute getPanorama_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel360.Panorama#getHotspots <em>Hotspots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hotspots</em>'.
	 * @see metamodel360.Panorama#getHotspots()
	 * @see #getPanorama()
	 * @generated
	 */
	EReference getPanorama_Hotspots();

	/**
	 * Returns the meta object for the attribute '{@link metamodel360.Panorama#getImagen <em>Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imagen</em>'.
	 * @see metamodel360.Panorama#getImagen()
	 * @see #getPanorama()
	 * @generated
	 */
	EAttribute getPanorama_Imagen();

	/**
	 * Returns the meta object for class '{@link metamodel360.Hotspot <em>Hotspot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotspot</em>'.
	 * @see metamodel360.Hotspot
	 * @generated
	 */
	EClass getHotspot();

	/**
	 * Returns the meta object for the attribute '{@link metamodel360.Hotspot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel360.Hotspot#getName()
	 * @see #getHotspot()
	 * @generated
	 */
	EAttribute getHotspot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel360.Hotspot#getPosicion <em>Posicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Posicion</em>'.
	 * @see metamodel360.Hotspot#getPosicion()
	 * @see #getHotspot()
	 * @generated
	 */
	EReference getHotspot_Posicion();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel360.Hotspot#getRotacion <em>Rotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotacion</em>'.
	 * @see metamodel360.Hotspot#getRotacion()
	 * @see #getHotspot()
	 * @generated
	 */
	EReference getHotspot_Rotacion();

	/**
	 * Returns the meta object for the reference '{@link metamodel360.Hotspot#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see metamodel360.Hotspot#getDestino()
	 * @see #getHotspot()
	 * @generated
	 */
	EReference getHotspot_Destino();

	/**
	 * Returns the meta object for class '{@link metamodel360.Posicion <em>Posicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Posicion</em>'.
	 * @see metamodel360.Posicion
	 * @generated
	 */
	EClass getPosicion();

	/**
	 * Returns the meta object for class '{@link metamodel360.Rotacion <em>Rotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotacion</em>'.
	 * @see metamodel360.Rotacion
	 * @generated
	 */
	EClass getRotacion();

	/**
	 * Returns the meta object for class '{@link metamodel360.Punto <em>Punto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Punto</em>'.
	 * @see metamodel360.Punto
	 * @generated
	 */
	EClass getPunto();

	/**
	 * Returns the meta object for the attribute '{@link metamodel360.Punto#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see metamodel360.Punto#getX()
	 * @see #getPunto()
	 * @generated
	 */
	EAttribute getPunto_X();

	/**
	 * Returns the meta object for the attribute '{@link metamodel360.Punto#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see metamodel360.Punto#getY()
	 * @see #getPunto()
	 * @generated
	 */
	EAttribute getPunto_Y();

	/**
	 * Returns the meta object for the attribute '{@link metamodel360.Punto#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see metamodel360.Punto#getZ()
	 * @see #getPunto()
	 * @generated
	 */
	EAttribute getPunto_Z();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Metamodel360Factory getMetamodel360Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metamodel360.impl.ProyectoImpl <em>Proyecto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel360.impl.ProyectoImpl
		 * @see metamodel360.impl.Metamodel360PackageImpl#getProyecto()
		 * @generated
		 */
		EClass PROYECTO = eINSTANCE.getProyecto();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROYECTO__NAME = eINSTANCE.getProyecto_Name();

		/**
		 * The meta object literal for the '<em><b>Toures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROYECTO__TOURES = eINSTANCE.getProyecto_Toures();

		/**
		 * The meta object literal for the '{@link metamodel360.impl.TourImpl <em>Tour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel360.impl.TourImpl
		 * @see metamodel360.impl.Metamodel360PackageImpl#getTour()
		 * @generated
		 */
		EClass TOUR = eINSTANCE.getTour();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUR__NAME = eINSTANCE.getTour_Name();

		/**
		 * The meta object literal for the '<em><b>Panoramas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUR__PANORAMAS = eINSTANCE.getTour_Panoramas();

		/**
		 * The meta object literal for the '{@link metamodel360.impl.PanoramaImpl <em>Panorama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel360.impl.PanoramaImpl
		 * @see metamodel360.impl.Metamodel360PackageImpl#getPanorama()
		 * @generated
		 */
		EClass PANORAMA = eINSTANCE.getPanorama();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANORAMA__NAME = eINSTANCE.getPanorama_Name();

		/**
		 * The meta object literal for the '<em><b>Hotspots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PANORAMA__HOTSPOTS = eINSTANCE.getPanorama_Hotspots();

		/**
		 * The meta object literal for the '<em><b>Imagen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PANORAMA__IMAGEN = eINSTANCE.getPanorama_Imagen();

		/**
		 * The meta object literal for the '{@link metamodel360.impl.HotspotImpl <em>Hotspot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel360.impl.HotspotImpl
		 * @see metamodel360.impl.Metamodel360PackageImpl#getHotspot()
		 * @generated
		 */
		EClass HOTSPOT = eINSTANCE.getHotspot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTSPOT__NAME = eINSTANCE.getHotspot_Name();

		/**
		 * The meta object literal for the '<em><b>Posicion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTSPOT__POSICION = eINSTANCE.getHotspot_Posicion();

		/**
		 * The meta object literal for the '<em><b>Rotacion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTSPOT__ROTACION = eINSTANCE.getHotspot_Rotacion();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTSPOT__DESTINO = eINSTANCE.getHotspot_Destino();

		/**
		 * The meta object literal for the '{@link metamodel360.impl.PosicionImpl <em>Posicion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel360.impl.PosicionImpl
		 * @see metamodel360.impl.Metamodel360PackageImpl#getPosicion()
		 * @generated
		 */
		EClass POSICION = eINSTANCE.getPosicion();

		/**
		 * The meta object literal for the '{@link metamodel360.impl.RotacionImpl <em>Rotacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel360.impl.RotacionImpl
		 * @see metamodel360.impl.Metamodel360PackageImpl#getRotacion()
		 * @generated
		 */
		EClass ROTACION = eINSTANCE.getRotacion();

		/**
		 * The meta object literal for the '{@link metamodel360.impl.PuntoImpl <em>Punto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel360.impl.PuntoImpl
		 * @see metamodel360.impl.Metamodel360PackageImpl#getPunto()
		 * @generated
		 */
		EClass PUNTO = eINSTANCE.getPunto();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUNTO__X = eINSTANCE.getPunto_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUNTO__Y = eINSTANCE.getPunto_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUNTO__Z = eINSTANCE.getPunto_Z();

	}

} //Metamodel360Package
