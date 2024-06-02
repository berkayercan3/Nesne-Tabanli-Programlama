package Demo;

import java.util.ArrayList;
import java.util.List;

public class FarmVille {
    public static void main(String[] args) {
        // Örnek bir çiftlik oluştur
        Farm farm = new Farm();

        // Domates bitkisini çiftliğe ekle
        TomatoPlant tomato = new TomatoPlant();
        farm.addPlant(tomato);

        // Havuç bitkisini çiftliğe ekle
        CarrotPlant carrot = new CarrotPlant();
        farm.addPlant(carrot);

        // 3 gün boyunca çiftlik simülasyonu yap
        for (int i = 0; i < 3; i++) {
            System.out.println("Day " + (i + 1) + ":");
            farm.simulateDay();
            System.out.println();
        }
    }
}

abstract class Plant implements IPlantActions {
    protected String name;
    protected int growthTime;
    protected boolean isHarvestable;

    public Plant(String name,int growthTime){
        this.name=name;
        this.growthTime=growthTime;
    }

    public boolean isHarvestable() {
        return this.isHarvestable;
    }

    public void grow() {
    }

    public String getName() {
        return name;
    }

    public int getGrowthTime() {
        return growthTime;
    }

    public void setHarvestable(boolean harvestable) {
        isHarvestable = harvestable;
    }
}

interface IPlantActions {
    void water();

    void harvest();
}

class TomatoPlant extends Plant {
    private int waterLevel;
    public TomatoPlant() {
        super("Tomato", 3); // Burada Plant sınıfının constructor'ını çağırarak başlangıç değerlerini belirtiyoruz
        this.waterLevel = 0;
    }
    public void water() {
        waterLevel++;
        System.out.println("Tomato Plant is growing. Growth time: " + (growthTime - 1) + "/3.");
    }

    @Override
    public void grow() {
        if (waterLevel >= 3) {
            growthTime--;
            waterLevel = 0;
            System.out.println("Tomato Plant is ready to harvest.");
            isHarvestable = true;
        }
    }

    public void harvest() {
        if (isHarvestable) {
            System.out.println("Tomato Plant has been harvested. Congratulations!!!");
        } else {
            System.out.println("Tomato Plant is not ready to harvest yet.");
        }
    }
}

class CarrotPlant extends Plant {
    private int waterLevel;

    public CarrotPlant() {
        super("Carrot", 5);
        this.waterLevel = 0;
    }
    public void water() {
        waterLevel++;
        System.out.println("Carrot Plant is growing. Growth time: " + (growthTime - 1) + "/5.");
    }

    @Override
    public void grow() {
        if (waterLevel >= 2) {
            growthTime--;
            waterLevel = 0;
            System.out.println("Carrot Plant is not ready to harvest yet.");
        }
    }

    public void harvest() {
        if (isHarvestable) {
            System.out.println("Carrot Plant has been harvested. Congratulations!!!");
        } else {
            System.out.println("Carrot Plant is not ready to harvest yet.");
        }
    }
}

class Farm {
    private List<Plant> plants;

    public Farm() {
        plants = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
        System.out.println(plant.getName() + " Plant has been added to farm.");
    }

    public void simulateDay() {
        for (Plant plant : plants) {
            plant.water();
            plant.grow();
            plant.harvest();
            System.out.println();
        }
    }
}
