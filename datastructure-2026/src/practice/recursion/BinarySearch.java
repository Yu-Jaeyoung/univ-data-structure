package practice.recursion;

public class BinarySearch {

    static int sequentialSearch(int[] A, int x) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearchIteration(int[] A, int x) {
        int low = 0;
        int high = A.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A[mid] < x) {
                low = mid + 1;
            } else if (A[mid] > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearchRecursion(int[] A, int x, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (A[mid] < x) {
            return binarySearchRecursion(A, x, mid + 1, high);
        } else if (A[mid] > x) {
            return binarySearchRecursion(A, x, low, mid - 1);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] A = new int[]{3, 7, 10, 16, 17, 20, 32, 40, 46, 50};
        int index = binarySearchRecursion(A, 32, 0, A.length - 1);
        if (index >= 0) {
            System.out.println("32는 " + index + "번째에 있습니다.");
        } else {
            System.out.println("32는 없습니다.");
        }

        index = binarySearchIteration(A, 32);
        if (index >= 0) {
            System.out.println("32는 " + index + "번째에 있습니다.");
        } else {
            System.out.println("32는 없습니다.");
        }
    }

}