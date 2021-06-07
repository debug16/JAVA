package 实训.实训上.面向对象2.case5;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/6/7 19:12
 **/
public class TestStudent {
    public static void main(String[] args) {
        Student[] stu = {
                new Student("3", "张三", 15),
                new Student("1", "李四", 31),
                new Student("5", "王五", 18),
                new Student("4", "赵六", 25),
                new Student("2", "小二", 20)
        };

        System.out.println("全部学生信息：");
        showAllStudents(stu);

        System.out.println("学号从小到大排序：");
        sortBySno(stu);
        showAllStudents(stu);

        System.out.println("所有学生年龄加1：");
        addAge(stu);
        showAllStudents(stu);

        System.out.print("大于 20 岁的学生人数：");
        System.out.println(count(stu, 20) + "人");

        System.out.println("全部学生信息：");
        showAllStudents(stu);

    }

    // 输出数组的所有元素
    public static void showAllStudents(Student[] stu) {
        for (Student s : stu) {
            System.out.printf("学号：%s\t姓名：%s\t年龄：%d\n", s.getSno(), s.getName(), s.getAge());
        }
    }

    //根据学号排序
    public static void sortBySno(Student[] stu) {
        int stuLen = stu.length;
        Student temp;
        for (int i = 0; i < stuLen - 1; i++) {
            for (int j = i + 1; j < stuLen; j++) {
                if (stu[i].getSno().compareTo(stu[j].getSno()) > 0) {
                    temp = stu[i];
                    stu[i] = stu[j];
                    stu[j] = temp;
                }
            }
        }
    }

    //将所有学生年龄加1
    public static void addAge(Student[] stu) {
        int age;
        for (Student s : stu) {
            age = s.getAge() + 1;
            s.setAge(age);
        }
    }

    //在实现子任务 2 的基础上， 统计大于 age 的学生人数。
    public static int count(Student[] stu, int age) {
        int count = 0;
        for (Student s : stu) {
            if (s.getAge() > age) count++;
        }
        return count;
    }
}
