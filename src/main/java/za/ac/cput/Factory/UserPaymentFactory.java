package za.ac.cput.Factory;

import za.ac.cput.Entity.UserPayment;
import za.ac.cput.Util.GenUserId;

public class UserPaymentFactory {
    public static UserPayment createUserPayment() {
        String userId = GenUserId.genUserId();
        String paymentId = GenUserId.genUserId();
        UserPayment user = new UserPayment.Builder()
                .setUserId(userId)
                .setPaymentId(paymentId)
                .build();
        return user;
    }
}
