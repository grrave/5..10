package laba3;

public class work4 {
        public static void main(String[] args) {
            int a,b;
            a = 1;
            b = 10;
            for(int i=1; i<=b; i++) {
                a = a*i;
            }
            System.out.println(b+"! = "+a);
            int c = 1;
            int d = 10;
            int j = 1;
            while(j < d){
                j++;
                c = c*j;
                System.out.println(d+"! = "+c);
            }
        }
    }
