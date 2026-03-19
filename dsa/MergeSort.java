class Mrg {

    int[] array;
    int[] tempMargeArr;
    int length;

    public static void main(String[] args) {
        int[] inputArr = {48, 36, 13, 52, 19, 94, 21};

        Mrg ms = new Mrg();  // Create an instance of Mrg class
        ms.sort(inputArr);   // Call sort method

        System.out.print("Sorted Array: ");
        for (int i : inputArr) {
            System.out.print(i + " ");
        }
    }

    public void sort(int[] inputArr) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMargeArr = new int[length];
        divideArray(0, length - 1);
    }

    public void divideArray(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            // Sort left side
            divideArray(lowerIndex, middle);

            // Sort right side
            divideArray(middle + 1, higherIndex);

            // Merge both sides
            mergeArray(lowerIndex, middle, higherIndex);
        }
    }

    public void mergeArray(int lowerIndex, int middle, int higherIndex) {
        // Copy data to temp array
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMargeArr[i] = array[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        // Merge the two halves
        while (i <= middle && j <= higherIndex) {
            if (tempMargeArr[i] <= tempMargeArr[j]) {
                array[k] = tempMargeArr[i];
                i++;
            } else {
                array[k] = tempMargeArr[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements from left half (if any)
        while (i <= middle) {
            array[k] = tempMargeArr[i];
            k++;
            i++;
        }
    }
}
