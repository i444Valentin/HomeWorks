package packs;

import lombok.*;
import enums.Material;
import utils.Size;


/**
 * Класс упаковки сока
 */
@Getter
@Setter
public class JuicePack extends PackLiquid {
    private String fruit;

    public JuicePack(Integer sizeW, Integer sizeH, Integer sizeD, Material material,String fruit) {
        super(sizeW, sizeH, sizeD, material);
        this.fruit = fruit;
    }

    public JuicePack(Size size, String mfr, Material material, String fruit) {
        super(size, mfr, material);
        this.fruit = fruit;
    }
}
