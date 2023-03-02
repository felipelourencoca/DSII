
public class Heroi extends Personagem {
		private Intencao intencao;

	public Heroi(int vida, int forca, String nome,Intencao intencao) {
		super(vida, forca, nome);
		this.intencao = intencao;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "Heroi [intencao=" + intencao + "]";
	}

	@Override
	public boolean atacar(Personagem p) {
		// TODO Auto-generated method stub
		return false;
	}

		
}
