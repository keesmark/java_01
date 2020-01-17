import java.io.File;

class mkdir {
    public static void main(String[] args) {
        String command = null;
        String name = null;

        int no_option = 1;
        int option = 2;

        if (args.length == no_option) {
            name = args[0];
        }
        else if (args.length == option) {
            command = args[0];
            name = args[1];

            if (!(command.equals("-p"))) {
                System.out.println("invalid option");
                return;
            }
        }

        File newFile = new File(name);

        if (newFile.mkdir()) {
            return;
        }
        else if (command.equals("-p")) {
            if (newFile.mkdirs()) {
                return;
            }
            else {
                System.out.println("invalid command");
            }
        }
        else {
            System.out.println("fail to make directory");
            return;
        }
    }
}