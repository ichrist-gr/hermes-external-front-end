package org.hua.hermes.frontend.constant;

import java.text.SimpleDateFormat;

public class DateTimeConstants
{
    public static final String DATE_FORMAT = "dd/MM/yyyy";
    public static final String TIME_FORMAT = "HH:mm:ss";
    public static final String DATE_TIME_FORMAT = "dd/MM/yyyy HH:mm:ss";

    public static final SimpleDateFormat DATETIME_FORMATTER = new SimpleDateFormat(DateTimeConstants.DATE_TIME_FORMAT);
}
