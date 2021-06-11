package za.ac.cput.Factory;
import za.ac.cput.Entity.ChargingRate;

import java.util.UUID;

//Entity for ChargingRateFactory
// Author: Panashe Muinzani_218186568
// Date: 9 June 2021


public class ChargingRateFactory {

    public static ChargingRate createChargingRate (UUID UserID, String moduleCode, int rate){

        ChargingRate chargingRate = new ChargingRate.Builder()
                .setUserID()
                .setmoduleCode()
                .setrate()
                .build();

                return chargingRate;


    }

}
