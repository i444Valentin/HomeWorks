package сontainers;

import packages.Package;

public class BottleContainer<P extends Package> extends BaseContainer<P> {

    public BottleContainer(Integer sizeW, Integer sizeH, Integer sizeD, Integer maxCount, Material material) {
        super(sizeW, sizeH, sizeD, maxCount, material);
    }

    public BottleContainer(Integer sizeW, Integer sizeH, Integer sizeD, Material material) {
        super(sizeW, sizeH, sizeD, material);
    }
}
