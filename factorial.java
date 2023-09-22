import java.util.Scanner;
public class factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter  number x:");
        int x=sc.nextInt();
        System.out.print("enter number y:");
        int y=sc.nextInt();
        int fact=1;
    {
    for (int i=1;i<=x & i<=y;i++){
        if(x%i ==0 && y%i ==0)
            fact=i;
        
    }
    int lcm=x*y/fact;
     System.out.print(lcm);

    }
}
}


    
