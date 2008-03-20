package com.library.security.model;

/**
 * User: Tej
 * Date: 7 mars 2007
 * Time: 11:22:32
 */
public class Authorization {

    private String authType, organisation, role, activity, view, context;


    private boolean prioritized=false;

    public Authorization(String authType, String organisation, String role, String activity, String view, String context) {
        this.authType = authType;
        this.organisation = organisation;
        this.role = role;
        this.activity = activity;
        this.view = view;
        this.context = context;
    }

    public Authorization(String authType, String organisation, String role, String activity, String view, String context, boolean priority) {
        this.authType = authType;
        this.organisation = organisation;
        this.role = role;
        this.activity = activity;
        this.view = view;
        this.context = context;
        this.prioritized = priority;
    }


    public boolean isProhibition() {
        return authType.equals("Prohibition");

    }


    public boolean isPermission() {
        return authType.equals("Permission");

    }


    public boolean isObligation()   {
        return authType.equals("Obligation");

    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }


    public boolean isPrioritized() {
        return prioritized;
    }

    public void setPrioritized(boolean prioritized) {
        this.prioritized = prioritized;
    }

    public String toString() {
        return authType + "(" + organisation + "," + role + "," + activity + "," + view + "," + context + ")";
    }
}


