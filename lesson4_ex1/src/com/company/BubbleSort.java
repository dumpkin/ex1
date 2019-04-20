package com.company;

class BubbleSort {

    void bubbleSort(int array[]) {

        // scan all arrray elements
        int arrElement = array.length;
        for (int scan = 0; scan < arrElement - 1; scan++) {
            // sorting cycle
            for (int iteration = 0; iteration < arrElement - scan - 1; iteration++) {
                if (array[iteration] > array[iteration + 1]) {
                    int temp = array[iteration];
                    array[iteration] = array[iteration + 1];
                    array[iteration + 1] = temp;
                }
            }
        }
    }
}
