package de.enithing.contenthub.editor;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import de.enithing.contenthub.generator.PackageGenerator;

import de.enithing.contenthub.model.contenthub.Package;

public class GenerateAction extends Action {
	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "Generate";
	}
	
	@Override
	public void run() {
		IWorkbenchPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
		EditingDomain domain = ((IEditingDomainProvider)part).getEditingDomain();
		ResourceSet resources = domain.getResourceSet();
		
		Resource chubResource = resources.getResources().get(0);
		
		Package pkg = (Package) chubResource.getContents().get(0);
		
		PackageGenerator gen = new PackageGenerator();
		
		gen.generate(pkg);
		
	}
}
