/*******************************************************************************
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.wst.dtd.ui.tests;

import junit.framework.TestCase;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.wst.dtd.ui.internal.DTDUIPlugin;


public class VerifyUIPlugin extends TestCase {

	public void testPluginExists() {
		// TODO: see https://bugs.eclipse.org/bugs/show_bug.cgi?id=81527
		assertTrue(true);
		Plugin plugin = null;
		try {
			plugin = DTDUIPlugin.getDefault();
		}
		catch (Exception e) {
			plugin = null;
		}
		assertNotNull("editor plugin could not be instantiated", plugin);
	}
}
