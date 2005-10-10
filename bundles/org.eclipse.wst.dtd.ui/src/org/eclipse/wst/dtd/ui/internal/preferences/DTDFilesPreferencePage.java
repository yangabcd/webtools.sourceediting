/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Jens Lukowski/Innoopract - initial renaming/restructuring
 *     
 *******************************************************************************/
package org.eclipse.wst.dtd.ui.internal.preferences;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.help.WorkbenchHelp;
import org.eclipse.wst.dtd.core.internal.DTDCorePlugin;
import org.eclipse.wst.dtd.ui.internal.DTDUIPlugin;
import org.eclipse.wst.dtd.ui.internal.editor.IHelpContextIds;
import org.eclipse.wst.sse.ui.internal.preferences.ui.AbstractPreferencePage;


public class DTDFilesPreferencePage extends AbstractPreferencePage {

	protected Control createContents(Composite parent) {
		noDefaultAndApplyButton();
		
		Composite composite = (Composite) super.createContents(parent);
		WorkbenchHelp.setHelp(composite, IHelpContextIds.DTD_PREFWEBX_FILES_HELPID);

		setSize(composite);
		loadPreferences();

		return composite;
	}

	protected IPreferenceStore doGetPreferenceStore() {
		return DTDUIPlugin.getDefault().getPreferenceStore();
	}

	protected void doSavePreferenceStore() {
		DTDCorePlugin.getInstance().savePluginPreferences(); // model
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.wst.sse.ui.preferences.ui.AbstractPreferencePage#getModelPreferences()
	 */
	protected Preferences getModelPreferences() {
		return DTDCorePlugin.getInstance().getPluginPreferences();
	}

	public boolean performOk() {
		boolean result = super.performOk();

		doSavePreferenceStore();

		return result;
	}
}
