package za.ac.cput.Factory;

/* UserRoleFactory.java
   this is a factory class for userRole
   Author: Ottor Ncedo (218052200)
   Date: 09 June 2021
 */

import za.ac.cput.Entity.UserRole;
import za.ac.cput.Util.UserRoleRandom;

public class UserRoleFactory {

    public static UserRole createUserRole() {


        String userId = UserRoleRandom.generateId();
        String roleId = UserRoleRandom.generateId();

        UserRole userRole = new UserRole.Builder()
                .setUserId(userId)
                .setRoleId(roleId)
                .build();
        return userRole;
    }
}