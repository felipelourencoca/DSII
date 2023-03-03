public class main {
	public static void main(String[] args) {
		character c = new villain(10, 5, "Megazord", intention.EVIL);
		character c2 = new hero(10, 6, "Lord Zedd", Intencao.GOOD);
		
		c2.attack(c);		
		System.out.println(c);
		c2.atacar(c);		
		System.out.println(c);
	}
}
