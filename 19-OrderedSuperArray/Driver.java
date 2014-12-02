public class Driver{
    public static void main(String[] args){
	OrderedSuperArray s = new OrderedSuperArray(3);
	System.out.println(s.toString());
	System.out.println(s.add("Hola"));
	System.out.println(s.toString()+"\n");
	System.out.println(s.add("Bye"));
	System.out.println(s.toString()+"\n");
	System.out.println(s.add("Hi"));
	System.out.println(s.toString()+"\n");
	System.out.println(s.add("Last"));
	System.out.println(s.toString()+"\n");
	System.out.println(s.set(1,"OK"));
	System.out.println(s.toString());
    }
}
