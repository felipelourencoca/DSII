
public class Main {
	
	
	public static void main(String[] args) {
		Personagem p = new Vilao(10,5,"Chico Bento", Intencao.MAU);
		Personagem p2 = new Heroi(10,6,"Milhouse", Intencao.BEM);
		
		p2.atacar(p);		
		System.out.println(p);
		p2.atacar(p);		
		System.out.println(p);
	}

}
