package tech.itpark;

import tech.itpark.manager.FlatManager;
import tech.itpark.model.Flat;

import java.sql.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stations = new ArrayList<>();
        stations.add("Пушкинская");
        stations.add("Тверская");
        stations.add("Чеховская");
        Flat flat = new Flat(stations, 4, 3, "Приволжский",50000.01);
        Flat elite = new Flat(stations, 5, 18, "Вахитовский",100000.01);
        Flat apartment = new Flat(stations, 2, 6, "Ново-Савиновский",500000.01);

        FlatManager flatManager = new FlatManager();
        flatManager.save(flat);
        flatManager.save(elite);
        flatManager.save(apartment);
        ArrayList<Flat> searchResultList = flatManager.search(stations, "Приволжский",
                10000d, 100000d,4,1,10);
        System.out.println(searchResultList.get(0));

    }
}
