package org.slf4j.impl;

import org.slf4j.spi.MDCAdapter;


/**
 * This implementation is bound to {@link EclipseEnabledLog4jMDCAdapter}.
 *
 * @author Ceki G&uuml;lc&uuml;
 */
public class StaticMDCBinder {

  
  /**
   * The unique instance of this class.
   */
  public static final StaticMDCBinder SINGLETON = new StaticMDCBinder();

  private StaticMDCBinder() {
  }
  
  /**
   * Currently this method always returns an instance of 
   * {@link StaticMDCBinder}.
   */
  public MDCAdapter getMDCA() {
     return new EclipseEnabledLog4jMDCAdapter();
  }
  
  public String  getMDCAdapterClassStr() {
    return EclipseEnabledLog4jMDCAdapter.class.getName();
  }
}
