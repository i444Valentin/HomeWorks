package fillers;

import packs.Pack;

import java.util.List;

/**
 * Данный абстрактный класс представляет собою семейство
 * классов-заполнителей упаковок. Заполнители делятся на заполнители жидкостей и
 * заполнители нежидких товаров (скоро это реализую, пока реализованы простые заполнители.)
 * Каждый заполнитель проделывает следующие шаги:<br>
 * <b>1 - подготовка содержимого</b><br>
 * <b>2 - заполнение содержимым</b>
 */
public abstract class Filler {
    protected List<Object> content = null;

    public abstract void prepareContent(Pack pack);

    public abstract void fill();

    /**
     * Реализует частичное заполнение упаковки (емкости)
     * Каждый дочерний класс должен сам реализовать метод заполнения упаковки
     * @param percent
     */
    public abstract void fill(Integer percent);
}
