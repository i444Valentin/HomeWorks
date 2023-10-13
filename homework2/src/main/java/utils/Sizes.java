package utils;

import packs.Pack;

public final class Sizes {

    public static Size fromItemCount(Pack pack, Integer count){
        Integer sizeH = pack.getSizeH();
        Integer sizeW = pack.getSizeW();
        Integer sizeD = pack.getSizeD();
        Integer totalSizeH = sizeH * count;

        return new Size(totalSizeH,sizeW,sizeD);
    }
}
