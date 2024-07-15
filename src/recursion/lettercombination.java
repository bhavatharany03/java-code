package recursion;
import java.util.*;
public class lettercombination {
    public static void main(String[] args) {
        String digits = "24";
        List<String> combinations = letterCombinations(digits);
        System.out.print(combinations);
    }
    public static List<String> letterCombinations(String digits) {
            if (digits.isEmpty())
                return new ArrayList<>();
            List<String> ans = new ArrayList<>();

            dfs(digits, 0, new StringBuilder(), ans);
            return ans;
        }

        private static final String[] strarray = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        private static void dfs(String digits, int i, StringBuilder sb, List<String> ans) {
            if (i == digits.length()) {
                ans.add(sb.toString());
                return;
            }

            for (final char c : strarray[digits.charAt(i) - '0'].toCharArray()) {
                sb.append(c);
                dfs(digits, i + 1, sb, ans);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }