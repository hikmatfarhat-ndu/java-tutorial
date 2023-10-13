import mypackage.*;
import outtree.InOutTree;
import mypackage.subpackage.*;
public class Calc {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Sum of a and b is " + c);
        Helper.doit();
        /** cannot make a static reference to non-static method */
        // Helper.another();
        Helper h = new Helper();
        Misc p=new Misc();
        InPackage ip=new InPackage();
        InSubPackage isp=new InSubPackage();
        InOutTree ot=new InOutTree();
        int t=22;
        h.another(t);
    }
}
// only one public class per file
 class Helper{
    int state=10;
    Helper(){

    }
    Helper(int state){
        this.state=state;
    }
    public static void doit(){
        System.out.println("I am in Helper");
    }
    public void another(int a){
        System.out.println("I am in another");
    }
}