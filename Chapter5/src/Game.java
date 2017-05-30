import java.util.Random;
import java.util.Scanner;

/**
 * Created by Comp on 30.05.2017.
 */
public class Game {
    public static void main(String[] args) {

        int numOfGuesses=0;
        int startCell = (int)(Math.random()*5);
        int[] location = {startCell,startCell+1,startCell+2};
        GameHelper helper = new GameHelper();
        SimpleDotCom dot = new SimpleDotCom();
        dot.setLocations(location);
        boolean isRunning=true;
        String testCell="0";
        String result;
        String guess;
        while(isRunning){
            numOfGuesses++;
            testCell = helper.getUserInput("введите номер ячейки");
            result=dot.checkYourself(testCell);
            if(result.equals("потопил")){
                isRunning=false;
                System.out.println("Вы победили за "+numOfGuesses+" ходов.");
            }
        }

    }
}
