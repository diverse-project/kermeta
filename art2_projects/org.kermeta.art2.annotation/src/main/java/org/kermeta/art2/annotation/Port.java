/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author ffouquet
 */
@Inherited
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD})
public @interface Port {
        String name();
        String method() default "empty";
}
