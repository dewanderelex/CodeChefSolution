import java.util.Scanner;

class BITOBYT {

    static void solve (int num){
        int bits = 0;
        int nibbles = 0;
        int bytes = 0;

        int div = num / 26;
        int mod = num % 26;
        int value = (int) Math.pow(2, div);
        if (0 <= mod && mod < 2){
            bits = value;
        } else if (2 <= mod && mod < 10){
            nibbles = value;
        } else if (10 <= mod){
            bytes = value;
        }

        System.out.println(bits + " " + nibbles + " " + bytes);
    }

    public static void main (String[] args){

        System.out.println ("Input: ");

        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine().trim());

        int [] arr = new int [cases];

        for (int i = 0; i < cases; i++){
            String data = sc.nextLine().trim();
            arr[i] = Integer.parseInt(data);
        }

        for (int sess : arr){
            solve(sess);
        }

        sc.close();
    }
}