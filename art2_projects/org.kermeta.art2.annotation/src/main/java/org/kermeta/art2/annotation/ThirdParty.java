/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author ffouquet
 */
@Retention(RetentionPolicy.CLASS)
public @interface ThirdParty {
    String name();
    String url();
}
