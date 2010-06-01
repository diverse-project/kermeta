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
@Retention(RetentionPolicy.SOURCE)
public @interface RequiredPort {

    String name();

    Class className() default Void.class;

    boolean optional() default false;

    boolean async() default false;
}
