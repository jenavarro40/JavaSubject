public class Code {

	private static final int NUM_COLORS = 6;
	private static final int NUM_PEGS = 4;
	private static final char[] COLORS = { 'R', 'O', 'Y', 'G', 'B', 'P' };

	// The four pegs
	private char[] pegs;

	// Default constructor
	public Code() {
		pegs = new char[4];
	}

	// A constructor that a Code object using four pegs
	public Code(char p1, char p2, char p3, char p4) {
		pegs = new char[4];
		pegs[0] = p1;
		pegs[1] = p2;
		pegs[2] = p3;
		pegs[3] = p4;
	}

	// Make a random code. The code may contain duplicated pegs.
	public void makeRandomCode() {
		for (int i = 0; i < NUM_PEGS; i++) {
			char color = COLORS[(int) (Math.random() * Code.NUM_COLORS)];
			setPeg(color, i);
		}
	}

	// set the four pegs
	public void setPegs(char p1, char p2, char p3, char p4) {
		setPeg(p1, 0);
		setPeg(p2, 1);
		setPeg(p3, 2);
		setPeg(p4, 3);
	}

	// check if there is duplicated pegs in the code
	public boolean hasDuplicatedPegs() {
		for (int i = 0; i < NUM_PEGS - 1; i++) {
			for (int j = i + 1; j < NUM_PEGS; j++) {
				if (pegs[i] == pegs[j])
					return true;
			}
		}
		return false;
	}

	// return true if the code of this object is the same as the code of c.
	// return false otherwise.
	public boolean compare(Code c) {
		for (int i = 0; i < NUM_PEGS; i++) {
			if (getPeg(i) != c.getPeg(i))
				return false;
		}
		return true;
	}

	// return the number of black key pegs by comparing this object and c.
	public int getNumBlackKeyPegs(Code c) {
		int count = 0;
		for (int i = 0; i < NUM_PEGS; i++) {
			if (getPeg(i) == c.getPeg(i))
				count++;
		}
		return count;
	}

	// return the number of white key pegs by comparing this object and c.
	public int getNumWhiteKeyPegs(Code c) {

		char[] temp1 = { pegs[0], pegs[1], pegs[2], pegs[3] };
		char[] temp2 = { c.getPeg(0), c.getPeg(1), c.getPeg(2), c.getPeg(3) };
		int count = 0;
		for (int i = 0; i < NUM_PEGS; i++) {
			for (int j = 0; j < NUM_PEGS; j++) {
				if (temp1[i] != '\0' && temp2[j] != '\0' && temp1[i] == temp2[j]) {
					count++;
					temp1[i] = '\0';
					temp2[j] = '\0';
				}
			}
		}
		return count - getNumBlackKeyPegs(c);
	}

	// print out the code
	public void printCode() {
		System.out.println(toString());
	}

	// setter of pegs
	public void setPegs(char[] pegs) {
		this.pegs = pegs;
	}

	// getter of pegs
	public char[] getPegs() {
		return this.pegs;
	}

	// set an individual peg given the position pos (pos starts from 0)
	public void setPeg(char peg, int pos) {
		this.pegs[pos] = peg;
	}

	// get an individual peg give the position pos
	public char getPeg(int pos) {
		return this.pegs[pos];
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < NUM_PEGS; i++) {
			str += this.pegs[i] + " ";
		}
		return str.trim();  // remove the ending space
	}
}