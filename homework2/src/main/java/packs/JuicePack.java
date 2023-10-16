package packs;

import lombok.*;
import enums.Material;

@Getter
@Setter
public class JuicePack extends PackLiquid {
    private String fruit;

    public JuicePack(Integer sizeW, Integer sizeH, Integer sizeD, Material material) {
        super(sizeW, sizeH, sizeD, material);
    }

}
