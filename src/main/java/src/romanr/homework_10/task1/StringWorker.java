package src.romanr.homework_10.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWorker {

    public static String getTwoFirstDigitBlocks(String documentNumber) {
        StringBuilder sb = new StringBuilder();

        Pattern pattern = Pattern.compile("\\d{4}");
        Matcher matcher = pattern.matcher(documentNumber);

        while (matcher.find()) {
            sb.append(matcher.group());
        }

        return sb.toString();
    }

    public static String getStringWithout3digitBlocks(String documentNumber) {
        StringBuilder sb = new StringBuilder();

        Pattern pattern = Pattern.compile("[a-zA-Z]{3}");
        Matcher matcher = pattern.matcher(documentNumber);

        int lastMatchIndex = 0;

        while (matcher.find()) {
            sb.append(documentNumber, lastMatchIndex, matcher.start());
            sb.append("***");
            lastMatchIndex = matcher.end();
        }

        sb.append(documentNumber, lastMatchIndex, documentNumber.length());
        return sb.toString();
    }

    public static String getOnlyLetters(String documentNumber) {
        StringBuilder sb = new StringBuilder();

        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(documentNumber);

        int lettersCount = 0;

        while (matcher.find()) {
            sb.append(matcher.group().toLowerCase());
            lettersCount++;

            if (lettersCount == 3 || lettersCount == 6 || lettersCount == 7) {
                sb.append('/');
            }
        }

        return sb.toString();
    }
    public static String getOnlyLettersInHighRegister(String documentNumber) {
        StringBuilder sb = new StringBuilder();
        sb.append("Letters:");

        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(documentNumber);

        int lettersCount = 0;

        while (matcher.find()) {
            sb.append(matcher.group().toUpperCase());
            lettersCount++;

            if (lettersCount == 3 || lettersCount == 6 || lettersCount == 7) {
                sb.append('/');
            }
        }

        return sb.toString();
    }

    public static String isContainsABC(String documentNumber) {

        Pattern pattern = Pattern.compile("abc", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(documentNumber);

        if (matcher.find()) {
            return "Document contains 'abc' string";
        }
        else {
            return "Document doesn't contains 'abc' string";
        }
    }

    public static String isStartsWith555(String documentNumber) {
        Pattern pattern = Pattern.compile("^555");
        Matcher matcher = pattern.matcher(documentNumber);

        if (matcher.find()) {
            return "Document number starts with '555'";
        } else {
            return "Document number doesn't start with '555'";
        }
    }

    public static String isEndsWith1a2b(String documentNumber) {
        Pattern pattern = Pattern.compile("1a2b$");
        Matcher matcher = pattern.matcher(documentNumber);

        if (matcher.find()) {
            return "Document number ends with '1a2b'";
        } else {
            return "Document number doesn't end with '1a2b'";
        }
    }


}
