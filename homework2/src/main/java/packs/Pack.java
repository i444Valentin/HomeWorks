package packs;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import enums.Material;
import lombok.ToString;
import utils.Size;

import java.util.List;

/**
 * Представляет собой общий класс для представления упаковок
 * Каждая упаковка имеет определенные размеры, конретного производителя и
 * материал, из которого она сделана
 * Длины сторон указываются в сантиметрах (см)
 */
@RequiredArgsConstructor
@Getter
@Setter
@ToString(exclude = "content")
public abstract class Pack {
    private final Integer sizeW;
    private final Integer sizeH;
    private final Integer sizeD;
    private String mfr;
    private final Material material;
    protected List<?> content;

    public Pack(Integer sizeW, Integer sizeH, Integer sizeD, String mfr, Material material) {
        this.sizeW = sizeW;
        this.sizeH = sizeH;
        this.sizeD = sizeD;
        this.mfr = mfr;
        this.material = material;
    }

    public Pack(Size size, String mfr, Material material) {
        this.sizeW = size.getSizeW();
        this.sizeH = size.getSizeH();
        this.sizeD = size.getSizeD();
        this.mfr = mfr;
        this.material = material;
    }
}

