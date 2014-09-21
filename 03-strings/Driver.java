public class Driver {
    public static void main(String[] args){
        String s = "harry potter";
        int space = s.indexOf(" ");
	String first = s.substring(0,space);
	String last = s.substring(space + 1);

	//System.out.println(first);
	//System.out.println(last);
    }
}
