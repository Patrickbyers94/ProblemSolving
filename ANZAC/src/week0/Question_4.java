package week0;
import java.util.*;
import java.io.*;

public class Question_4 {
 
int N = 0;
int M = 0;
List<place> places = new ArrayList<place>();

}

class place{
	private int floor;
	private int xCoord;
	private int yCoord;
	public place(int f,int x,int y){
		this.setFloor(f);
		this.setxCoord(x);
		this.setyCoord(y);
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getxCoord() {
		return xCoord;
	}
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}
	public int getyCoord() {
		return yCoord;
	}
	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}
	
	
}