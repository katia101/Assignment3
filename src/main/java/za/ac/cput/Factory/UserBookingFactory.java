package za.ac.cput.Factory;

import za.ac.cput.Entity.UserBooking;

public class UserBookingFactory 
{
    public static UserBooking createUserBooking(int userID, int bookID)
    {
        UserBooking userBooking = new UserBooking.Builder()
                .setUserID(userID)
                .setBookID(bookID)
                .build();

        return userBooking;

    }
}
