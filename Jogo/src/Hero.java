public class hero extends character {
	private Intention intention;

	public hero(int heroLife, int heroStrengh, String heroName, Intention intention) {
		super(heroLife, heroStrengh, heroLife);
		this.intention = intention;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Hero [intention=" + intention + "]";
	}
	
	@Override
	public boolean attack(character c1) {
		return false;
	}
}
