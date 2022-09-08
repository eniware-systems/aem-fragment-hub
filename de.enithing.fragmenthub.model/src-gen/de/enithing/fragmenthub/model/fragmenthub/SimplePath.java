/**
 */
package de.enithing.fragmenthub.model.fragmenthub;

import java.nio.file.Path;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.fragmenthub.SimplePath#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see de.enithing.fragmenthub.model.fragmenthub.FragmentHubPackage#getSimplePath()
 * @model
 * @generated
 */
public interface SimplePath extends PathProvider {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(Path)
	 * @see de.enithing.fragmenthub.model.fragmenthub.FragmentHubPackage#getSimplePath_Path()
	 * @model default="" dataType="de.enithing.fragmenthub.model.fragmenthub.Path" required="true"
	 * @generated
	 */
	Path getPath();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.fragmenthub.SimplePath#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Path value);

} // SimplePath
