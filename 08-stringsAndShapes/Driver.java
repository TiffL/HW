public class Driver{
    public static void main(String []args) {
        StringsAndShapes s = new StringsAndShapes();

	System.out.println("\n~~~Frame Tests:~~~\n");
        System.out.println(s.frame(5,4));
	System.out.println(s.frame(4,4));

	System.out.println("\n~~~StringSplosion Tests:~~~\n");
	System.out.println("expecting AAuAutAutuAutumAutumn:");
        System.out.println(s.stringSplosion("Autumn"));
	System.out.println("\nexpecting PPuPumPumpPumpkPumpkiPumpkinPumpkins:");
	System.out.println(s.stringSplosion("Pumpkins"));

	System.out.println("\n~~~StringX Tests:~~~\n");
	System.out.println("expecting xNewYorkx:");
        System.out.println(s.stringX("xxNewxYorkxx"));
	System.out.println("\nexpecting xBakedApplesx:");
	System.out.println(s.stringX("xxxBakxedxxxAppxlesxxx"));
	System.out.println("\nexpecting Blueberry Soda:");
	System.out.println(s.stringX("Bluexberryx xSoda"));
    }
} 
