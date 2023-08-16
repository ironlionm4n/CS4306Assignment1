package BookReviewQuestions;

public class BookReview {

    public int GreatestCommonDivisor(int m, int n)
    {
        if(n == 0) return m;
        int r = m%n;
        m = n;
        n = r;
        return GreatestCommonDivisor(m, n);
    }
    public int[] ComparisonCountingSort(int[] A)
    {
        int len = A.length;
        int[] count = new int[len];
        for(int i = 0; i < len; i++)
        {
            count[i] = 0;
        }
        for(int i = 0; i < len - 1; i++)
        {
            for(int j  = i + 1; j < len; j++)
            {
                if(A[i] < A[j])
                {
                    count[j] = count[j] + 1;
                } else {
                    count[i] = count[i] + 1;
                }
            }
        }
        int[] returnArr = new int[len];
        for(int i = 0; i < len; i++)
        {
            returnArr[count[i]] = A[i];
        }
        for (int i: returnArr)
        {
            System.out.println(i);
        }
        return returnArr;
    }
}
