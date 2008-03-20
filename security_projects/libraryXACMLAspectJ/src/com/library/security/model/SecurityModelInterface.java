package com.library.security.model;

import java.util.Collection;

/**
 * User: Tej
 * Date: 7 mars 2007
 * Time: 10:55:30
 */
public interface SecurityModelInterface {


    /**
     * Load the list of rules from the database.
     * Rules are the OR-BAC security policy rules
     */
    void loadSecurityRules();


    /**
     * Define the mapping between rules entities and the application model
     * The rules entities are : Activities, Roles and Views and contexts
     */
    void defineSecurityModelMapping();


    /**
     * Init the mapping lists, fill it with the list of classes/methods/contexts from
     * the application and their entities
     */
    void initMapping();


    Collection<Authorization> getAuthorisations();


}
