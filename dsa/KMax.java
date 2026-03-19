class KMax {
    public static void main(String[] args) {
        int[] a = {3, 56, 23, 78, 98, 34, 67, 45, 7, 45, 89};
        int k=4;
         int temp;
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

           if(i==k-1)
            {
            System.out.println("k th eliment is" + a[i]);
             break;
            }
        }

    }
}
