import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int toilet=0;
        int corridor=0;
        int classroom=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%12==0){
                toilet++;
            }else if(i%3==0){
                corridor++;
            }else if(i%2==0){
                classroom++;
            }
        }System.out.print(classroom+" "+corridor+" "+toilet);
    }
}