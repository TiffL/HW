public class Driver{
    public static void main(String[] args){
	whileLoops n = new whileLoops();

	System.out.println("\n~~~frontTimes Tests:~~~");
	System.out.println("\nexpecting hihihi:");
	System.out.println(n.frontTimes("hi",3));
	System.out.println("\nexpecting helhel:");
	System.out.println(n.frontTimes("hello",2));

	System.out.println("\n~~~stringBits Tests:~~~");
	System.out.println("\nexpecting Maine:");
	System.out.println(n.stringBits("Maabicnde"));
	System.out.println("\nexpecting NewYork:");
	System.out.println(n.stringBits("NaebwcYdoerik"));
    
	System.out.println("\n~~~stringYak Tests:~~~");
	System.out.println("\nexpecting pack:");
	System.out.println(n.stringYak("yakpack"));
	System.out.println("\nexpecting hellopack");
	System.out.println(n.stringYak("helloyakpack"));

	System.out.println("\n~~~stringMatch Tests:~~~");
	System.out.println("\nexpecting 2");
	System.out.println(n.stringMatch("aacbbab","aadbbcd"));
	System.out.println("\nexpecting 0");
	System.out.println(n.stringMatch("weekend","sleep"));
    }
}
