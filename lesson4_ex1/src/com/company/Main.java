package com.company;

public class Main {

    public static void main(String[] args) {

        // values and array initialise
        int array[] = {43, 17, 94, 28, 75, 32, 92, 66, 3, 89};
        BubbleSort sort = new BubbleSort();
        //print default array
        for (int list: array){
            System.out.print(list+" ");
        }
        System.out.println("\n________________________________");

        sort.bubbleSort(array);
        //print sorted array
        System.out.println("Sorting ok");
        for (int list: array) {
            System.out.print(list+" ");
        }
        System.out.println("\n________________________________");

    }
}
