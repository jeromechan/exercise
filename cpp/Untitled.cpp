#include<iostream>
using namespace std;

/**
 * 用模板的方式计算数组长度
 * @param array 待计算的数组
 */
template <class T>
int getArrayLen(T& array)
{
	return (sizeof(array) / sizeof(array[0]));
}

/**
 * 将insertDigit插入到src指定位置上
 * @param src原始数组
 * @param sizeOfSrc 原始数组src长度
 * @param insertDigit 待插入数字
 * @return point of array
 */
int* calculateSortedArray(int* src, int sizeOfSrc, int insertDigit) {	
	    // 需要sizeOfSrc - 2，因为需要腾出一个空余位置来做循环
		for(int i = sizeOfSrc - 2; i >= 0; i--){
			if(insertDigit > src[i]) {
				src[1+i] = src[i];
			} else {
				src[1+i] = insertDigit;
				break;
			}
			
			if(i == 0) {
				src[0] = insertDigit;
			}
		}
		return src;
}

int main(void){
	int a[10] = {9, 7, 5, 3, 2};
	int num = 88;
	
	/**
	 * 方法1：直接在main函数体里写
	 */
//	for(int i = 4; i >= 0; i--){
//		if(num > a[i]) {
//			a[1+i] = a[i];
//		} else {
//			a[1+i] = num;
//			break;
//		}
//		
//		if(i == 0) {
//			a[0] = num;
//		}
//	}

    /**
     * 方法2：抽象成独立方法
     */
	calculateSortedArray(a, getArrayLen(a), num);
	
	/**
	 * 循环打印数值
	 */
	for(int i = 0; i < 10; i++) {
		if (0 < i) {
			cout << ',';
		}
		cout << a[i];
	}
}