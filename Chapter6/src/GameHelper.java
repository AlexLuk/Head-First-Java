import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Comp on 30.05.2017.
 */
public class GameHelper {
    private static final String alphabet="abcdefg";
    private int gridLength=7;

    public String getUserInput(String showText){
        System.out.print(showText + " ");
        String inputText=null;
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputText=is.readLine();
            if(inputText.length()==0) return null;
        }catch (IOException e){
            System.out.println("IOException: "+ e);
        }
        return inputText;
    }
    public ArrayList<String> placeDotCom(int size){
        ArrayList<String> postion = new ArrayList<>();
        postion.add("A1");
        postion.add("A2");
        postion.add("A3");
        return postion;
    }
}
