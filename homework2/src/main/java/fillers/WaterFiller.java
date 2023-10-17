package fillers;

import packs.BottleOfWater;
import packs.Pack;

/**
 * Класс заполнителя упаковок водой
 */
public class WaterFiller extends LiquidFiller{

    public WaterFiller(BottleOfWater bottle) {
        prepareContent(bottle);
    }

    public WaterFiller() {
    }

    @Override
    public void prepareContent(Pack pack) {
        prepareContent((BottleOfWater) pack);
    }

    private void prepareContent(BottleOfWater bottleOfWater) {
        super.prepareContent(bottleOfWater,-2,2);
    }

    @Override
    public void fill() {
        super.fill();
    }

    @Override
    public void fill(Integer percent) {
        super.fill(percent);
    }
}
