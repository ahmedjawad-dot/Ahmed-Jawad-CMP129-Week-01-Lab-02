
package Labs.Week_1.scr;
import java.util.Scanner;
public class SalesBarChart {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int sales1;
        int sales2;
        int sales3;
        int sales4;
        int sales5;

        System.out.print("Enter today's sales for store 1: ");
        sales1 = input.nextInt();

        System.out.print("Enter today's sales for store 2: ");
        sales2 = input.nextInt();

        System.out.print("Enter today's sales for store 3: ");
        sales3 = input.nextInt();

        System.out.print("Enter today's sales for store 4: ");
        sales4 = input.nextInt();

        System.out.print("Enter today's sales for store 5: ");
        sales5 = input.nextInt();
        
        int salesbar1 = sales1/100;
        System.out.println("");
        System.out.print("Store 1: ");
        for(int i = 0; i < salesbar1; i++)
        {
            System.out.print("*");
        }

        int salesbar2 = sales2/100;
        System.out.println("");
        System.out.print("Store 2: ");
        for(int i = 0; i < salesbar2; i++)
        {          
            System.out.print("*");
        }

        int salesbar3 = sales3/100;
        System.out.println("");
        System.out.print("Store 3: ");
        for(int i = 0; i < salesbar3; i++)
        {         
            System.out.print("*");
        }

        int salesbar4 = sales4/100;
        System.out.println("");
        System.out.print("Store 4: ");
        for(int i = 0; i < salesbar4; i++)
        {
            System.out.print("*");
        }
        int salesbar5 = sales5/100;
        System.out.println("");
        System.out.print("Store 5: ");
        for(int i = 0; i < salesbar5; i++)
        {
            System.out.print("*");
        }





    }
}
