
public class Player {
	
	public int score = 0;
	public int x = 1;
	public int y = 1;
	public boolean dead = false;
	public int starPoint = 0;
	
	public void move(String direction) {
		
		if (direction.equals("right")) {
			x++;
			if ((x==2 && y==2) || (x==1 && y==5) || (x==4 && y==3)) {
				System.out.println("You are on ["+x+","+y+"]");
				System.out.println("You found a star!");
				starPoint += 100;
			}
			else if ((x==2 && y==3) || (x==2 && y==5) || (x==5 && y==4)) {
				System.out.println("You are on ["+x+","+y+"]");
				System.out.println("You stepped on a bomb!");
				dead = true;
			}
			else if (x>5) {
				dead = true;
			}
			else {
				System.out.println("You are on ["+x+","+y+"]");
			}
			
		}
		
		else if (direction.equals("left")) {
			x--;
			if ((x==2 && y==2) || (x==1 && y==5) || (x==4 && y==3)) {
				System.out.println("You are on ["+x+","+y+"]");
				System.out.println("You found a star!");
				starPoint += 100;
			}
			else if ((x==2 && y==3) || (x==2 && y==5) || (x==5 && y==4)) {
				System.out.println("You are on ["+x+","+y+"]");
				System.out.println("You stepped on a bomb!");
				dead = true;
			}
			else if (x<=0) {
				dead = true;
			}
			else {
				System.out.println("You are on ["+x+","+y+"]");
			}
			
		}
		
		else if (direction.equals("up")) {
			y--;
			if ((x==2 && y==2) || (x==1 && y==5) || (x==4 && y==3)) {
				System.out.println("You are on ["+x+","+y+"]");
				System.out.println("You found a star!");
				starPoint += 100;
			}
			else if ((x==2 && y==3) || (x==2 && y==5) || (x==5 && y==4)) {
				System.out.println("You are on ["+x+","+y+"]");
				System.out.println("You stepped on a bomb!");
				dead = true;
			}
			else if (y<=0) {
				dead = true;
			}
			else {
				System.out.println("You are on ["+x+","+y+"]");
			}
		}
		
		else if (direction.equals("down")) {
			y++;
			if ((x==2 && y==2) || (x==1 && y==5) || (x==4 && y==3)) {
				System.out.println("You are on ["+x+","+y+"]");
				System.out.println("You found a star!");
				starPoint += 100;
			}
			else if ((x==2 && y==3) || (x==2 && y==5) || (x==5 && y==4)) {
				System.out.println("You are on ["+x+","+y+"]");
				System.out.println("You stepped on a bomb!");
				dead = true;
			}
			else if (y>5) {
				dead = true;
			}
			else {
				System.out.println("You are on ["+x+","+y+"]");
			}
		}
		
		else {
			System.out.println("You are on ["+x+","+y+"]");
		}
		
		if (dead==true) {
			System.out.println("You died");
		}
	}
}
