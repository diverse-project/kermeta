
//  Internal enum
final class PackageGlobalCmd {
  public static final int _findNamespaceCmd = 0;
  public static final PackageGlobalCmd findNamespaceCmd = new PackageGlobalCmd(_findNamespaceCmd);
  public static final int _findPackageCmd = 1;
  public static final PackageGlobalCmd findPackageCmd = new PackageGlobalCmd(_findPackageCmd);
  public static final int _findModuleCmd = 2;
  public static final PackageGlobalCmd findModuleCmd = new PackageGlobalCmd(_findModuleCmd);
  public static final int _getProjectCmd = 3;
  public static final PackageGlobalCmd getProjectCmd = new PackageGlobalCmd(_getProjectCmd);
  public static final int _isProjectModifiedCmd = 4;
  public static final PackageGlobalCmd isProjectModifiedCmd = new PackageGlobalCmd(_isProjectModifiedCmd);
  public static final int _saveProjectCmd = 5;
  public static final PackageGlobalCmd saveProjectCmd = new PackageGlobalCmd(_saveProjectCmd);

  private int value;

  public int value() {
    return value;
  }

  public static PackageGlobalCmd fromInt(int value) {
    switch (value) {
    case _findNamespaceCmd: return findNamespaceCmd;
    case _findPackageCmd: return findPackageCmd;
    case _findModuleCmd: return findModuleCmd;
    case _getProjectCmd: return getProjectCmd;
    case _isProjectModifiedCmd: return isProjectModifiedCmd;
    case _saveProjectCmd: return saveProjectCmd;
    default: throw new Error();
    }
  }

  private PackageGlobalCmd(int v) { value = v; }; 
}
