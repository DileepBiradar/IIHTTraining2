class even {
	void display() {
		System.out.println(" Even Nos,4 2");
	}
}

class odd extends even {
	void display() {
		super.display();
		System.out.println(" Odd Nos ,1 3");
	}
}

class Main {
	public static void main(String[] args) {
		even e = new odd();
		e.display();
	}
}