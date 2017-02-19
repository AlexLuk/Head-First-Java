/**
 * Created by Alexandr on 20.02.2017.
 */
public class BookTestDrive {
    public static void main(String[] args) {
        Book[] myBooks =new  Book[3];
        myBooks[0] =new Book();
        myBooks[1] =new Book();
        myBooks[2] =new Book();
        int x=0;
        myBooks[0].title="0";
        myBooks[1].title="1";
        myBooks[2].title="2";

        myBooks[0].author="a0";
        myBooks[1].author="a1";
        myBooks[2].author="a2";

        while(x<3){
            System.out.print(myBooks[x].title);
            System.out.print(", author");
            System.out.println(myBooks[x].author);
            x=x+1;

        }
    }




}
