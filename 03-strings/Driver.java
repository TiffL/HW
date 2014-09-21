public class Driver {
    public static void main(String[] args){
        String s = "harry potter";
        int spaceloc = s.indexOf(" ");
	String first = s.substring(0,spaceloc);
	String last = s.substring(spaceloc + 1);

	//System.out.println(first);
	//System.out.println(last);
    }
}
