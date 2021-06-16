package game;

public class RoomManager {
	
	Room startingRoom;
	Room[] rooms;
	
	public void init() {
		Room foyer = new Room(
				"The Foyer",
				"a small foyer",
				"The small entryway of a neo-colonial house. A dining room is to south,"
				+ "a large table can be seen." + "\n"
						+ "The hardwood floor leads west into doorway");
		this.rooms[0] = foyer;
		this.startingRoom = foyer;
	}

}
