/**
 * Created by Comp on 30.05.2017.
 */
public class SimpleDotCom {
    private  int[] locationsCells;
    private int numOfHits;

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);

        String result = "мимо";

        for (int i = 0; i < locationsCells.length; i++) {
            if (guess==locationsCells[i]){
                result="попал";
                locationsCells[i]=0;
                numOfHits++;
                break;
            }
        }


        if(numOfHits==locationsCells.length){
            result = "потопил";
        }
        System.out.println(result);

        return result;
    }

    public void setLocations(int[] locations){
        locationsCells=locations;
    }

}
