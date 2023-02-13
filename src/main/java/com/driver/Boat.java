package com.driver;

public class Boat implements WaterVehicle{
    String name;
    String type;
    int capacity;
    Boat(String  name,String type,int capacity){
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }
    @Override
    public String getVehicleName() {

        return this.name;
    }

    @Override
    public int getVehicleCapacity() {

        return this.capacity;
    }
}
