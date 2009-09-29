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
				.append("\n<sca:composite xmlns:sca=\"http://www.osoa.org/xmlns/sca/1.0\" name=\"");

		_res.append(system.getRoot().getName());

		_res.append("\" targetNamespace=\"http://sample\">\n");

		//BIft:each

		{

			kermeta.standard.Iterator<art.instance.ComponentInstance> it_ft95 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<art.instance.ComponentInstance> convertAsOrderedSet(
							system.getRoot().getSubComponent()).iterator();
			java.lang.Boolean idLoopCond_382 = false;
			while (!idLoopCond_382) {
				idLoopCond_382 = it_ft95.isOff();
				if (idLoopCond_382) {
				} else {

					//BIle:func
					art.instance.ComponentInstance sub_lbdExp95 = it_ft95
							.next();

					_res.append("\t<sca:component constrainingType=\"eu.diva.");

					_res.append(sub_lbdExp95.getName());

					_res.append("\" name=\"");

					_res.append(sub_lbdExp95.getName());

					_res
							.append("\">\n\t<sca:implementation.java class=\"eu.diva.");

					_res.append(sub_lbdExp95.getName());

					_res.append(".");

					_res.append(sub_lbdExp95.getName());

					_res.append("Impl\"/>\n");

					//BIft:select

					kermeta.standard.Sequence<art.type.Port> result_ft97 = null;

					art.type.Port elem_ft97 = null;

					result_ft97 = ((kermeta.standard.Sequence<art.type.Port>) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.standard.StandardPackage.eINSTANCE
									.getSequence()));

					{

						kermeta.standard.Iterator<art.type.Port> it_ft97 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<art.type.Port> convertAsOrderedSet(
										sub_lbdExp95.getType().getPort())
								.iterator();
						java.lang.Boolean idLoopCond_384 = false;
						while (!idLoopCond_384) {
							idLoopCond_384 = it_ft97.isOff();
							if (idLoopCond_384) {
							} else {

								elem_ft97 = it_ft97.next();

								java.lang.Boolean idIfCond_385 = false;
								//BIle:selector
								art.type.Port p_lbdExp97 = elem_ft97;

								idIfCond_385 = kermeta.standard.helper.StringWrapper
										.equals(p_lbdExp97.getRole(), "server");
								//EIle:selector

								if (idIfCond_385) {

									result_ft97.add(elem_ft97);
								}

							}
						}
					}

					//EIft:select
					//BIft:each

					{

						kermeta.standard.Iterator<art.type.Port> it_ft96 = result_ft97
								.iterator();
						java.lang.Boolean idLoopCond_383 = false;
						while (!idLoopCond_383) {
							idLoopCond_383 = it_ft96.isOff();
							if (idLoopCond_383) {
							} else {

								//BIle:func
								art.type.Port p_lbdExp96 = it_ft96.next();

								_res.append("\t\t<sca:service name=\"");

								_res.append(p_lbdExp96.getName());

								_res
										.append("\">\n\t\t\t<sca:interface.java interface=\"");

								_res.append(p_lbdExp96.getService().getName());

								_res.append("\"/>\n\t\t</sca:service>\n");
								//EIle:func

							}
						}
					}

					//EIft:each

					_res.append("");

					//BIft:select

					kermeta.standard.Sequence<art.type.Port> result_ft99 = null;

					art.type.Port elem_ft99 = null;

					result_ft99 = ((kermeta.standard.Sequence<art.type.Port>) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject(kermeta.standard.StandardPackage.eINSTANCE
									.getSequence()));

					{

						kermeta.standard.Iterator<art.type.Port> it_ft99 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<art.type.Port> convertAsOrderedSet(
										sub_lbdExp95.getType().getPort())
								.iterator();
						java.lang.Boolean idLoopCond_387 = false;
						while (!idLoopCond_387) {
							idLoopCond_387 = it_ft99.isOff();
							if (idLoopCond_387) {
							} else {

								elem_ft99 = it_ft99.next();

								java.lang.Boolean idIfCond_388 = false;
								//BIle:selector
								art.type.Port p_lbdExp99 = elem_ft99;

								idIfCond_388 = kermeta.standard.helper.StringWrapper
										.equals(p_lbdExp99.getRole(), "client");
								//EIle:selector

								if (idIfCond_388) {

									result_ft99.add(elem_ft99);
								}

							}
						}
					}

					//EIft:select
					//BIft:each

					{

						kermeta.standard.Iterator<art.type.Port> it_ft98 = result_ft99
								.iterator();
						java.lang.Boolean idLoopCond_386 = false;
						while (!idLoopCond_386) {
							idLoopCond_386 = it_ft98.isOff();
							if (idLoopCond_386) {
							} else {

								//BIle:func
								art.type.Port p_lbdExp98 = it_ft98.next();

								_res.append("\t\t <sca:reference name=\"");

								_res.append(p_lbdExp98.getName());

								_res.append("\"/>\n");
								//EIle:func

							}
						}
					}

					//EIft:each

					_res.append("");

					//BIft:each

					{

						kermeta.standard.Iterator<art.instance.ValuedAttribute> it_ft100 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
								.<art.instance.ValuedAttribute> convertAsOrderedSet(
										sub_lbdExp95.getAttribute()).iterator();
						java.lang.Boolean idLoopCond_389 = false;
						while (!idLoopCond_389) {
							idLoopCond_389 = it_ft100.isOff();
							if (idLoopCond_389) {
							} else {

								//BIle:func
								art.instance.ValuedAttribute a_lbdExp100 = it_ft100
										.next();

								_res.append("\t\t<sca:property name=\"");

								_res
										.append(kermeta.standard.helper.StringWrapper
												.substring(
														kermeta.standard.helper.StringWrapper
																.split(
																		a_lbdExp100
																				.getValue(),
																		":")
																.elementAt(0),
														3,
														kermeta.standard.helper.StringWrapper
																.size(kermeta.standard.helper.StringWrapper
																		.split(
																				a_lbdExp100
																						.getValue(),
																				": ")
																		.elementAt(
																				0))));

								_res.append("\">");

								_res
										.append(kermeta.standard.helper.StringWrapper
												.split(a_lbdExp100.getValue(),
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

			kermeta.standard.Iterator<art.instance.TransmissionBinding> it_ft101 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<art.instance.TransmissionBinding> convertAsOrderedSet(
							system.getRoot().getterGetAllBindings()).iterator();
			java.lang.Boolean idLoopCond_390 = false;
			while (!idLoopCond_390) {
				idLoopCond_390 = it_ft101.isOff();
				if (idLoopCond_390) {
				} else {

					//BIle:func
					art.instance.TransmissionBinding b_lbdExp101 = it_ft101
							.next();

					_res.append("\t<sca:wire source=\"");

					_res
							.append(((art.instance.ComponentInstance) org.kermeta.compil.runtime.helper.language.ObjectUtil
									.asTypeSwitcher(
											org.kermeta.compil.runtime.helper.language.ObjectUtil
													.containerSwitcher(b_lbdExp101),
											org.kermeta.compil.runtime.ExecutionContext
													.getInstance()
													.getMetaClass(
															"art.instance.ComponentInstance")))
									.getName());

					_res.append("/");

					_res.append(b_lbdExp101.getClient().getName());

					_res.append("\" target=\"");

					_res.append(b_lbdExp101.getServerInstance().getName());

					_res.append("/");

					_res.append(b_lbdExp101.getServer().getName());

					_res.append("\"/>\n");
					//EIle:func

				}
			}
		}

		//EIft:each

		_res.append("");

		//BIft:each

		{

			kermeta.standard.Iterator<art.instance.DelegationBinding> it_ft102 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<art.instance.DelegationBinding> convertAsOrderedSet(
							system.getRoot().getDelegation()).iterator();
			java.lang.Boolean idLoopCond_391 = false;
			while (!idLoopCond_391) {
				idLoopCond_391 = it_ft102.isOff();
				if (idLoopCond_391) {
				} else {

					//BIle:func
					art.instance.DelegationBinding d_lbdExp102 = it_ft102
							.next();

					_res.append("\t<sca:service name=\"");

					_res.append(d_lbdExp102.getSource().getName());

					_res.append("\" promote=\"");

					_res.append(d_lbdExp102.getServerInstance().getName());

					_res.append("/");

					_res.append(d_lbdExp102.getExported().getName());

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
