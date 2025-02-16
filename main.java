import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mynum = (int)(Math.random()*100);
        int usernum = 0;

        do {
            System.out.print("Guess the number : ");
            usernum = sc.nextInt();

            if(usernum == mynum) {
                System.out.println("WOOHOOOO....CORRECT NUMBER!!! ");
                break;
            }
            else if(usernum > mynum) {
                System.out.println("TOO HIGH!!....TRY AGAIN  ");
            }
            else{
                System.out.println("TOO LOW!!....TRY AGAIN  ");
            }
        } while(usernum >= 0);
        System.out.print("The Number is : ");
        System.out.println(mynum);
    }
}
