package fillers;

import packs.Pack;

import java.util.List;


public abstract class Filler {
    protected List<Object> content = null;

    public abstract void prepareContent(Pack pack);

    public abstract void fill();
    public abstract void fill(Integer percent);
}
