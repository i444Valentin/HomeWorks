package packs;

import lombok.Getter;
import lombok.Setter;
import enums.Material;

import java.util.ArrayList;

/**
 * Представляет класс упаковки с жидкостью
 * Помимо базовых атрибутов, у класса есть атрибут объем
 * Длины сторон указываются в сантиметрах (см)
 * Объем высчитывается перемножением трех сторон и указывается в миллилитрах
 *
 */
@Getter
@Setter
public class PackLiquid extends Pack {
    private final Integer volume;

    public PackLiquid(Integer sizeW, Integer sizeH, Integer sizeD, Material material) {
        super(sizeW, sizeH, sizeD, material);
        volume = sizeW*sizeH*sizeD;
        content = new ArrayList<Integer>(volume);
    }

    public PackLiquid(Integer sizeW, Integer sizeH, Integer sizeD, String mfr, Material material) {
        super(sizeW, sizeH, sizeD, mfr, material);
        volume = sizeW*sizeH*sizeD;
        content = new ArrayList<Integer>(volume);
    }
}
