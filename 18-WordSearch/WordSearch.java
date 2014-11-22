import java.util.*;
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
		throw new IllegalArgumentException();
		//System.out.println("illegal overlap");
	    }
	}
	else{
	    throw new IndexOutOfBoundsException();
	    /*
	    if ((w.length()+col > board[0].length)||(col<0)){
		System.out.println("illegal column");
	    }
	    else{
		System.out.println("illegal row");
	    }
	    */
	}
    }

    public void addWordHB(String w, int row, int col){
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
	    (col >= 0 && col < board[0].length)){
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
		throw new IllegalArgumentException();
		//System.out.println("illegal overlap");
	    }

	}
	else{
	    throw new IndexOutOfBoundsException();
	    /*
	    if ((w.length()+col > board[0].length)||(col<0)){
		System.out.println("illegal column");
	    }
	    else{
		System.out.println("illegal row");
	    }
	    */
	}
    }

    public void addWordVB(String w, int row, int col){
	String backwards = "";
	for (int i = w.length()-1; i >= 0; i--){
	    backwards += w.charAt(i);
	}
	addWordV(backwards, row, col);
    }

    public void addWordRD(String w, int row, int col){
	int r = row;
	int c = col;
	boolean possibleLoc = true;
	if ((col >= 0 && col + w.length() <= board[0].length)&&
	    (row >= 0 && row + w.length() <= board.length)){
	    for (int i = 0; i < w.length(); i++){
		if ((board[i+row][i+col] != '.')&&
		    (board[i+row][i+col] != w.charAt(i))){
		    possibleLoc = false;
		    break;
		}
	    }
	    if (possibleLoc){
		for (int i=0; i < w.length();i++){
		    board[r][c] = w.charAt(i);
		    r++;
		    c++;
		}
	    }

	    else {
		throw new IllegalArgumentException();
		//System.out.println("illegal overlap");
	    }

	}
	else{
	    throw new IndexOutOfBoundsException();
	    /*
	    if ((w.length()+col > board[0].length)||(col<0)){
		System.out.println("illegal column");
	    }
	    else{
		System.out.println("illegal row");
	    }
	    */
	}
    }

    public void addWordRDB(String w, int row, int col){
	String backwards = "";
	for (int i = w.length()-1; i >= 0; i--){
	    backwards += w.charAt(i);
	}
	addWordRD(backwards, row, col);
    }

    public void addWordLD(String w, int row, int col){
	int r = row;
	int c = col;
	boolean possibleLoc = true;
	if (((col+1) - w.length() >= 0 && col < board[0].length)&&
	    (row >= 0 && row + w.length() <= board.length)){
	    for (int i = 0; i < w.length(); i++){
		if ((board[i+row][col-i] != '.')&&
		    (board[i+row][col-i] != w.charAt(i))){
		    possibleLoc = false;
		    break;
		}
	    }
	    if (possibleLoc){
		for (int i=0; i < w.length();i++){
		    board[r][c] = w.charAt(i);
		    r++;
		    c--;
		}
	    }

	    else {
		throw new IllegalArgumentException();
		//System.out.println("illegal overlap");
	    }

	}
	else{
	    throw new IndexOutOfBoundsException();
	    /*
	    if ((w.length()+col > board[0].length)||(col<0)){
		System.out.println("illegal column");
	    }
	    else{
		System.out.println("illegal row");
	    }
	    */
	}
    }

    public void addWordLDB(String w, int row, int col){
	String backwards = "";
	for (int i = w.length()-1; i >= 0; i--){
	    backwards += w.charAt(i);
	}
	addWordLD(backwards, row, col);
    }
 
    public boolean addWord(String w){
	Random r = new Random();
	int d = r.nextInt(8);
	int x = r.nextInt(board[0].length);
	int y = r.nextInt(board.length);

	try {
	    if (d == 0) {addWordH(w,x,y);}
	    else if (d == 1) {addWordHB(w,x,y);}
	    else if (d == 2) {addWordV(w,x,y);}
	    else if (d == 3) {addWordVB(w,x,y);}
	    else if (d == 4) {addWordRD(w,x,y);}
	    else if (d == 5) {addWordRDB(w,x,y);}
	    else if (d == 6) {addWordLD(w,x,y);}
	    else {addWordLDB(w,x,y);}
	    return true;
	}
	catch (IllegalArgumentException e){
	    return false;
	}
	catch (IndexOutOfBoundsException e){
	    return false;
	}
    }

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	//System.out.println(w);

	/*
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
	w.addWordHB("hola",7,10); // 6. test backwards
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
	w.addWordVB("hola",7,10); // 6. test backwards
	System.out.println(w);

	//~~~~Tests for Diagonal (Right Down)~~~~
	System.out.println("1");
	w.addWordRD("hello",3,15); // 1. should work
	System.out.println(w);
	System.out.println("2");
	w.addWordRD("look",5,17); // 2. test illegal overlap
	System.out.println(w);
	System.out.println("3");
	w.addWordRD("look",6,18); // 3. test legal overlap
	System.out.println(w);
	System.out.println("4");
	w.addWordRD("look",-3,20); // 4. test illegal row
	System.out.println(w);
	System.out.println("5");
	w.addWordRD("look",3,55); // 5. test illegal col
	System.out.println(w);
	System.out.println("6");
	w.addWordRDB("hola",7,10); // 6. test backwards
	System.out.println(w);

	//~~~~Tests for Diagonal (Left Down)~~~~
	System.out.println("1");
	w.addWordLD("hello",3,15); // 1. should work
	System.out.println(w);
	System.out.println("2");
	w.addWordLD("look",4,14); // 2. test illegal overlap
	System.out.println(w);
	System.out.println("3");
	w.addWordLD("look",6,12); // 3. test legal overlap
	System.out.println(w);
	System.out.println("4");
	w.addWordLD("look",-3,20); // 4. test illegal row
	System.out.println(w);
	System.out.println("5");
	w.addWordLD("look",3,55); // 5. test illegal col
	System.out.println(w);
	System.out.println("6");
	w.addWordLDB("hola",10,39); // 6. test backwards
	System.out.println(w);

	*/

	//~~~~Test for AddWord~~~~
	System.out.println(w.addWord("word"));
	System.out.println(w.addWord("hello"));
	System.out.println(w);
    }
}
