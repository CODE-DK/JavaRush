package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Dmitriy on 25.06.2017.
 */
public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes pic){
        try{
            switch (pic) {
                case BMP:
                    return new BmpReader();
                case JPG:
                    return new JpgReader();
                case PNG:
                    return new PngReader();
                default:
                    return null;
            }
        }catch (Exception e){
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
