public class Driver{
    public static void main(String[] args){
	Sarray s = new Sarray();
	s.set(0,1);
	s.set(1,2);
	s.set(2,3);
	s.set(3,4);
	s.set(4,5);
	System.out.println("\nOriginal s after setting values: ");
	System.out.println(s.toString());

	System.out.println("\n~~~Tests for Add~~~");
	s.add(1);
	System.out.println("\nexpecting 1 at index 5: \n" + s.toString());
	s.add(3);
	s.add(5);
	System.out.println("\nexpecting 3 at index 6 and 5 at index 7:");
	System.out.println(s.toString());

  	System.out.println("\n~~~Test for Size~~~");
	System.out.println("\nexpecting 8: " + s.size());

	System.out.println("\n~~~Tests for Add at Index~~~");
	s.add(4,4);
	System.out.println("\nexpecting 4 at index 4 with rest moved down: ");
	System.out.println(s.toString());
	s.add(9,5);
	System.out.println("\nexpecting 5 at index 9: \n" + s.toString());
	s.add(9,2);
	System.out.println("\nexpecting 2 at index 9 with rest moved down: ");
	System.out.println(s.toString());

	System.out.println("\n~~~One More Test for Add~~~");
	System.out.println(s.add(3));
	System.out.println("\nexpecting 3 added at end: \n" + s.toString());

	System.out.println("\n~~~Test for Get~~~");
	System.out.println("\nexpecting 3: " + s.get(2)); 

	try{
	    System.out.println(s.get(1000));
	}
	catch(IndexOutOfBoundsException e){
	    System.out.println("Oops: " + e);
	}
	
	System.out.println("\n~~~Test for Remove~~~");
	System.out.println("\nexpecting number at index 10 removed and others moved up: ");
	System.out.println("\n" + s.remove(10));
	System.out.println(s.toString());
	System.out.println("\n" + s.remove(10));
	System.out.println(s.toString());
    }
}
