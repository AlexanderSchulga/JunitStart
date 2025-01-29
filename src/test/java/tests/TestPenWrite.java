package tests;

import Pen.Pen;
import org.junit.Assert;
import org.junit.Test;

//клас тестирования метода write у ручки
public class TestPenWrite extends BaseTest{
    @Test
    public void testPenWrite_wordSizeLessThanInkCounter(){
        //Метод тестирования где размер слова
        // меньше чем incCounter
        Pen pen = new Pen();//создаем обьект

        //ожидаемый результат
        String expectedResult = "Hello, world";
        //актуальный результат
       String actualResult = pen.write("Hello, world");//вызываем метод write
        //проверка junit овская
        //Стринг формат для того, что бы вывести что ожидалось вместо пустой строки
        //Assert.assertEquals(String.format("Expected %s, actual result %s", expectedResult, actualResult),
                //expectedResult, actualResult);
        Assert.assertEquals(expectedResult, actualResult);
    }

}
