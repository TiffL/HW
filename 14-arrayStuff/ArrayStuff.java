import java.util.*;

public class ArrayStuff {

    /*--------------------- Instance Variables --------------------*/
    private int[] a;
    Random r;

    /*--------------------- Constructors --------------------*/
    public ArrayStuff(int n){
	r = new Random();
	a = new int[n];
	for (int i=0; i<a.length;i++){
	    a[i] = 75+r.nextInt(76);
	}
    }

    public ArrayStuff(){
	this(100);
    }

    /*--------------------- Methods --------------------*/
    public String toString(){
	String s = "";
	for (int i = 0; i < a.length; i++) {
	    s = s + a[i]+", ";
	}
	return s;
    }

    public int find(int n){
	for (int i = 0; i < a.length; i++){
	    if (a[i] == n){
		return i;
	    }
	}
	return -1;
    }
    
    public int maxVal(){
        int greatest = 0;
	for (int i = 0; i < a.length; i++){
	    if (a[i] > greatest){
		greatest = a[i];
	    }
	}
	return greatest;
    }

    /*--------------------- Main --------------------*/
    public static void main(String[] args) {
	ArrayStuff s = new ArrayStuff();
	System.out.println(s);
	System.out.println(s.find(150));
	System.out.println(s.find(114));
	System.out.println(s.maxVal());
    }
}
