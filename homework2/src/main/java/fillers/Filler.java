package fillers;

import packs.Pack;
import packs.PackLiquid;

import java.util.List;


public abstract class Filler {
    protected List<Object> content = null;

    public abstract void prepareContent(Pack pack);
    public abstract void prepareContent(PackLiquid packageLiquid, int minV, int maxV);

    public abstract void fill();
    public abstract void fill(Integer percent);
}
