public abstract class character {
	private int charLife;
	private int charStrengh;
	private String charName;
	
	public character(int charLife, int charStrengh, String charName) {
		this.charLife = charLife;
		this.charStrengh = charStrengh;
		this.charName = charName;
	}
	
	public int getCharLife() {
		return charLife;
	}
	
	public void setCharLife(int charLife) {
		this.charLife = charLife;
	}
	
	public int getCharStrengh() {
		return charStrengh;
	}
	
	public void setCharStrengh(int charStrengh) {
		this.charStrengh = charStrengh;
	}
	
	public String getCharName() {
		return charName;
	}
	
	public void setCharName(String charName) {
		this.charName = charName;
	}
	
	public abstract boolean attack(Character c);
	
	@Override
	public String toString() {
		return "Character [life=" + charLife + ", strengh=" + charStrengh + ", name=" + charName + "]";
	}
}
