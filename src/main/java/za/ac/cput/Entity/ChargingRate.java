package za.ac.cput.Entity;

//Entity for ChargingRate
// Author: Panashe Muinzani_218186568
// Date: 9 June 2021


public class ChargingRate {
    private String UserID, moduleCode;
    private int rate;

    public ChargingRate(ChargingRate.Builder builder) {
        this.UserID = builder.UserID;
        this.moduleCode = builder.moduleCode;
        this.rate = builder.rate;

    }

    @Override
    public String toString() {
        return "ChargingRateFactory{" +
                "UserID='" + UserID + '\'' +
                ", moduleCode='" + moduleCode + '\'' +
                ", rate=" + rate +
                '}';
    }
    public static class Builder {
        private String UserID, moduleCode;
        private int rate;

        public ChargingRate.Builder setUserID() {
            this.UserID = UserID;
            return this;
        }

        public ChargingRate.Builder setmoduleCode() {
            this.moduleCode = moduleCode;
            return this;
        }

        public ChargingRate.Builder setrate() {
            this.rate = rate;
            return this;
        }

        public ChargingRate build(){
            return new ChargingRate(this);
        }
        public ChargingRate.Builder copy(ChargingRate chargingRate){
            this.UserID = chargingRate.UserID;
            this.moduleCode = chargingRate.moduleCode;
            this.rate = chargingRate.rate;

            return this;

        }
    }
}

