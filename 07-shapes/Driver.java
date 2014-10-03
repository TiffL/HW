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

	System.out.println("~~~Tri3 Tests:~~~\n");
	System.out.println(s.tri3(4));
	System.out.println(s.tri3(3));

	System.out.println("~~~Diamond Tests:~~~\n");
	System.out.println(s.diamond(7));
	System.out.println(s.diamond(5));
	System.out.println(s.diamond(3));
	System.out.println(s.diamond(4));
	System.out.println(s.diamond(6));

	System.out.println("~~~Tri4 Tests:~~~\n");
	System.out.println(s.tri4(4));
	System.out.println(s.tri4(3));
    }
}
