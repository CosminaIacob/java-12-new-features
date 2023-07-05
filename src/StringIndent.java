public class StringIndent {
    public static void main(String[] args) {
        // 2 spaces have been added
        // also added a linke break to the ending of the string
        System.out.println("hello".indent(2));
        // is intended to be used with multiline strings
        // where indenting each line of the multiline string it also normalizes the line ending
        var multiline = "This\nis a\nmulti-line\nString";
        System.out.println(multiline);
        System.out.println("===============");

        multiline.lines().forEach(System.out::println);
        System.out.println("===============");

        var indented = multiline.indent(5);
        System.out.println(indented);
        System.out.println("===============");

        indented.lines().forEach(System.out::println);
        System.out.println("===============");

        indented.indent(-3).lines().forEach(System.out::println);
        System.out.println("===============");

    }
}