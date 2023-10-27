package methods;

public class Method1 {
    public static void main(String[] args) {

        String stringResult = Method1.getString(3, "Hello");
        System.out.println(stringResult);
    }

    //getting method. This method will take two parameters. One is int value and another one is a string value

    /**
     * this method is going to return string value based on x numbers.
     * @param x
     * @param str
     * @return
     */
    public static String getString(int x,  String str) {
        String newResult = str;
        for (int i = 0; i < x; i++) {
            newResult += str.charAt(str.length() - 1); //newResult += str;
        }
        return str + newResult;
    }
}
