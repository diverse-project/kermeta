/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProcessorEnum.java,v 1.2 2008-07-31 13:43:52 edaubert Exp $
 */
package option;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Processor Enum</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * @see option.OptionPackage#getProcessorEnum()
 * @model
 * @generated
 */
public enum ProcessorEnum implements Enumerator {
	/**
	 * The '<em><b>P6 8k</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P6_8K_VALUE
	 * @generated
	 * @ordered
	 */
	P6_8K(0, "P68k", "68k"),

	/**
	 * The '<em><b>ARM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARM_VALUE
	 * @generated
	 * @ordered
	 */
	ARM(1, "ARM", "ARM"),

	/**
	 * The '<em><b>Alpha</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHA_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHA(2, "Alpha", "Alpha"),

	/**
	 * The '<em><b>Ignite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNITE_VALUE
	 * @generated
	 * @ordered
	 */
	IGNITE(3, "Ignite", "Ignite"),

	/**
	 * The '<em><b>Mips</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIPS_VALUE
	 * @generated
	 * @ordered
	 */
	MIPS(4, "Mips", "Mips"),

	/**
	 * The '<em><b>PArisc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARISC_VALUE
	 * @generated
	 * @ordered
	 */
	PARISC(5, "PArisc", "PArisc"),

	/**
	 * The '<em><b>Power PC</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #POWER_PC_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_PC(6, "PowerPC", "PowerPC"),

	/**
	 * The '<em><b>Sh4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SH4_VALUE
	 * @generated
	 * @ordered
	 */
	SH4(7, "Sh4", "Sh4"),

	/**
	 * The '<em><b>Sparc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPARC_VALUE
	 * @generated
	 * @ordered
	 */
	SPARC(9, "Sparc", "Sparc"),

	/**
	 * The '<em><b>S390</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S390_VALUE
	 * @generated
	 * @ordered
	 */
	S390(10, "S390", "S390"),

	/**
	 * The '<em><b>S39 0x</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S39_0X_VALUE
	 * @generated
	 * @ordered
	 */
	S39_0X(11, "S390x", "S390x"),

	/**
	 * The '<em><b>V850E</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V850E_VALUE
	 * @generated
	 * @ordered
	 */
	V850E(12, "V850E", "V850E"),

	/**
	 * The '<em><b>X86</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X86_VALUE
	 * @generated
	 * @ordered
	 */
	X86(13, "x86", "x86"),

	/**
	 * The '<em><b>X8664</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X8664_VALUE
	 * @generated
	 * @ordered
	 */
	X8664(14, "x8664", "x86-64");

	/**
	 * The '<em><b>P6 8k</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>P6 8k</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #P6_8K
	 * @model name="P68k" literal="68k"
	 * @generated
	 * @ordered
	 */
	public static final int P6_8K_VALUE = 0;

	/**
	 * The '<em><b>ARM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARM_VALUE = 1;

	/**
	 * The '<em><b>Alpha</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alpha</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHA
	 * @model name="Alpha"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHA_VALUE = 2;

	/**
	 * The '<em><b>Ignite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ignite</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IGNITE
	 * @model name="Ignite"
	 * @generated
	 * @ordered
	 */
	public static final int IGNITE_VALUE = 3;

	/**
	 * The '<em><b>Mips</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mips</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIPS
	 * @model name="Mips"
	 * @generated
	 * @ordered
	 */
	public static final int MIPS_VALUE = 4;

	/**
	 * The '<em><b>PArisc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PArisc</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARISC
	 * @model name="PArisc"
	 * @generated
	 * @ordered
	 */
	public static final int PARISC_VALUE = 5;

	/**
	 * The '<em><b>Power PC</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Power PC</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWER_PC
	 * @model name="PowerPC"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_PC_VALUE = 6;

	/**
	 * The '<em><b>Sh4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sh4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SH4
	 * @model name="Sh4"
	 * @generated
	 * @ordered
	 */
	public static final int SH4_VALUE = 7;

	/**
	 * The '<em><b>Sparc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sparc</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPARC
	 * @model name="Sparc"
	 * @generated
	 * @ordered
	 */
	public static final int SPARC_VALUE = 9;

	/**
	 * The '<em><b>S390</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S390</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S390
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int S390_VALUE = 10;

	/**
	 * The '<em><b>S39 0x</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S39 0x</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S39_0X
	 * @model name="S390x"
	 * @generated
	 * @ordered
	 */
	public static final int S39_0X_VALUE = 11;

	/**
	 * The '<em><b>V850E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>V850E</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #V850E
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int V850E_VALUE = 12;

	/**
	 * The '<em><b>X86</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>X86</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #X86
	 * @model name="x86"
	 * @generated
	 * @ordered
	 */
	public static final int X86_VALUE = 13;

	/**
	 * The '<em><b>X8664</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>X8664</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #X8664
	 * @model name="x8664" literal="x86-64"
	 * @generated
	 * @ordered
	 */
	public static final int X8664_VALUE = 14;

	/**
	 * An array of all the '<em><b>Processor Enum</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcessorEnum[] VALUES_ARRAY = new ProcessorEnum[] {
			P6_8K,
			ARM,
			ALPHA,
			IGNITE,
			MIPS,
			PARISC,
			POWER_PC,
			SH4,
			SPARC,
			S390,
			S39_0X,
			V850E,
			X86,
			X8664,
		};

	/**
	 * A public read-only list of all the '<em><b>Processor Enum</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProcessorEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Processor Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessorEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessorEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processor Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessorEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessorEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processor Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessorEnum get(int value) {
		switch (value) {
			case P6_8K_VALUE: return P6_8K;
			case ARM_VALUE: return ARM;
			case ALPHA_VALUE: return ALPHA;
			case IGNITE_VALUE: return IGNITE;
			case MIPS_VALUE: return MIPS;
			case PARISC_VALUE: return PARISC;
			case POWER_PC_VALUE: return POWER_PC;
			case SH4_VALUE: return SH4;
			case SPARC_VALUE: return SPARC;
			case S390_VALUE: return S390;
			case S39_0X_VALUE: return S39_0X;
			case V850E_VALUE: return V850E;
			case X86_VALUE: return X86;
			case X8664_VALUE: return X8664;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private ProcessorEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // ProcessorEnum
