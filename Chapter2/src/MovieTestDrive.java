
public class MovieTestDrive {
    public static void main(String[] args) {
        Movie m1=new Movie();
        Movie m2=new Movie();
        Movie m3=new Movie();

        m1.title="Коты на проводах";
        m2.title="Окопы в огне";
        m3.title="Бессонница";

        m1.genre="Комедия";
        m2.genre="Трагедия";
        m3.genre="Мелодрама";

        m1.rating=1;
        m2.rating=5;
        m3.rating=2;

        m1.playIt();
        m2.playIt();
        m3.playIt();


    }
}
