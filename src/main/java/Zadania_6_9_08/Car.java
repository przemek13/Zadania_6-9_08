package Zadania_6_9_08;

public abstract class Car {

    int id;
    Brands brand;
    int productionYear;
    double engineSize;

    public Car(int id, Brands brand, int productionYear, double engineSize) {
        this.id = id;
        this.brand = brand;
        this.productionYear = productionYear;
        this.engineSize = engineSize;
    }

}
