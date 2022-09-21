package learn_tinhDahinh;

public class Napchong {
    // nạp chồng bằng cách thay đổi số lượng tham số
    public static int tinhTong(int a, int b){

        return a+b;
    }
    public static Integer tinhTong (int a, int b, int c){

        return a+b+c;
    }
    //Nạp chồng bằng cách thay đổi kiêủ dữ liệu của tham số
    public static void info(int age, String name){
        System.out.println(name + "-"+age);
    }

    public static void main(String[] args) {
        System.out.println(tinhTong(10,20));
        System.out.println(tinhTong(20, 90, 78));
        info(10,"mina");
    }
}
