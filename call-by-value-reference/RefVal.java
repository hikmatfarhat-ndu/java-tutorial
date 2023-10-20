public class RefVal {

    public static void main(String[] args){
        String s="Hello";
        Modify m=new Modify();
        m.setX(20);
        mutate(s,m);
        System.out.println(s);
        System.out.println(m.getX());

    }
    public static  void mutate(String s,Modify m){
        s="World";
        m.setX(44);
    }
}
class Modify{
int x=10;
  public void setX(int x){
    this.x=x;
  }
  public int getX(){return x;}

}