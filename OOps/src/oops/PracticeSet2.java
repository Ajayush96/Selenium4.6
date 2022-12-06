package oops;

class cylendra{
	private int r;
	private int h;
	private float a;
	
	public cylendra(int rad, int hei) {
		
		r=rad;
		h=hei;
		
	}
	
	public int getRadius() {return r;}
	public void setRadius(int radius) {r=radius;}
	
	public int getHeight() {return h;}
	public void setHeight(int height) {h=height;}
	
	public void area() {
		
		a = (float) (2 * Math.PI * r * (h+r));
		System.out.println(a);
		
	}
	public float volume() {
		
		return (float) (Math.PI * r * r * h);
	}
}
public class PracticeSet2 {

	public static void main(String[] args) {
		cylendra c = new cylendra(7,8);
//		c.setRadius(7);
//		c.setHeight(7);	
		
		c.area();
		System.out.println(c.volume());

	}

}
