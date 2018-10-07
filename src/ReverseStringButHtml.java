public class ReverseStringButHtml {
    public static void main(String[] args) {
        ReverseStringButHtml sol = new ReverseStringButHtml();

        String s = "3&TWD;2&J";
        // String s = "&euro4321";
        System.out.println(sol.reverseHtml2(s));
        System.out.println(sol.reverseHtml(s));
    }

    public String reverseHtml2(String html) {
        if (html == null || html.length() < 2) {
            return html;
        }
        int len = html.length();
        char[] htmlArr = html.toCharArray();
        swap(htmlArr, 0, len - 1);
        int left = 0;
        while (left < len) {
            if (htmlArr[left] != ';') {
                left++;
            } else {
                int right = left + 1;
                if (right >= len - 1) {
                    break;
                }
                while (htmlArr[right] != '&') {
                    if (htmlArr[right] == ';') {
                        left = right;
                    }
                    right++;
                }
                swap(htmlArr, left, right);
                left = right + 1;
            }
        }
        return new String(htmlArr);
    }

    private void swap(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }

    public String reverseHtml(String html) {
        if (html == null || html.length() == 0) {
            return null;
        }
        int len = html.length();
        char[] chArr = html.toCharArray();
        swap(chArr, 0, len - 1);
        int start = 0;
        int end = 0;
        while (end < len) {
            if (chArr[end] == ';') {
                start = end;
            } else if (chArr[end] == '&') {
                if (chArr[start] == ';')
                    swap(chArr, start, end);
                start = end + 1;
            }
            end++;

        }
        return new String(chArr);
    }
}
