package Zadania_6_9_08;

import java.util.List;

public class Dealer {
    String dealerName;
    String Address;
    List<? extends Car> carsList;

    public Dealer(String dealerName, String address, List<? extends Car> carsList) {
        this.dealerName = dealerName;
        Address = address;
        this.carsList = carsList;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "dealerName='" + dealerName + '\'' +
                ", Address='" + Address + '\'' +
                ", carsList=" + carsList +
                '}';
    }
}
