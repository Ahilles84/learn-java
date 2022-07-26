

if (array.lenght >= 2 && array[] != null) {
boolean [] row = new boolean [array.length];
row[0] = false;
row[1] = false;
int i = 2;	
	for (int j = 2; j < array.length; j++) {
		boolean val = false;
		if (array[j] == array[j-1] + array[j-2]) {
			val = true;		
		}	
		row[i] = val;
		i++;
		}
	return row;
	}	
}


***Local maxima remove***

if (array.length >= 1 && array[] != null) {

int [] newArray = Arrays.copyOf(array, array.length);

for (int i = 0; i < newArray.length; i++) {
	if (newArray[i] < newArray [i-1] && newArray[i] < newArray [i+1]) {
		newArray[i] = newArray[i];
	} else {
		newArray[i] = null; 
		}
	}
return newArray;
}

***Cycle Swap***

int[] array = {1, 2, 3, 4, 5};
int[] shift = new shift[array.length];
System.arraycopy(array, 0, shift, 1, array.length - 1);
shift[0] = array[array.length-1];