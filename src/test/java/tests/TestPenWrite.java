package tests;

import Pen.Pen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertEquals(expectedResult, actualResult);

    }
    //Негативный сценарий
    @Test
    public void testPenWriteWordNegative(){
        Pen pen = new Pen();//создаем обьект
        //ожидаемый результат
        String expectedResult = "Putin";
        //актуальный результат
        try {
            String actualResult = pen.write(expectedResult);//вызываем метод write
            Assertions.assertTrue(false);//тут обчзательно что то из этого, тру или фолсы в методе или параметре
        } catch (RuntimeException ex) { //Тут перхватываем RuntimeException
            Assertions.assertTrue(true);//Проверяем, что пришел
            //корректный ексепшен
        }
//Это нужно, что бы тест свалился, если метод write с Путиным прошел
    }

}
