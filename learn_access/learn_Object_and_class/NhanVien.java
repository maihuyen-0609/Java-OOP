package learn_access.learn_Object_and_class;

public class NhanVien {
    // chỉ là hàm chứa thông tin thôi
    public int age;
    public String name;
    public String gender;
    public String add;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAdd() {
        return add;
    }
    public String getInfomation(){
        return "Thong tin nhân viên: " + name + "-" + age + "-" + add + "-" + gender;
    }

    public NhanVien(int age, String name, String gender, String add) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.add = add;
    }
//    public NhanVien(int age, String name, String gender, String add){
//        // 2 cách để truyền giá trị khi tên biến trùng
//        //1. Đặt tên khác nhau
//        //2. dùng this. để phân biệt biết trong vs ngoài class
//        this.age=age;
//        this.gender= gender;
//        this.add=add;
//        this.name=name;
//    }
    }

