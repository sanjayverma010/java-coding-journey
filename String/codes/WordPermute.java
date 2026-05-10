public class WordPermute {

    static void permute(String[] arr, int l) {
        if (l == arr.length) {
            for (String word : arr)
                System.out.print(word + " ");
            System.out.println();
            return;
        }

        for (int i = l; i < arr.length; i++) {
            // swap
            String temp = arr[l];
            arr[l] = arr[i];
            arr[i] = temp;

            permute(arr, l + 1);

            // backtrack
            temp = arr[l];
            arr[l] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        String s = "this is java code";
        String[] words = s.split(" ");

        permute(words, 0);
    }
}