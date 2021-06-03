package zjy_Icve.题库作业.作业6_类和对象.case2;

/**
 * @Author DOME
 * @Version V1.0.0
 * @Date 2021/5/29 17:56
 **/
public class test2 {
    public static void main(String[] args) {
        Student[] t = {
                new Student(202101, "张三", 19),
                new Student(202105, "李四", 14),
                new Student(202103, "王五", 21),
                new Student(202106, "赵六", 25),
                new Student(202108, "刘七", 29)
        };
        //子任务1
        System.out.println("子任务1");
        stuSort(t);
        stuShow(t);

        //子任务2
        System.out.println("子任务2");
        stuAgeAdd(t);
        stuShow(t);

        //子任务3
        System.out.println("子任务3");
        for (Student n : t) {
            if (stuAge20(n)) {
                System.out.printf("学号：%d\t姓名：%s\t年龄：%d\n", n.sno, n.name, n.age);
            }
        }
    }

    public static void stuSort(Student[] t) {
        int len = t.length;
        Student temp;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (t[i].sno > t[j].sno) {
                    temp = t[i];
                    t[i] = t[j];
                    t[j] = temp;
                }
            }
        }
    }

    public static void stuShow(Student[] t) {
        int len = t.length;
        for (Student student : t) {
            System.out.printf("学号：%d\t姓名：%s\t年龄：%d\n", student.sno, student.name, student.age);
        }
    }

    public static void stuAgeAdd(Student[] t) {
        for (Student student : t) {
            student.age++;
        }
    }

    public static boolean stuAge20(Student t) {
        return t.age > 20;
    }
}

class Student {
    public String name;
    public int sno, age;

    public Student() {
    }

    public Student(int sno, String name, int age) {
        this.name = name;
        this.sno = sno;
        this.age = age;
    }
}
