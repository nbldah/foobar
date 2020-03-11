import java.util.stream.IntStream;

public class FooBar {

    public static final String FOO = "Foo";
    public static final String BAR = "Bar";
    public static final String QIX = "Qix";

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .mapToObj(FooBar::process)
                .forEach(System.out::println);
    }

    public static String process(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        if (isMultipleOfFive(number) && isMultipleOfThree(number)) {
            stringBuilder.append(FOO + BAR);
        }
        if (isMultipleOfFive(number)) {
            stringBuilder.append(BAR);
        }
        if (isMultipleOfThree(number)) {
            stringBuilder.append(FOO);
        }

        addDigitOccurrence(number, stringBuilder);

        return isEmpty(stringBuilder.toString()) ?
                String.valueOf(number) : stringBuilder.toString();
    }

    private static void addDigitOccurrence(int intValue, StringBuilder sb) {
        for (char character : String.valueOf(intValue).toCharArray()) {
            if (character == '3') {
                sb.append(FOO);
            } else if (character == '5') {
                sb.append(BAR);
            } else if (character == '7') {
                sb.append(QIX);
            }
        }
    }

    private static boolean isEmpty(String value) {
        return value.trim().equals("");
    }

    private static boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private static boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
