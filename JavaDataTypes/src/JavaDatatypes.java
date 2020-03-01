import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class JavaDatatypes {


        public static void main(String []argh)
        {



            Scanner scanner = new Scanner(System.in);
            int numTestCases=scanner.nextInt();

            for(int i=0;i<numTestCases;i++)
            {

                try
                {

                    long inputNum=scanner.nextLong();

                    System.out.println(inputNum+" can be fitted in:");

                    //Test if byte
                    if(inputNum >= -128 && inputNum <= 127){
                        System.out.println("* byte");
                    }

                    //Test if short
                    if(inputNum >= -32768 && inputNum <= 32767){
                        System.out.println("* short");
                    }

                    //Test if int
                    if(inputNum >= -2147483648 && inputNum <= 2147483647){
                        System.out.println("* int");
                    }

                    //Test if long
                    if(inputNum >= -9223372036854775808L && inputNum <= 9223372036854775807L){
                        System.out.println("* long");
                    }

                }
                catch(Exception e)
                {
                    System.out.println(scanner.next()+" can't be fitted anywhere.");
                }

            }
        }
    }


