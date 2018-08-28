package Zadania_6_9_08;

public class Audi extends Car {
    AudiModels model;

    public Audi(int id, Brands brand, int productionYear, double engineSize, AudiModels model) {
        super(id, brand, productionYear, engineSize);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "model=" + model +
                ", id=" + id +
                ", brand=" + brand +
                ", productionYear=" + productionYear +
                ", engineSize=" + engineSize +
                '}';
    }
}
