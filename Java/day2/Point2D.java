import java.util.*;
class Point2D{
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
	
	public double calDis(Point2D a){
		
		double h=(Math.sqrt(((a.x-x)*(a.x-x))+((a.y-y)*(a.y-y))));
		return h;
	}
	
	
	
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Point2D p1=new Point2D(4.5f,6.5f);
		
		Point2D p2=new Point2D(5.5f,9.5f);
		p1.show();
		p2.show();
		int a=p1.isEqual(p2);
		System.out.println(a);
		
		System.out.println("Distance between p1 and p2 is "+p1.calDis(p2));
	}
}
