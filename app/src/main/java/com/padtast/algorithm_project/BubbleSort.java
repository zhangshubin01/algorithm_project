package com.padtast.algorithm_project;

/**
 * 冒泡排序
 *
 * 冒泡排序的关键点是从后向前对相邻的两个数组元素进行比较，若后面元素的值小于前面元素的值，
 * 则将这两个元素交换位置，否则不进行交换。依次进行下去，第一趟排序可将数组中值最小的元素移至下标为0的位置。
 * 对于有n个元素的数组，循环执行n-1趟扫描便可完成排序。(当然，也可以从前向后对相邻的两个数组元素进行比较，
 * 但此时应注意将大数向后移，与小者前移的冒泡法相对应，可将这种大者后移的排序称为下沉法)。
 */
public class BubbleSort {
    public static void bubbleSort(int a[]){
        int temp  = 0;

        for (int i = 0; i < a.length - 1; ++ i){
            for (int j = i; j < a.length; ++ j){

                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
