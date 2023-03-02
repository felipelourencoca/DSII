
public class Vilao extends Personagem {
    private Intencao intencao;
	public Vilao(int vida, int forca, String nome, Intencao intencao) {
		super(vida, forca, nome);
		this.intencao = intencao;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()  + "Vilao [intencao=" + intencao + "]";
	}

	

}
