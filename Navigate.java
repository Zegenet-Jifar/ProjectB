
import java.util.Scanner;

public class Navigate {
	
	public String scanInput() {
		Scanner input = new Scanner(System.in);
		String play = input.next();
		return play;
	}
	
	
	public static void main(String[] args) {

	System.out.println("Greetings player!\n   You have two options:\n  Please type 'tour' or 'quit'\n");
	//boolean tour = true;
	boolean quit = false;
	boolean player = true;
	boolean tour = false;
	boolean ex = true;
	
		while (quit == false) {
	Navigate b = new Navigate();
	String x = b.scanInput();
	
			
	switch (x) {
	
	case "tour":{
		
		livingRoom();
		tour = true;
		player = true;
		ex = true;
		break;
	}
	
	case "north": {
		if((player == false)&&(tour == true)&&(ex==true)) {
			System.out.println("There is no room to the north. Please type 'west' to go to the living room\n or 'south' to go to the restroom.");
		}
		else if ((player == false)&&(tour == true)&&(ex==false)) {
		kitchen();
		player = false;
		ex = true;
		}
		else if((player == true)&&(tour == true)&&(ex==false)){
			System.out.println("There is no room to the north. Please type 'south' to go to the living room.");
		}
		else if((player == true)&&(tour == true)&&(ex==true)){
			bedRoom();
			player=true;
			ex=false;
		}else
		{System.out.println("Please type 'tour' to start/continue the tour.");}
		break;
	}
	
	case "east": {
		if((player == false)&&(tour == true)&&(ex==false)) {
			System.out.println("There is no room to the east. Please type 'north' to go to the kitchen.");
		}
		else if ((player == true)&&(tour == true)&&(ex==true)) {
		kitchen();
		player = false;
		ex = true;
		}
		else if((player == false)&&(tour == true)&&(ex==true)){
			System.out.println("There is no room to the east. Please type 'south' to go to the restroom\n or 'west' to go to the living room.");
		}
		else if((player == true)&&(tour == true)&&(ex==false)){
			System.out.println("There is no room to the east. Please type 'south' to go to the living room.");
			
		}else
		{System.out.println("Please type 'tour' to start/continue the tour.");}
		break;
	}
	
	case "south": {
		if((player == false)&&(tour == true)&&(ex==false)) {
			System.out.println("There is no room to the south. Please type 'north' to go to the kitchen.");
		}
		else if ((player == false)&&(tour == true)&&(ex==true)) {
		restRoom();
		player = false;
		ex = false;
		}
		else if((player == true)&&(tour == true)&&(ex==true)){
			System.out.println("There is no room to the south. Please type 'north' to go to the bed room\n or 'east' to go to the kitchen.");
		}
		else if((player == true)&&(tour == true)&&(ex==false)){
			livingRoom();
			player=true;
			ex=true;
		}else
		{System.out.println("Please type 'tour' to start/continue the tour.");}
		break;
	}
	
	case "west":{
		if((player == false)&&(tour == true)&&(ex==false)) {
			System.out.println("There is no room to the west. Please type 'north' to go to the kitchen.");
		}
		else if ((player == false)&&(tour == true)&&(ex==true)) {
		livingRoom();
		player = true;
		ex = true;
		}
		else if((player == true)&&(tour == true)&&(ex==true)){
			System.out.println("There is no room to the west. Please type 'north' to go to the bedroom\n or 'east' to go to the kitchen.");
		}
		else if((player == true)&&(tour == true)&&(ex==false)){
			System.out.println("There is no room to the west. Please type 'south' to go to the living room.");
			
		}else
		{System.out.println("Please type 'tour' to start/continue the tour.");}
		break;
	}
	case "quit":{
		later();
		quit = true;
		break;
	}
	default: System.out.println("Invalid entry. Please type entry as specified.");
	}
	}
		}
	
	
	public static void livingRoom() {
		System.out.println("You are currently in the living room space. It has not been furnished yet, so it is empty.\n To the east is the kitchen\n and to the north is the bedroom. Type 'east' or 'north'");
		
	}
	
	public static void later() {
		System.out.println("Good Bye!");		
	}
	
	public static void kitchen() {
		System.out.println("You are currently in the kitchen space. There is a fridge, a stove, and a sink.\n You can go to the living room due west\n or to the restroom due south Type 'west' or 'south'");		
	}
	
	public static void restRoom() {
		System.out.println("You are currently in the restroom.\n There is one toilet, a fabilicious vanity mirror, a bath, and a faucet.\n You can only exit towards the kitchen. \n Please type 'north' to exit to the kitchen.");		
	}
	
	public static void bedRoom() {
		System.out.println("You are currently in the bedroom.\n There is one king size bed and a Yasss! dresser. This room is very clean and smells fresh lol.\n You can only exit toward Please type 'south' to exit to the living room.");		
	}
}
