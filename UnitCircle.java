
public class UnitCircle implements Comparable<UnitCircle>{
	int radius = 1;
	public UnitCircle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius(){
	    return radius;
	}

	public String toString(){
	    return "UnitCircle[r=" + radius + "]";
	}
	@Override
	public int compareTo(UnitCircle o) {
		if (radius == o.getRadius()) {return 0;}
		else if (radius > o.getRadius()) {return 1;}
		else {return -1;}
	}
}