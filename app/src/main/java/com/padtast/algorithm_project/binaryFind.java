package com.padtast.algorithm_project;

/**
 * 二分查询
 * 二分查找是在一个有序表(数据是按其值由小到大或由大到小依次存放的，
 * 这里我们以值由小到大排列为例)中，每次都与中间的那个元素比较，若相等则查找成功；
 * 否则，调整查找范围，若中间那个元素的值小于待查值，则在表的后一半中查找；
 * 若中间那个元素的值大于待查值，则在表的前一半中查找；如此循环，每次只与一半中的一个元素比较，
 * 可使查找效率大大提高。
 */
public class binaryFind {
    public static int binaryFind(int a[],int num){

        int low, mid, high;

        low = 0;//low是第一个数组元素的下标
        high = a.length - 1;//high是最后一个数组元素的下标
        mid = (low + high) / 2;//mid是中间那个数组元素的下标

        while (low <= high){

            if (num == a[mid]){
                return  mid;
            }else if (num > a[mid]){
                low = mid + 1;//要找的数可能在数组的后半部分中
                mid = (low + high) / 2;
            }else{
                high = mid - 1;//要找的数可能在数组的前半部分中
                mid = (low + high) / 2;
            }
        }


        //mid是数组元素下标，若为-1则表示不存在要查的元素
        if (mid != ((low + high) / 2)) {
            return mid;
        } else {
            return -1;
        }

    }


}
