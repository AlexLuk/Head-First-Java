/**
 * Created by Alexandr on 19.02.2017.
 */
public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d=new DrumKit();
        d.playSnare();
        d.playTopHat();
        d.snare=false;
        if(d.snare==true){
            d.playSnare();
        }
        //some comments
    }
}
