package cn.snake;

import java.awt.*;

public class robot_mouseInfo{
	public String robot_mouseInfo(){
		PointerInfo pinfo = MouseInfo.getPointerInfo();
		Point p = pinfo.getLocation();
		double mx = p.getX();
		double my = p.getY();
		String location = mx + "\t" + my;
		return location;
	}
}