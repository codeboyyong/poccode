/*
 * sort.h
 *
 *  Created on: Dec 28, 2013
 *      Author: codeboyyong
 */

#ifndef SORT_H_
#define SORT_H_



#endif /* SORT_H_ */

#include <stdio.h>
#include <stdlib.h>

int myarray[]={1,3,6,7,1,2,6,7,8,9,5,3,2,5,4};
int myarray_size = 15;


void bubbleSort(int a[], int array_size);
void insertionSort(int a[], int array_size) ;
void selectionSort(int array[], int array_size) ;

void printArray(int myarray[],int myarray_size);
