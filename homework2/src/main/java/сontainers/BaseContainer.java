package сontainers;

import enums.Material;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import utils.Size;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class BaseContainer<P> implements Fillable<P> {
    private final Integer sizeW;
    private final Integer sizeH;
    private final Integer sizeD;
    private Integer maxCount;
    private final Material material;
    private Boolean isOneMFR = false; // MFR - (сокр.) производитель
    protected Boolean isWrapped = false;
    protected List<P> packs;

    public BaseContainer(Integer sizeW, Integer sizeH, Integer sizeD, Integer maxCount, Material material) {
        this.sizeW = sizeW;
        this.sizeH = sizeH;
        this.sizeD = sizeD;
        this.maxCount = maxCount;
        this.material = material;
        packs = new ArrayList<>(maxCount);
    }

    public BaseContainer(@NonNull Size size, Integer maxCount, Material material) {
        this.sizeW = size.getSizeW();
        this.sizeH = size.getSizeH();
        this.sizeD = size.getSizeD();
        this.maxCount = maxCount;
        this.material = material;
        packs = new ArrayList<>(maxCount);
    }

    public BaseContainer(Size size, Material material, Size packSize) {
        this.sizeW = size.getSizeW();
        this.sizeH = size.getSizeH();
        this.sizeD = size.getSizeD();
        this.material = material;
        maxCount = maxCountFromPackSize();
    }

    private Integer maxCountFromPackSize() {

        return 10;
    }

    public final Boolean makeFromOneOrManyMFR() {
        return isOneMFR = !isOneMFR;
    }

}
