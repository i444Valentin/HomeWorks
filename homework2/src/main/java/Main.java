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

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //создаем две упаковки
        BottleOfCocaCola pack = new BottleOfCocaCola(2,5,2, "CocaCola",Material.GLASS);
        BottleOfWater bottleOfWater = new BottleOfWater(5,5,8,"Aqua",Material.PLASTIC);
        //создаем заполнитель кока-колой
        Filler filler = new CocaColaFiller();
        filler.prepareContent(pack);
        filler.fill();
        //заполнитель водой
        Filler filler1 = new WaterFiller();
        filler1.prepareContent(bottleOfWater);
        filler1.fill();
        //Заполнитель жидкостью
        LiquidFiller fillL = new LiquidFiller();
        fillL.prepareContent(pack,2,5);
        fillL.fill(100);
        //Создаем контейнер бутылок с кока-колой

        BaseContainer<BottleOfCocaCola> container = new BottleContainer<>(new Size(10,10,10),10,Material.METAL);

        container.addPack(pack);
        container.addAllPackWithTruncate(new ArrayList<>(Arrays.asList(pack,pack,pack,pack,pack,pack,pack,pack,pack,pack,pack)));

        System.out.println(bottleOfWater.getVolume());
        System.out.println(bottleOfWater.getContent());
        System.out.println(container);
        container.wrap();
    }
}
