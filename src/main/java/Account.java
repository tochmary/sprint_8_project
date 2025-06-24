public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.

        int l = name.length();
        if ((l >= 3) && (l <= 19)) {
            int i = name.indexOf(' ');
            if ((i > 0) && (i < l - 1)) {
                i = name.indexOf(' ', i + 1);
                if (i == -1) {
                    return true;
                }
            }
        }
        return false; */
        return ((name.length() >= 3)
                && (name.length() <= 19)
               // && name.contains(" ")
                && !name.startsWith(" ")
                && !name.endsWith(" ")
                && name.split(" ").length == 2);
    }
}