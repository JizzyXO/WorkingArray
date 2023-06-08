package task_one;

public class DoubleArray {
    private double[] array;

    public DoubleArray(double[] array) {
        if (array.length != 10) {
            throw new IllegalArgumentException("Array length should be 10");
        }
        this.array = array;
    }

    public int[] getIntegerArrayWithoutRounding() {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = (int) array[i];
        }
        return result;
    }

    public int[] getIntegerArrayWithRounding() {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = (int) Math.round(array[i]);
        }
        return result;
    }

    public void sortArrayAscending() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public double getSumOfPositiveNumbers() {
        double sum = 0;
        for (double number : array) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }
}

