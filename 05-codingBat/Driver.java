public class Driver {
    public static void main(String[] args){
	StringStuff s = new StringStuff();

	System.out.println("\n~~~nonStart Tests:~~~");
	System.out.println("\nexpecting iello:");
	System.out.println(s.nonStart("Hi","Hello"));
	System.out.println("\nexpecting ey:");
	System.out.println(s.nonStart("H","Hey"));

	System.out.println("\n~~~makeAbba Tests:~~~");
	System.out.println("\nexpecting HiByeByeHi:");
	System.out.println(s.makeAbba("Hi","Bye"));
	System.out.println("\nexpecting HeyHiHiHey:");
	System.out.println(s.makeAbba("Hey","Hi"));
    
	System.out.println("\n~~~diff21 Tests:~~~");
	System.out.println("\nexpecting 0:");
	System.out.println(s.diff21(21));
	System.out.println("\nexpecting 38:");
	System.out.println(s.diff21(40));

    }
}
