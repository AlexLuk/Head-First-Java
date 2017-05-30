import java.util.Random;
import java.util.Scanner;

/**
 * Created by Comp on 30.05.2017.
 */
public class Game {1
    public static void main(String[] args) {

        int numOfGuesses=0;
        Random r = new Random();
        int startCell=r.nextInt(4);
        int[] location = {startCell,startCell+1,startCell+2};

        SimpleDotCom dot = new SimpleDotCom();
        dot.setLocations(location);
        boolean isRunning=true;
        String testCell="0";
        String result;
        Scanner in = new Scanner(System.in);
        while(isRunning){
            numOfGuesses++;
            System.out.println("введите ячейку");
            testCell = in.nextLine();
            result=dot.checkYourself(testCell);
            if(result.equals("потопил")){
                isRunning=false;
                System.out.println("Вы победили за "+numOfGuesses+" ходов.");
            }
        }

    }
}
