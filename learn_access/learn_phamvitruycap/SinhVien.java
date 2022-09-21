package learn_access.learn_phamvitruycap;

public class SinhVien {
    public int age = 40;
    public String name = "Mina";
    protected String add = "HCM";

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    protected String getAdd() {
        return add;
    }

    public void getInfo(){
        System.out.println(age);
        System.out.println(name);
    }
}



