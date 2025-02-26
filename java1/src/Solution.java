
public class Solution {


    public static class oop {
        private String email;
        private String matKhau;
        // nhap thong tin cua tung doi tuong

        //alt+ins

        public oop() {
            matKhau = "nice";
            email = "nice@gmail.com";
        }

        public oop(String email, String matKhau) {
            this.email = email;
            this.matKhau = matKhau;
        }


        // phuong thuc gom kieu tra ve va khong co kieu tra ve
        public void hienThiThongTin() {
            System.out.println(email);
            System.out.println(matKhau);
        }
        // get va set

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getMatKhau() {
            return matKhau;
        }

        public void setMatKhau(String matKhau) {
            this.matKhau = matKhau;
        }
        //toString

        @Override
        public String toString() {
            return "oop{" +
                    "email='" + email + '\'' +
                    ", matKhau='" + matKhau + '\'' +
                    '}';
        }
        private boolean checkEmail(){
            return email.contains("@");
        }
        public void checkdiemhople(){
            if(checkEmail()){
                System.out.println("email hop le");
            }
            else{
                System.out.println("email not hop le");
            }
        }

    }
}



