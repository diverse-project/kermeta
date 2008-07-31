/**
 * <copyright>
 * </copyright>
 *
 * $Id: OsNameEnum.java,v 1.2 2008-07-31 13:43:52 edaubert Exp $
 */
package option;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Os Name Enum</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * @see option.OptionPackage#getOsNameEnum()
 * @model
 * @generated
 */
public enum OsNameEnum implements Enumerator {
	/**
	 * The '<em><b>AIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIX_VALUE
	 * @generated
	 * @ordered
	 */
	AIX(0, "AIX", "AIX"),

	/**
	 * The '<em><b>Digital Unix</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #DIGITAL_UNIX_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITAL_UNIX(1, "DigitalUnix", "DigitalUnix"),

	/**
	 * The '<em><b>Embos</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMBOS_VALUE
	 * @generated
	 * @ordered
	 */
	EMBOS(2, "Embos", "Embos"),

	/**
	 * The '<em><b>Epoc32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPOC32_VALUE
	 * @generated
	 * @ordered
	 */
	EPOC32(3, "Epoc32", "Epoc32"),

	/**
	 * The '<em><b>Free BSD</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #FREE_BSD_VALUE
	 * @generated
	 * @ordered
	 */
	FREE_BSD(4, "FreeBSD", "FreeBSD"),

	/**
	 * The '<em><b>HPUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPUX_VALUE
	 * @generated
	 * @ordered
	 */
	HPUX(5, "HPUX", "HPUX"),

	/**
	 * The '<em><b>IRIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRIX_VALUE
	 * @generated
	 * @ordered
	 */
	IRIX(6, "IRIX", "IRIX"),

	/**
	 * The '<em><b>Linux</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX(7, "Linux", "Linux"),

	/**
	 * The '<em><b>Mac OS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAC_OS_VALUE
	 * @generated
	 * @ordered
	 */
	MAC_OS(8, "MacOS", "MacOS"),

	/**
	 * The '<em><b>Net BSD</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #NET_BSD_VALUE
	 * @generated
	 * @ordered
	 */
	NET_BSD(9, "NetBSD", "NetBSD"),

	/**
	 * The '<em><b>Netware</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #NETWARE_VALUE
	 * @generated
	 * @ordered
	 */
	NETWARE(10, "Netware", "Netware"),

	/**
	 * The '<em><b>Open BSD</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #OPEN_BSD_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_BSD(11, "OpenBSD", "OpenBSD"),

	/**
	 * The '<em><b>OS2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OS2_VALUE
	 * @generated
	 * @ordered
	 */
	OS2(12, "OS2", "OS2"),

	/**
	 * The '<em><b>QNX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QNX_VALUE
	 * @generated
	 * @ordered
	 */
	QNX(13, "QNX", "QNX"),

	/**
	 * The '<em><b>Solaris</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #SOLARIS_VALUE
	 * @generated
	 * @ordered
	 */
	SOLARIS(14, "Solaris", "Solaris"),

	/**
	 * The '<em><b>Sun OS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUN_OS_VALUE
	 * @generated
	 * @ordered
	 */
	SUN_OS(15, "SunOS", "SunOS"),

	/**
	 * The '<em><b>Vx Works</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #VX_WORKS_VALUE
	 * @generated
	 * @ordered
	 */
	VX_WORKS(16, "VxWorks", "VxWorks"),

	/**
	 * The '<em><b>Windows95</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #WINDOWS95_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS95(17, "Windows95", "Windows95"),

	/**
	 * The '<em><b>Windows98</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #WINDOWS98_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS98(18, "Windows98", "Windows98"),

	/**
	 * The '<em><b>Windows NT</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #WINDOWS_NT_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS_NT(19, "WindowsNT", "WindowsNT"),

	/**
	 * The '<em><b>Windows CE</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #WINDOWS_CE_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS_CE(20, "WindowsCE", "WindowsCE"),

	/**
	 * The '<em><b>Windows2000</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #WINDOWS2000_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS2000(21, "Windows2000", "Windows2000"),

	/**
	 * The '<em><b>Windows2003</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #WINDOWS2003_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS2003(22, "Windows2003", "Windows2003"),

	/**
	 * The '<em><b>Windows XP</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #WINDOWS_XP_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS_XP(23, "WindowsXP", "WindowsXP"),

	/**
	 * The '<em><b>Windows Vista</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #WINDOWS_VISTA_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS_VISTA(24, "WindowsVista", "WindowsVista");

	/**
	 * The '<em><b>AIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AIX_VALUE = 0;

	/**
	 * The '<em><b>Digital Unix</b></em>' literal value. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Digital Unix</b></em>' literal object
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #DIGITAL_UNIX
	 * @model name="DigitalUnix"
	 * @generated
	 * @ordered
	 */
	public static final int DIGITAL_UNIX_VALUE = 1;

	/**
	 * The '<em><b>Embos</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Embos</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMBOS
	 * @model name="Embos"
	 * @generated
	 * @ordered
	 */
	public static final int EMBOS_VALUE = 2;

	/**
	 * The '<em><b>Epoc32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Epoc32</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EPOC32
	 * @model name="Epoc32"
	 * @generated
	 * @ordered
	 */
	public static final int EPOC32_VALUE = 3;

	/**
	 * The '<em><b>Free BSD</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Free BSD</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREE_BSD
	 * @model name="FreeBSD"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_BSD_VALUE = 4;

	/**
	 * The '<em><b>HPUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HPUX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HPUX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HPUX_VALUE = 5;

	/**
	 * The '<em><b>IRIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IRIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IRIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IRIX_VALUE = 6;

	/**
	 * The '<em><b>Linux</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Linux</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINUX
	 * @model name="Linux"
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_VALUE = 7;

	/**
	 * The '<em><b>Mac OS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mac OS</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAC_OS
	 * @model name="MacOS"
	 * @generated
	 * @ordered
	 */
	public static final int MAC_OS_VALUE = 8;

