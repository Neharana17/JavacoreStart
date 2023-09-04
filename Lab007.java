package aug27;

public class Lab007 {
    public static void main(String[] args) {
//        int n1=0;
//		int n2=1;
//		int n3 =10;
//		for(int i =0;i<=n3;i++) {
//            System.out.println(n1 + " ");
//            int j = n1 + n2;
//            n1 = n2;
//            n2 = j;
//        }

        // Prime number
        int num=6;
        boolean j= false;
        for(int i=2; i<=num/2;i++){
            if (num % i==0)
                j= true;
                break;
        }

        if(!j)

            System.out.println(num + " is a prime number.");
		    else
            System.out.println(num + " is not a prime number.");

    }

}
