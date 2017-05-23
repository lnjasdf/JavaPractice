package offer;

/**
 * Created by lnjasdf on 2017/5/23.
 * 面试题4：替换空格
 */
public class Question4 {

    private static String text = "We are happy.";

    private static String replaceWord(String text, char word, String str) {
        int wordNum = 0;
        for (char c : text.toCharArray()) {
            if (c == word)
                wordNum++;
        }
        if (wordNum == 0) {
            return text;
        }
        int newLength = text.length() + wordNum * (str.length() - 1);
        char[] buffer = new char[newLength];
        int j = newLength - 1;
        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) != word) {
                buffer[j] = text.charAt(i);
                j--;
            } else {
                int count = j - str.length() + 1;
                for (char c : str.toCharArray()) {
                    buffer[count] = c;
                    count++;
                }
                j -= str.length();
            }
        }
        return String.valueOf(buffer);
    }

    public static String replace(String text, char word, String str) {
        if (text == null || str == null)
            return null;
        return replaceWord(text, word, str);
    }

    public static void main(String[] args) {
        System.out.println(text);
        System.out.println(replace(text, ' ', "%20"));
    }
}
