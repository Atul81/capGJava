package magicbricks;

public class SubArraySum {

    public static void main(String[] args) {
        int[] searchArray = new int[]{1, 2, 3, 7, 5};
        int sum = 12;

        findSumIndexing(searchArray, sum);
    }

    private static void findSumIndexing(int[] searchArray, int sum) {
        int currentItrIndex = 0;
        int currentSum = 0;
        for (int i = 0; i < searchArray.length; i++) {
            i = currentItrIndex;
            System.out.println(i);
        }
    }

}
