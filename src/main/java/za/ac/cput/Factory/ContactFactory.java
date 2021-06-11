package za.ac.cput.Factory;

/* Assignment3
 *Factory for Contact
 * Author: Zintle Zothe (216130565)
 *Date: 10 June 2021
 */
import za.ac.cput.Entity.Contact;

public class ContactFactory {
    public static Contact createContact(String cellNumber, String email){

        if(  cellNumber.matches("[0]{1}[0-9]{9}"))
            System.out.print(cellNumber+ " is valid"+"\n");
        else
            return null;


        Contact contact= new Contact.Builder()
                .setCellNumber(cellNumber)
                .setEmail(email)
                .build();
        return contact;
    }
}