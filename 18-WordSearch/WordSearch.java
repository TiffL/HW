public class WordSearch {

    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    public WordSearch() {
	this(20,40);
    }
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    public void addWordH(String w, int row, int col){
	int c = col;
	boolean possibleLoc = true;
	if ((w.length() + col <= board[0].length)&&(col >= 0)&&
	    (row >= 0 && row < board.length)){

	    for (int i = 0; i < w.length(); i++){
		if ((board[row][i+col] != '.')&&
		    (board[row][i+col] != w.charAt(i))){
		    possibleLoc = false;
		    break;
		}
	    }

	    if (possibleLoc){
		for (int i=0; i < w.length();i++){
		    board[row][c] = w.charAt(i);
		    c++;
		}
	    }
	    else {
		System.out.println("illegal overlap");
	    }
	}
	else{
	    if ((w.length()+col > board[0].length)||(col<0)){
		System.out.println("illegal column");
	    }
	    else{
		System.out.println("illegal row");
	    }
	}
    }

    public void addWordHBackwards(String w, int row, int col){
	String backwards = "";
	for (int i = w.length()-1; i >= 0; i--){
	    backwards += w.charAt(i);
	}
        addWordH(backwards, row, col);
    }

    public void addWordV(String w, int row, int col){
	int r = row;
	boolean possibleLoc = true;
	if ((w.length() + row <= board.length && row >= 0)&&
	    (col >= 0 && col < board.length)){
	    for (int i = 0; i < w.length(); i++){
		if ((board[i+row][col] != '.')&&
		    (board[i+row][col] != w.charAt(i))){
		    possibleLoc = false;
		    break;
		}
	    }
	    if (possibleLoc){
		for (int i=0; i < w.length();i++){
		    board[r][col] = w.charAt(i);
		    r++;
		}
	    }
	    else {
		System.out.println("illegal overlap");
	    }
	}
	else{
	    if ((w.length()+col > board[0].length)||(col<0)){
		System.out.println("illegal column");
	    }
	    else{
		System.out.println("illegal row");
	    }
	}
    }

    public void addWordVBackwards(String w, int row, int col){
	String backwards = "";
	for (int i = w.length()-1; i >= 0; i--){
	    backwards += w.charAt(i);
	}
	addWordV(backwards, row, col);
    }

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	//System.out.println(w);

	//~~~~Tests for Horizontal~~~~
	System.out.println("1");
	w.addWordH("hello",3,15); // 1. should work
	System.out.println(w);

	System.out.println("2");
	w.addWordH("look",3,14); // 2. test illegal overlap
	System.out.println(w);

	System.out.println("3");
        w.addWordH("look",3,18); // 3. test legal overlap
	System.out.println(w);

	System.out.println("4");
        w.addWordH("look",-3,20); // 4. test illegal row
	System.out.println(w);

	System.out.println("5");
	w.addWordH("look",3,55); // 5. test illegal col
	System.out.println(w);

	System.out.println("6");
	w.addWordHBackwards("hola",7,10); // 6. test backwards
	System.out.println(w);

	//~~~~Tests for Vertical~~~~
	System.out.println("1");
	w.addWordV("hello",3,15); // 1. should work
	System.out.println(w);
	System.out.println("2");
	w.addWordV("look",4,15); // 2. test illegal overlap
	System.out.println(w);
	System.out.println("3");
	w.addWordV("look",6,15); // 3. test legal overlap
	System.out.println(w);
	System.out.println("4");
	w.addWordV("look",-3,20); // 4. test illegal row
	System.out.println(w);
	System.out.println("5");
	w.addWordV("look",3,55); // 5. test illegal col
	System.out.println(w);
	System.out.println("6");
	w.addWordVBackwards("hola",7,10); // 6. test backwards
	System.out.println(w);
    }
}
