package learn_tinhkethua;

public class Student extends Person {
    //tuân theo cấu trúc contructor từ lớp cha
    public Student(String name, int age, float height, String add) {
        //từ khóa supper trong kế thừa
        //float heigh = 0;
        super(name, age, height); // bắt buộc phải giống vs cấu trúc từ cha Person
    }

    public void getInfoFromParentClass() {
        System.out.println(name);
    }

    // kế thừa lại phương thức của lớp cha
    public static void main(String[] args) {
        // System.out.println();
    }
    //kế thừa lại thuộc tính ( biến) của lớp cha
}
