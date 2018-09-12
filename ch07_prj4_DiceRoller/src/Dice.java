
public class Dice {
	private Die die1;
	private Die die2;
	
	/*
	 * Create two instance of Die.
	 * The constructor of Die will generate
	 * a random value (rolling of the die).
	 * 
	 * Note to students:  this is different than
	 * stated in the project requirements.
	 */
	public Dice() {
		die1 = new Die();
		die2 = new Die();
	}

	public Die getDie1() {
		return die1;
	}

	public void setDie1(Die die1) {
		this.die1 = die1;
	}

	public Die getDie2() {
		return die2;
	}

	public void setDie2(Die die2) {
		this.die2 = die2;
	}
	
	public int getSum() {
		return die1.getValue() + die2.getValue();
	}

	// This is in place of the printRoll() method in specs.
	@Override
	public String toString() {
		return "Die 1: " + die1.getValue() + "\n" +
				"Die 2: " + die2.getValue() + "\n" +
				"Total: "+getSum()+"\n"+
				displaySpecialMessage();
	}
	
	/*
	 * Return a string that represents special case
	 * rolls...  box cars (two 6's), snake eyes (two 1's)
	 * and craps (total of 7)
	 */
	private String displaySpecialMessage() {
		String s = "";
		
		if (getSum() == 7) {
			s = "Craps!";
		}
		else if (getSum() == 12) {
			s = "Box Cars!";
		}
		else if (getSum() == 2) {
			s = "Snake eyes!";
		}
		s += "\n";
		return s;
	}
	
	
}
