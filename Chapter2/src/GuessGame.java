import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Comp on 15.02.2017.
 */
public class GuessGame {
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();

    public void startGame(){
        int guessP1=0;
        int guessP2=0;
        int guessP3=0;

        boolean p1isRight=false;
        boolean p2isRight=false;
        boolean p3isRight=false;

        int tragetNumber=(int)(Math.random()*10);
        System.out.println("Number from 0 to 9 is proposed");
        while(true){
            System.out.println("Proposed num is "+ tragetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            guessP1=p1.number;
            guessP2=p2.number;
            guessP3=p3.number;
            System.out.println("Player 1 thinks it is "+guessP1);
            System.out.println("Player 2 thinks it is "+guessP2);
            System.out.println("Player 3 thinks it is "+guessP3);

            if(p1.number==tragetNumber){
                p1isRight=true;
                System.out.println("Plauer 1 guessed");
            }
            if(p2.number==tragetNumber){
                p2isRight=true;
                System.out.println("Plauer 2 guessed");
            }
            if(p3.number==tragetNumber){
                p3isRight=true;
                System.out.println("Plauer 3 guessed");
            }

            if(p1isRight || p2isRight || p3isRight){
                System.out.println("We have winner!");
                System.out.println("Player 1 guessed? " + p1isRight);
                System.out.println("Player 2 guessed? " + p2isRight);
                System.out.println("Player 3 guessed? " + p3isRight);
                System.out.println("Game over!");
                break;
            }else{
                System.out.println("We still have no winner and new round awaits!");
            }
        }
    }

}
