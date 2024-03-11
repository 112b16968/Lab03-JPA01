import java.util.Scanner;

public class Lab03JPA01 {
    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();
        int total = 0;
        for(int i = 0; i<number1+1; i++){
             total = total+i;  // Each number 0 to the last number plus
        }
        System.out.println("1 + ... + "+number1+" = "+total);
        input1.close();;
    }
}
