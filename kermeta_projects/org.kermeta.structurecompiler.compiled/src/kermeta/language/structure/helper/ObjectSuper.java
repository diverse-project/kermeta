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

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft203 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							self.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_929 = false;
			while (!idLoopCond_929) {
				idLoopCond_929 = it_ft203.isOff();
				if (idLoopCond_929) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp203 = it_ft203
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp202 = o_lbdExp203;

					java.lang.Boolean idIfCond_930 = false;
					idIfCond_930 = kermeta.standard.helper.StringWrapper
							.equals(p_lbdExp202.getDeprecated(), "");

					if (idIfCond_930) {

						p_lbdExp202.applyPass2(context);
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
	public static <G> void super_applyPass2BehaviorJava(

	kermeta.language.structure.Object self, km2ecore.KM2EcoreContext context

	) {

		//BIft:eachOwnedElement

		//BIft:each

		{

			kermeta.standard.Iterator<kermeta.language.structure.Tag> it_ft205 = org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
					.<kermeta.language.structure.Tag> convertAsOrderedSet(
							self.getOwnedTags()).iterator();
			java.lang.Boolean idLoopCond_931 = false;
			while (!idLoopCond_931) {
				idLoopCond_931 = it_ft205.isOff();
				if (idLoopCond_931) {
				} else {

					//BIle:func
					kermeta.language.structure.Tag o_lbdExp205 = it_ft205
							.next();

					//BIle:func
					kermeta.language.structure.Tag p_lbdExp204 = o_lbdExp205;

					p_lbdExp204.applyPass2BehaviorJava(context);
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
