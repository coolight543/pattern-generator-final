// Kuang Miao
// 11 6 2025
// this is to generate patterns

public class pattern{
    public static void stars (int rows)
    {
        String stars = "*";
        int row = 0;
        while (row<rows)
        {
            row++;
            System.out.println(stars);
            stars += "**";    
        }
    }
    public static void triangle (int rows)
    {
        int row = 0;

        while (row<rows)
        {
            row++;
            int i = 0;
            while (i<row)
            {
                System.out.print(row);
                i++;
            }
            System.out.println();
        }

    }
    public static void odds (int start)
    {
        for (int i = start; start > 0; start -=2)
        {
            for (int row = 0; row < start; row++)
            {
                System.out.print(start);
            }
            System.out.println();
        }
    }
    public static void EO (int maxE)
    {
        String letter = "E";
        for (int row =0; row<maxE; row+=2)
        {
            if (maxE % 2 ==0)
            {
                letter = "O";
                for (int i = 0; i<row; i++)
                {
                    System.out.print(letter);
                }
            }
        }
           
    }
    public static void main(String [] args)
    {
        stars(5);
        triangle(5);
        odds(9);
        EO(6);
    }
}
