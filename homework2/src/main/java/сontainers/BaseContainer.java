package сontainers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import packages.Package;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class BaseContainer<P extends Package>{
    private final Integer sizeW;
    private final Integer sizeH;
    private final Integer sizeD;
    private Integer maxCount;
    private final Material material;
    private Boolean isOneMFR = false; // MFR - (сокр.) производитель
    private List<P> packs;

    public BaseContainer(Integer sizeW, Integer sizeH, Integer sizeD, Integer maxCount, Material material) {
        this.sizeW = sizeW;
        this.sizeH = sizeH;
        this.sizeD = sizeD;
        this.maxCount = maxCount;
        this.material = material;
        packs = new ArrayList<>(maxCount);
    }

    public BaseContainer(Integer sizeW, Integer sizeH, Integer sizeD,Material material) {
        this.sizeW = sizeW;
        this.sizeH = sizeH;
        this.sizeD = sizeD;
        this.material = material;
    }

    public final Boolean makeFromOneOrManyMFR(){
        return isOneMFR = !isOneMFR;
    }
    public final void setMaxCountFromSizes(){

    }

}
