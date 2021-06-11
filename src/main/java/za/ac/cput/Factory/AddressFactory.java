package za.ac.cput.Factory;
/* Assignment3
 *Factory for Address
 * Author: Zintle Zothe (216130565)
 *Date: 10 June 2021
 */
import za.ac.cput.Entity.Address;

public class AddressFactory {
    public static Address createAddress(String stNumber, String strName, String postalCode){

        if(stNumber.isEmpty()|| strName.isEmpty())
            return null;
        if(  postalCode.matches("[1-9]{1}[0-9]{3}"))
            System.out.print(postalCode+ " is valid"+"\n");
        else
            return null;


        Address address= new Address.Builder()
                .setStNumber(stNumber)
                .setStrName(strName)
                .setPostalCode(postalCode)
                .build();
        return address;
    }

}