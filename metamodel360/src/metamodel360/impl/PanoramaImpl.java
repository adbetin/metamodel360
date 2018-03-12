/**
 */
package metamodel360.impl;

import java.util.Collection;

import metamodel360.Hotspot;
import metamodel360.Metamodel360Package;
import metamodel360.Panorama;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Panorama</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel360.impl.PanoramaImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodel360.impl.PanoramaImpl#getHotspots <em>Hotspots</em>}</li>
 *   <li>{@link metamodel360.impl.PanoramaImpl#getImagen <em>Imagen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PanoramaImpl extends MinimalEObjectImpl.Container implements Panorama {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHotspots() <em>Hotspots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotspots()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotspot> hotspots;

	/**
	 * The default value of the '{@link #getImagen() <em>Imagen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagen()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagen() <em>Imagen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagen()
	 * @generated
	 * @ordered
	 */
	protected String imagen = IMAGEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PanoramaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metamodel360Package.Literals.PANORAMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel360Package.PANORAMA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotspot> getHotspots() {
		if (hotspots == null) {
			hotspots = new EObjectContainmentEList<Hotspot>(Hotspot.class, this, Metamodel360Package.PANORAMA__HOTSPOTS);
		}
		return hotspots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagen(String newImagen) {
		String oldImagen = imagen;
		imagen = newImagen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel360Package.PANORAMA__IMAGEN, oldImagen, imagen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metamodel360Package.PANORAMA__HOTSPOTS:
				return ((InternalEList<?>)getHotspots()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Metamodel360Package.PANORAMA__NAME:
				return getName();
			case Metamodel360Package.PANORAMA__HOTSPOTS:
				return getHotspots();
			case Metamodel360Package.PANORAMA__IMAGEN:
				return getImagen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Metamodel360Package.PANORAMA__NAME:
				setName((String)newValue);
				return;
			case Metamodel360Package.PANORAMA__HOTSPOTS:
				getHotspots().clear();
				getHotspots().addAll((Collection<? extends Hotspot>)newValue);
				return;
			case Metamodel360Package.PANORAMA__IMAGEN:
				setImagen((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Metamodel360Package.PANORAMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Metamodel360Package.PANORAMA__HOTSPOTS:
				getHotspots().clear();
				return;
			case Metamodel360Package.PANORAMA__IMAGEN:
				setImagen(IMAGEN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Metamodel360Package.PANORAMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Metamodel360Package.PANORAMA__HOTSPOTS:
				return hotspots != null && !hotspots.isEmpty();
			case Metamodel360Package.PANORAMA__IMAGEN:
				return IMAGEN_EDEFAULT == null ? imagen != null : !IMAGEN_EDEFAULT.equals(imagen);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", imagen: ");
		result.append(imagen);
		result.append(')');
		return result.toString();
	}

} //PanoramaImpl
