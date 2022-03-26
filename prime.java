import java.util.*;
class prime{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int f=1;
        
        if (num <= 1)
            f=0;
 
        else if (num == 2)
            f=1;
 
        else if (num % 2 == 0)
            f=0;
 
        for (int i = 3; i <= Math.sqrt(num); i += 2)
        {
            if (num % i == 0)
                f=0;
            
        }
        
        if(f==1)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");
        
    }
}