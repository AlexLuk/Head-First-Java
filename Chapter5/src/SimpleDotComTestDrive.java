/**
 * Created by Comp on 30.05.2017.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4};
        dot.setLocations(locations);

        String userGuess="2";
        String result = dot.checkYourself(userGuess);
        String testResult = "провален";
        if(result.equals("попал")){
            testResult="пройден";
        }
        System.out.println(testResult);
    }


}
