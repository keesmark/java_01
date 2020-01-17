import java.io.File;

class ls {
    public static void main(String[] args) {
        String command = null;

        for(int i = 0; i < args.length; i++){
            command = args[i];
        }

        File dir = new File("C:/src/ls");
        File[] list = dir.listFiles();

        if (list != null) {
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i].toString());
            }
        }
        else {
            System.out.println("null");
        }
    }
}