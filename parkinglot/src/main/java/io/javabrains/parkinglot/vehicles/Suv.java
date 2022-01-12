package io.javabrains.parkinglot.vehicles;

public class Suv extends Vehicle{
    private VehicleType vehicleType = VehicleType.SUV;

    public Suv(VehicleType vehicleType, Boolean handicapped) {
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
