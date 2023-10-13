package fillers;

import packs.Pack;
import packs.PackLiquid;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LiquidFiller extends Filler {
    PackLiquid packageLiquid;

    @Override
    public void prepareContent(Pack pack) {
        throw new RuntimeException("Не поддерживается наполнение для этого типа упаковки");
    }

    public void prepareContent(PackLiquid packLiquid, int minV, int maxV) {
        int volume = packLiquid.getVolume();
        Random random = new Random();
        content = new ArrayList<>(packLiquid.getVolume());
        for (int i =0; i < volume; i++){
            content.add(random.nextInt(minV,maxV));
        }
        this.packageLiquid = packLiquid;
    }


    @Override
    public void fill() {
        if(packageLiquid == null){
            throw new RuntimeException("Наполнитель не был готов");
        }
        packageLiquid.setContent(content);
    }

    @Override
    public void fill(Integer percent) {
        if(packageLiquid == null){
            throw new RuntimeException("Наполнитель не был готов");
        }else if (percent > 100){
            throw new RuntimeException("Invalid value of percent");
        }
        int countElements = (content.size() / 100) * percent;
        List<Object> temp= new ArrayList<>();
        for (int i = 0; i< countElements; i++){
            temp.add(content.get(i));
        }
        packageLiquid.setContent(temp);
    }

}
