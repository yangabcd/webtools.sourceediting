/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     
 *******************************************************************************/
package org.eclipse.wst.xml.ui.internal.preferences;

/**
 * Preference keys for XML UI
 */
public class XMLUIPreferenceNames {
	/**
	 * A named preference that controls if code assist gets auto activated.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 */
	public static final String AUTO_PROPOSE = getAutoProposeKey();

	private static String getAutoProposeKey() {
		return "autoPropose";//$NON-NLS-1$
	}

	/**
	 * A named preference that holds the characters that auto activate code
	 * assist.
	 * <p>
	 * Value is of type <code>String</code>. All characters that trigger
	 * auto code assist.
	 * </p>
	 */
	public static final String AUTO_PROPOSE_CODE = getAutoProposeCodeKey();

	private static String getAutoProposeCodeKey() {
		return "autoProposeCode";//$NON-NLS-1$
	}

	/**
	 * The key to store customized templates.
	 * <p>
	 * Value is of type <code>String</code>.
	 * </p>
	 */
	public static final String TEMPLATES_KEY = getTemplatesKey();

	private static String getTemplatesKey() {
		return "org.eclipse.wst.sse.ui.custom_templates"; //$NON-NLS-1$
	}

	/**
	 * A named preference that controls whether or grammar should be inferred
	 * or not.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 */
	public static final String USE_INFERRED_GRAMMAR = getUseInferredGrammarKey();

	private static String getUseInferredGrammarKey() {
		return "useInferredGrammar"; //$NON-NLS-1$
	}
}
