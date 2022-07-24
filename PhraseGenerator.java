public class PhraseOMatic {
	public static void main(String[] args) {
		String [] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный выигрыш", "фронтэнд", "на основе вэб-технологий", "проникающий", "умный", "шесть сигм", "метод критического пути", "динамичный"};
		String [] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированый", "центральный", "распределенный", "кластеризованный", "фирменный", "нестандартный ум", "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на", "общий", "совместный", "ускоренный"};
		String [] wordListThree = {"процесс", "пункт разгрузки", "выход из положени€", "тип структуры", "промежуточный результат", "валовый доход", "талант", "принцип", портал", "уровень завоеванного внимани€", "пункт следовани€", "период времени"};
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		System.out.println("¬се, что нам нужно, - это " + phrase);
		}
	}