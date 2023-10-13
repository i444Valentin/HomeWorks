package fillers;

import packs.BottleOfCocaCola;
import packs.Pack;

public class CocaColaFiller extends LiquidFiller{
    @Override
    public void prepareContent(Pack pack) {
        prepareContent((BottleOfCocaCola) pack);
    }

    private void prepareContent(BottleOfCocaCola bottleOfCocaCola) {
        super.prepareContent(bottleOfCocaCola, -24, 24);
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
