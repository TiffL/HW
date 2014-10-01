public class Driver{
    public static void main(String[] args){
	Shapes s = new Shapes();

	System.out.println("~~~Box Tests:~~~\n");
	System.out.println(s.box(5,4));
	System.out.println(s.box(4,5));
	
	System.out.println("~~~Tri1 Tests:~~~\n");
	System.out.println(s.tri1(4));
	System.out.println(s.tri1(3));

	System.out.println("~~~Tri2 Tests:~~~\n");
	System.out.println(s.tri2(4));
	System.out.println(s.tri2(3));
    }
}
