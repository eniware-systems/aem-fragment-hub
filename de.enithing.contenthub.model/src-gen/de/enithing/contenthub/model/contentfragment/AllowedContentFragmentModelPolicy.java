/**
 */
package de.enithing.contenthub.model.contentfragment;

import de.enithing.contenthub.model.contenthub.ContextPolicy;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allowed Content Fragment Model Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.AllowedContentFragmentModelPolicy#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getAllowedContentFragmentModelPolicy()
 * @model
 * @generated
 */
public interface AllowedContentFragmentModelPolicy extends ContextPolicy {
	/**
	 * Returns the value of the '<em><b>Models</b></em>' reference list.
	 * The list contents are of type {@link de.enithing.contenthub.model.contentfragment.ContentFragmentModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' reference list.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getAllowedContentFragmentModelPolicy_Models()
	 * @model
	 * @generated
	 */
	EList<ContentFragmentModel> getModels();

} // AllowedContentFragmentModelPolicy
