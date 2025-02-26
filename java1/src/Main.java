public class Main {
    public static void main(String[] args) {
        Solution.oop tk1 = new Solution.oop();
        Solution.oop tk2 = new Solution.oop();
        Solution.oop tk3 = new Solution.oop("contact@gmail.com", "1234");
        tk1.hienThiThongTin();
        tk2.hienThiThongTin();
        tk3.hienThiThongTin();
        System.out.println(tk1.getEmail());
        System.out.println(tk1.getMatKhau());
        tk1.setEmail("black");
        System.out.println();
        System.out.println(tk1.toString());
        tk2.checkdiemhople();


    }
}





