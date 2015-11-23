public class JavaShow {
	int i;
	String a;
	String name;

	public JavaShow(String name) {
		this.name = name;
	}
	public void setAge(int sAge){
		i=sAge;
 	}
	public void setName(String sName){
		a=sName;
	}
	public void PrintInfo(){
		System.out.println("姓名："+name);
		System.out.println("年龄："+i);
		
	}
	
}
