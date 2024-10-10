package src.romanr.hometask_12.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> documentsSet = new HashSet<>();
        Map<String, Boolean> validateMap = new HashMap<>();
        Map<String, Integer> counterMap = new HashMap<>();

        while (true) {
            System.out.println("Введите номер документа в одну строку или 0 для выхода");
            String gottenDocument = sc.next();
            if (gottenDocument.equals("0")) {
                System.out.println("Проихсодит выход из программы...");
                break;
            }
            System.out.println("Получено: " + gottenDocument);

            if (documentsSet.add(gottenDocument)) {
                counterMap.put(gottenDocument, 1);
            } else {
                int curValue = counterMap.get(gottenDocument);
                counterMap.put(gottenDocument, ++curValue);
            }
        }

        for (String document : documentsSet) {
            System.out.print("Документ: " + document);
            boolean isValid = isDocumentValid(document);
            validateMap.put(document, isValid);
            if (isValid) {
                System.out.print(" валиден. ");
            } else {
                System.out.print(" не валиден. ");
            }
            System.out.print("Встречался " + counterMap.get(document) + " раз.\n");
        }
        sc.close();
    }

    public static boolean isDocumentValid(String documentNumber) {
        if (documentNumber.length() != 15) {
            return false;
        }
        return documentNumber.startsWith("docnum") || documentNumber.startsWith("kontract");
    }
}
