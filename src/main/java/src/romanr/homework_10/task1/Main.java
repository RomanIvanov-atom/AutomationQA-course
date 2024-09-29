package src.romanr.homework_10.task1;

public class Main {
    public static void main(String[] args) {
        final String documentNumber = "1234-qwe-5678-abc-9u0i";

        String twoFirstDigitBlocks = StringWorker.getTwoFirstDigitBlocks(documentNumber);
        System.out.println(twoFirstDigitBlocks);

        String documentWithout3digitBlocks = StringWorker.getStringWithout3digitBlocks(documentNumber);
        System.out.println(documentWithout3digitBlocks);

        String onlyLettersInDocument = StringWorker.getOnlyLetters(documentNumber);
        System.out.println(onlyLettersInDocument);

        String onlyLettersInDocumentInHighRegister = StringWorker.getOnlyLettersInHighRegister(documentNumber);
        System.out.println(onlyLettersInDocumentInHighRegister);

        String textAboutIsContainsABCOrNot = StringWorker.isContainsABC(documentNumber);
        System.out.println(textAboutIsContainsABCOrNot);

        String textAboutIsStartsWith555 = StringWorker.isStartsWith555(documentNumber);
        System.out.println(textAboutIsStartsWith555);

        String textAboutIsEndsWith1a2b = StringWorker.isEndsWith1a2b(documentNumber);
        System.out.println(textAboutIsEndsWith1a2b);
    }
}
