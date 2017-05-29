import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

/**
 * Created by Alexandr on 29.05.2017.
 */
public class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        System.out.println(x.go(orig));
    }
    int go(int arg){
        return arg*2;
    }
}
