import fillers.CocaColaFiller;
import fillers.Filler;
import fillers.LiquidFiller;
import fillers.WaterFiller;
import packs.BottleOfCocaCola;
import packs.BottleOfWater;
import packs.Pack;
import utils.Size;
import сontainers.BaseContainer;
import сontainers.BottleContainer;
import сontainers.Fillable;
import сontainers.Material;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BottleOfCocaCola pack = new BottleOfCocaCola(2,5,2, "CocaCola",Material.GLASS);
        Filler filler = new CocaColaFiller();
        filler.prepareContent(pack);
        filler.fill();
        Filler filler1 = new WaterFiller();
        Filler fillL = new LiquidFiller();
        fillL.prepareContent(pack,2,12);
        fillL.fill(75);
        BaseContainer<BottleOfCocaCola> container = new BottleContainer<>(new Size(10,10,10),12,Material.METAL);
        container.addPack(pack);
        container.addAllPacks(new ArrayList<>(Arrays.asList(pack,pack,pack,pack,pack,pack,pack,pack,pack,pack,pack)));
        System.out.println(container.getPacks().get(0).getVolume());
        System.out.println(pack.getContent());

    }
}
