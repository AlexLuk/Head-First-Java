import java.util.ArrayList;

public class DotCom {
    private ArrayList <String> locationsCells;
    private String name;


    public DotCom(String name){
        this.name=name;
    }


    public String checkYourself(String userInput){

        String result = "мимо";

        int index = locationsCells.indexOf(userInput);
        if(index >=0){
            locationsCells.remove(index);
            if(locationsCells.isEmpty()){
                result = "потопил";
                System.out.println("Ой вы потопили "+name+" :(");
            }else{
                result = "попал";
            }

        }
        return result;
    }

    public void setLocations(ArrayList<String> locations){
        locationsCells=locations;
    }

}
