package tests;

import Pen.Pen;
import org.junit.Assert;

//клас тестирования метода write у ручки
public class TestPenWrite {
    public void testPenWrite_wordSizeLessThanInkCounter(){
        //Метод тестирования где размер слова
        // меньше чем incCounter
        Pen pen = new Pen();//создаем обьект

        //ожидаемый результат
        String expectedResult = "Hello, world";
        //актуальный результат
       String actualResult = pen.write("Hello, world");//вызываем метод write
        //проверка junit овская
        Assert.assertEquals(expectedResult, actualResult);
    }

}
