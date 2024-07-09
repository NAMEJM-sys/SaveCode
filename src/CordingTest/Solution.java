package CordingTest;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    boolean flag;
    boolean[] included;
    String str1, str2;
    String[] intStrs;
    int num1, num2, num3, mode;
    int[] arrayNum1, arr;
    int[][] ArrayDoubleNum, queries;

    public Solution(String str1) {
        this.str1 = str1;
    }
    public Solution(String[] intStrs, int k, int s, int l){
        this.intStrs = intStrs;
        this.num1 = k;
        this.num2 = s;
        this.num3 = l;
    }
    public Solution(String[] my_strings, int[][] parts) {
        this.intStrs = my_strings;
        this.ArrayDoubleNum = parts;
    }
    public Solution(String str1, int n) {
        this.str1 = str1;
        this.num1 = n;
    }
    public Solution(String str1, int[][] queries){
        this.str1 = str1;
        this.queries = queries;
    }
    public Solution(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }
    public Solution(String str1, String str2, int n) {
        this.str1 = str1;
        this.str2 = str2;
        this.num1 = n;
    }
    public Solution(String str1, String str2, int num1, int num2) {
        this.str1 = str1;
        this.str2 = str2;
        this.num1 = num1;
        this.num2 = num2;
    }
    public Solution(int[] num1) {
        this.arrayNum1 = num1;
    }
    public Solution(int[] arr, int[][] queries){
        this.arr = arr;
        this.queries = queries;
    }
    public Solution(int num1) {
        this.num1 = num1;
    }
    public Solution(int num1, String str1) {
        this.num1 = num1;
        this.str1 = str1;
    }
    public Solution(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public Solution(int num1, int num2, boolean str1) {
        this.flag = str1;
        this.num1 = num1;
        this.num2 = num2;
    }
    public Solution(int num1, int num2, boolean[] str1) {
        this.included = str1;
        this.num1 = num1;
        this.num2 = num2;
    }
    public Solution(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public String overwrite() {
        char[] my = str1.toCharArray();
        char[] over = str2.toCharArray();
        for (int i = 0; i < over.length; i++) my[num1 + i] = over[i];
        return String.valueOf(my);
    }
    public String mix() {
        String answer = "";
        for (int i = 0; i < this.str1.length(); i++) {
            answer += this.str1.charAt(i);
            answer += this.str2.charAt(i);
        }
        return answer;
    }
    public String stringMultiply() {
        return str1.repeat(this.num1);
    }
    public int moreSum() {
        int answer = 0;
        int a = Integer.parseInt("" + this.num1 + this.num2);
        int b = Integer.parseInt("" + this.num2 + this.num1);
        answer = a > b ? a : b;
        return answer;
    }
    public int sumReturn() {
        int answer = 0;
        int along = Integer.parseInt("" + this.num1 + this.num2);
        int blong = 2 * this.num1 * this.num2;
        answer = along > blong ? along : blong;
        return answer;
    }
    public int intMultiply() {
        int answer = this.num1 % this.num2 == 0 ? 1 : 0;
        return answer;
    }
    public int intDoubleMultiply() {
        int answer = this.num1 % this.num2 == 0 && this.num1 % this.num3 == 0 ? 1 : 0;
        return answer;
    }
    public int evenNumberSum() {
        int answer = 0;
        for (int i = 0; i <= num1; i++) {
            answer += (num1 % 2 == 1 && i % 2 == 1) ? i :
                    (num1 % 2 == 0 && i % 2 == 0) ? i * i : 0;
        }
        return answer;
    }
    public int correctInt() {
        int answer = 0;
        if (str1.equals(">")) {
            if (str2.equals("=")) answer = num1 >= num2 ? 1 : 0;
        } else if (str1.equals("<")) {
            if (str2.equals("=")) answer = num1 <= num2 ? 1 : 0;
        }
        return answer;
    }
    public int flagBoolean() {
        return flag ? num1 + num2 : num1 - num2;
    }
    public String cordClear() {
        String ret = ""; // ret 변수 초기화
        int mode = 0; // mode를 메서드 내부에서 초기화

        for (int idx = 0; idx < str1.length(); idx++) {
            if (mode == 0) {
                if (str1.charAt(idx) != '1' && idx % 2 == 0) {
                    ret += str1.charAt(idx);
                } else {
                    mode = 1;
                    continue;
                }
            } else if (mode == 1) {
                if (str1.charAt(idx) != '1' && idx % 2 == 1) {
                    ret += str1.charAt(idx);
                } else {
                    mode = 0;
                    continue;
                }
            }
        }
        return ret.length() == 0 ? "EMPTY" : ret;
    }
    public int Square() {
        int Square = (int) (Math.pow(num1, 3) + Math.pow(num2, 3) + Math.pow(num3, 3));
        int Double = (int) (Math.pow(num1, 2) + Math.pow(num2, 2) + Math.pow(num3, 2));
        int sum = num1 + num2 + num3;
        return num1 == num2 && num1 == num3 ? Square * Double * sum :
                num1 == num2 || num1 == num3 || num2 == num3 ? Double * sum : sum;

    }
    public int Double() {
        return (Arrays.stream(arrayNum1).reduce((acc, i) -> acc * i).getAsInt() < Math.pow(Arrays.stream(arrayNum1).sum(), 2)) ? 1 : 0;
    }
    public int SumChangeStringToInteger() {
        return Integer.parseInt(Arrays.stream(arrayNum1)
                .filter(x -> x % 2 == 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()))
                +
                Integer.parseInt(Arrays.stream(arrayNum1)
                        .filter(x -> x % 2 == 1)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining()));
    }
    public int move() {
        return str1.chars().
                reduce(0, (acc, i) -> acc + (i == 'w' ? 1 : i == 's' ? -1 : i == 'd' ? 10 : i == 'a' ? -10 : 0));
    }
    public String move2() {
        String result = "";
        for (int i = 0; i < arrayNum1.length - 1; i++) {
            if (arrayNum1[i + 1] - arrayNum1[i] == 1) result += 'w';
            else if (arrayNum1[i + 1] - arrayNum1[i] == -1) result += 's';
            else if (arrayNum1[i + 1] - arrayNum1[i] == 10) result += 'd';
            else if (arrayNum1[i + 1] - arrayNum1[i] == -10) result += 'a';
        }
        return result;
    }
    public int[] queries1() {
        for(int i =0; i<queries.length; i++) {
            int middle = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = middle;
        }
        return arr;
    }
    public int[] ArrayMake() {
        int[] answer =  IntStream.rangeClosed(num1, num2)
                .mapToObj(String::valueOf)
                .filter(x -> x
                        .chars()
                        .allMatch(y -> y == '0' || y == '5'))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] wur = {-1};
        return answer.length > 0 ? answer : wur;
    }
    public int[] numList() {
        return IntStream.rangeClosed(num1, num2).toArray();
    }
    public int[] Coratz() {
        List<String> space = new ArrayList<>();
        while(true) {
            if(num1 % 2 ==0) {
                space.add(String.valueOf(num1));
                num1 = num1 / 2;
            } else if (num1 % 2 == 1 && num1 != 1) {
                space.add(String.valueOf(num1));
                num1 = 3 * num1 +1;
            } else if (num1 == 1) {
                space.add(String.valueOf(num1));
                break;
            }
        }

        return space.stream().mapToInt(Integer::parseInt).toArray();
    }
    public int[] ArrayLi() {
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        while (i< arrayNum1.length) {
            if(stk.isEmpty() || stk.get(stk.size()-1) < arrayNum1[i]) {
                stk.add(arrayNum1[i]);
                i++;
            }
            else if(!stk.isEmpty() && stk.get(stk.size()-1) >= arrayNum1[i]) stk.remove(stk.size()-1);

        }
        return stk.stream().mapToInt(Integer::valueOf).toArray();
    }
//    public String SwapString() {
//        char[] my = str1.toCharArray();
//        for(int i =0; i<queries.length; i++) {
//            int length = queries[0].length;
//            my[length-1]
//        }
//        return
//    }
    public int[] StringArray() {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<intStrs.length; i++) {
            String sub = intStrs[i].substring(num2,num2+num3);
            int changeSubToNum = Integer.parseInt(sub);
            if(changeSubToNum > num1) result.add(changeSubToNum);
        }
        return result.stream().mapToInt(x->(int)x).toArray();
    }
    public String sumString() {
        String result= "123";
        for(int i=0; i<ArrayDoubleNum.length; i++) {
            result += this.intStrs[i].substring(ArrayDoubleNum[i][0],ArrayDoubleNum[i][1]+1);
        }
        return result;
    }
    public String[] SuffixArray(){
        List<String> suffix = new ArrayList<>(str1.length());
        for(int i=0; i<str1.length(); i++){
            suffix.add(str1.substring(i));
        }
        Collections.sort(suffix);
        return suffix.stream().toArray(String[]::new);
    }
//    public int IsSuffix() {
//        List<String> name = new ArrayList<>();
//
//
//    }
}