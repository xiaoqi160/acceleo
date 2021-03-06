/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.acceleo.parser.tests.unit;

import org.eclipse.acceleo.parser.cst.CstFactory;
import org.eclipse.acceleo.parser.cst.ModuleExtendsValue;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Tests the behavior of the {@link ModuleExtendsValue} class.
 * 
 * @generated
 */
public class ModuleExtendsValueTest extends AbstractCstTest {

	/**
	 * Tests the behavior of attribute <code>startPosition</code>'s accessors.
	 * 
	 * @generated
	 */
	public void testStartPosition() {
		EStructuralFeature feature = org.eclipse.acceleo.parser.cst.CstPackage.eINSTANCE
				.getCSTNode_StartPosition();
		ModuleExtendsValue moduleExtendsValue = CstFactory.eINSTANCE.createModuleExtendsValue();
		moduleExtendsValue.eAdapters().add(new MockEAdapter());
		int startPositionValue = getIntDistinctFromDefault(feature);

		assertFalse(moduleExtendsValue.eIsSet(feature));
		assertEquals(((Integer)feature.getDefaultValue()).intValue(), ((Integer)moduleExtendsValue
				.getStartPosition()).intValue());

		moduleExtendsValue.setStartPosition(startPositionValue);
		assertTrue(notified);
		notified = false;
		assertEquals(startPositionValue, ((Integer)moduleExtendsValue.getStartPosition()).intValue());
		assertEquals(((Integer)moduleExtendsValue.getStartPosition()).intValue(),
				((Integer)moduleExtendsValue.eGet(feature)).intValue());
		assertTrue(moduleExtendsValue.eIsSet(feature));

		moduleExtendsValue.eUnset(feature);
		assertTrue(notified);
		notified = false;
		assertEquals(((Integer)feature.getDefaultValue()).intValue(), ((Integer)moduleExtendsValue
				.getStartPosition()).intValue());
		assertEquals(((Integer)moduleExtendsValue.getStartPosition()).intValue(),
				((Integer)moduleExtendsValue.eGet(feature)).intValue());
		assertFalse(moduleExtendsValue.eIsSet(feature));

		moduleExtendsValue.eSet(feature, startPositionValue);
		assertTrue(notified);
		notified = false;
		assertEquals(startPositionValue, ((Integer)moduleExtendsValue.getStartPosition()).intValue());
		assertEquals(((Integer)moduleExtendsValue.getStartPosition()).intValue(),
				((Integer)moduleExtendsValue.eGet(feature)).intValue());
		assertTrue(moduleExtendsValue.eIsSet(feature));

		moduleExtendsValue.setStartPosition(((Integer)feature.getDefaultValue()).intValue());
		assertTrue(notified);
		notified = false;
		assertEquals(((Integer)feature.getDefaultValue()).intValue(), ((Integer)moduleExtendsValue
				.getStartPosition()).intValue());
		assertEquals(((Integer)moduleExtendsValue.getStartPosition()).intValue(),
				((Integer)moduleExtendsValue.eGet(feature)).intValue());
		assertFalse(moduleExtendsValue.eIsSet(feature));
	}

