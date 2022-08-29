package lessons;

public class PhraseGenerator {
	public static void main(String[] args) {
		String [] wordListOne = {"длинный", "жёлтый", "превосходящий", "конский", "переднеприводный", "долгосрочный", "кривой"};
		String [] wordListTwo = {"уполномоченный", "трудный", "кислый", "ориентированый", "черно-белый", "чопорный", "ускоренный", "хладнокровный"};
		String [] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "промежуточный результат", "валовый доход", "талант", "принцип", "портал", "уровень завоеванного внимания", "пункт следования", "период времени"};
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		System.out.println("Все, что нам нужно, - это " + phrase);
		}
	}