package fillers;

import packs.JuicePack;
import packs.Pack;
import packs.PackLiquid;

public class JuiceFiller extends LiquidFiller{
    public JuiceFiller(PackLiquid packLiquid) {
        this.packLiquid = packLiquid;
    }

    @Override
    public void prepareContent(Pack pack) {
        prepareContent((JuicePack) pack);
    }

    private void prepareContent(JuicePack juicePack) {
        super.prepareContent(juicePack, -18, 18);
    }

    @Override
    public void fill() {
        super.fill();
    }

    @Override
    public void fill(Integer percent) {
        super.fill(percent);
    }
}
