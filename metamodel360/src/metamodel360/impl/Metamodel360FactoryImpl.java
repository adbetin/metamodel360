/**
 */
package metamodel360.impl;

import metamodel360.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Metamodel360FactoryImpl extends EFactoryImpl implements Metamodel360Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Metamodel360Factory init() {
		try {
			Metamodel360Factory theMetamodel360Factory = (Metamodel360Factory)EPackage.Registry.INSTANCE.getEFactory(Metamodel360Package.eNS_URI);
			if (theMetamodel360Factory != null) {
				return theMetamodel360Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Metamodel360FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel360FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Metamodel360Package.PROYECTO: return createProyecto();
			case Metamodel360Package.TOUR: return createTour();
			case Metamodel360Package.PANORAMA: return createPanorama();
			case Metamodel360Package.HOTSPOT: return createHotspot();
			case Metamodel360Package.POSICION: return createPosicion();
			case Metamodel360Package.ROTACION: return createRotacion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proyecto createProyecto() {
		ProyectoImpl proyecto = new ProyectoImpl();
		return proyecto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tour createTour() {
		TourImpl tour = new TourImpl();
		return tour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panorama createPanorama() {
		PanoramaImpl panorama = new PanoramaImpl();
		return panorama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotspot createHotspot() {
		HotspotImpl hotspot = new HotspotImpl();
		return hotspot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Posicion createPosicion() {
		PosicionImpl posicion = new PosicionImpl();
		return posicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotacion createRotacion() {
		RotacionImpl rotacion = new RotacionImpl();
		return rotacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel360Package getMetamodel360Package() {
		return (Metamodel360Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Metamodel360Package getPackage() {
		return Metamodel360Package.eINSTANCE;
	}

} //Metamodel360FactoryImpl
