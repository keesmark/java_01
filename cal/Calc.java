class Calc {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("invalid number");
            return;
        }

        String op = args[0];
        String x = args[1];
        String y = args[2];

        int xi = 0;
        int yi = 0;
        
        try{
            xi = Integer.parseInt(x);
            yi = Integer.parseInt(y);
        } catch(Exception exception){
            System.out.println("数字を入れてください");
            return;
        }
        
        int result = 0;
        
        if (op.equals("+")) {
            result = sum(xi, yi);
        }
        else if (op.equals("-")) {
            result = mainus(xi, yi);
        }
        else if (op.equals("/")) {
            result = devide(xi, yi);
        }
        else if (op.equals("*")) {
            result = matiple(xi, yi);
        }
        else if (op.equals("%")) {
            result = left(xi, yi);
        }
        else {
            System.out.println("+ - * / のどれかを選択してください");
            return;
        }



        System.out.println(result);

    }

    static int sum(int x, int y) {
        return x + y;
    }

    static int mainus(int x, int y) {
        return x - y;
    }

    static int devide(int x, int y) {
        return x / y;
    }

    static int matiple(int x, int y) {
        return x * y;
    }

    static int left(int x, int y) {
        return x % y;
    }
}