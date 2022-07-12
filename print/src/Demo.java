import model.colorprinter;
import model.printer;

public class Demo {
    public static void main(String[] args){
        printer p = new colorprinter();
        printer pp = new printer();
        colorprinter cp = new colorprinter();
        cp.write();
//        cp.print();
//        重载
        pp.write();
        pp.write("hello");
//        重写覆盖
        p.print();

//        https://segmentfault.com/q/1010000040306308/      ???
    }
}
