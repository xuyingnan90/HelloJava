public class Puppy {
	int num;

	public Puppy(String i) {
		System.out.println("Puppy的名字是" + i);
	}

	public void pAge(int age) {
		num = age;
	}

	public int getAge() {
		System.out.println("Puppy的age是：" + num);
		return num;
	}

	public static void main(String[] args) {
		Puppy myPuppy = new Puppy("Jason");
		myPuppy.pAge(25);
		myPuppy.getAge();
		System.out.println(myPuppy.num);
	}

}
