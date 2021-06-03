package zjy_Icve.个人作业.类和对象.choose1;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/28 17:37
 **/
public class testNewStudent {
    public static void main(String[] args) {
        NewStudent[] stu = {
                new NewStudent("张三", 15),
                new NewStudent("李四", 31),
                new NewStudent("王五", 18),
                new NewStudent("赵六", 20)
        };
        int maxAge = stu[0].age, minAge = stu[0].age;   //初始化最大年纪和最小年纪
        for (NewStudent newStudent : stu) {
            newStudent.show();  //输入信息;
            if (newStudent.age > maxAge) {
                maxAge = newStudent.age;
            } else if (newStudent.age < minAge) {
                minAge = newStudent.age;
            }
        }
        System.out.printf("最大年龄为:%d\t最小年龄为:%d", maxAge, minAge);

    }
}
