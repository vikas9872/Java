public class Fibonacci {
    public static int fib(int x){  // 3
        // ground
        if(x<=1){
            return x;
        }
        return fib(x-1)+fib(x-2);
    }
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<=n;i++) {
            System.out.println("Fib"+"("+i+")"+ "="+ fib(i));
        }
    }
}
