public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame () {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRigth = false;
		
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("ß çàãàäûâàþ ÷èñëî îò 0 äî 9...");
		
		while(true) {
			System.out.println("×èñëî, êîòîðîå íóæíî óãàäàòü, - " + targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("Ïåðâûé èãðîê äóìàåò, ÷òî ýòî " + guessp1);
			guessp2 = p2.number;
			System.out.println("Âòîðîé èãðîê äóìàåò, ÷òî ýòî " + guessp1);
			guessp3 = p3.number;
			System.out.println("Òðåòèé èãðîê äóìàåò, ÷òî ýòî " + guessp1);
			
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}	
			
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("Ó íàñ åñòü ïîáåäèòåëü!");
				System.out.println("Ïåðâûé èãðîê óãàäàë?" + p1isRight);
				System.out.println("Âòîðîé èãðîê óãàäàë?" + p2isRight);
				System.out.println("Òðåòèé èãðîê óãàäàë?" + p3isRight);
				System.out.println("Êîíåö èãðû");
				break;
				} else {
					System.out.println("Èãðîêè äîëæíû ïîïðîáîâàòü åù¸ ðàç.");
				}
			}
		}
	}

public class Player {
	int number = 0;
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("Äóìàþ, ýòî ÷èñëî " + number);
		}
	}

public class GameLauncher  {
	public static void main (String[] args) {
		GuessGame game = new GuessGame();
		game.startGame();
		}
	}
