package DemoProject.Demo;

class San {
	public void m1(int i, float f) {
		System.out.println(" int float method");
	}

	public void m1(float f, int i) {
		System.out.println("float int method");
	}

	public static void main(String[] args) {
		San s = new San();
		final int i;
		i=20;
		i=30;
		System.out.println(i);
		//s.m1(20, 20);
	}
}