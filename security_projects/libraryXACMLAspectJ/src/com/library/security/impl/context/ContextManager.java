package com.library.security.impl.context;

import com.library.security.model.context.Context;

import java.util.Calendar;

/**
 * User: Tej
 * Date: 7 mars 2007
 * Time: 11:08:06
 */
public class ContextManager {

    public static final Context workingday = new WorkingDaysContext(),
            holidays = new HolidayContext(),
            maintenanceDay = new MaintenanceDayContext();

    // used for test security TODO remove this after tests
    public static Boolean doCalculateContext = true;
    public static Context currentContext;

    /**
     * Gcalcutales the temporal context of the current date
     * @return one of the temporal context that correspond to current date
     */
    public static Context getTemporalContext()    {

        // used for test security TODO remove this after tests
        if(!doCalculateContext)
              return currentContext;

        Calendar now = Calendar.getInstance();
        if(now.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
            return holidays;
        else if(now.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
            return maintenanceDay;
        else
            return workingday;
    }


    






    
}
