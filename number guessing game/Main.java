import java.util.Scanner;

class GeneratedNo {
    int random_no = (int) Math.floor(1 + Math.random() * 100);

    void printInfo() {
        System.out.println(random_no);
    }

    void CheckingNo() {
        int attempts = 1;
        for (int i = 0; i <=10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your number between 0 and 100");
            int userNO = sc.nextInt();

            if (random_no == userNO ) {
                System.out.println("You guessed the right no " + "in " + attempts + " attempt");
                break;
            } else if(userNO > random_no){
                System.out.println("Your no is greater than generated number");
            } else if(userNO < random_no){
                System.out.println("Your no is less than the generated number");
            }
            attempts++;

            if(i==10){
                System.out.println("You have reached maximum attempts and no is "+random_no);
            }
        }
    }

    void playAgain(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to play again? ");
        String playagain = sc.next();
        if (playagain.equals("yes")) {
            random_no = (int) Math.floor(1 + Math.random() * 100); 
            // System.out.println(random_no);
            CheckingNo();
        } else if (playagain.equals("no")) {
            System.out.println("Thanks for playing!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GeneratedNo obj = new GeneratedNo();
        // obj.printInfo();
        obj.CheckingNo();
        obj.playAgain();
        
    }
}