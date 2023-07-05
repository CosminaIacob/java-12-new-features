import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormats {
    public static void main(String[] args) {
        NumberFormat shortNF = NumberFormat.getCompactNumberInstance();
        // in this case uses the default locale, which is US and will return K
        String shortForm = shortNF.format(1000);
        System.out.println(shortForm); // 1K
        System.out.println(shortNF.format(1_000_000)); // 1M
        System.out.println(shortNF.format(1500)); // 2K
        shortNF.setRoundingMode(RoundingMode.DOWN);
        System.out.println(shortNF.format(1500)); // 1K
        shortNF.setMaximumFractionDigits(2);
        System.out.println(shortNF.format(1500)); // 1.5 K
        System.out.println("===================================");

        NumberFormat shortNFLocaleGerman = NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.SHORT);
        System.out.println(shortNFLocaleGerman.format(1000)); // 1.000
        System.out.println(shortNFLocaleGerman.format(1_000_000)); // 1 Mio.
        System.out.println(shortNFLocaleGerman.format(1500)); // 1.500
        shortNFLocaleGerman.setRoundingMode(RoundingMode.UP);
        System.out.println(shortNFLocaleGerman.format(1500)); // 1.500
        shortNFLocaleGerman.setMaximumFractionDigits(2);
        System.out.println(shortNFLocaleGerman.format(1500)); // 1.500

    }
}
