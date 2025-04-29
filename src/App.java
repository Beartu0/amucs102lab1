import java.util.Scanner;
public class App {
    public static void q1(){
        int n = 11;
        for (int i = 0; i < 6; i++) { 
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 11 - 2 * i; j++) { 
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
    public static void q2 () {

        int n = 11; 
        for (int i = 5; i >= 1; i--) { 
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 11 - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        for (int k = 0; k < 6; k++) { 
            for (int l = 0; l < k; l++) {
                System.out.print(" ");
            }
            for (int m = 0; m < 11 - 2 * k; m++) { 
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
    public static void q3 (){
    int n = 6; 
        for (int i = 0; i < n-1; i++) { 
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { 
                if (j == 0 || j == i ) 
                    System.out.print("* ");
                else
                    System.out.print("  "); 
            }
            System.out.println(); 
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }
    public static void q4 (){
        int n = 6; 
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println(); 
        for (int i = n - 2; i >= 0; i--) { 
            for (int j = 0; j < n - i - 1; j++) { 
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { 
                if (j == 0 || j == i) 
                    System.out.print("* ");
                else
                    System.out.print("  "); 
            }
            System.out.println();
        }
    }
    public static void q5 (){

        int n = 6; 
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println(); 
        for (int i = n - 2; i > 0; i--) { 
            for (int j = 0; j < n - i - 1; j++) { 
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { 
                if (j == 0 || j == i) 
                    System.out.print("* ");
                else
                    System.out.print("  "); 
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) { 
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { 
                if (j == 0 || j == i ) 
                    System.out.print("* ");
                else
                    System.out.print("  "); 
            }
            System.out.println(); 
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }
    public static void q6 (){
        int n = 6; 
        for (int i = 0; i < n-1; i++) { 
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { 
                if (j == 0 || j == i ) 
                    System.out.print("* ");
                else
                    System.out.print("  "); 
            }
            System.out.println(); 
        }
        for (int i = n - 2; i >= 0; i--) { 
            for (int j = 0; j < n - i - 1; j++) { 
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { 
                if (j == 0 || j == i) 
                    System.out.print("* ");
                else
                    System.out.print("  "); 
            }
            System.out.println();
        }
    }
    public static void q7 (){
       Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to the Basic Calculator Simulator!\r\n" + //
                        "Menu:\r\n" + //
                        "1. Add\r\n" + //
                        "2. Subtract\r\n" + //
                        "3. Multiply\r\n" + //
                        "4. Divide\r\n" + //
                        "5. Clear\r\n" + //
                        "6. Display Result\r\n" + //
                        "7. Exit  ");
        int x=1;
        double res=0;
        while(x==1){
            System.out.println("enter your choice");
            int sec= scanner.nextInt();
            if (sec==1) {
                System.out.println("enter the value to add");
                int say=scanner.nextInt();
                res= say+res;
                System.out.println("result after add"+res);
                
            }
            else if (sec==2) {
                System.out.println("enter the value to subtract");
                int say=scanner.nextInt();
                res= res-say;
                System.out.println("result after subtract"+res);
            }
            else if (sec==3) {
                System.out.println("enter the value to multiply");
                int say=scanner.nextInt();
                res= res*say;
                System.out.println("result after multiply"+res);
            }
            else if (sec==4) {
                System.out.println("enter the value to divide");
                int say=scanner.nextInt();
                res= res/say;
                System.out.println("result after divide"+res);
            }
            else if (sec==5) {
                res=0;
                System.out.println("result cleared");
            }
            else if (sec==6) {
                System.out.println(res);
            }
            else if (sec==7){
                System.out.println("thx for using");
                break;
            }
            
            
            else System.out.println("please select a true choice");}

                   
    }
    public static void main(String[] args) throws Exception {
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        
    }
}
