package kermeta.language.structure.helper;

/**
 *
 * @generated
 */
public class ObjectSuper {

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.String super_createBehaviorJava(

	kermeta.language.structure.Object self, km2ecore.KM2EcoreContext context

	) {

		java.lang.String result = null;

		result = "";

		return result;

	}

	/**
	 *
	 * @generated
	 */
	public static <G> void super_applyPass2(

	kermeta.language.structure.Object self, km2ecore.KM2EcoreContext context

	) {

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft249 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							self.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_1058 = false;
			while (!idLoopCond_1058) {
				idLoopCond_1058 = it_ft249.isOff();
				if (idLoopCond_1058) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp249 = it_ft249
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp248 = o_lbdExp249;

					java.lang.Boolean idIfCond_1059 = false;
					idIfCond_1059 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp248.getDeprecated(), "");

					if (idIfCond_1059) {

						p_lbdExp248.applyPass2(context);
					}

					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

	}

}
