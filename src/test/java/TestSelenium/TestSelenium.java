package TestSelenium;

//класс запускающий браузер

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

    private WebDriver webDriver;//классовое поле
    //константа для адреса сайта
    private static final String AUTOMAT_PRACT_URL = "https://www.dns-shop.ru/catalog/";
    @BeforeEach
    public void setUp(){
        //предусловие
        //указываем путь до вебдрайвера
        System.setProperty("wedriver.chrome.driver", "src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver();// создаем обьект что бы можно было юзать
        webDriver.get(AUTOMAT_PRACT_URL);//гет запрос по url
    }

    @Test
    public void testSelenium(){

    }

    @AfterEach
    public void tearDown(){
        //постусловие

    }
}
