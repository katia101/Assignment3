package za.ac.cput.Entity;

/**
 * Booking.java
 * Entity for Booking
 * Author: Mandisa E. Msongelwa - 217149073
 * Due Date: 11 June 2021, Friday
 */

public class Booking {
    private int bookID;
    private String bookTime;
    private String bookDate;
    private String moduleCode;
    private String moduleName;

    //declaring a private constructor to make attributes immutable
    private Booking(Builder builder) {
        this.bookID = builder.bookID;
        this.bookTime = builder.bookTime;
        this.bookDate = builder.bookDate;
        this.moduleCode = builder.moduleCode;
        this.moduleName = builder.moduleName;
    }

    @Override
    public String toString() {
        return "Booking{" + "bookID=" + bookID + ", bookTime='" + bookTime + '\'' + ", bookDate='" + bookDate + '\'' + ", moduleCode='" + moduleCode + '\'' +
                ", moduleName='" + moduleName + '\'' +
                '}';
    }

    public static class Builder {
        private int bookID;
        private String bookTime;
        private String bookDate;
        private String moduleCode;
        private String moduleName;


        //Setters
        public Builder setBookID(int bookID) {
            this.bookID = bookID;
            return this;
        }

        public Builder setBookTime(String bookTime) {
            this.bookTime = bookTime;
            return this;
        }

        public Builder setBookDate(String bookDate) {
            this.bookDate = bookDate;
            return this;
        }

        public Builder setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }

        public Builder setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }

        public Builder copy(Booking booking) {
            this.bookID = booking.bookID;
            this.bookTime = booking.bookTime;
            this.bookDate = booking.bookDate;
            this.moduleCode = booking.moduleCode;
            this.moduleName = booking.moduleName;

            return this;
        }
    }

}
