package learn_access.learn_Object_and_class;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien(20, "haha", "dd", "dd");
        NhanVien nv2 = new NhanVien(10, "Mina", "male", "HCM");
//        System.out.println(nv2.getAge());
//        System.out.println(nv1.getAge());
//        System.out.println(nv2.getInfomation());
        // Gọi lại thông tin từ class Sinh viên theo cách instance ( giá trị toàn cục )
        Sinhvien.getInfo();
        System.out.println(Config.browser);
        System.out.println(new Sinhvien().getClass());

    }
}
