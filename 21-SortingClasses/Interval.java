import java.util.*;

public class Interval{
    private int low, high;

    public Interval(){
	Random r = new Random();
	int h = r.nextInt(100)+1;
	int l = r.nextInt(h);
        setup(l, h);
    }
    public Interval(int l, int h){
	setup(l, h);
    }
    public void setup(int l, int h){
	low = l;
	high = h;
    }
    public int compareTo(Interval other) {
	if (this.low < other.low) {
	    return -1;
	} 
	else if (this.low > other.low) {
	    return 1;
	} 
	else {
	    if (this.high < other.high) {
		return -1;
	    } else if (this.high > other.high) {
		return 1;
	    } else {
		return 0;
	    }
	}
    }	
    public String toString(){
	return "[" + low + ", " + high + "]";
    }
}
