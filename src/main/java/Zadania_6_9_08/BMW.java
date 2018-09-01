package Zadania_6_9_08;

public class BMW extends Car {

    //TODO pole powinno być prywatne
    BMWModels model;

    public BMW(int id, Brands brand, int productionYear, double engineSize, BMWModels model) {
        super(id, brand, productionYear, engineSize);
        this.model = model;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "model=" + model +
                ", id=" + id +
                ", brand=" + brand +
                ", productionYear=" + productionYear +
                ", engineSize=" + engineSize +
                '}';
    }
}
