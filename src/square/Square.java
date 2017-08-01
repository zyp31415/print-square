package square;

/**
 *
 * @author Wilson
 */
public class Square {

    public static StringBuilder printSquare(int n)
    {
        StringBuilder square = new StringBuilder();
        //return empty if n is invalid
        if (n <= 0)
        {
            return square;
        }
        for (int x = 0; x < n; x++)
        {
            for (int y = 0; y < n; y++)
            {
                //print # along the outer line of the square
                if (x == 0 || y == 0 || x == n - 1 || y == n - 1)
                {
                    square.append("#");
                }
                else
                {
                    square.append(" ");
                }
            }
            //append a new line at the end of every line
            square.append("\n");
        }
        return square;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(Square.printSquare(0));
    }
}
