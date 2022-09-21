package learn_tinhDahinh;

public class Ghide extends ClassCha{
    public static void getInfo(){
        System.out.println("Name: lion");
        System.out.println("Age:19");
    }
    public static void main(String[] args) {
        // xay ra trường hợp ghi đè phương thức
        getInfo(); //hàm của thằng con , ko phải của cha
    }


}
