import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        System.out.print("Enter your age: ");
        Scanner age = new Scanner(System.in);

        try {
            AgeResult(age.nextInt());
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("End program");
    }

    private static void AgeResult(int nextInt) throws Exception {
        if (nextInt >100 || nextInt<0) throw new Exception("Incorrect number entered");
        String st;
        if (nextInt<18) System.out.println ("You are young");
        else System.out.println ("Welcome");
    }
}
