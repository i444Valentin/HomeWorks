package packs;

import enums.Material;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Класс бутылки Кока-колы
 */
@Getter
@Setter
@ToString(callSuper = true)
public class BottleOfCocaCola extends PackLiquid {
    public BottleOfCocaCola(Integer sizeW, Integer sizeH, Integer sizeD, Material material) {
        super(sizeW, sizeH, sizeD, material);
    }

    public BottleOfCocaCola(Integer sizeW, Integer sizeH, Integer sizeD, String mfr, Material material) {
        super(sizeW, sizeH, sizeD, mfr,material);
    }
}
