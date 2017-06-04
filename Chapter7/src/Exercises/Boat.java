package Exercises;

/**
 * Created by Alexandr on 04.06.2017.
 */
public class Boat {
    private int lenght;
    public void setLenght(int len){
        lenght = len;
    }
    public int getLenght(){
        return lenght;
    }
    public void move(){
        System.out.println("Дрейф");
    }
}

