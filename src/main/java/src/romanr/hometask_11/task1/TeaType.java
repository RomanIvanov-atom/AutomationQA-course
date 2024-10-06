package src.romanr.hometask_11.task1;

import java.util.Random;

public enum TeaType {
    BLACK("'Черный чай'"),
    GREEN("'Зеленый чай'"),
    WHITE("'Белый чай'");

    private final String typeName;

    TeaType (String typeName) {
        this.typeName = typeName;
    }

    static final Random random = new Random();
    private static TeaType getRandomTeaType() {
        return TeaType.values()[random.nextInt(TeaType.values().length)];
    }
    public static String getRandomTeaTypeName() {
        return getRandomTeaType().getTypeName();
    }

    public String getTypeName() {
        return typeName;
    }
}
