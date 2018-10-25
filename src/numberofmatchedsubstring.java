public class numberofmatchedsubstring {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "abcdedef";
        String findStr = "de";
        System.out.println(count(str, findStr));
        System.out.println(count2(str, findStr));
    }

    public static int count(String str, String findStr) {
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = str.indexOf(findStr, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += findStr.length();
            }
        }
        return count;
    }

    public static int count2(String str, String findStr) {
        int j = findStr.length();
        int k = 0;
        for (int i = 0; i < str.length() - j + 1; i++) {

            String str1 = str.substring(i, j + i);

            System.out.println("sub string loop " + i + " => " + str1);

            if (str1.equals(findStr)) {
                k++;
            }
        }
        return k;
    }
}
