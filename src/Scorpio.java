public class Scorpio {
	int num;

	public Scorpio(String i) {
		System.out.println("星座是：" + i);
	}

	public Scorpio(int i) {
		System.out.println("星座序号：" + i);
	}

	public void age(int num) {

	}

	public static void main(String[] args) {
		Scorpio myScorpio = new Scorpio("天蝎座");
	}

}
