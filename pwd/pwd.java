import java.io.File;

class pwd {
    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println("invalide code");
            return;
        }

        String pwd = new File(".").getAbsoluteFile().getParent();
        System.out.println(pwd);
    }
}