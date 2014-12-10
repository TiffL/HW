public class Driver{
    public static void main(String[] args){
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
    }
}
