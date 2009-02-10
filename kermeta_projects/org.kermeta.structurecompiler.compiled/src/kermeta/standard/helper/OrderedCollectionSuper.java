package kermeta.standard.helper;

/**
 *
 * @generated
 */
public class OrderedCollectionSuper {

	/**
	 *
	 * @generated
	 */
	public static <G> void super_addAt(

	kermeta.standard.OrderedCollection self, java.lang.Integer index, G element

	) {

		java.lang.Boolean idIfCond_1163 = false;
		idIfCond_1163 = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isLower(index, 0),
				kermeta.standard.helper.IntegerWrapper.isGreater(index, self
						.size()));

		if (idIfCond_1163) {

			if (true)
				throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
						((kermeta.exceptions.IndexOutOfBound) org.kermeta.compil.runtime.helper.language.ClassUtil
								.newObject(kermeta.exceptions.ExceptionsPackage.eINSTANCE
										.getIndexOutOfBound())));

		}

		org.kermeta.compil.runtime.helper.basetypes.OrderedCollectionUtil
				.addAt(self, index, element);

	}

	/**
	 *
	 * @generated
	 */
	public static <G> java.lang.Boolean super_equals(

	kermeta.standard.OrderedCollection self,
			kermeta.language.structure.Object element

	) {

		java.lang.Boolean result = null;

		java.lang.Boolean isEqual = false;

		java.lang.Boolean idIfCond_1164 = false;
		idIfCond_1164 = kermeta.standard.helper.BooleanWrapper
				.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
						.isVoidSwitcher(element));

		if (idIfCond_1164) {

			java.lang.Boolean idIfCond_1165 = false;
			idIfCond_1165 = org.kermeta.compil.runtime.helper.language.TypeUtil
					.isInstanceSwitcher(
							org.kermeta.compil.runtime.ExecutionContext
									.getInstance()
									.getMetaClass(
											"kermeta.standard.OrderedCollection<G>"),
							element);

			if (idIfCond_1165) {

				kermeta.standard.Collection<G> collection = null;

				collection = (kermeta.standard.Collection<G>) org.kermeta.compil.runtime.helper.language.ObjectUtil
						.asTypeOrVoid(element, "kermeta.standard.Collection<G>");

				java.lang.Boolean idIfCond_1166 = false;
				idIfCond_1166 = kermeta.standard.helper.IntegerWrapper.equals(
						self.size(), collection.size());

				if (idIfCond_1166) {

					kermeta.standard.Iterator<G> selfIterator = self.iterator();

					kermeta.standard.Iterator<G> collectionIterator = collection
							.iterator();

					java.lang.Boolean difference = false;

					kermeta.standard.helper.IntegerWrapper.equals(1, 1);
					java.lang.Boolean idLoopCond_1167 = false;
					while (!idLoopCond_1167) {
						idLoopCond_1167 = kermeta.standard.helper.BooleanWrapper
								.or(kermeta.standard.helper.BooleanWrapper.or(
										selfIterator.isOff(),
										collectionIterator.isOff()), difference);
						if (idLoopCond_1167) {
						} else {

							java.lang.Boolean idIfCond_1168 = false;
							idIfCond_1168 = kermeta.standard.helper.BooleanWrapper
									.not(org.kermeta.compil.runtime.helper.language.ObjectUtil
											.equalsSwitcher(
													selfIterator.next(),
													collectionIterator.next()));

							if (idIfCond_1168) {

								difference = true;
							}

						}
					}

					isEqual = kermeta.standard.helper.BooleanWrapper
							.not(difference);
				}

			}

		}

		result = isEqual;

		return result;

	}

}
