/*******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.wst.xml.ui.tests.breakpoints;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorInput;
import org.eclipse.wst.sse.ui.extensions.breakpoint.IBreakpointProvider;
import org.eclipse.wst.sse.ui.extensions.breakpoint.SourceEditingTextTools;
import org.eclipse.wst.xml.ui.tests.XMLUITestsPlugin;
import org.w3c.dom.Document;
import org.w3c.dom.Node;


public class BreakpointErrorProvider implements IBreakpointProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.wst.sse.ui.extensions.breakpoint.IBreakpointProvider#addBreakpoint(org.w3c.dom.Document,
	 *      org.eclipse.jface.text.IDocument, org.eclipse.ui.IEditorInput,
	 *      org.w3c.dom.Node, int, int)
	 */
	public IStatus addBreakpoint(Document doc, IDocument idoc, IEditorInput input, Node node, int lineNumber, int offset) throws CoreException {
		XMLUITestsPlugin.getDefault().getPreferenceStore().setDefault("break-error", false);
		boolean enable = XMLUITestsPlugin.getDefault().getPreferenceStore().getBoolean("break-error");
		if (enable)
			return new Status(IStatus.INFO, XMLUITestsPlugin.getDefault().getBundle().getSymbolicName(), IStatus.ERROR, getClass().getName() + ": Test Error", null);
		return new Status(IStatus.OK, XMLUITestsPlugin.getDefault().getBundle().getSymbolicName(), IStatus.OK, "", null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.wst.sse.ui.extensions.breakpoint.IBreakpointProvider#getResource(org.eclipse.ui.IEditorInput)
	 */
	public IResource getResource(IEditorInput input) {
		IResource res = (IResource) input.getAdapter(IFile.class);
		if (res == null)
			res = (IResource) input.getAdapter(IResource.class);
		return res;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.wst.sse.ui.extensions.breakpoint.IBreakpointProvider#setSourceEditingTextTools(org.eclipse.wst.sse.ui.extensions.breakpoint.SourceEditingTextTools)
	 */
	public void setSourceEditingTextTools(SourceEditingTextTools tool) {
	}
}