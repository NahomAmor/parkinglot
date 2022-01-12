package io.javabrains.parkinglot.vehicles;

public class Truck extends Vehicle{
//    private VehicleType vehicleType = VehicleType.TRUCK;
//
//    public Truck(VehicleType vehicleType) {
//        this.vehicleType = vehicleType;
//    }
//
//    @Override
//    public VehicleType getVehicleType() {
//        return vehicleType;
//    }

    public Truck(VehicleType vehicleType, Boolean handicapped) {
        setHandicapped(handicapped);
        setVehicleType(vehicleType);

    }

    @Override
    public void setVehicleType(VehicleType vehicleType) {
        super.setVehicleType(vehicleType);
    }

    @Override
    public void setParkingTimeMinutes(int parkingTimeMinutes) {
        super.setParkingTimeMinutes(parkingTimeMinutes);
    }

    @Override
    public void setHandicapped(boolean handicapped) {
        super.setHandicapped(handicapped);
    }
}
