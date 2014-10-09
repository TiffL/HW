public class Mage extends Basechar{
    private int mana;
    private String name;

    public Mage(){
	this.name = "Hedwig";
    }

    public Mage(String name){
	this.name = name;
    }

    public Mage(String name, int mana){
	this.name = name;
	this.mana = mana;
    }

    public String getName(){
	return name;
    }

    public int getMana(){
	return mana;
    }
}
