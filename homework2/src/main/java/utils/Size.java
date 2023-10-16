package utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Представляет класс для хранения размеров
 * SizeW - ширина
 * SizeH - высота
 * SizeD - глубина
 */
@AllArgsConstructor
@Getter
@Setter
public final class Size {
    private Integer sizeW;
    private Integer sizeH;
    private Integer sizeD;
}
