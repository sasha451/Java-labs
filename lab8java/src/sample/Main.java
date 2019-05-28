package sample;

public class Main {

    public static void main(String[] args) {

        //1
        do {
            try {
                First a = new First();
                a.start();
            } catch (Error e) {
                System.out.println(e);
                System.out.println("\n");
                break;
            }
        } while (true);

        //2
        boolean k = true;
        do {
            try {
                new Second().e_new();;
            } catch (Error e)
            {
                System.out.println(e);
                System.out.println("\n");
                k = false;
            }
        } while(k);

        //3
        do try {
            Third b = new Third();
            b.launch();
        } catch (Error e) {
            System.out.println(e);
            System.out.println("\n");
            break;
        } while (true);

        //4
        try {
            Fourth c = new Fourth();
        } catch (Error e) {
            System.out.println(e);
            System.out.println("\n");
        }

    }

}
