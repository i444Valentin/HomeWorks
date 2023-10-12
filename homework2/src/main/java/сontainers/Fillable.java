package сontainers;

import packages.Package;

import java.util.List;

public interface Fillable {
    void addPack(Package pack);
    void wrap();
    void addAllPacks(List<? extends Package> packages);
}
