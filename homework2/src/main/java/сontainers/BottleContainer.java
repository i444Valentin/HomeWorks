package сontainers;

import lombok.NonNull;
import utils.Size;

import java.util.List;

public class BottleContainer<P> extends BaseContainer<P> {

    public BottleContainer(Integer sizeW, Integer sizeH, Integer sizeD, Integer maxCount, Material material) {
        super(sizeW, sizeH, sizeD, maxCount, material);
    }

    public BottleContainer(@NonNull Size size, Integer maxCount, Material material) {
        super(size, maxCount, material);
    }

    public BottleContainer(Size size, Material material,Size packSize) {
        super(size, material,packSize);
    }

    @Override
    public void addPack(P pack) {
        if (packs.size() > getMaxCount())
            throw new RuntimeException("Контейнер больше не может вместить упаковки");
        else if (isWrapped)
            throw new RuntimeException("Контейнер запечатан");
        packs.add(pack);
    }

    @Override
    public void wrap() {
        if (packs.size() == getMaxCount()){
            isWrapped = true;
        }
    }

    @Override
    public void addAllPacks(List<P> packages) {
        if (packages.size() > getMaxCount())
            throw new RuntimeException("Количество упаковок превышает количество, которое может вместить контейнер");
        else if (isWrapped)
            throw new RuntimeException("Контейнер запечатан");
        else packs.addAll((packages));
    }

    @Override
    public void addAllPackWithTruncate(List<P> packages) {
        if (isWrapped)
            throw new RuntimeException("Контейнер запечатан");
        int startTruncate = getMaxCount();
        while (packages.size() > startTruncate){
            packages.remove(startTruncate);
        }
        packs.addAll((packages));
    }
}
