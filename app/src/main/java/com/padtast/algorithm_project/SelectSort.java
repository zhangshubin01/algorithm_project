package com.padtast.algorithm_project;

/**
 * 选择排序法
 * 选择法排序的基本思想是：首先从待排序的n个数中找出最小的一个与array[0]对换；
 * 再将array [1]到array [n]中的最小数与array [1]对换，依此类推。每比较一轮，
 * 找出待排序数中最小的一个数进行交换，共进行n-1次交换便可完成排序。
 * 选择法排序每执行一次外循环只进行一次数组元素的交换，可使交换的次数大大减少。
 */
public class SelectSort {
    /**
     * 选择排序法
     * @param a
     */
    public static void selectSorts(int a[]){

        int min = 0;
        int temp = 0;

        //外层循环 n-1
        //
        for (int i = 0; i < a.length - 1; ++ i){

            min = i;
            // 内层循环 n
            // 先找出最大的  再依次循环 依次从大到小
            for (int j = i + 1; j < a.length; ++ j){
                // 如果 大于
                // 下次循环   min已经 ==j
                //
                if (a[min] > a[j]){
                    min = j;
                }
            }
            // 如果不相等  交换
            // 下边 交换位置
            if (min != i){
                // min 值先赋值给 temp
                temp = a[min];
                // i 替换 min
                a[min] = a[i];
                // temp  赋值给 [i]
                a[i] = temp;
            }
        }
    }
}
