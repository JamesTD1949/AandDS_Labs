public class TestWordCount {
    public static void main(String[] args) {
        System.out.println(CountWords.countWords("A Star is Born")); //expect 4
        System.out.println(CountWords.countWords(" ")); //expect 0
        System.out.println(CountWords.countWords("")); //expect 0
    }
}
