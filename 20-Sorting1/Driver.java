public class Driver{
    public static void main(String[] args){
        SuperArray s = new SuperArray(8);

	s.add("holidays");
	s.add("hi");
	s.add("winter");
	s.add("december");

	s.add("apple");
	s.add("chocolate");
	s.add("penguin");
	s.add("mountain");
	
	System.out.println("Original: " + s.toString()+ "\n");

	s.isort();

	System.out.println("Sorted: " + s.toString()+ "\n");

    }
}
