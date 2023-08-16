package BookReviewQuestions;

import Utilities.SearchFunctions;

public class BookReviewTest {
    BookReview bookReview;

    public BookReviewTest()
    {
        bookReview = new BookReview();
    }

    public BookReview getBookReview() {
        return bookReview;
    }

    public void TestPrintFindIndexOfArrayBinarySearch(int [] input, int target)
    {
        System.out.println(SearchFunctions.BinarySearchIntArray(input, target));
    }
}
