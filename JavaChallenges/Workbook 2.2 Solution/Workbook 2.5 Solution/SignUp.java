import java.net.Socket;
import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name ? ");
        String name = sc.nextLine();

        System.out.println("What's your last name ? ");
        String lastName = sc.nextLine();

        System.out.println("How old are you ?");
        int age = sc.nextInt();

        System.out.println("Make a username");
        sc.nextLine();
        String username = sc.nextLine();

        System.out.println("What city do u live in ?");
        String city = sc.nextLine();

        System.out.println("What country is that ?");
        String country = sc.nextLine();

        System.out.println(name);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(username);
        System.out.println(city);
        System.out.println(country);
    }
}
