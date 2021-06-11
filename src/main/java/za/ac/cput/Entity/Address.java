package za.ac.cput.Entity;

/* G17_ADP3_Assignment3
 *Entity for Address
 * Author: Zintle Zothe (216130565)
 *Date: 10 June 2021
 */

public class Address {
    private String stNumber, strName, postalCode;


    private Address(Builder builder){
        this.stNumber=builder.stNumber;
        this.strName=builder.strName;
        this.postalCode=builder.postalCode;
    }

    public static class Builder{
        private String stNumber, strName, postalCode;

        public Builder setStNumber(String stNumber){
            this.stNumber=stNumber;
            return this;
        }
        public Builder setStrName(String strName) {
            this.strName =strName;
            return this;
        }

        public Builder setPostalCode(String postalCode){
            this.postalCode=postalCode;
            return this;
        }

        public Address build() {
            return new Address(this);
        }

        public Address.Builder copy(Address address){
            this.stNumber= address.stNumber;
            this.strName= address.strName;
            this.postalCode=address.postalCode;

            return this;
        }
    }
    @Override
    public String toString() {
        return "Address{" +
                "stNumber='" + stNumber + '\'' +
                ", strName='" + strName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}