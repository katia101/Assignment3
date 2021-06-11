package za.ac.cput.Factory;

import za.ac.cput.Entity.User;
import za.ac.cput.Util.GenUserId;

public class UserFactory {
    public static User createUser(String firstName, String lastName) {
    String userId = GenUserId.genUserId();
    User user = new User.Builder()
            .setUserId(userId)
            .setFirstName(firstName)
            .setLastName(lastName)
            .build();
    return user;
    }
    }

