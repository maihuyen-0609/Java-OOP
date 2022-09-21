package learn_access.learn_Object_and_class;

public class ObjectandClass {
    public int age;
    public String name;

    public int getAge() {
        return age;
    }

    public ObjectandClass() {
        //hàm xây dựng
        // cùng 1 kiểu khai báo chỉ tồn tại 1 hàm xây dựng
        // tên hàm trùng vs tên class (bắt buộc)
        // có hàm xây dựng có cũng dc ko có cũng dc
        // có tham số hoặc k có tham số
        // ý nghĩa hàm xây dựng: có thể khởi tạo dc những gtri ban đầu khi khởi tạo class
        // vì sao k khai báo luôn mà cho gtri dô hàm xây dựng

        //khi nào gtri cố định thì xai cách này
        age = 15;
        name = "Mina";
    }

    //khi nào gtri cố định thì xai cách này
    public ObjectandClass(int age2, String name2) {
        age2 = age2;
        name2 = name2;
    }


    public static void main(String[] args) {
        //khởi tạo class vs object
        ObjectandClass ob1 = new ObjectandClass();
        ob1.getAge(); // lấy tên object để gọi lại những thành phần trong đó
        System.out.println(ob1.getAge());
        // khởi tạo class thuộc kiểu xây dựng thứ 2
        ObjectandClass ob2 = new ObjectandClass(20, "Auto");
        System.out.println(ob2.getAge());
        chillClass cl = new chillClass();
        System.out.println(cl.address);
    }
}
    //class con
// k có hàm main
//như cái nhà kho trong cái nhà chính thôi, chỉ để chứa gtri
    class chillClass{
        public String address;
        public String getAddress(){
            return address;
        }
        public chillClass(){

        }
    }

