package TestSelenium;

//класс запускающий браузер

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

    private WebDriver webDriver;//классовое поле
    //константа для адреса сайта
    private static final String AUTOMAT_PRACT_URL = "https://www.championat.com//";

    //Локатор для клика или поиска
    private static final String FOOTBAL_BUTTON_LOC = "//div[1]/div/nav/ul/li[1]/a";
            //"//nav[@id='header-nav js-header-nav']//a[@title='football']";

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
        //Создаю вебэлемент на основе драйвера,
        // провожу поиск по xPath и сохранение элемента в webElement
        WebElement webElement = webDriver.findElement(By.xpath(FOOTBAL_BUTTON_LOC));
        webElement.click(); //Кликаем на него
        // webElement.click();
        }

    @AfterEach
    public void tearDown(){
        //постусловие
        //webDriver.close(); //Закрывает вкладку, и остается в диспетчере
        webDriver.quit(); //Выходит из браузера и убивает себя как процесс
    }
}
