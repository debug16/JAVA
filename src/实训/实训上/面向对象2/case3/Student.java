package 实训.实训上.面向对象2.case3;

public class Student {
	private  String Id; //学生学号，不能重复
	private  String name;	//姓名
	private  int age;			//年龄
	private  String className;	//班级
	private  String hobby;	//爱好
	
	//无参构造方法
	public Student() {
		
	}
	
	//带4个参数的构造方法，分别对应的成员赋值
	public String getName() {
		return name;
	}

	public Student(String id, String name, int age, String className,
			String hobby) {
		Id = id;
		this.name = name;
		this.age = age;
		this.className = className;
		this.hobby = hobby;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	
	
	

	
	
	//学生参加特定课程的学习
	public void learning(String kcName){
		System.out.println(name + "正在参加" + kcName +"的学习....");
		
	}

}
