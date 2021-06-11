package za.ac.cput.Factory;

import za.ac.cput.Entity.Booking;

public class BookingFactory 
{
 public static Booking createBooking(int bookID, String bookTime, String bookDate, String moduleCode, String moduleName)
 {
     Booking booking = new Booking.Builder()
             .setBookID(bookID)
             .setBookTime(bookTime)
             .setBookDate(bookDate)
             .setModuleCode(moduleCode)
             .setModuleName(moduleName)
             .build();

     return booking;


 }
}
