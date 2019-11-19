class ClassDemo {
    public static void main(String[] args) {
        // 创建变量，p是局部变量
        Person p = new Person();
        p.height = 7;
        // 调用函数的方法
        p.run();
    }
}

/**
 * 定义类
 */
class Person{
    // 成员变量
    int height;
    int weight;
    int age;

    public void run() {
        System.out.println(height + "run......");
    }
}