public class Main {
	public static void main(String[] args) {
		Character c1 = new hero(75, 10, "Megazord", intention.EVIL);
		Character c2 = new villain(100, 20, "Lord Zedd", Intencao.GOOD);
		
		c1.attack(c2);		
		System.out.println(c1);
		c2.attack(c1);		
		System.out.println(c2);
	}
}
