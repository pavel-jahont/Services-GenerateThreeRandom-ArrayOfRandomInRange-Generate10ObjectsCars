package com.gmail.jahont.pavel.service.model;

public class Car {

    private String name;
    private CarModelEnum carModel;
    private int engineCapacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarModelEnum getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModelEnum carModel) {
        this.carModel = carModel;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return name + " : " + carModel + " : " + engineCapacity;
    }

}
