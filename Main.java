public class Main {

    public static void main(String[] args) {
        int c=0;


        for (int i=1 ; i < 2000; i++) {

            if (IsEven(i)) {
                System.out.println(" the number entered is even " + i);
                c++;

            } else {

                System.out.println("not an even number");
            }

            System.out.println("no of even numbers "+ c);
        }
    }

    public static boolean IsEven(int n ) {

        if (n%2 == 0){
            return true;

        }

        return  false;


    }
}
