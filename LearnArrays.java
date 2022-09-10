public class LearnArrays {
	public static void main (String[] args) {
	int[] basicArr = new int[200000];
	int element = -100001;
	for (int i = 0; i < basicArr.length; i++){
		element ++
		if (element == 0) {   
			continue;
		}
		basicArr[i] = element;
		}
	System.out.println(Arrays.toString(basicArr));
	
	int[] negativeArr = new negativeArr[100000]; 
	negativeArr = Arrays.copyOf(basicArr, basicArr.length / 2);
	System.out.println(Arrays.toString(negativeArr));
	
	int[] positiveArr = new positiveArr[100000];
	System.arraycopy(basicArr, 100000, positiveArr, 0, basicArr.length / 2);
	System.out.println(Arrays.toString(positiveArr));
	
	}
			
}