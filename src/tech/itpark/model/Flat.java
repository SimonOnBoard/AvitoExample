package tech.itpark.model;

import java.util.ArrayList;

public class Flat {


    private int id;
    private ArrayList<String> stations = new ArrayList<>();
    private int amountOfRooms;
    private int floor;
    private String area;
    private double cost;

    @Override
    public String toString() {
        return "Flat{" +
                "id=" + id +
                ", stations=" + stations +
                ", amountOfRooms=" + amountOfRooms +
                ", floor=" + floor +
                ", area='" + area + '\'' +
                ", cost=" + cost +
                '}';
    }

    public Flat(ArrayList<String> stations, int amountOfRooms, int floor, String area, double cost) {
        this.stations = stations;
        this.amountOfRooms = amountOfRooms;
        this.floor = floor;
        this.area = area;
        this.cost = cost;
    }

    public Flat() {
    }

    public int getAmountOfRooms() {
        return amountOfRooms;
    }

    public void setAmountOfRooms(int amountOfRooms) {
        this.amountOfRooms = amountOfRooms;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getStations() {
        return stations;
    }

    public void setStations(ArrayList<String> stations) {
        this.stations = stations;
    }
}
