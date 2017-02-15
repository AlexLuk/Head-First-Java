import java.util.Random;

/**
 * Created by Comp on 15.02.2017.
 */
public class Player {
    public int number=0;
    public void guess(){
        number=(int)(Math.random()*10);
    }
}
