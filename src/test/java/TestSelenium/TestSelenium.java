package TestSelenium;

//класс запускающий браузер

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestSelenium {

    private WebDriver webDriver;//классовое поле
    //константа для адреса сайта
    private static final String AUTOMAT_PRACT_URL = "https://www.championat.com//";

    //Локатор для клика или поиска
    //private static final String FOOTBAL_BUTTON_LOC = "//div[1]/div/nav/ul/li[1]/a";
    private static final String FOOTBAL_BUTTON_LOC = "/html/body/header/div[1]/div/nav/ul/li[1]";
    private static final String FOOTBAL_BUTTON = "/html/body/header/div[1]/div/nav/ul/li[1]/noindex/div/div/a[1]";
    //Локатор для проверки, точно ли мы на той странице
   // private static final String FOOTBAL_PAGE_SELECTOR = "body > div.page > div.breadcrumbs.js-breadcrumbs > h1";
    @BeforeEach
    public void setUp(){
        //предусловие
        //указываем путь до вебдрайвера
        System.setProperty("webDriver.chrome.driver", "src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver();// создаем обьект что бы можно было юзать
        webDriver.get(AUTOMAT_PRACT_URL);//гет запрос по url

        //Плохой пример ожидания
        //чего то не робит, наверно дуратион нужен
        //webDriver.manage().timeouts().implicitlyWait(time 10, TimeUnit.SECONDS);
        //при пейдж=0,а имплисити 100 милисек тест падает,
        //Для норм работы, перекрываем таймаут, ставя 10 сек в имплисити и
        //в таймаут переводим в секунды 5 к примеру
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testSelenium(){
        //Создаю вебэлемент на основе драйвера,
        // провожу поиск по xPath и сохранение элемента в webElement
        WebElement webElement = webDriver.findElement(By.xpath(FOOTBAL_BUTTON_LOC));
        webElement.click(); //Кликаем на него

        WebElement webElement1 = webDriver.findElement(By.xpath(FOOTBAL_BUTTON));
        webElement1.click(); //Кликаем на него


         //еще один веб элемент для поиска по css селектора
        //WebElement titlePage = webDriver.findElement(By.cssSelector(FOOTBAL_PAGE_SELECTOR));
        //получаем текст который ищем
        //String titleText = titlePage.getText();
        //Проверяем, что titleText содержит в себе текст нужный
        //Assertions.assertTrue(titleText.contains("ФУТБОЛ РОССИИ И МИРА"));
        //можно перевести в нижний регистр
        //Assertions.assertTrue(titleText.toLowerCase().contains("Футбол Росии и Мира"));
        }

    @AfterEach
    public void tearDown(){
        //постусловие
        //webDriver.close(); //Закрывает вкладку, и остается в диспетчере
        webDriver.quit(); //Выходит из браузера и убивает себя как процесс
    }
}
