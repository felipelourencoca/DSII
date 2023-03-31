public class Villain extends Character {
    private Intention intention;
	public Villain(int charLife, int charStrengh, String charName, Intention intention) {
		super(charLife, charStrengh, charName);
		this.intention = intention;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Villain [intention=" + intention + "]";
	}
}
