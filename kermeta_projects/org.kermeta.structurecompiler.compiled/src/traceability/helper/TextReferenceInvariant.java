package traceability.helper;

/**
 *
 * @generated
 */
public class TextReferenceInvariant {

	/**
	 *
	 * @generated
	 */
	public static java.lang.Boolean checkInvariant_18742069__validTextRef(

	traceability.TextReference self

	) {
		java.lang.Boolean result = false;

		result = kermeta.standard.helper.BooleanWrapper.or(
				kermeta.standard.helper.IntegerWrapper.isGreater(self
						.getLineEndAt(), self.getLineBeginAt()),
				kermeta.standard.helper.BooleanWrapper.and(
						kermeta.standard.helper.IntegerWrapper.equals(self
								.getLineBeginAt(), self.getLineEndAt()),
						kermeta.standard.helper.IntegerWrapper
								.isGreaterOrEqual(self.getCharEndAt(), self
										.getCharBeginAt())));

		return result;
	}

}
