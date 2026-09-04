package Labs.Week_1.scr;

public class Patterns {
    public static void main(String[] args) {
        
        int rows = 10;

        System.out.println("Pattern A");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("+");
            }
            System.out.println();
        }

        int rows1 = 10;

        System.out.println("Pattern B");
        for(int i = 0; i < rows1; i++)
        {
            for(int j = 10; j > i; j--)
            {
                System.out.print("+");
            }
            System.out.println();
        }

    }
    
}
