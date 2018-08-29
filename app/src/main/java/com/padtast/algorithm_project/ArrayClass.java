package com.padtast.algorithm_project;

import java.math.BigDecimal;

/**
 * 数组  相关 算法
 */
public class ArrayClass {
    /* 打印第一个最小和第二个最小元素的功能 */
  public  static void print2Smallest(int arr[])
    {
        int first, second, arr_size = arr.length;

        /* 至少应该有两个要素 */
        if (arr_size < 2)
        {
            System.out.println(" Invalid Input ");
            return;
        }

        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size ; i ++)
        {
            /* 如果当前元素小于第一个   然后更新第一个和第二个 */
            if (arr[i] < first)
            {
                second = first;
                first = arr[i];
            }
            /* 如果arr [i]在第一个和第二个之间，则更新第二个  */
            else if (arr[i] < second && arr[i] != first)
                second = arr[i];
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second" +"smallest element");
        else
            System.out.println("The smallest element is " +	first + " and second Smallest" +	" element is " + second);
    }

    /**
     *  val1s <  val2s
     */
    public  final static int DOUBLE_EQUALS_1 = 1;

    /**
     * val2s == val1s
     */
    public  final static int DOUBLE_EQUALS_2 = 2;
    /**
     *  val1s <  val2s
     */
    public  final static int DOUBLE_EQUALS_3 = 3;
    /**
     *  判断 两个double 大小
     *
     * @return
     */
    public static int compare(double val1s, double val2s) {
        BigDecimal val2 = new BigDecimal(val2s);
        BigDecimal val1 = new BigDecimal(val1s);
        int result = 0;
        //第二位数大！
        if (val1.compareTo(val2) < 0) {
            result = DOUBLE_EQUALS_1;
        }
        // "两位数一样大！"
        if (val1.compareTo(val2) == 0) {
            result = DOUBLE_EQUALS_2;
        }
        //第一位数大！
        if (val1.compareTo(val2) > 0) {
            result = DOUBLE_EQUALS_3;
        }
        return result;
    }
}
