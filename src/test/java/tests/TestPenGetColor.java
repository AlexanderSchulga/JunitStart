package tests;

import Pen.Pen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ValueSource;


public class TestPenGetColor extends BaseTest{
    //Тест для второго метода в Pen
    @Test
    public void testPenWriteGetColorBasicColor(){
        Pen pen = new Pen();//создаем обьект

        //ожидаемый результат
        String expectedResult = "blue";
        //актуальный результат
        String actualResult = pen.getColor();
        //проверка junit овская
        Assertions.assertEquals(expectedResult, actualResult);
    }

    //@Test
    @ParameterizedTest
     @ValueSource(strings = {"Red", "blue", "Yellow"})
    public void testPenWriteGetColorRedColor(String expectedResult) {

        Pen pen = new Pen(expectedResult);//создаем обьект

        //актуальный результат
        String actualResult = pen.getColor();
        //проверка junit овская
        Assertions.assertEquals(expectedResult, actualResult);//Сравнение

        //С этим ошибка
       // Assertions.assertEquals(String.format("Expected %s, actual result %s", expectedResult, actualResult),
            //    expectedResult, actualResult);
    }
    @ParameterizedTest
    @ArgumentsSource(PenGetColorArguments.class)//Другая аннотация
    // и указываем источник PenGetColorArguments.class
    public void testPenWriteGetColorFoo(String color, int inkCounter) {

        Pen pen = new Pen(color, inkCounter);//создаем обьект

        //актуальный результат
        String actualResult = pen.getColor();
        //проверка junit овская
        Assertions.assertEquals(color, actualResult);//Сравнение

        //С этим ошибка
        // Assertions.assertEquals(String.format("Expected %s, actual result %s", expectedResult, actualResult),
        //    expectedResult, actualResult);
    }


}
