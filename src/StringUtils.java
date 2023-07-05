public class StringUtils {

    public static String clean(String s) {
        return s.replace("$", "");
    }

    public static String[] words(String s) {
        return s.split(" ");
    }
}
