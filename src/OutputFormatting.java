import java.util.InputMismatchException;
import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String inputStr=scanner.next();
                int inputNum=scanner.nextInt();

                System.out.printf("%-15s%03d%n", inputStr, inputNum);
            }
            System.out.println("================================");

        }
    }



