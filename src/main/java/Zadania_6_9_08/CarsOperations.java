package Zadania_6_9_08;

import java.util.*;

public class CarsOperations {

    List<? extends Car> mainList = Arrays.asList(
            (new Audi(1, Brands.AUDI, 2012, 2.0, AudiModels.A4)),
            (new Audi(2, Brands.AUDI, 2015, 1.6, AudiModels.A3)),
            (new Audi(3, Brands.AUDI, 2017, 1.8, AudiModels.A4)),
            (new Audi(4, Brands.AUDI, 2016, 3.0, AudiModels.A7)),
            (new Audi(5, Brands.AUDI, 2015, 2.5, AudiModels.A6)),
            (new Audi(6, Brands.AUDI, 2012, 4.0, AudiModels.A8)),
            (new Audi(7, Brands.AUDI, 2013, 3.0, AudiModels.Q7)),
            (new Audi(8, Brands.AUDI, 2015, 2.0, AudiModels.Q5)),
            (new Audi(9, Brands.AUDI, 2014, 2.5, AudiModels.A5)),
            (new Audi(10, Brands.AUDI, 2017, 1.8, AudiModels.Q3)),
            (new BMW(11, Brands.BMW, 2015, 2.0, BMWModels.M5)),
            (new BMW(12, Brands.BMW, 2017, 1.6, BMWModels.M3)),
            (new BMW(13, Brands.BMW, 2016, 1.8, BMWModels.X2)),
            (new BMW(14, Brands.BMW, 2013, 3.0, BMWModels.X5)),
            (new BMW(15, Brands.BMW, 2016, 2.5, BMWModels.M7)),
            (new BMW(16, Brands.BMW, 2014, 4.0, BMWModels.M5)),
            (new BMW(17, Brands.BMW, 2013, 2.0, BMWModels.X3)),
            (new BMW(18, Brands.BMW, 2015, 1.8, BMWModels.X1)),
            (new BMW(19, Brands.BMW, 2014, 2.5, BMWModels.M5)),
            (new BMW(20, Brands.BMW, 2015, 3.0, BMWModels.Z4))
    );

    List<Car> list1 = new ArrayList<>();
    List<Car> list2 = new ArrayList<>();

    public void addList1() {
        while (list1.size() < 10) {
            Car random;
            random = mainList.get(new Random().nextInt(mainList.size()));
            if (!list1.contains(random)) {
                list1.add(random);
            }
        }
        for (Car car : list1) {
            System.out.println(car);
        }
        System.out.println();
    }

    public void addList2() {
        while (list2.size() < 10) {
            Car random;
            random = mainList.get(new Random().nextInt(mainList.size()));
            if (!list1.contains(random) & !list2.contains(random)) {
                list2.add(random);
            }
        }
        for (Car car : list2) {
            System.out.println(car);
        }
    }

    Dealer dealer1 = new Dealer("Dealer1", "Long Street 1", list1);
    Dealer dealer2 = new Dealer("Dealer2", "Short Street 1", list2);

    List<Dealer> dealersList = Arrays.asList(dealer1, dealer2);

    Map<Brands, List<? extends Car>> map = new HashMap<>();

    List<Car> sList = new ArrayList<>();
    List<Car> sList2 = new ArrayList<>();

    void put() {
        int hash1 = dealersList.get(0).carsList.get(0).brand.hashCode();

        for (int i = 0; i < dealersList.get(0).carsList.size(); i++) {
            if (dealersList.get(0).carsList.get(i).brand.hashCode() == hash1) {
                sList.add(dealersList.get(0).carsList.get(i));
            } else {
                sList2.add(dealersList.get(0).carsList.get(i));
            }
        }
        for (int i = 0; i < dealersList.get(1).carsList.size(); i++) {
            if (dealersList.get(1).carsList.get(i).brand.hashCode() == hash1) {
                sList.add(dealersList.get(1).carsList.get(i));
            } else {
                sList2.add(dealersList.get(1).carsList.get(i));
            }
        }
        for (int i = 0; i < dealersList.get(0).carsList.size(); i++) {
            if (dealersList.get(0).carsList.get(0).brand.hashCode() != dealersList.get(0).carsList.get(i).brand.hashCode()) {
                map.put(dealersList.get(0).carsList.get(0).brand, sList);
                map.put(dealersList.get(0).carsList.get(i).brand, sList2);
            }
        }

        System.out.println(sList);
        System.out.println(sList2);
        System.out.println();
        System.out.println(map);
    }
}
