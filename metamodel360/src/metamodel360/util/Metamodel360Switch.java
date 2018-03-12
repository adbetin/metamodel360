/**
 */
package metamodel360.util;

import metamodel360.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see metamodel360.Metamodel360Package
 * @generated
 */
public class Metamodel360Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Metamodel360Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel360Switch() {
		if (modelPackage == null) {
			modelPackage = Metamodel360Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Metamodel360Package.PROYECTO: {
				Proyecto proyecto = (Proyecto)theEObject;
				T result = caseProyecto(proyecto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel360Package.TOUR: {
				Tour tour = (Tour)theEObject;
				T result = caseTour(tour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel360Package.PANORAMA: {
				Panorama panorama = (Panorama)theEObject;
				T result = casePanorama(panorama);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel360Package.HOTSPOT: {
				Hotspot hotspot = (Hotspot)theEObject;
				T result = caseHotspot(hotspot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel360Package.POSICION: {
				Posicion posicion = (Posicion)theEObject;
				T result = casePosicion(posicion);
				if (result == null) result = casePunto(posicion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel360Package.ROTACION: {
				Rotacion rotacion = (Rotacion)theEObject;
				T result = caseRotacion(rotacion);
				if (result == null) result = casePunto(rotacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel360Package.PUNTO: {
				Punto punto = (Punto)theEObject;
				T result = casePunto(punto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proyecto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proyecto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProyecto(Proyecto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTour(Tour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panorama</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panorama</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanorama(Panorama object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotspot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotspot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotspot(Hotspot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Posicion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Posicion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosicion(Posicion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotacion(Rotacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Punto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Punto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePunto(Punto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Metamodel360Switch
