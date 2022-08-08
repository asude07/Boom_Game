import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		Player p1 = new Player();
		
		System.out.println("Which direction to move?");
		String movement = key.next();
		
		while (!p1.dead) {
			
			p1.move(movement);
			
			if (p1.x==5 && p1.y==5) {
				System.out.println("You finished the game with " +p1.starPoint+ " points");
				break;
			}
			if(!p1.dead)
			movement = key.next();
			
		}
		
		
	}

}
