package src.romanr.hometask_9.task1;

public enum UserAction {
    FEED_ALL(1, "feed avery animal in array"),
    DO_ANIMAL_ACTION(2, "do animal's action"),
    GET_ALL_INFO(3, "get on console all info about animals"),
    GET_NAMES(4, "get all names on console"),
    GET_AGES(5, "get all ages on console"),
    GET_IDS(6, "get all IDs on console"),
    EXIT(7, "exit from program");

    private final int code;
    private final String description;

    UserAction(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static UserAction valueOf (int code) throws Exception {
        UserAction[] values = UserAction.values();
        for (UserAction value : values) {
            if (value.code == code) {
                return value;
            }
        }

        throw new Exception("Illegal input! Number should be from 1 to 7!");
    }
}
