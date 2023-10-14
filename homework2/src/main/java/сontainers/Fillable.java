package сontainers;

import java.util.List;

public interface Fillable<P> {
    void addPack(P pack);
    void wrap();
    void addAllPacks(List<P> packages);
    void addAllPackWithTruncate(List<P> packages);
}
