public class prime{
    public static void main(String ...args){
        int n = 1;
        int flag = 0;
        for(int i = 2; i<=n/2; i++){
            if(n%i==0){
                System.out.println("Not primes");
                flag = 1;
                break;
            }
                
        }
        if(flag ==0)
         System.out.println("prime");
    }
}
