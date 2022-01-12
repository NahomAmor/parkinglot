package io.javabrains.parkinglot.vehicles;

public class VehicleFactory {

    public static Vehicle createVehicle(VehicleType vehicleType, boolean isHandicapped) {
        switch (vehicleType){
            case SUV:
                return new Suv(vehicleType, isHandicapped);
            case BIKE:
                return new Bike(vehicleType, isHandicapped);
            case LARGE:
                return new Large(vehicleType, isHandicapped);
            case TRUCK:
                return new Truck(vehicleType, isHandicapped);
            case COMPACT:
                return new Compact(vehicleType, isHandicapped);
            default:
                break;
        }
        return null;
    }
}
