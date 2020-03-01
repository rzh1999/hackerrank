import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static int breadth;
    static int height;
    static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        breadth = scanner.nextInt();
        height = scanner.nextInt();
        scanner.close();

        try {
            if (breadth <= 0 || height <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }

        }
        catch (Exception exc){
            System.out.println(exc);
            System.exit(0);
        }

    }

    public static void main(String[] args){
        if(flag){
            int area=breadth * height;
            System.out.print(area);
        }
    }

}
