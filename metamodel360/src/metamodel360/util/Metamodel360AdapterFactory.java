/**
 */
package metamodel360.util;

import metamodel360.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see metamodel360.Metamodel360Package
 * @generated
 */
public class Metamodel360AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Metamodel360Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel360AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Metamodel360Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Metamodel360Switch<Adapter> modelSwitch =
		new Metamodel360Switch<Adapter>() {
			@Override
			public Adapter caseProyecto(Proyecto object) {
				return createProyectoAdapter();
			}
			@Override
			public Adapter caseTour(Tour object) {
				return createTourAdapter();
			}
			@Override
			public Adapter casePanorama(Panorama object) {
				return createPanoramaAdapter();
			}
			@Override
			public Adapter caseHotspot(Hotspot object) {
				return createHotspotAdapter();
			}
			@Override
			public Adapter casePosicion(Posicion object) {
				return createPosicionAdapter();
			}
			@Override
			public Adapter caseRotacion(Rotacion object) {
				return createRotacionAdapter();
			}
			@Override
			public Adapter casePunto(Punto object) {
				return createPuntoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link metamodel360.Proyecto <em>Proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel360.Proyecto
	 * @generated
	 */
	public Adapter createProyectoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel360.Tour <em>Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel360.Tour
	 * @generated
	 */
	public Adapter createTourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel360.Panorama <em>Panorama</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel360.Panorama
	 * @generated
	 */
	public Adapter createPanoramaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel360.Hotspot <em>Hotspot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel360.Hotspot
	 * @generated
	 */
	public Adapter createHotspotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel360.Posicion <em>Posicion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel360.Posicion
	 * @generated
	 */
	public Adapter createPosicionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel360.Rotacion <em>Rotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel360.Rotacion
	 * @generated
	 */
	public Adapter createRotacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel360.Punto <em>Punto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel360.Punto
	 * @generated
	 */
	public Adapter createPuntoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Metamodel360AdapterFactory
