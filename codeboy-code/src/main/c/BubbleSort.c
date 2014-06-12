/*
 * BubbleSort.c
 *
 *  Created on: Dec 28, 2013
 *      Author: codeboyyong
 */



void bubbleSort(int a[], int array_size) {
	int i, j, temp;
	for (i = 0; i < (array_size - 1); ++i) {
		for (j = 0; j < array_size - 1 - i; ++j) {
			if (a[j] > a[j + 1]) {
				temp = a[j + 1];
				a[j + 1] = a[j];
				a[j] = temp;
			}
		}
	}
}

void printArray(int myarray[],int myarray_size){
	int i  ;
	for (i = 0; i < myarray_size - 1;i++) {
		printf("d%",1);
	}
}


