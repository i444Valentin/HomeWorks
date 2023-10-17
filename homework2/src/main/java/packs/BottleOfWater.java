package packs;

import enums.Material;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Класс бутылки воды
 */
@Getter
@Setter
@ToString(callSuper = true)
public class BottleOfWater extends PackLiquid {
    public BottleOfWater(Integer sizeW, Integer sizeH, Integer sizeD, Material material) {
        super(sizeW, sizeH, sizeD, material);
    }

    public BottleOfWater(Integer sizeW, Integer sizeH, Integer sizeD, String mfr, Material material) {
        super(sizeW, sizeH, sizeD, mfr, material);
    }
}
