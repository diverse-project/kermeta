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
	public static <G> void super_applyPass2(

	kermeta.language.structure.Object self, km2ecore.KM2EcoreContext context

	) {

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft257 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							self.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_1121 = false;
			while (!idLoopCond_1121) {
				idLoopCond_1121 = it_ft257.isOff();
				if (idLoopCond_1121) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp257 = it_ft257
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp256 = o_lbdExp257;

					java.lang.Boolean idIfCond_1122 = false;
					idIfCond_1122 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp256.getDeprecated(), "");

					if (idIfCond_1122) {

						p_lbdExp256.applyPass2(context);
					}

					//EIle:func

					//EIle:func

				}
			}
		}

		//EIft:each

		//EIft:eachOwnedElement

	}

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

}
