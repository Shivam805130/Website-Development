import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        System.out.println("Select any of Them \nRock -- 1,\nPaper -- 2,\nScissor -- 3");
        Scanner sc = new Scanner(System.in);
        int User_Input = sc.nextInt();
        if (User_Input > 3) {
            System.out.println("Sorry This is Invalid");
        }
        Random random = new Random();
        int Computer_Input = random.nextInt(1,4);
        if (User_Input == Computer_Input ){
            System.out.println("$$___Draw___$$ \nComputer choose --> " + Computer_Input );
        }
        else if (User_Input== 1 && Computer_Input == 3 || User_Input==2 && Computer_Input==1 || User_Input==3 && Computer_Input== 2) {
            System.out.println("&&___You Win___$$ \nComputer choose --> " + Computer_Input);
        }
        else  {
            System.out.println("&&___Computer Win___$$ \nComputer choose --> " +  Computer_Input);
        }
        System.out.println("Thanks for play");

    }
}

