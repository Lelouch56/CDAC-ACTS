package p1;

import java.util.*;
public class Point2D{
	private float x;
	private float y;
	
	public Point2D(float a, float b){
		x=a;
		y=b;
	}
	public void setter(float a,float b){
		//System.out.println("Enter value of coordinate x :");
		x=a;
		//System.out.println("Enter value of coordinate y :");
		y=b;
	}
	public void show(){
		System.out.println(" value of coordinate x :"+x);
		System.out.println(" value of coordinate y :"+y);
		
	}
	
	public int isEqual(Point2D a ){
		if ((a.x==x)&&(a.y==y)){
			return 1;
		}
		
		return 0;
	}
	
	public double distance(Point2D a){
		
		double h=(Math.sqrt(((a.x-x)*(a.x-x))+((a.y-y)*(a.y-y))));
		return h;
	}
}
