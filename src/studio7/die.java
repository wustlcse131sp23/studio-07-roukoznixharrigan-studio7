package studio7;

public class die {
	int n;
	public die(int n) {
		this.n = n;
	}
	public int throwDie() {
		int side = (int)(Math.random()*(this.n+1));
		return side;
	}
	public static void main(String args[]) {
		die d = new die(5);
		
		System.out.println(d.throwDie());
	}

}
