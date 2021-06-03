package 实训.实训上.面向对象2.case3;

import java.util.Scanner;

public class TestStudentDAO {
	
	StudentDAO  sda ; //学生操作实现类作为成员变量

	
	public TestStudentDAO() {
		sda = new StudentDAO(); //实例化成员变量
	}

	public static void main(String[] args) {
		TestStudentDAO tsd = new TestStudentDAO();
		tsd.showAction();
	}

	// 显示学生管理主菜单
	public void showFuction() {
		System.out.println("***************************");
		System.out.println("*   欢迎您使用学生管理系统      *");
		System.out.println("*   1:添加学生信息            *");
		System.out.println("*   2:删除学生信息            *");
		System.out.println("*   3:修改学生信息            *");
		System.out.println("*   4:查询学生信息            *");
		System.out.println("*   5:显示所有学生信息         *");
		System.out.println("*   6:退出系统               *");
		System.out.println("****************************");

	}
	//

	// 功能操作
	public void showAction() {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		 while (flag) {
			showFuction();
			System.out.print("请选择要操作的功能：");
			if (sc.hasNextInt()){
				int action = sc.nextInt();
				
				switch (action) {
				case 1:// 1：添加学生
					this.insertStudentInfo();
					//System.out.println("add");
					break;
				case 2:// 2：删除学生信息
					this.delStudentInfo();
					//System.out.println("del");
					break;
				case 3: // 3：修改学生信息
					this.updateStudentInfo();
					System.out.println("update");
					break;
				case 4: // 4：查询学生信息
					this.findStudentById();
					//System.out.println("search");
					break;
				case 5: // 5：显示所有学生信息
					//System.out.println("search");
					this.showAllStudentInfo();
					break;
				case 6: // 6：退出
					System.out.println("谢谢使用本系统 ,你已经成功退出了！");
					flag = false;
					break;
				default:
					System.out.println("功能选择错误！");
					break;
				}
			}else{
				System.out.println("功能输入错误！");
				sc.next(); // 读掉输入的非法数据
			}
		}

	}
	
	//增加学生信息
	public void insertStudentInfo(){
			//1： 输入学生信息
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入学生编号：");
			String stuId = sc.next();

			System.out.println("请输入学生姓名：");
			String stuName = sc.next();

			System.out.println("请输入学生年龄：");
			int stuAge  = sc.nextInt(); //取第0个字符

			System.out.println("请输入学生班级：");
			String  stuClass = sc.next();

			System.out.println("请输入学生兴趣爱好：");
			String  stuHobby = sc.next();
			
			//2： 创建学生对象
			Student student = new Student();
			student.setId(stuId);
			student.setName(stuName);
			student.setAge(stuAge);
			student.setClassName(stuClass);
			student.setHobby(stuHobby);
			
			//3： 判断学生信息是否存在 
			boolean flag=sda.isExist(student);
			
			if(flag)
			{
				System.out.println("已经存在，不能添加");
			}else{
				// 4. 调用学生操作实现类的添加方法将学生加入集合中
				boolean f = sda.addStudent(student);
				if(f)
				{
					System.out.println("添加成功");
				}else{
					System.out.println("不能添加");
				}
			}
		}
	
	//
	// 修改学生信息
		public void updateStudentInfo() {
			
			// 1:首先根据输入的学生编号查询是否存在
			System.out.println("请输入要修改的学生编号：");
			Scanner sc = new Scanner(System.in);
			String stuId = sc.next();
			
			//2：调用业务方法，学生编号查询学生信息，返回学生对象
		    Student student= sda.findStudentById(stuId);

			//3：根据查询结果执行修改和不修改操作
			    //a：如果不存在，提示“该学生不存在！”；
			    //b：如果存在，先显示学生信息：学生编号\t学生姓名\t学生年龄\t班级\t爱好
	             //同时进行修改信息的提示和录入，对该学生对象属性进行修改
			 if(student==null)
			 {
				 System.out.println("该学生不存在！");
			 }else
			 {
				 sda.showStudentInfo(student);
				 System.out.println("请输入要修改的信息：");
				
				 System.out.println("请输入要修改学生姓名：");
				 String stuName = sc.next();
				 
				 System.out.println("请输入修改学生年龄：");
				 int stuAge = sc.nextInt();
				 
				 System.out.println("请输入修改学生班级：");
				 String  stuClass = sc.next();
				 
				 System.out.println("请输入修改学生兴趣爱好：");
				 String  stuHobby = sc.next();
				 
				 //4：生成学生对象

				 Student newStudent = new Student();
				 newStudent.setId(stuId);
				 newStudent.setName(stuName);
				 newStudent.setClassName(stuClass);
				 newStudent.setAge(stuAge);
				 newStudent.setHobby(stuHobby);
				 
				 //5：调用修改方法，提示修改成功与
				 boolean flag= sda.updateStudent(stuId, newStudent);
				 if(flag){
					 System.out.println("修改成功");
				 }else{
					 System.out.println("修改失败");
				}
				
			}
		}
		
		// 删除学生信息
		
		public void delStudentInfo() {
			
			//1: 输入的学生编号
			System.out.println("请输入要删除的学生编号：");
			Scanner sc = new Scanner(System.in);
			String stuId = sc.next();
						
			//2：调用学生删除方法，删除学生信息		
			boolean flag = sda.deleteStudent(stuId);
			
			//3：根据返回结果判断删除是否成功
			if(flag)
			{
				System.out.println("删除成功！");
			}else{
				System.out.println("删除失败！");
			}
		}
		
		//输入学生编号，查询学生信息
		public void findStudentById(){
			//1: 输入的学生编号
			System.out.println("请输入要查询的学生编号：");
			Scanner sc = new Scanner(System.in);
			String stuId = sc.next();
						
			//2：调用学生查询方法		
			Student student = sda.findStudentById(stuId);
			if (student!=null){ //找到了
				//3：调用显示学生信息的方法
				sda.showStudentInfo(student);
			}else{
				System.out.println("没有编号为 "+ stuId + " 的学生！");
			}
		}
		
		//显示所有学生信息
		public void showAllStudentInfo(){
			//1：调用显示所有学生信息的方法
			sda.showAllStudent();
		}
	}


