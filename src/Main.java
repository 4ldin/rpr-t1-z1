import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int x, y;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite brojeve");
        x = ulaz.nextInt();
        y = ulaz.nextInt();
        System.out.println("Brojevi su: "+ x + " i " + y);
    }
} 