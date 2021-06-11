package za.ac.cput.Factory;

import za.ac.cput.Entity.Module;
import za.ac.cput.Entity.UserModule;

public class UserModuleFactory {
    public static UserModule createUserModule(int userId, String moduleCode) {
        return new UserModule.Builder().setUserId(userId).setModuleCode(moduleCode).build();
    }
}