	/**
	 * Tests the behavior of attribute <code>endPosition</code>'s accessors.
	 * 
	 * @generated
	 */
	public void testEndPosition() {
		EStructuralFeature feature = org.eclipse.acceleo.parser.cst.CstPackage.eINSTANCE
				.getCSTNode_EndPosition();
		ModuleExtendsValue moduleExtendsValue = CstFactory.eINSTANCE.createModuleExtendsValue();
		moduleExtendsValue.eAdapters().add(new MockEAdapter());
		int endPositionValue = getIntDistinctFromDefault(feature);

		assertFalse(moduleExtendsValue.eIsSet(feature));
		assertEquals(((Integer)feature.getDefaultValue()).intValue(), ((Integer)moduleExtendsValue
				.getEndPosition()).intValue());

		moduleExtendsValue.setEndPosition(endPositionValue);
		assertTrue(notified);
		notified = false;
		assertEquals(endPositionValue, ((Integer)moduleExtendsValue.getEndPosition()).intValue());
		assertEquals(((Integer)moduleExtendsValue.getEndPosition()).intValue(), ((Integer)moduleExtendsValue
				.eGet(feature)).intValue());
		assertTrue(moduleExtendsValue.eIsSet(feature));

		moduleExtendsValue.eUnset(feature);
		assertTrue(notified);
		notified = false;
		assertEquals(((Integer)feature.getDefaultValue()).intValue(), ((Integer)moduleExtendsValue
				.getEndPosition()).intValue());
		assertEquals(((Integer)moduleExtendsValue.getEndPosition()).intValue(), ((Integer)moduleExtendsValue
				.eGet(feature)).intValue());
		assertFalse(moduleExtendsValue.eIsSet(feature));

		moduleExtendsValue.eSet(feature, endPositionValue);
		assertTrue(notified);
		notified = false;
		assertEquals(endPositionValue, ((Integer)moduleExtendsValue.getEndPosition()).intValue());
		assertEquals(((Integer)moduleExtendsValue.getEndPosition()).intValue(), ((Integer)moduleExtendsValue
				.eGet(feature)).intValue());
		assertTrue(moduleExtendsValue.eIsSet(feature));

		moduleExtendsValue.setEndPosition(((Integer)feature.getDefaultValue()).intValue());
		assertTrue(notified);
		notified = false;
		assertEquals(((Integer)feature.getDefaultValue()).intValue(), ((Integer)moduleExtendsValue
				.getEndPosition()).intValue());
		assertEquals(((Integer)moduleExtendsValue.getEndPosition()).intValue(), ((Integer)moduleExtendsValue
				.eGet(feature)).intValue());
		assertFalse(moduleExtendsValue.eIsSet(feature));
	}

	/**
	 * Tests the behavior of attribute <code>name</code>'s accessors.
	 * 
	 * @generated
	 */
	public void testName() {
		EStructuralFeature feature = org.eclipse.acceleo.parser.cst.CstPackage.eINSTANCE
				.getModuleExtendsValue_Name();
		ModuleExtendsValue moduleExtendsValue = CstFactory.eINSTANCE.createModuleExtendsValue();
		moduleExtendsValue.eAdapters().add(new MockEAdapter());
		java.lang.String nameValue = (java.lang.String)getValueDistinctFromDefault(feature);

		assertFalse(moduleExtendsValue.eIsSet(feature));
		assertEquals(feature.getDefaultValue(), moduleExtendsValue.getName());

		moduleExtendsValue.setName(nameValue);
		assertTrue(notified);
		notified = false;
		assertEquals(nameValue, moduleExtendsValue.getName());
		assertEquals(moduleExtendsValue.getName(), moduleExtendsValue.eGet(feature));
		assertTrue(moduleExtendsValue.eIsSet(feature));

		moduleExtendsValue.eUnset(feature);
		assertTrue(notified);
		notified = false;
		assertEquals(feature.getDefaultValue(), moduleExtendsValue.getName());
		assertEquals(moduleExtendsValue.getName(), moduleExtendsValue.eGet(feature));
		assertFalse(moduleExtendsValue.eIsSet(feature));

		moduleExtendsValue.eSet(feature, nameValue);
		assertTrue(notified);
		notified = false;
		assertEquals(nameValue, moduleExtendsValue.getName());
		assertEquals(moduleExtendsValue.getName(), moduleExtendsValue.eGet(feature));
		assertTrue(moduleExtendsValue.eIsSet(feature));

		moduleExtendsValue.setName(null);
		assertTrue(notified);
		notified = false;
		assertEquals(feature.getDefaultValue(), moduleExtendsValue.getName());
		assertEquals(moduleExtendsValue.getName(), moduleExtendsValue.eGet(feature));
		assertFalse(moduleExtendsValue.eIsSet(feature));
	}

}
