package io.javabrains.parkinglot.lot;

import io.javabrains.parkinglot.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<ParkingSpace> parkingSpaces = new ArrayList<>();
    private PaymentCounter paymentCounter = new PaymentCounter();
    private ParkingAttendant parkingAttendant;

    public ParkingAttendant getParkingAttendant() {
        parkingAttendant = new ParkingAttendant(getParkingSpaces(), getPaymentCounter());
//        for(ParkingSpace p: parkingSpaces){
//            if(p.getVehicle()==null){
//                continue;
//            }
//            else
//                parkingAttendant.spaces.add(p);
//        }
//        parkingAttendant.spaces = getParkingSpaces();
        return parkingAttendant;
    }

    public PaymentCounter getPaymentCounter() {
        return this.paymentCounter;
    }

    public List<ParkingSpace> getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(List<ParkingSpace> parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }


    @Override
    public String toString() {
        String output = "";
        for (ParkingSpace p : parkingSpaces) {

            output+="("+p.getParkingSpaceType().name().charAt(0)+")";
            if (p.getVehicle()!=null)
                output+= "|__"+ p.getVehicle().getVehicleType()+"__|      ";
            else
                output+= "|______|      ";
        }
        return output;
    }


}