	/**
	 * The '<em><b>Net BSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Net BSD</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NET_BSD
	 * @model name="NetBSD"
	 * @generated
	 * @ordered
	 */
	public static final int NET_BSD_VALUE = 9;

	/**
	 * The '<em><b>Netware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Netware</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NETWARE
	 * @model name="Netware"
	 * @generated
	 * @ordered
	 */
	public static final int NETWARE_VALUE = 10;

	/**
	 * The '<em><b>Open BSD</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Open BSD</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_BSD
	 * @model name="OpenBSD"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_BSD_VALUE = 11;

	/**
	 * The '<em><b>OS2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OS2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OS2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OS2_VALUE = 12;

	/**
	 * The '<em><b>QNX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QNX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QNX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QNX_VALUE = 13;

	/**
	 * The '<em><b>Solaris</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solaris</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLARIS
	 * @model name="Solaris"
	 * @generated
	 * @ordered
	 */
	public static final int SOLARIS_VALUE = 14;

	/**
	 * The '<em><b>Sun OS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sun OS</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUN_OS
	 * @model name="SunOS"
	 * @generated
	 * @ordered
	 */
	public static final int SUN_OS_VALUE = 15;

	/**
	 * The '<em><b>Vx Works</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Vx Works</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VX_WORKS
	 * @model name="VxWorks"
	 * @generated
	 * @ordered
	 */
	public static final int VX_WORKS_VALUE = 16;

	/**
	 * The '<em><b>Windows95</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Windows95</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS95
	 * @model name="Windows95"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS95_VALUE = 17;

	/**
	 * The '<em><b>Windows98</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Windows98</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS98
	 * @model name="Windows98"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS98_VALUE = 18;

	/**
	 * The '<em><b>Windows NT</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Windows NT</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_NT
	 * @model name="WindowsNT"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS_NT_VALUE = 19;

	/**
	 * The '<em><b>Windows CE</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Windows CE</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_CE
	 * @model name="WindowsCE"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS_CE_VALUE = 20;

	/**
	 * The '<em><b>Windows2000</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Windows2000</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS2000
	 * @model name="Windows2000"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS2000_VALUE = 21;

	/**
	 * The '<em><b>Windows2003</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Windows2003</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS2003
	 * @model name="Windows2003"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS2003_VALUE = 22;

	/**
	 * The '<em><b>Windows XP</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Windows XP</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_XP
	 * @model name="WindowsXP"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS_XP_VALUE = 23;

	/**
	 * The '<em><b>Windows Vista</b></em>' literal value. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows Vista</b></em>' literal object
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #WINDOWS_VISTA
	 * @model name="WindowsVista"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS_VISTA_VALUE = 24;

	/**
	 * An array of all the '<em><b>Os Name Enum</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final OsNameEnum[] VALUES_ARRAY = new OsNameEnum[] {
			AIX,
			DIGITAL_UNIX,
			EMBOS,
			EPOC32,
			FREE_BSD,
			HPUX,
			IRIX,
			LINUX,
			MAC_OS,
			NET_BSD,
			NETWARE,
			OPEN_BSD,
			OS2,
			QNX,
			SOLARIS,
			SUN_OS,
			VX_WORKS,
			WINDOWS95,
			WINDOWS98,
			WINDOWS_NT,
			WINDOWS_CE,
			WINDOWS2000,
			WINDOWS2003,
			WINDOWS_XP,
			WINDOWS_VISTA,
		};

	/**
	 * A public read-only list of all the '<em><b>Os Name Enum</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OsNameEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Os Name Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static OsNameEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OsNameEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Os Name Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static OsNameEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OsNameEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Os Name Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static OsNameEnum get(int value) {
		switch (value) {
			case AIX_VALUE: return AIX;
			case DIGITAL_UNIX_VALUE: return DIGITAL_UNIX;
			case EMBOS_VALUE: return EMBOS;
			case EPOC32_VALUE: return EPOC32;
			case FREE_BSD_VALUE: return FREE_BSD;
			case HPUX_VALUE: return HPUX;
			case IRIX_VALUE: return IRIX;
			case LINUX_VALUE: return LINUX;
			case MAC_OS_VALUE: return MAC_OS;
			case NET_BSD_VALUE: return NET_BSD;
			case NETWARE_VALUE: return NETWARE;
			case OPEN_BSD_VALUE: return OPEN_BSD;
			case OS2_VALUE: return OS2;
			case QNX_VALUE: return QNX;
			case SOLARIS_VALUE: return SOLARIS;
			case SUN_OS_VALUE: return SUN_OS;
			case VX_WORKS_VALUE: return VX_WORKS;
			case WINDOWS95_VALUE: return WINDOWS95;
			case WINDOWS98_VALUE: return WINDOWS98;
			case WINDOWS_NT_VALUE: return WINDOWS_NT;
			case WINDOWS_CE_VALUE: return WINDOWS_CE;
			case WINDOWS2000_VALUE: return WINDOWS2000;
			case WINDOWS2003_VALUE: return WINDOWS2003;
			case WINDOWS_XP_VALUE: return WINDOWS_XP;
			case WINDOWS_VISTA_VALUE: return WINDOWS_VISTA;
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
	private OsNameEnum(int value, String name, String literal) {
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

} // OsNameEnum
