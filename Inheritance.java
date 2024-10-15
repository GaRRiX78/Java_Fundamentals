/*/ public class Inheritance {
    static int a;
    int b;

    public void set(int i, int j){
        a=j;
        b=i;
    }
    public void show(){
        System.out.println("static value" + a);
        System.out.println("non-static value" + b);
    }
    public static void main(String arg[]){
        Inheritance y = new Inheritance();
        y.set(250,120);
        y.show();
    }
} /* */

class roll{
    private int studentid;
    roll()
{
    studentid=101;
    System.out.println(studentid);

}
roll(int no )
{
    studentid= no;
    System.out.println(studentid);
}
public static void main(String[] args) {
    roll obj1= new roll();
    roll obj2= new roll(8510);
    roll obj3= new roll(85104);
    roll obj4= new roll(85106);
    
    
 }
}