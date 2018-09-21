public class camelCaseString {
    public static void main (String[] args) {

        String input = "camelCasEString";
        camel(input);

        // camel
        // Case
        // String

    }

    public static void camel(String s){
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch -'A' >= 0 && ch - 'Z' <= 0){
                System.out.println(sb.toString());
                sb = new StringBuilder();
                sb.append(ch);
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
