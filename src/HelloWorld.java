import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("\tHello World\nHello");
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
//        System.out.println(b+" " + a);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello"+ name);
        System.out.println("Give number");
        int age = scanner.nextInt();
        System.out.println("Your number "+age);
    }
}
