package Zadania_6_9_08;

public class Saab extends Car {

    private SaabModels model;

    public Saab(int id, Brands brand, int productionYear, double engineSize, SaabModels model) {
        super(id, brand, productionYear, engineSize);
        this.model = model;
    }
}
