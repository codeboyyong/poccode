
void selectionSort(int array[], int array_size) {
	printf("\n----------------------------------------------\n");
	printf("selectionSort");
	printf("\n----------------------------------------------");
	int c, d, swap,position;
	for ( c = 0 ; c < ( array_size - 1 ) ; c++ )
	   {
	      position = c;

	      for ( d = c + 1 ; d < array_size ; d++ )
	      {
	         if ( array[position] > array[d] )
	            position = d;
	      }
	      if ( position != c )
	      {
	         swap = array[c];
	         array[c] = array[position];
	         array[position] = swap;
	      }
	   }
}



