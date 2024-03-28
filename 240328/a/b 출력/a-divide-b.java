import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a/b; //몫
        int d=a%b; //나머지
        if(a>=b){ //  14/3
            System.out.print(c+".");
            for(int i=0;i<20;i++){
                c=(d*10)/b;
                System.out.print(c);
            }
        }else{ //  3/5
            System.out.print(0+".");
            c=(a*10)/b;
            for(int i=0;i<20;i++){
                System.out.print(c);
                c=(d*10)/b;
            }
        }
    }
}

//14/3=4...2    3/5->0.      3/7->0. 
//20/3=6...2    30/5=6...0   30/7=4...2
//20/3=6....2   0/5=0-> 0?   20/7=2...6