import fillers.CocaColaFiller;
import fillers.Filler;
import fillers.LiquidFiller;
import fillers.WaterFiller;
import packs.BottleOfCocaCola;
import packs.BottleOfWater;
import utils.Size;
import сontainers.BaseContainer;
import сontainers.BottleContainer;
import enums.Material;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BottleOfCocaCola pack = new BottleOfCocaCola(2,5,2, "CocaCola",Material.GLASS);
        BottleOfWater bottleOfWater = new BottleOfWater(4,5,3,"Aqua",Material.PLASTIC);
        Filler filler = new CocaColaFiller();
        filler.prepareContent(pack);
        filler.fill();
        Filler filler1 = new WaterFiller();
        filler1.prepareContent(bottleOfWater);
        filler1.fill();
        LiquidFiller fillL = new LiquidFiller();
        fillL.prepareContent(pack,2,5);
        fillL.fill(100);
        BaseContainer<BottleOfCocaCola> container = new BottleContainer<>(new Size(10,10,10),12,Material.METAL);
        container.addPack(pack);
        container.addAllPacks(Arrays.asList(pack,pack,pack,pack,pack,pack,pack,pack,pack,pack,pack));
        System.out.println(bottleOfWater.getVolume());
        System.out.println(bottleOfWater.getContent());
        container.wrap();
    }
}
