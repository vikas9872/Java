package DataStructures.Arrays;

public class A006_MoveZerostoLast {
    public static void main(String[] args) {
        int[] a={0, 1, 2, 0, 3, 4, 0, 5};
        int idx=0;
        for(int i=0;i<a.length;i++) {
            if (a[i] != 0) {
                a[idx] = a[i];
                idx++;
            }
        }
        while(idx<a.length){
            a[idx]=0;
            idx++;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

