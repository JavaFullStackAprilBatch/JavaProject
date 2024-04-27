package pack;

public class ControlStatementsExample {
    public static void main(String[] args) {
        //if
        //if else
        //nested if
        //if-else-if ladder
        //switch
        int y = 5;
        int x = 6;




        if (y<15) {
            System.out.println("Inside if block");
            if(x>6)
                System.out.println("Inside if block of x>6");
            System.out.println("Inside if block ");

        }
        else{
            System.out.println("Inside else block");
        }


        int i = 20;

        //if-else-if ladder

      if ( i == 10)
          System.out.println(" i = 10");
      else if (i == 20)
          System.out.println(" i = 15");
      else if (i == 30)
          System.out.println(" i = 20");
      else
          System.out.println(" i not present in block");



        System.out.println("outside if block");


        //swtich statement


        int n = 20;

        switch (n) {
            case 10: {
                System.out.println("value  = 10");
                break;
            }
            case 20:
                System.out.println("value = 20");
                System.out.println("inside of switch block");
            case 30: {
                System.out.println("value = 30");
                ;
                break;
            }
            default:
                System.out.println("value not present");
                System.out.println("value not present----");

        }

    }
}
