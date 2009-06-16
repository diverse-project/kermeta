/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package sca.impl;

import kermeta.language.structure.impl.ObjectImpl;

import org.eclipse.emf.ecore.EClass;

import sca.SCA;
import sca.ScaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SCA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SCAImpl extends ObjectImpl implements SCA {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SCAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScaPackage.Literals.SCA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String generate(art.System system) {

		java.lang.String result = null;

		kermeta.utils.StringBuffer _res = ((kermeta.utils.StringBuffer) org.kermeta.compil.runtime.helper.language.ClassUtil
				.newObject(kermeta.utils.UtilsPackage.eINSTANCE
						.getStringBuffer()));

		_res
				.append("\n<sca:composite xmlns:sca=\"http://www.osoa.org/xmlns/sca/1.0\" xmlns:sample=\"http://sample\" xmlns=\"http://www.osoa.org/xmlns/sca/1.0\" name=\"");

		_res.append(system.getRoot().getName());

		_res.append("\" targetNamespace=\"http://sample\">\n");

		//BIft:each

		{

			kermeta.standard.Iterator<art.instance.ComponentInstance> it_ft112 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<art.instance.ComponentInstance> convertAsOrderedSet(
							system.getRoot().getSubComponent()).iterator();
			java.lang.Boolean idLoopCond_394 = false;
			while (!idLoopCond_394) {
				idLoopCond_394 = it_ft112.isOff();
				if (idLoopCond_394) {
				} else {

					//BIle:func
					art.instance.ComponentInstance sub_lbdExp112 = it_ft112
							.next();

					_res.append("\t<sca:component name=\"");

					_res.append(sub_lbdExp112.getName());

					_res.append("\">\n");

					//BIft:select

					kermeta.standard.Sequence<art.type.Port> result_ft114 = null;

					art.type.Port elem_ft114 = null;

					result_ft114 = ((kermeta.standard.Sequence<art.type.Port>) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.standard.StandardPackage.eINSTANCE
									.getSequence()));

					{

						kermeta.standard.Iterator<art.type.Port> it_ft114 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<art.type.Port> convertAsOrderedSet(
										sub_lbdExp112.getType().getPort())
								.iterator();
						java.lang.Boolean idLoopCond_396 = false;
						while (!idLoopCond_396) {
							idLoopCond_396 = it_ft114.isOff();
							if (idLoopCond_396) {
							} else {

								elem_ft114 = it_ft114.next();

								java.lang.Boolean idIfCond_397 = false;
								//BIle:selector
								art.type.Port p_lbdExp114 = elem_ft114;

								idIfCond_397 = kermeta.standard.helper.StringWrapper
										.equals(p_lbdExp114.getRole(), "server");
								//EIle:selector

								if (idIfCond_397) {

									result_ft114.add(elem_ft114);
								}

							}
						}
					}

					//EIft:select
					//BIft:each

					{

						kermeta.standard.Iterator<art.type.Port> it_ft113 = result_ft114
								.iterator();
						java.lang.Boolean idLoopCond_395 = false;
						while (!idLoopCond_395) {
							idLoopCond_395 = it_ft113.isOff();
							if (idLoopCond_395) {
							} else {

								//BIle:func
								art.type.Port p_lbdExp113 = it_ft113.next();

								_res.append("\t\t<sca:service name=\"");

								_res.append(p_lbdExp113.getName());

								_res
										.append("\">\n\t\t\t<sca:interface.java interface=\"");

								_res.append(p_lbdExp113.getService().getName());

								_res.append("\"/>\n\t\t</sca:service>\n");
								//EIle:func

							}
						}
					}

					//EIft:each

					_res.append("");

					//BIft:select

					kermeta.standard.Sequence<art.type.Port> result_ft116 = null;

					art.type.Port elem_ft116 = null;

					result_ft116 = ((kermeta.standard.Sequence<art.type.Port>) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.standard.StandardPackage.eINSTANCE
									.getSequence()));

					{

						kermeta.standard.Iterator<art.type.Port> it_ft116 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<art.type.Port> convertAsOrderedSet(
										sub_lbdExp112.getType().getPort())
								.iterator();
						java.lang.Boolean idLoopCond_399 = false;
						while (!idLoopCond_399) {
							idLoopCond_399 = it_ft116.isOff();
							if (idLoopCond_399) {
							} else {

								elem_ft116 = it_ft116.next();

								java.lang.Boolean idIfCond_400 = false;
								//BIle:selector
								art.type.Port p_lbdExp116 = elem_ft116;

								idIfCond_400 = kermeta.standard.helper.StringWrapper
										.equals(p_lbdExp116.getRole(), "client");
								//EIle:selector

								if (idIfCond_400) {

									result_ft116.add(elem_ft116);
								}

							}
						}
					}

					//EIft:select
					//BIft:each

					{

						kermeta.standard.Iterator<art.type.Port> it_ft115 = result_ft116
								.iterator();
						java.lang.Boolean idLoopCond_398 = false;
						while (!idLoopCond_398) {
							idLoopCond_398 = it_ft115.isOff();
							if (idLoopCond_398) {
							} else {

								//BIle:func
								art.type.Port p_lbdExp115 = it_ft115.next();

								_res.append("\t\t <sca:reference name=\"");

								_res.append(p_lbdExp115.getName());

								_res.append("\"/>\n");
								//EIle:func

							}
						}
					}

					//EIft:each

					_res.append("");

					//BIft:each

					{

						kermeta.standard.Iterator<art.instance.ValuedAttribute> it_ft117 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<art.instance.ValuedAttribute> convertAsOrderedSet(
										sub_lbdExp112.getAttribute())
								.iterator();
						java.lang.Boolean idLoopCond_401 = false;
						while (!idLoopCond_401) {
							idLoopCond_401 = it_ft117.isOff();
							if (idLoopCond_401) {
							} else {

								//BIle:func
								art.instance.ValuedAttribute a_lbdExp117 = it_ft117
										.next();

								_res.append("\t\t<sca:property name=\"");

								_res
										.append(kermeta.standard.helper.StringWrapper
												.substring(
														kermeta.standard.helper.StringWrapper
																.split(
																		a_lbdExp117
																				.getValue(),
																		":")
																.elementAt(0),
														3,
														kermeta.standard.helper.StringWrapper
																.size(kermeta.standard.helper.StringWrapper
																		.split(
																				a_lbdExp117
																						.getValue(),
																				": ")
																		.elementAt(
																				0))));

								_res.append("\">");

								_res
										.append(kermeta.standard.helper.StringWrapper
												.split(a_lbdExp117.getValue(),
														": ").elementAt(1));

								_res.append("</sca:property>\n");
								//EIle:func

							}
						}
					}

					//EIft:each

					_res.append("\t</sca:component>\n");
					//EIle:func

				}
			}
		}

		//EIft:each

		_res.append("");

		//BIft:each

		{

			kermeta.standard.Iterator<art.instance.TransmissionBinding> it_ft118 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<art.instance.TransmissionBinding> convertAsOrderedSet(
							system.getRoot().getterGetAllBindings()).iterator();
			java.lang.Boolean idLoopCond_402 = false;
			while (!idLoopCond_402) {
				idLoopCond_402 = it_ft118.isOff();
				if (idLoopCond_402) {
				} else {

					//BIle:func
					art.instance.TransmissionBinding b_lbdExp118 = it_ft118
							.next();

					_res.append("\t<sca:wire source=\"");

					_res
							.append(((art.instance.ComponentInstance) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.containerSwitcher(b_lbdExp118),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"art.instance.ComponentInstance")))
									.getName());

					_res.append("/");

					_res.append(b_lbdExp118.getClient().getName());

					_res.append("\" target=\"");

					_res.append(b_lbdExp118.getServerInstance().getName());

					_res.append("/");

					_res.append(b_lbdExp118.getServer().getName());

					_res.append("\"/>\n");
					//EIle:func

				}
			}
		}

		//EIft:each

		_res.append("");

		//BIft:each

		{

			kermeta.standard.Iterator<art.instance.DelegationBinding> it_ft119 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<art.instance.DelegationBinding> convertAsOrderedSet(
							system.getRoot().getDelegation()).iterator();
			java.lang.Boolean idLoopCond_403 = false;
			while (!idLoopCond_403) {
				idLoopCond_403 = it_ft119.isOff();
				if (idLoopCond_403) {
				} else {

					//BIle:func
					art.instance.DelegationBinding d_lbdExp119 = it_ft119
							.next();

					_res.append("\t<sca:service name=\"");

					_res.append(d_lbdExp119.getSource().getName());

					_res.append("\" promote=\"");

					_res.append(d_lbdExp119.getServerInstance().getName());

					_res.append("/");

					_res.append(d_lbdExp119.getExported().getName());

					_res.append("\"/>\n");
					//EIle:func

				}
			}
		}

		//EIft:each

		_res.append("</sca:composite>");

		result = _res.toString();

		return result;

	}

} //SCAImpl
