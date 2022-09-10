public class PrimeNumbers {
	int[] prime = new int[50000];
	int countDiv = 0;
	int k = 0;
	for(int i = 100000; i > 0; i--){
		if (countDiv <= 2){
			prime[k] = i;
			k++;
		}
		for(int j = i; j > 0; j--){
			if(i % j == 0){
				countDiv++;
			}
			if(countDiv > 2){
				break;
			}
		}
	}
