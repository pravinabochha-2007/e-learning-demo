public class Login {

    public boolean validate(String username, String password) {
        if(username.equals("student") && password.equals("1234")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Login l = new Login();
        System.out.println(l.validate("student","1234"));
    }
}
