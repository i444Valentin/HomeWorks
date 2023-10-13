package packs;

import lombok.Getter;
import lombok.Setter;
import сontainers.Material;

import java.util.ArrayList;

@Getter
@Setter
public class PackLiquid extends Pack {
    private final Integer volume;

    public PackLiquid(Integer sizeW, Integer sizeH, Integer sizeD, Material material) {
        super(sizeW, sizeH, sizeD, material);
        volume = sizeW*sizeH*sizeD*1000;
        content = new ArrayList<Integer>(volume);
    }

    public PackLiquid(Integer sizeW, Integer sizeH, Integer sizeD, String mfr, Material material) {
        super(sizeW, sizeH, sizeD, mfr, material);
        volume = sizeW*sizeH*sizeD*1000;
        content = new ArrayList<Integer>(volume);
    }
}
