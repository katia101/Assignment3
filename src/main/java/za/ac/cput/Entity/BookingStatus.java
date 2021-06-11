package za.ac.cput.Entity;

//Entity for BookingStatus
// Author: Panashe Muinzani_218186568
// Date: 9 June 2021
//Java Collection classes

public class BookingStatus {
    private String Confirm, Reject, Pending;

    public BookingStatus(Builder builder) {
        this.Confirm = builder.Confirm;
        this.Reject = builder.Reject;
        this.Pending = builder.Pending;

    }

    @Override
    public String toString() {
        return "Builder{" +
                "Confirm='" + Confirm + '\'' +
                ", Reject='" + Reject + '\'' +
                ", Pending='" + Pending + '\'' +
                '}';
    }

    public static class Builder {
        private String Confirm, Reject, Pending;

        public Builder setConfirm() {
            this.Confirm = Confirm;
            return this;
        }

        public Builder setReject() {
            this.Reject = Reject;
            return this;
        }

        public Builder setPending() {
            this.Pending = Pending;
            return this;
        }

        public BookingStatus build(){
            return new BookingStatus(this);
        }
        public Builder copy(BookingStatus bookingStatus){
            this.Confirm = bookingStatus.Confirm;
            this.Reject = bookingStatus.Reject;
            this.Pending = bookingStatus.Pending;

            return this;

        }
    }
}