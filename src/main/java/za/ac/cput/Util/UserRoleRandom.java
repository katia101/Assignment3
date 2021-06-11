package za.ac.cput.Util;

/* RandomId.java
   Generate random id's for userRole;
   Author: Ottor Ncedo (218052200)
   Date: 09 June 2021
 */

import java.util.UUID;

public class UserRoleRandom {
    public static String generateId() {

        return UUID.randomUUID().toString();
    }
}
