package Pen;

public class Pen {
    //Свойства и характеристики ручки
    private String color = "blue";
    private int intCounter = 100;
    private double sizeLetter = 1.0;

    //метод написания симвлов
    public String write(String wordToWrite){// принимает параметр
        return wordToWrite;
//return wordToWrite + "123";
    }
    //метод плучения цвета
    public String getColor(){//не принимает параметр
        return color;
    }

}
