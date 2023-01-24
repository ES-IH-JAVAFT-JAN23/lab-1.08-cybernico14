package com.ironhack.lab_108.classes;

import com.ironhack.lab_108.classes.Car;

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle(int vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String toString() {
        return "UtilityVehicle{" +
                "fourWheelDrive=" + fourWheelDrive +
                '}';
    }
}
