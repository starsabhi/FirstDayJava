import java.util.Scanner;
import javax.swing.JOptionPane;
import  java.util.Random;
public class HelloWorld {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+name);
    }
}

//    String day = "nine";

//    switch (day){
//        case "Sunday":System.out.println("It is sunday.");
//            break;
//        case "Friday":System.out.println("It is Friday.");
//            break;
//        default:System.out.println("That is not day!");
//    int age = 20;
//    if(age < 10){
//        System.out.println("Hello");
//        }
//        else if (age == 20){
//        System.out.println("Hello 20");
//        }
//        else{
//        System.out.println("Hello NO");
//        }
//    Random random = new Random();
//
//    int x = random.nextInt(7);
//    System.out.println(x);

//    double x = 3.14;
//    double y = -10;
//
//    double z = Math.max(x,y);
//        System.out.println(z);
//        String name = JOptionPane.showInputDialog("Enter your name");
//        JOptionPane.showMessageDialog(null,"Hello "+name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        JOptionPane.showMessageDialog(null,"Your age "+age);

//        System.out.println("\tHello World\nHello");


//        //this is comment
//
//        int x = 29;
//        double y = 3.14;
//        boolean z = true;
//        char symbol = '@';
//        String name = "Bro";
//        System.out.println(x);
//        String a = "not me";
//        String b = "who is there?";
////        System.out.println(b+" " + a);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name? ");
//        String name = scanner.nextLine();
//        System.out.println("Hello"+ name);
//        System.out.println("Give number");
//        int age = scanner.nextInt();
//        System.out.println("Your number "+age);


//    public static void main(String[] args){
//        double x;
//        double y;
//        double z;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter side x: ");
//        x = scanner.nextDouble();
//
//        System.out.println("Enter side y: ");
//        y = scanner.nextDouble();
//
//        z = Math.sqrt((x*x)+(y*y));
//
//        System.out.println("The hypotenuse is :"+z);
//        scanner.close();