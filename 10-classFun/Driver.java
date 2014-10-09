public class Driver {
    public static void main(String[] args){
	Basechar c = new Basechar();
	Warrior w = new Warrior();

	Mage m1 = new Mage();
	System.out.println(m1.getName());
	
	Mage m2 = new Mage("Errol");
	System.out.println(m2.getName());

	Mage m3 = new Mage("Errol",300);
	System.out.println(m3.getName());
	System.out.println(m3.getMana());

    }
}
