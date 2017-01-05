
public class RobotDrawingHouses {
	public static void main(String[] args) {

		HouseCreator creator = new HouseCreator();
		creator.moveToCorner();
		for (int i = 0; i < 9; i++) {
			creator.draw1FlatHouseWithGrass();
		}
	}
}
