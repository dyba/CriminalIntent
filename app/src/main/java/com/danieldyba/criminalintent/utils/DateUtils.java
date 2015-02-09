package com.danieldyba.criminalintent.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by ddyba on 2/8/15.
 */
public class DateUtils {
    public static String formatDateAsFriendlyDateInstance(Date d) {
        String formatString = "EEEE, LLL F, yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(formatString, Locale.US);
        return sdf.format(d);
    }
}
