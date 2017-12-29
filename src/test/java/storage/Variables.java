package storage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Variables {

    public static String ACCOUNT_PSSWD = "test1234";
    private static String ACCOUNT_NAME;

    public static String getUniqueAccountName() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
        String timeStamp = dateFormat.format(new Date());

        ACCOUNT_NAME = "test" + timeStamp + "@gmail.com";

        return ACCOUNT_NAME;
    }
}

