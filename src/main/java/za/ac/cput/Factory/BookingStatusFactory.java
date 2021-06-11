package za.ac.cput.Factory;


//Entity for BookingStatusFactory
// Author: Panashe Muinzani_218186568
// Date: 9 June 2021


import za.ac.cput.Entity.BookingStatus;

public class BookingStatusFactory {

    public static BookingStatus createBookingStatus(String Confirm, String Reject, String Pending){

        BookingStatus bookingStatus = new BookingStatus.Builder()
                .setConfirm()
                .setReject()
                .setPending()
                .build();

        return bookingStatus;

    }
}

