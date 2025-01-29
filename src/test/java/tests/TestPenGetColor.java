package tests;

import Pen.Pen;
import org.junit.Assert;
import org.junit.Test;


public class TestPenGetColor extends BaseTest{
    //Тест для второго метода в Pen
    @Test
    public void testPenWriteGetColorBasicColor(){
        Pen pen = new Pen();//создаем обьект

        //ожидаемый результат
        String expectedResult = "Red";
        //актуальный результат
        String actualResult = pen.getColor();
        //проверка junit овская
        Assert.assertEquals(expectedResult, actualResult);
    }

}
