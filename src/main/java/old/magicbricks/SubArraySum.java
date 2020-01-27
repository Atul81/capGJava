package old.magicbricks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubArraySum
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int totalCases = Integer.parseInt(bufferedReader.readLine());
        while (totalCases-- > 0) {
            int[] searchArray = new int[]{ 1, 2, 3, 7, 5 };
            int sum = 12;
            findSumIndexing(searchArray, sum);
        }
    }

    private static void findSumIndexing(int[] searchArray, int sum)
    {
        int initItr = 0;
        int finishItr = 0;
        int currentSum = searchArray[0];
        for (int i = 1; i < searchArray.length; i++) {
            if (currentSum + searchArray[i] == sum) {
                System.out.println(String.format("Got the sum %d %d", initItr + 1, finishItr + 2));
                break;
            } else if (currentSum + searchArray[i] > sum) {
                i = initItr + 1;
                currentSum = searchArray[i];
                finishItr = i;
                initItr++;
            } else {
                currentSum += searchArray[i];
                finishItr++;
            }
        }
    }
}
