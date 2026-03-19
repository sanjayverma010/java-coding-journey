class Single2 {
    public static void main(String[] args) {
        int[] a = {3, 5, 7, 4, 6, 8, 3, 5, 3, 3, 2, 5, 7, 7};

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(a[i]);
            }
        }
    }
}
