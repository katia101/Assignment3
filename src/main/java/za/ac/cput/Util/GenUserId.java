package za.ac.cput.Util;

import java.util.UUID;

public class GenUserId {
    public static String genUserId(){
        return UUID.randomUUID().toString();
    }
}
