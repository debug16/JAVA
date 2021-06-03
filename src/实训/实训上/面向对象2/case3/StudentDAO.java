package 实训.实训上.面向对象2.case3;

public class StudentDAO {
	public Student students[];

	public StudentDAO() {
		students = new Student[10]; // 设定最多保存10个同学的信息，初始值为null
	}

	// 添加学生
	public boolean addStudent(Student newStudent) {
		for (int i = 0; i < students.length; i++) {
			// 遍历数组使用循环,
			if (students[i] == null) { // 说明第i个单元还没有放学生信息
				students[i] = newStudent;
				return true;
			}
		}
		return false;
	}

	// 根据学生id查找是否存在该学生，若存在返回该学生对象，否则返回null
	public Student findStudentById(String Id) {
		Student findStudent = null;

		for (int i = 0; i < students.length && students[i]!=null; i++) {
			if (students[i].getId().equals(Id)) {
				findStudent = students[i];
			}
		}
		return findStudent;
	}

	// 学生信息修改，根据学生id修改学生的姓名、年龄、班级、兴趣爱好等信息，成功返回true，否则返回false

	public boolean updateStudent(String Id, Student newStudent) {
		
		Student findStudent  = null ;
		
		for (int i = 0; i < students.length && students[i]!=null; i++) {
			if (students[i].getId().equals(Id)) {
				students[i] = newStudent;
				return true;
			}
		}
		return false;
	}
	
	// 学生信息删除，根据学生id删除对应的学生，删除成功返回true，否则返回false
	public boolean deleteStudent(String Id) {
		int j;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getId().equals(Id)) { //找到了
			//将第i+1到最后一个学生往前移一个位置
				for ( j = i; j < students.length-1; j++) {
					students[j] = students[j+1];
				}
				students[j-1] = null;
				return true;
			}
		}
		
			return false;
		}
	
	
	//判断学生是否已经存在
	public boolean isExist(Student student){
		for (int i = 0; i < students.length && students[i]!=null; i++) {
			if (students[i].getId().equals(student.getId())){
				return true;
			}			
		}
		return false;
	}
	
	
	//显示所有学生
	public void showAllStudent() {
		if (students.length>0 && students[0]!=null ){
			 System.out.println("学号 "+"\t"+"姓名  "+"\t"+"年龄 "+"\t"+"班级  "+"\t"+"爱好 ");
			 for (int i = 0; i < students.length && students[i]!=null; i++) {
			  System.out.println(students[i].getId()+"\t"+students[i].getName()+"\t"+students[i].getAge()+
					              "\t"+students[i].getClassName()+"\t"+students[i].getHobby());
		   }
			
		}else{
			System.out.println("暂时没有学生！");
		}
		
	}
	
	//显示单个同学信息
		public void showStudentInfo(Student student){
		     System.out.println("学生信息：\n " +"学生编号"+student.getId()+"\t"+"  姓名:  "+student.getName()+
		    		             "\t"+"  年龄:  "+student.getAge()+"\t"+
		    		              "  班级：  "+student.getClassName()+"\t"+
		    		               "  爱好：  "+student.getHobby());
		   }
}
