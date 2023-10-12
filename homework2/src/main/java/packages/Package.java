package packages;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import сontainers.Material;

import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
public abstract class Package {
    private final Integer sizeW;
    private final Integer sizeH;
    private final Integer sizeD;
    private String mfr;
    private final Material material;
    private List<String> content;


}
