import java.util.Arrays;

public class StringTransform {

    public static void main(String[] args) {
        // you can call transform on a string
        // and pass it a function that takes a string and returns an arbitrary object
        // transforming the string in a new object
        var text = "$some text $with$ $dollars";
        String[] words = StringUtils.words(StringUtils.clean(text));
        Arrays.stream(words).forEach(System.out::println);
        System.out.println("=======================");
        String[] transformed = text.transform(StringUtils::clean)
                .transform(String::toUpperCase)
                .transform(StringUtils::words);
        Arrays.stream(transformed).forEach(System.out::println);
        // transform allows us to use a string like we would use a stream pipeline on collections.
    }
}
