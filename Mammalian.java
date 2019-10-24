
public class Mammalian {
	 private String name;
	
	void showType() {
		System.out.println("哺乳類です");
	}
	void showName() {
		System.out.println("私の名前は"+name+"です");
	}
	void eat() {
		System.out.println("生き物を食べます");
	}
	void setName(String name) {
		this.name=name;
	}
		
	public String getName() {
		return name;
	}
	
	
}
