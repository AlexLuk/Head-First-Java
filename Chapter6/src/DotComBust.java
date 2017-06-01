import java.util.ArrayList;

/**
 * Created by Comp on 01.06.2017.
 */
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuess = 0;

    void setUpGame() {
        DotCom dot1 = new DotCom("pets.com");
        DotCom dot2 = new DotCom("gog.com");
        DotCom dot3 = new DotCom("steam.com");

        dotComList.add(dot1);
        dotComList.add(dot2);
        dotComList.add(dot3);

        System.out.println("Потопите три сайта");
        System.out.println("pets.com, gog.com, steam.com");
        System.out.println("Сделайте это за минимальное число ходов");

        for (int i = 0; i < dotComList.size(); i++) {
            dotComList.get(i).setLocations(helper.placeDotCom(3));
        }
    }

    void startPlaying() {
        while (!dotComList.isEmpty()) {
            checkUserGuess(helper.getUserInput("Сделайте ход "));
        }
        finishGame();
    }

    void checkUserGuess(String userGuess) {
        numOfGuess++;
        String result = "мимо";
        for (DotCom dot : dotComList) {
            result = dot.checkYourself(userGuess);
            if (result.equals("попал")) {
                //System.out.println("Вы попали в " + dot.getName());
                break;
            }
            if(result.equals("потопил")) {
                //System.out.println("Вы потопили " + dot.getName());
                dotComList.remove(dot);
                break;
            }
        }
        System.out.println(result);
    }


    void finishGame(){
        System.out.println("Вы выйграли за "+numOfGuess+" ходов.");
        if(numOfGuess<=18){
            System.out.println("Везунчик!");
        }else{
            System.out.println("Лошара!");
        }
    }

    public static void main(String[] args) {
        DotComBust game=new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
