package fillers;

import packs.BottleOfWater;
import packs.Pack;

public class WaterFiller extends LiquidFiller{

    @Override
    public void prepareContent(Pack pack) {
        prepareContent((BottleOfWater) pack);
    }

    public void prepareContent(BottleOfWater bottleOfWater) {
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
