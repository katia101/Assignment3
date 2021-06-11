package za.ac.cput.Factory;

/* RoleFactory.java
   this is a factory class for a role
   Author: Ottor Ncedo (218052200)
   Date: 09 June 2021
 */

import za.ac.cput.Entity.Role;
import za.ac.cput.Util.RandomId;

public class RoleFactory {

    public static Role createRole(String roleName){
        String roleId = RandomId.generateId();

        Role role = new Role.Builder()
                .setRoleId(roleId)
                .setRoleName(roleName)
                .build();
        return role;

    }
}
