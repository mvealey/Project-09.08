
public class Coin implements Lockable {
	
	private int key;
	private boolean lock = false;
		
// from implementation

	@Override
	public void setKey(int iKey) {
		if (!locked()) {
			key = iKey;
		}
	}

	@Override
	public void lock(int iKey) {
		if (!locked()) {
			if (key == iKey) {
				lock = true;
			}
		}
	}

	@Override
	public void unLock(int iKey) {
		if (locked()) {
			if (key == iKey) {
				lock = false;
			}
		}
	}

	@Override
	public boolean locked() {
		return lock;
	}

	// coin code
	
	private final int HEADS = 0;
	private int face;
	
	public Coin() {
		flip();
	}
	public void flip() {
		face = (int) (Math.random() * 2);
	}
	
	public boolean isHeads() {
		return (face == HEADS);
	}

	public String toString() {
		return (face == HEADS) ? "Heads" : "Tails";
	}
}
