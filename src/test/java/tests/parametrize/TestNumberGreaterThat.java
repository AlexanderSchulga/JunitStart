package tests.parametrize;

import Pen.Pen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ValueSource;
import tests.BaseTest;
import tests.PenGetColorArguments;


public class TestNumberGreaterThat extends BaseTest {
    //Тест для второго метода в Pen
    @ParameterizedTest
    @ArgumentsSource(TestNumberGreaterThanArguments.class)//Другая аннотация
    // и указываем источник PenGetColorArguments.class
    public void testPenWriteGetColorFoo(int numberToCheck, int numberToCompare, String expectedResult) {

        Pen pen = new Pen();//создаем обьект
        String result = pen.isNumberGreaterThan(numberToCheck, numberToCompare);
        //проверка junit овская
        Assertions.assertEquals(expectedResult, result);//Сравнение

    }


}
