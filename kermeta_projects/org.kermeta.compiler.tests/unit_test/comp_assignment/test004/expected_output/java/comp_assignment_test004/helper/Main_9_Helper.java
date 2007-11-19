
package comp_assignment_test004.helper;

import org.eclipse.emf.common.util.EList;

import comp_assignment_test004.B;

/**
 *
 * @generated
 */
public class Main_9_Helper 
{


  public static void each(EList<B> list) {
    for(B it : list) {
      func(it);
    }
  }
  
  private static void func(B e) {
    System.out.println("b: " + e.toString());
  }

}
