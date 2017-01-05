import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class HouseCreator {
boolean alive;
Robot johnny5;
int x;
int y;
int widthBetweenHouses = 30;
double building1Height = 100;
int building2Height = 130;


public HouseCreator(){
	alive = true;
	johnny5 = new Robot();
}
void moveToCorner(){
	johnny5.moveTo(100, 700);
}
void draw1FlatHouseWithGrass(){
	johnny5.penDown();
	johnny5.setSpeed(10);
	johnny5.setPenWidth(4);
	building1Height = Math.random()*170 + 50;
	johnny5.setPenColor(180,180,180);
	johnny5.move((int)building1Height);
	johnny5.turn(90);
	johnny5.setPenColor(180,180,180);
	johnny5.move(30);
	johnny5.turn(90);
	johnny5.setPenColor(150,150,150);
	johnny5.move((int)building1Height);
	johnny5.setPenColor(Color.green);
	johnny5.turn(-90);
	johnny5.move(widthBetweenHouses);
	johnny5.turn(-90);
	
}
void draw1PointedHouseWithGrass(){
	johnny5.turn(-90);
	johnny5.move(building2Height);
	johnny5.turn(45);
	johnny5.setPenColor(200, 50, 100);
	johnny5.move(30);
	johnny5.turn(90);
	johnny5.move(30);
	johnny5.turn(45);
	johnny5.setPenColor(2, 5, 100);
	johnny5.move(building2Height);
	johnny5.setPenColor(Color.green);
	johnny5.turn(-90);
	johnny5.move(widthBetweenHouses);
	johnny5.turn(-90);
}
}
