package io.javabrains.parkinglot.lot;

import io.javabrains.parkinglot.vehicles.Vehicle;
import io.javabrains.parkinglot.vehicles.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingAttendant {

    public List<ParkingSpace> spaces;
    public PaymentCounter paymentCounter;
    public ParkingAttendant(List<ParkingSpace> sp, PaymentCounter paymentCounter){
        this.spaces = sp;
        this.paymentCounter = paymentCounter;
    }

    public boolean park(Vehicle vehicle) {
        for(ParkingSpace space: spaces){
            if((space.isHandicapped() && !vehicle.isHandicapped()) || space.getVehicle()!=null){
                continue;
            }
            else if(space.getParkingSpaceType().equals(ParkingSpaceType.TRUCK)){
                space.park(vehicle);
                paymentCounter.pay(paymentCounter.calculateCost(vehicle.getParkingTimeMinutes()));
                return true;
            }
            else if (space.getParkingSpaceType().equals(ParkingSpaceType.LARGE) && !(vehicle.getVehicleType().equals(VehicleType.TRUCK) || vehicle.getVehicleType().equals(VehicleType.SUV))){
                space.park(vehicle);
                paymentCounter.pay(paymentCounter.calculateCost(vehicle.getParkingTimeMinutes()));
                return true;
            }
            else if (space.getParkingSpaceType().equals(ParkingSpaceType.COMPACT) && (vehicle.getVehicleType().equals(VehicleType.COMPACT) || vehicle.getVehicleType().equals(VehicleType.BIKE))){
                space.park(vehicle);
                paymentCounter.pay(paymentCounter.calculateCost(vehicle.getParkingTimeMinutes()));
                return true;
            }
            else if (space.getParkingSpaceType().equals(ParkingSpaceType.BIKE)&& vehicle.getVehicleType().equals(VehicleType.BIKE)){
                space.park(vehicle);
                paymentCounter.pay(paymentCounter.calculateCost(vehicle.getParkingTimeMinutes()));
                return true;
            }
        }

        return false;
    }
}
