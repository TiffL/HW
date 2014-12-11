import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
    	ArrayList<Basechar> a1 = new ArrayList<Basechar>();
    	 
        Ninja e1 = new Ninja("Alien"); 
        Ninja e2 = new Ninja("Star"); 
        Ninja e3 = new Ninja("Fire"); 
        
        Cowboy e4 = new Cowboy("Teddy"); 
        Cowboy e5= new Cowboy("Jump"); 
        
    	a1.add(e1);
    	a1.add(e2);
    	a1.add(e3);
    	a1.add(e4);
    	a1.add(e5);

	System.out.println(a1);
        Collections.sort(a1);        
        System.out.println("Test Basechar arraylist: " + a1.toString());
        
        Ninja[] a2 = new Ninja[3];
        a2[0] = e1;
        a2[1] = e2;
        a2[2] = e3;
        
        Arrays.sort(a2);
        System.out.println("Test Ninja array: " + Arrays.toString(a2));

	/*
	Interval i1 = new Interval(5,50);
	Interval i2 = new Interval();
		
	System.out.println("Interval 1: " + i1);
	System.out.println("Interval 2: " + i2);
		
	System.out.println("Interval 1 compared to 2: " + i1.compareTo(i2));
	System.out.println("Interval 2 compared to 1: " + i2.compareTo(i1)+"\n");
		
	Interval i3 = new Interval(2,100);
	Interval i4 = new Interval(5,50);

	System.out.println("Interval 3: " + i3);
	System.out.println("Interval 4: " + i4);

	System.out.println("Interval 3 compared to 4: "+i3.compareTo(i4));
	System.out.println("Interval 4 compared to 3: "+i4.compareTo(i3)+"\n");
		
	Interval i5 = new Interval(5,100);
	Interval i6 = new Interval(5,150);

	System.out.println("Interval 5: " + i5);
	System.out.println("Interval 6: " + i6);

	System.out.println("Interval 5 compared to 6: "+i5.compareTo(i6));
	System.out.println("Interval 6 compared to 5: "+i6.compareTo(i5));
	*/
    }
}
