package utils;

import packs.Pack;

/**
 * Утилитный класс, используемый
 * для расчета размеров для возможного создания упаковок и контейнеров
 */
public final class Sizes {

    //Запрещает создание объектов этого класса
    private Sizes(){

    }

    /**
     * Возвращает размер, вычисленный из количества
     * упаковок и их размера
     * @param pack - упаковка
     * @param count - количество упаковок
     * @return - новый размер
     */
    public static Size fromItemCount(Pack pack, Integer count){
        Integer sizeH = pack.getSizeH();
        Integer sizeW = pack.getSizeW();
        Integer sizeD = pack.getSizeD();
        Integer totalSizeH = sizeH * count;

        return new Size(totalSizeH,sizeW,sizeD);
    }

    /**
     * Вычисляет размеры, исходя из объема и высоты
     * Подходит для вычисления размеров для емкостей для жидкостей (упаковок,
     * бутылок и т.д.)
     * Метод не учитывает особые формы упаковки (как в случае с бутылками),
     * поэтому размеры могут быть неточными.
     * @param volume - объем
     * @param height - высота
     * @return - вычисленные размеры
     */
    public static Size fromVolume(int volume,int height){
        int square = volume / height;
        int side = (int) Math.sqrt(square);

        return new Size(side,height,side);
    }
}
