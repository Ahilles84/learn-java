package lessons;

public class BeerSong {
	public static void main(String[] args) {
		int beerNum = 99;
		String word = "бутылок";
		while (beerNum >= 0) {
			if (beerNum%10 == 1) {
				word = "бутылка";
			}
			if (beerNum%10 == 2 || beerNum%10 == 3 || beerNum%10 == 4) {
				word = "бутылки";
			}
			if (beerNum%10 == 0) {
				word = "бутылок";
			}
			if (beerNum == 11 || beerNum == 12 || beerNum == 13 || beerNum == 14) {
				word = "бутылок";
			}
			System.out.println(beerNum + " " + word + " пива на столе");
			System.out.println(beerNum + " " + word + " пива.");
			System.out.println("Возьми одну.");
			System.out.println("Пусти по кругу.");
			beerNum = beerNum - 1;
			if (beerNum == 0) {
				System.out.println("Нет бутылок пива на столе");
			}
		}
	}
}
	
				
	
				
