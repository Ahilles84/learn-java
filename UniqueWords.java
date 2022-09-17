public class UniqueWords {
	public static int uniqueWordsCounter (String sourceText) {
		String aligned = sourceText.toLowerCase;
		String[] words = aligned.split("[.,?!]? +");
		int uniqueCount = 0;
		for(int i = 0; i < words.length; i++){
			int hitCount = 0;
			for(int j = 0; j < words.length; j++){
				if(words.compareTo(words[i], words[j]){
					hitCount++;
				}
			}
			if(hitCount == 1){
				uniqueCount++;
			}
		}
	}
	public static void main (String[] args){
		String text = "Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text.";
		System.out.println(uniqueWordsCounter(text));
	}
}
		