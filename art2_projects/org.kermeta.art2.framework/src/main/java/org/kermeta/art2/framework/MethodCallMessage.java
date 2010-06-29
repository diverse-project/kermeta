/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework;

import java.util.HashMap;

/**
 *
 * @author ffouquet
 */
public class MethodCallMessage implements java.io.Serializable {

    private HashMap<String,Object> params = new HashMap<String,Object>();

    private String methodName ;

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public HashMap<String, Object> getParams() {
        return params;
    }

    public void setParams(HashMap<String, Object> params) {
        this.params = params;
    }

}
