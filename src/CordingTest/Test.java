package CordingTest;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Solution solution = new Solution(sc.next(),sc.next(),sc.nextInt());
//        System.out.println(solution.overwrite());

//        Solution solution = new Solution(sc.next(),sc.next(),sc.nextInt());
//        System.out.print(solution.mix());

//        Solution solution = new Solution(sc.next(),sc.nextInt());
//        System.out.print(solution.stringMultiply());

//        Solution solution = new Solution(sc.nextInt(),sc.nextInt());
//        System.out.print(solution.moreSum());

//        Solution solution = new Solution(sc.nextInt(),sc.nextInt());
//        System.out.print(solution.sumReturn());

//        Solution solution = new Solution(sc.nextInt(),sc.nextInt());
//        System.out.print(solution.intMultiply());

//        Solution solution = new Solution(sc.nextInt(),sc.nextInt(), sc.nextInt());
//        System.out.print(solution.intDoubleMultiply());

//        Solution solution = new Solution(sc.nextInt());
//        System.out.print(solution.evenNumberSum());

//        Solution solution = new Solution(sc.next(),sc.next(),sc.nextInt(),sc.nextInt());
//        System.out.print(solution.correctInt());

//        Solution solution = new Solution(sc.next());
//        System.out.print(solution.cordClear());

//        Solution solution = new Solution(sc.nextInt(), sc.nextInt(), new boolean[]{false, false, false, true, false, false, false});
//        System.out.print(solution.arithmeticBoolean());

//        Solution solution = new Solution(sc.nextInt(),sc.nextInt(),sc.nextInt());
//        System.out.println(solution.Square());

//        Solution solution = new Solution(sc.nextInt(), sc.next());
//        System.out.println(solution.move());

//        int[] num = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
//        Solution solution = new Solution(num);
//        System.out.println(solution.move2());

//        int[] arr = {0, 1, 2, 3, 4};
//        int[][] queries = {{0, 3},{1, 2},{1, 4}};
//        Solution solution = new Solution(arr, queries);
//        System.out.println(Arrays.toString(solution.queries1()));

//        Solution solution = new Solution(sc.nextInt());
//        System.out.println(Arrays.toString(solution.Coratz()));

//        int[] arr = {1, 4, 2, 5, 3};
//        Solution solution = new Solution(arr);
//        System.out.println(Arrays.toString(solution.ArrayLi()));

//        String my_string = "rermgorpsam";
//        int[][] queries = {{2,3},{0,7},{5,9},{6,10}};
//        Solution solution = new Solution(my_string, queries);
//        System.out.println(solution.SwapString());

//        String[] intStrs = {"0123456789","9876543210","9999999999999"};
//        Solution solution = new Solution(intStrs, 50000, 5, 5);
//        System.out.println(Arrays.toString(solution.StringArray()));

//        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
//        int[][] parts = {{0,4},{1,2},{3,5},{7,7}};
//        Solution solution = new Solution(my_strings, parts);
//        System.out.println(solution.sumString());
//        String my_string = "banana";
//        Solution solution = new Solution(my_string);
//        System.out.println(solution.SuffixArray());
        String my_string = "banana";
        String is_suffix = "ana";
        Solution solution = new Solution(my_string, is_suffix);
        System.out.println(solution.IsSuffix());
    }
}
