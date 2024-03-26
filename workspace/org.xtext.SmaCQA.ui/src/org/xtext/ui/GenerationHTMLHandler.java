package org.xtext.ui;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.xtext.generator.HTMLGenerator;//Importamos el generador para llamar al metodo generate

import com.google.inject.Inject;
import com.google.inject.Provider;

/*
 * Descripción: Esta clase sirve para definir una determinada acción asociada a un botón en la barra de herramientas de Eclipse (segunda instancia)
 * En este caso, esta definida la acción de llamar al generador de un archivo HTML con la información de SmaCQA
 */


public class GenerationHTMLHandler extends AbstractHandler implements IHandler {
    
	@Inject
    private HTMLGenerator generator = new HTMLGenerator(); //Nos creamos un objeto de la clase generador para poder hacer uso de su funcionalidad
    
    private IGeneratorContext context = new IGeneratorContext() {
		
		@Override
		public CancelIndicator getCancelIndicator() {
			// TODO Auto-generated method stub
			return null;
		}
	};
 
    @Inject
    private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;
     
    @Inject
    IResourceDescriptions resourceDescriptions;
     
    @Inject
    IResourceSetProvider resourceSetProvider;
     
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
         
    	IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
    	if(activeEditor != null) {//Esta parte es para llamar al generador de la barra de herramientas con el modelo abierto en el editor
	        IFile file = (IFile) activeEditor.getEditorInput().getAdapter(IFile.class);
	        if (file != null) {
	            IProject project = file.getProject();//Obtenemos el proyecto donde se encuentra el fichero (El modelo)
	            IFolder srcGenFolder = project.getFolder("HTMLTable-src-generated");//Comprobamos si existe una carpeta con ese nombre
	            if (!srcGenFolder.exists()) {//Si no existe la creamos
	                try {
	                    srcGenFolder.create(true, true,
	                            new NullProgressMonitor());
	                } catch (CoreException e) {
	                    return null;
	                }
	            }
	     
	            final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
                fsa.setOutputPath("HTMLTable-src-generated");//Carpeta donde se guardará el archivo a generar
                fsa.setProject(project);//Proyecto donde se va a guardar la carpeta
                fsa.setMonitor(new NullProgressMonitor());
                 
                URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);//Obtenemos ruta del archivo
                ResourceSet rs = resourceSetProvider.get(project);
                Resource r = rs.getResource(uri, true);
                //generator.doGenerate(r, fsa, context);
	             
	             
	            if (activeEditor instanceof XtextEditor) {
	                ((XtextEditor)activeEditor).getDocument().readOnly(new IUnitOfWork<Boolean, XtextResource>() {
	                 
	                    @Override
	                    public Boolean exec(XtextResource state)
	                            throws Exception {
	                    	generator.doGenerate(r, fsa, context);
	                        return Boolean.TRUE;
	                    }
	                });
	                 
	            }
	        }
    	}
    	ISelection selection = HandlerUtil.getCurrentSelection(event);//Recoge la selección de archivos marcada en el explorador de archivos
        if (selection instanceof IStructuredSelection && selection != null) {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            for(Object element : structuredSelection.toList()) {
	            if (element instanceof IFile) {
	                IFile file2 = (IFile) element;
	                IProject project = file2.getProject();
	                IFolder srcGenFolder = project.getFolder("HTMLTable-src-generated");
	                if (!srcGenFolder.exists()) {
	                    try {
	                        srcGenFolder.create(true, true,
	                                new NullProgressMonitor());
	                    } catch (CoreException e) {
	                        return null;
	                    }
	                }
	 
	                final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
	                fsa.setOutputPath("HTMLTable-src-generated");//Nombre de la carpeta que se va a generar
	                fsa.setProject(project);
	                fsa.setMonitor(new NullProgressMonitor());
	                 
	                URI uri = URI.createPlatformResourceURI(file2.getFullPath().toString(), true);
	                ResourceSet rs = resourceSetProvider.get(project);
	                Resource r = rs.getResource(uri, true);//Obtenemos el modelo 
	                generator.doGenerate(r, fsa, context);//Llamada al generador para que genere el tipo de archivo que hemos definido en el método doGenerate
	                 
	            }
            }
        }
        return null;
    }
 
    @Override
    public boolean isEnabled() {
        return true;
    }


 
}