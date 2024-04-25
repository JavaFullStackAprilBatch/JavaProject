package pack;

public class ConstructorExample {

    int x ;
    int y ;
    int z;
    static int s;
    String u;

   public ConstructorExample(int a, int b, String st)
   {
       this.x=a;
       this.y=b;
       this.u = st;
       s = a+b;
   }
   public ConstructorExample(int a){

   }
   public ConstructorExample()
   {

   }


    public int add()
    {
        int z = this.x+this.y;
        return z;
    }




    public static void main(String[] args) {
        ConstructorExample m = new ConstructorExample(50,30,"saritha");
        ConstructorExample m2 = new ConstructorExample(70,90,"abc");
       // ConstructorExample m3 = new ConstructorExample();
       // ConstructorExample m4 = new ConstructorExample(5);
        int z = m.add();
        int x = m2.add();
        System.out.println("sum is "+z);
        System.out.println("sum is "+x);

    }
}
