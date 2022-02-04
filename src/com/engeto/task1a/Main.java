package com.engeto.task1a;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        String clientName = "John Doe"; // client's name and surname

        int salesCount = 42; // count of how many times item has been bought

        String headQuatersLocation = "New York"; // headQuaters location

        double vehicleConsumption = 9.78; // vehicle consumption in l/100 km

        int cableLength = 716; // cable length in meters
        /* double cableLength = 716.35; // cable length in meters, decimal value */

        LocalDate dateOfBirth = LocalDate.of(1991,2,25); // date of birth in YYYY-MM-DD format

        String vehicleLicencePlate = "1TR 2962"; // vehicle's licence plate

        String ipAddress = "192.168.1.1"; // IP address

        System.out.println(clientName+"\n"+salesCount+"\n"+headQuatersLocation+"\n"+vehicleConsumption+" l/100km"+"\n"+cableLength+" m"+"\n"+dateOfBirth+"\n"+vehicleLicencePlate+"\n"+ipAddress); //humus na jeden radek

        //System.out.printf(clientName, salesCount, headQuatersLocation, vehicleConsumption,cableLength,dateOfBirth,vehicleLicencePlate, ipAddress);
    }
}
