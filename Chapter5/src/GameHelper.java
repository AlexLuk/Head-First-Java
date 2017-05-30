import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Comp on 30.05.2017.
 */
public class GameHelper {
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
}
