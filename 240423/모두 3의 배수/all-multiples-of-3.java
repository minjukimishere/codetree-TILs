import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        boolean j=true;
        for(int i=0;i<5;i++){
            int n=sc.nextInt();
            if(n%3!=0){
                j=false;
            }
        }
        if(j==false){
            System.out.print(0);
        }else if(j==true){
            System.out.print(1);
        }

    }
}