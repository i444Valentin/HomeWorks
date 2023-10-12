package packages;

import lombok.*;
import сontainers.Material;

@Getter
@Setter
public class JuicePackage extends Package {
    private final Integer volume;
    private String fruit;

    public JuicePackage(Integer sizeW, Integer sizeH, Integer sizeD, Material material) {
        super(sizeW, sizeH, sizeD, material);
        volume = sizeD * sizeH * sizeW * 1000;
    }

}
