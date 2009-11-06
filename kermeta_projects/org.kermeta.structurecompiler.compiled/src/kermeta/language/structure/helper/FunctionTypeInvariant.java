package kermeta.language.structure.helper;

/**
 *
 * @generated
 */
public class FunctionTypeInvariant {

	/**
	 *
	 * @generated
	 */
	public static java.lang.Boolean checkInvariant_13970096__resultType_must_not_be_a_ProductType(

	kermeta.language.structure.FunctionType self

	) {
		java.lang.Boolean result = false;

		result = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isKindOfSwitcher(
								self.getRight(),
								org.kermeta.compil.runtime.ExecutionContext
										.getInstance()
										.getMetaClass(
												"kermeta.language.structure.ProductType")));
		return result;
	}

}
