

void insertionSort(int myarray[], int array_size) {
	printf("\n----------------------------------------------\n");
	printf("insertionSort");
	printf("\n----------------------------------------------");
	int c, d, t;
	for (c = 1 ; c <= array_size - 1; c++) {
	    d = c;

	    while ( d > 0 && myarray[d] < myarray[d-1]) {
	      t          = myarray[d];
	      myarray[d]   = myarray[d-1];
	      myarray[d-1] = t;

	      d--;
	    }
	  }
}
