/**
 * Created by TOSHIBA on 5/26/2017.
 */
import java.util.Scanner;
public class HackerRank_9
{
    static void factorial (int n)
    {
        int fact =1;
        for ( int i=1; i<=n; i++)
        {
            fact = fact*i;
        }
        System.out.println ( fact );
    }
    public static void main ( String[] args )
    {
        Scanner obj = new Scanner ( System.in );
        System.out.println(" enter the number = " );
        int num ;
        num = obj.nextInt ();
        factorial (num);
    }
}
