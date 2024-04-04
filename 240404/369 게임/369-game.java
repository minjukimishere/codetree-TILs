import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            String s=Integer.toString(i);
            if(s.contains("3")||s.contains("6")||s.contains("9")||i%3==0){
                System.out.print(0+" ");
            }else{
                System.out.print(i+" ");
            }
        }
    }
}