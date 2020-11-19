package tech.itpark.manager;

import tech.itpark.model.Flat;

import java.util.ArrayList;

public class FlatManager {
    private ArrayList<Flat> items = new ArrayList<>();
    private int nextId = 1;

    public void save(Flat item) {
        if (item.getId() == 0) {
            item.setId(nextId);
            nextId++;
            items.add(item);
        } else {
            // TODO: handle update
            //Flat toUpdateFlat = items.get(item.getId() - 1);
            items.set(item.getId() - 1, item);
        }

    }

    public ArrayList<Flat> search(ArrayList<String> stations, String area,
                                  double minCost, double maxCost, int rooms,
                                  int minFloor, int maxFloor) {
        // 1. Району
// 2. Цена min/max <- Авито, Циан, ДомКлик... 3 000 000 -> 3 050 000
// 3. Комнаты (можно галочками) <- 2 (3?)
// 4. Этаж (равенство) <- 3 (4/2)?
        ArrayList<Flat> result = new ArrayList<>();
        ArrayList<Flat> finalResult = new ArrayList<>();

        for (Flat item : items) {
            if (containsAny(item, stations)) {
                result.add(item);
            }
        }

        for (Flat item : result) {
            if (isInArea(item, area) && isFloorBetween(item, minFloor, maxFloor) &&
                    hasNRooms(item, rooms) && costBetween(item, minCost, maxCost)) {
                System.out.println("Flat is really good");
                finalResult.add(item);
            }
        }

        return finalResult;
    }

    private boolean costBetween(Flat item, double minCost, double maxCost) {
        return item.getCost() >= minCost && item.getCost() <= maxCost;
    }

    private boolean hasNRooms(Flat item, int rooms) {
        return item.getAmountOfRooms() == rooms;
    }

    private boolean isFloorBetween(Flat item, int minFloor, int maxFloor) {
        return item.getFloor() >= minFloor && item.getFloor() <= maxFloor;
    }

    private boolean isInArea(Flat item, String area) {
        return item.getArea().contains(area);
    }

    private boolean containsAny(Flat item, ArrayList<String> stations) {
        for (String station : item.getStations()) {
            // ArrayList -> contains(element) - true|false
            if (stations.contains(station)) {
                return true;
            }
        }
        return false;
    }
}
