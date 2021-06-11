package za.ac.cput.Entity;

/* G17_ADP3_Assignment3
 *Entity for Contact
 * Author: Zintle Zothe (216130565)
 *Date: 10 June 2021
 */


public class Contact {
    private String cellNumber, email;

    private Contact(Builder builder) {
        this.cellNumber = builder.cellNumber;
        this.email = builder.email;
    }

    public static class Builder {
        private String cellNumber, email;

        public Builder setCellNumber(String cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }

        public Builder copy(Contact contact){
            this.cellNumber=contact.cellNumber;
            this.email=contact.email;

            return this;
        }
    }

    @Override
    public String toString() {
        return "Contact{" +
                "cellNumber='" + cellNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}