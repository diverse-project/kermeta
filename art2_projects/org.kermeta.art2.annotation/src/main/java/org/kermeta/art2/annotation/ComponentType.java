/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author ffouquet
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
public @interface ComponentType {
    java.lang.String name() default "empty";
    java.lang.String libName() default "default";
}