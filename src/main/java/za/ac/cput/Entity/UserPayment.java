/**
 * Mziyanda Mwanda
 * 215133765
 * Assignment 3
 * 11 June 2021
 * */
package za.ac.cput.Entity;

public class UserPayment {
    public String userId, paymentId;

    private UserPayment(Builder builder){
        this.userId = builder.userId;
        this.paymentId = builder.paymentId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", paymentId='" + paymentId + '\'' +
                '}';
    }

    public static class Builder{
        private String userId, paymentId;

        public Builder setUserId(String userId){
            this.userId = userId;

            return this;
        }

        public Builder setPaymentId(String paymentId){
            this.paymentId = paymentId;

            return this;
        }


        public UserPayment build(){

            return new UserPayment(this);
        }

        public Builder copy(UserPayment userPayment){
            this.userId = userPayment.userId;
            this.paymentId = userPayment.paymentId;

            return this;
        }



    }
}
