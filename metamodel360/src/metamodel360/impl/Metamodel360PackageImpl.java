/**
 */
package metamodel360.impl;

import metamodel360.Hotspot;
import metamodel360.Metamodel360Factory;
import metamodel360.Metamodel360Package;
import metamodel360.Panorama;
import metamodel360.Posicion;
import metamodel360.Proyecto;
import metamodel360.Punto;
import metamodel360.Rotacion;
import metamodel360.Tour;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Metamodel360PackageImpl extends EPackageImpl implements Metamodel360Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proyectoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panoramaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotspotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass posicionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puntoEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see metamodel360.Metamodel360Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Metamodel360PackageImpl() {
		super(eNS_URI, Metamodel360Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Metamodel360Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Metamodel360Package init() {
		if (isInited) return (Metamodel360Package)EPackage.Registry.INSTANCE.getEPackage(Metamodel360Package.eNS_URI);

		// Obtain or create and register package
		Metamodel360PackageImpl theMetamodel360Package = (Metamodel360PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Metamodel360PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Metamodel360PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMetamodel360Package.createPackageContents();

		// Initialize created meta-data
		theMetamodel360Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetamodel360Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Metamodel360Package.eNS_URI, theMetamodel360Package);
		return theMetamodel360Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProyecto() {
		return proyectoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProyecto_Name() {
		return (EAttribute)proyectoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProyecto_Toures() {
		return (EReference)proyectoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTour() {
		return tourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTour_Name() {
		return (EAttribute)tourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTour_Panoramas() {
		return (EReference)tourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanorama() {
		return panoramaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanorama_Name() {
		return (EAttribute)panoramaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanorama_Hotspots() {
		return (EReference)panoramaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanorama_Imagen() {
		return (EAttribute)panoramaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotspot() {
		return hotspotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotspot_Name() {
		return (EAttribute)hotspotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotspot_Posicion() {
		return (EReference)hotspotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotspot_Rotacion() {
		return (EReference)hotspotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotspot_Destino() {
		return (EReference)hotspotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosicion() {
		return posicionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotacion() {
		return rotacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPunto() {
		return puntoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPunto_X() {
		return (EAttribute)puntoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPunto_Y() {
		return (EAttribute)puntoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPunto_Z() {
		return (EAttribute)puntoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel360Factory getMetamodel360Factory() {
		return (Metamodel360Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		proyectoEClass = createEClass(PROYECTO);
		createEAttribute(proyectoEClass, PROYECTO__NAME);
		createEReference(proyectoEClass, PROYECTO__TOURES);

		tourEClass = createEClass(TOUR);
		createEAttribute(tourEClass, TOUR__NAME);
		createEReference(tourEClass, TOUR__PANORAMAS);

		panoramaEClass = createEClass(PANORAMA);
		createEAttribute(panoramaEClass, PANORAMA__NAME);
		createEReference(panoramaEClass, PANORAMA__HOTSPOTS);
		createEAttribute(panoramaEClass, PANORAMA__IMAGEN);

		hotspotEClass = createEClass(HOTSPOT);
		createEAttribute(hotspotEClass, HOTSPOT__NAME);
		createEReference(hotspotEClass, HOTSPOT__POSICION);
		createEReference(hotspotEClass, HOTSPOT__ROTACION);
		createEReference(hotspotEClass, HOTSPOT__DESTINO);

		posicionEClass = createEClass(POSICION);

		rotacionEClass = createEClass(ROTACION);

		puntoEClass = createEClass(PUNTO);
		createEAttribute(puntoEClass, PUNTO__X);
		createEAttribute(puntoEClass, PUNTO__Y);
		createEAttribute(puntoEClass, PUNTO__Z);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		posicionEClass.getESuperTypes().add(this.getPunto());
		rotacionEClass.getESuperTypes().add(this.getPunto());

		// Initialize classes, features, and operations; add parameters
		initEClass(proyectoEClass, Proyecto.class, "Proyecto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProyecto_Name(), ecorePackage.getEString(), "name", null, 0, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProyecto_Toures(), this.getTour(), null, "toures", null, 1, -1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tourEClass, Tour.class, "Tour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTour_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTour_Panoramas(), this.getPanorama(), null, "panoramas", null, 1, -1, Tour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panoramaEClass, Panorama.class, "Panorama", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPanorama_Name(), ecorePackage.getEString(), "name", null, 0, 1, Panorama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPanorama_Hotspots(), this.getHotspot(), null, "hotspots", null, 1, -1, Panorama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPanorama_Imagen(), ecorePackage.getEString(), "imagen", null, 0, 1, Panorama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hotspotEClass, Hotspot.class, "Hotspot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotspot_Name(), ecorePackage.getEString(), "name", null, 0, 1, Hotspot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHotspot_Posicion(), this.getPosicion(), null, "posicion", null, 1, 1, Hotspot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHotspot_Rotacion(), this.getRotacion(), null, "rotacion", null, 1, 1, Hotspot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHotspot_Destino(), this.getPanorama(), null, "destino", null, 1, 1, Hotspot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(posicionEClass, Posicion.class, "Posicion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rotacionEClass, Rotacion.class, "Rotacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(puntoEClass, Punto.class, "Punto", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPunto_X(), ecorePackage.getEDouble(), "x", null, 0, 1, Punto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPunto_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, Punto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPunto_Z(), ecorePackage.getEDouble(), "z", null, 0, 1, Punto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Metamodel360PackageImpl
