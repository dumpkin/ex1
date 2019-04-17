import java.util.Scanner;

public class Main {

    //3) Використовуючи switch,
    // виводити на екран день тижня,
    // в залежності від введеного його порядкового номеру.

    public static void main(String[] args) {

        System.out.println("Weeks");
        System.out.println("\n_____________________________\n");
        System.out.print("input day number: ");

        Scanner in= new Scanner(System.in);
boolean n=false;

        while (!n) {
    switch (in.nextInt()) {
        case 1:
            System.out.println("Monday");break;
        case 2:
            System.out.println("Tueseday");break;
        case 3:
            System.out.println("Wenesnday");break;
        case 4:
            System.out.println("thursday");break;
        case 5:
            System.out.println("Friday");break;
        case 6:
            System.out.println("Saaurday");break;
        case 7:
            System.out.println("Sunday");break;
        case 0:
            n=false;
            System.out.println("exit");break;
    }
}

        System.out.println("\n_____________________________\n");

        System.out.println("end");

    }
}
