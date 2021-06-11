package za.ac.cput.Entity;

/**
 * Booking.java
 * Entity for Booking
 * Author: Mandisa E. Msongelwa - 217149073
 * Due Date: 11 June 2021, Friday
 */

public class UserBooking
{
    private int userID;
    private int bookID;

    //declaring a private constructor to make attributes immutable
    private UserBooking(Builder builder)
    {
        this.userID = builder.userID;
        this.bookID = builder.bookID;
    }

    @Override
    public String toString()
    {
        return "UserBooking{" + "userID=" + userID + ", bookID=" + bookID + '}';
    }

    public static class Builder
    {
        private int userID;
        private int bookID;

        //Setters
        public Builder setUserID(int userID)
        {
            this.userID = userID;
            return this;
        }

        public Builder setBookID(int bookID)
        {
            this.bookID = bookID;
            return this;
        }

        public UserBooking build()
        {
            return new UserBooking(this);
        }

        public Builder copy(UserBooking userBooking)
        {
            this.userID = userBooking.userID;
            this.bookID = userBooking.bookID;

            return this;
        }
    }

}
