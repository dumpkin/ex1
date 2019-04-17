public class Main {

    //Створіть масив з 8 випадкових цілих чисел з відрізка [1; 10].
    // Виведіть масив на екран у рядок.
    // Замінити кожен елемент з непарним індексом на нуль.
    // Знову виведете масив на екран на окремому рядку.

    public static void main(String[] args) {

int[] mass= {6,1,7,3,9,5,8,4};

int a=0;
while (a<8){
    System.out.print(mass[a]+" ");
    a++;
}
        System.out.println("\n");

         a=0;
        while (a<8){
            if ((mass[a]&1)==1) {mass[a]=0;}
            System.out.print(mass[a]+" ");
            a++;
        }

System.out.println("Ex3");
    }
}
