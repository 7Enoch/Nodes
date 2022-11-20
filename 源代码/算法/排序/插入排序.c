#include <stdio.h>
#include <stdlib.h>
int main()
{
    int arr[10] = {10, 4, 2, 6, 8, 1, 5, 9, 3, 11};
    //定义一个10个元素的数组
    int tmp;
    int i, j;
    //定义建值和循环值
    for (j = 1; j < 10; j++)
    {

        //将数组第二个数字赋给键值
        i = j;
        //为了获取键值前一个数组
        while (i - 1 >= 0 && arr[i - 1] > arr[i])
        {
            tmp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = tmp;
            i--;
        }
    }
    for (int k = 0; k < 10; k++)
    {
        printf("%d ", arr[k]);
    }

    return 0;
}