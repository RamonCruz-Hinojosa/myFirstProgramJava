import java.awt.*;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
//
//        System.out.println("\t\\pizzaz");
//        System.out.println("\"pizzazazaz\"");
//        // vid 1 ^^
//        int x = 123; //initialization
//        double y = 3.14;
//        boolean z = true;
//        char symbol = '@';
//        String name = "Bro";
//
//        System.out.println("Hello "+name);
//        //vid 2^^

//        String x = "water";
//        String y = "Kool-Aid";
//        String temp;
//
//        temp = x;
//        x = y;
//        y = temp;
//
//        System.out.println("x: "+x);
//        System.out.println("y: "+y);
          //vid 3 ^^
//          Scanner scanner = new Scanner(System.in);
//          System.out.println("What is your name? ");
//          String name = scanner.nextLine();
//          System.out.println("How old are you? ");
//          int age = scanner.nextInt();
//          scanner.nextLine();
//          System.out.println("What is your favorite food? ");
//          String food = scanner.nextLine();
//
//          System.out.println("Hello "+name);
//          System.out.println("You are "+age+" years old");
//          System.out.println("You like "+food);
            //vid 4 ^^
//           int friends = 10;
//
//           friends = friends + 1;
//           System.out.println(friends);
            //vid 5 ^^
            String name = JOptionPane.showInputDialog("Enter your name");
            JOptionPane.showMessageDialog(null, "Hello "+name);

            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
            JOptionPane.showMessageDialog(null, "You are "+age+" years old");

            double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
            JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");

    }

}
