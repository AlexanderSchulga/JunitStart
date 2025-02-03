package tests;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

        @BeforeEach//предусловие
    public void setUo(){
        System.out.println("Старт");
        }

        @AfterEach//посусловие
    public void tearDown(){
            System.out.println("Стоп");
        }
}
