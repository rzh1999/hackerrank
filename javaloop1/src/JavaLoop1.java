import java.util.Scanner;

public class JavaLoop1 {


    //Will put most code into functions to get used to using them
    public static void main(String[] args) {
       int inputNum = getNumber();

       for (int i = 1; i<11; i++){
           int product = inputNum * i;
           System.out.println(inputNum + " x " + i + " = " + product );
       }

    }

    public static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        return inputNum;
    }
}
