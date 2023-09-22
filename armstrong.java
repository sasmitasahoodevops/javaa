public class armstrong{
    public static void main(String args[]){
        int a=371;
        int temp=a;
       int res=0;{
            while(temp!=0){
               int rem=a%10;
                res += Math.pow(rem,3);
                temp /= 10;
            }
            if (res == a)
                System.out.println("number is armstrong");
            
            else
                System.out.println("number is not armstrong");
            
            }
        }
    }
