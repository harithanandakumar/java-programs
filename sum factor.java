import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(n<0){
            System.out.println("Invalid");
        }else{
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    sum+=i;
                }
            }
        }
        System.out.println(sum);
    }
}