package packs;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import enums.Material;

import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
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
}

