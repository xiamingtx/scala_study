/**
 * @author 夏明
 * @version 1.0
 */
public class TestDynamicBind {
    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println(worker.name);
        worker.hello();
        worker.hi();

        System.out.println("==============");

        // 多态
        Person person = new Worker();
        System.out.println(person.name); // 属性是静态绑定的
        person.hello(); // 方法调用是动态绑定的
//        person.hi(); // error
    }
}

class Person {
    String name = "person";
    public void hello() {
        System.out.println("hello person");
    }
}

class Worker extends Person {
    String name = "worker";
    public void hello() {
        System.out.println("hello worker");
    }
    public void hi() {
        System.out.println("hi worker");
    }
}
