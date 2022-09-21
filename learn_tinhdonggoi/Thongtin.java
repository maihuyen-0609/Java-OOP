package learn_tinhdonggoi;

public class Thongtin {
    public static void main(String[] args) {
        Student sv = new Student();
        sv.setName("Mina");

        System.out.println(sv.getName());

        System.out.println(sv.name);
        sv.setName("Mina3");
        System.out.println(sv.name);

    }
}
