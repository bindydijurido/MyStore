package storage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Variables {

    public static final String ACCOUNT_PSSWD = "test1234";

    public static String getUniqueAccountName() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
        String timeStamp = dateFormat.format(new Date());
        return "test" + timeStamp + "@gmail.com";
    }
}

