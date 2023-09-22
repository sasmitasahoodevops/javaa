import java.util.*;
public class multiplication{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int x=sc.nextInt();{
            for (int i=1;i<=10;i++){
                int mult=x*i;
                System.out.println(mult);
            }
        }
    }
}