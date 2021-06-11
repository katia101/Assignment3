/**
 * Mziyanda Mwanda
 * 215133765
 * Assignment 3
 * 11 June 2021
 * */
package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;

import za.ac.cput.Entity.UserPayment;

import static org.junit.jupiter.api.Assertions.*;

class UserPaymentFactoryTest {
    @Test
    public void createUser() {
        UserPayment uP = UserPaymentFactory.createUserPayment();
        System.out.println(uP);

    }
}