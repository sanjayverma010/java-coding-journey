public class IdentifierCount {
    static int sumOfDigits(int[] d) {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += d[i];
        }
        return sum;
    }

    static boolean hasSameConsecutive(int[] d) {
        for (int i = 0; i < 5; i++) {
            if (d[i] == d[i + 1]) {
                return true;
            }
        }
        return false;
    }

    static int countIdentifiers() {
        int count = 0;
        int[] d = new int[6];

        for (d[0] = 1; d[0] <= 9; d[0]++) {
            for (d[1] = 0; d[1] <= 9; d[1]++) {
                for (d[2] = 0; d[2] <= 9; d[2]++) {
                    for (d[3] = 0; d[3] <= 9; d[3]++) {
                        for (d[4] = 0; d[4] <= 9; d[4]++) {
                            for (d[5] = 0; d[5] <= 9; d[5]++) {

                                if (hasSameConsecutive(d))
                                    continue;

                                int sum = sumOfDigits(d);

                                if (sum != 7 && sum != 11 && sum != 13) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(
                "Total acceptable identifiers = " + countIdentifiers());
    }
}
