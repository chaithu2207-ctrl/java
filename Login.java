class Login {

    public void L(String name) {
        System.out.println("Name: " + name);
    }

    public void L(String name, int password) {
        System.out.println("Name: " + name);
        System.out.println("Password: " + password);
    }

    public void L(String name, int password, int otp) {
        System.out.println("Name: " + name);
        System.out.println("Password: " + password);
        System.out.println("OTP: " + otp);
    }

    public static void main(String[] args) {

        Login l1 = new Login();

        l1.L("Rhea");
        l1.L("Rashi", 26489);
        l1.L("Arp", 92618, 2462);
    }
}