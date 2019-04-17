// считывает символы пока не встретится точка.
// Также предусмотрите вывод количества пробелов.

import  java.util.Scanner;

public class Main {

    public static void main(String [] args) {

        int numberOfSpaces=0;
        Scanner scan = new Scanner(System.in);
        String inputText = scan.nextLine();
        int textLenght=inputText.length();

       for (int a=0; a<textLenght; a=a+1) {
           char b = ' ', c = '.';
           if (inputText.charAt(a) == b) {
               numberOfSpaces++;
           }
           if (inputText.charAt(a) == c) {
               System.out.println("Місце крапки в тексті:"+(a+1));
               break;
           }
       }

        System.out.println("всього пробілів:"+numberOfSpaces);
        System.out.println("Всього літер тексті:"+textLenght);


    }
}
