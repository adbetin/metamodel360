/**
 */
package metamodel360;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proyecto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel360.Proyecto#getName <em>Name</em>}</li>
 *   <li>{@link metamodel360.Proyecto#getToures <em>Toures</em>}</li>
 * </ul>
 *
 * @see metamodel360.Metamodel360Package#getProyecto()
 * @model
 * @generated
 */
public interface Proyecto extends EObject {
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
	 * @see metamodel360.Metamodel360Package#getProyecto_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel360.Proyecto#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Toures</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel360.Tour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toures</em>' containment reference list.
	 * @see #isSetToures()
	 * @see #unsetToures()
	 * @see metamodel360.Metamodel360Package#getProyecto_Toures()
	 * @model containment="true" unsettable="true" required="true"
	 * @generated
	 */
	EList<Tour> getToures();

	/**
	 * Unsets the value of the '{@link metamodel360.Proyecto#getToures <em>Toures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetToures()
	 * @see #getToures()
	 * @generated
	 */
	void unsetToures();

	/**
	 * Returns whether the value of the '{@link metamodel360.Proyecto#getToures <em>Toures</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Toures</em>' containment reference list is set.
	 * @see #unsetToures()
	 * @see #getToures()
	 * @generated
	 */
	boolean isSetToures();

} // Proyecto
