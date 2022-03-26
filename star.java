import java.util.*;

public class star
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = 4;
		int space=0;
		for (int i=0; i<row; i++)   
        {  
            for (int j=row*4; j>=i; j--)   
                System.out.print(" ");   
            for (int j=0; j<=i; j++ )   
                System.out.print("7 ");  
            System.out.println();
            
        }
        for (int i= row; i>= 1; i--)  
        {
            for (int j=(row*2)-1; j>i;j--)  
                System.out.print("  ");  
            for (int k=1;k<=i;k++)  
                System.out.print("7 ");
            for(int j=row;j>=1;j--)
                System.out.print("7 ");
            for (int j=0; j<i; j++)  
                System.out.print("7 ");
            System.out.println("");  
        }  
    for (int i = row-1; i >= 1; i--)
    {
      for(int j=row+2;j>=1;j--)
        System.out.print("  ");
      for (int j = i; j >= 1; j--)
        System.out.print("7 ");
      for (int j = 1; j <= space; j++)
        System.out.print("  ");
      for (int j = i; j >= 1; j--)
        System.out.print("7 ");
      System.out.println();
      space = space + 2;
	}
}
}