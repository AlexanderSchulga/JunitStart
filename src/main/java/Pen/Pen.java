package Pen;

public class Pen {
    //Свойства и характеристики ручки
    private String color = "blue";
    private int intCounter = 100;
    private double sizeLetter = 1.0;

    public Pen(){
        
    }
    //Конструктор для переопределения цвета
    public Pen(String color) {
        this.color = color;
    }

    //конструктор с двумя парам, для теста @ParametriezeTest
    //Что бы работать с несколькими типами
    public Pen(String color, int inkCounter) {
        this(color);//тут вызываем конструктор цвета, что бы не дублировать код
        //когда там много параметров
        this.intCounter = inkCounter;
    }
    //метод написания симвлов
   // public String write(String wordToWrite){// принимает параметр
     //   return wordToWrite;
//return wordToWrite + "123";
    //}
    //Метод с условием, что бы исключить какой то параметр
    public String write(String wordToWrite){// принимает параметр
        if (wordToWrite.equals("Putin")) {
            throw new RuntimeException("illegal.....wordToWrite");
        }

        return wordToWrite;

    }

    //Покрытие данными метода, на примере сравнения чисел
    public String isNumberGreaterThan(int numberToCheck, int numberToCompare) {
        if (numberToCheck > numberToCompare) {
            return "true";
        } else {
            return "false";
        }

    }

    //метод плучения цвета
    public String getColor(){//не принимает параметр
        return color;
    }

}
