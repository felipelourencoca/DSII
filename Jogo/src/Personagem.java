
public abstract class Personagem {
	private int vida;
	private int forca;
	private String nome;
	
	public Personagem(int vida, int forca, String nome) {
		this.vida = vida;
		this.forca = forca;
		this.nome = nome;
	}

	
	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


	public int getForca() {
		return forca;
	}


	public void setForca(int forca) {
		this.forca = forca;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract boolean atacar(Personagem p);
		

		
	@Override
	public String toString() {
		return "Personagem [vida=" + vida + ", forca=" + forca + ", nome=" + nome + "]";
	}

	
	
	

}
