package packs;

import сontainers.Material;

public class BottleOfCocaCola extends PackLiquid {
    public BottleOfCocaCola(Integer sizeW, Integer sizeH, Integer sizeD, Material material) {
        super(sizeW, sizeH, sizeD, material);
    }

    public BottleOfCocaCola(Integer sizeW, Integer sizeH, Integer sizeD, String mfr, Material material) {
        super(sizeW, sizeH, sizeD, mfr,material);
    }
}
