public class EvenNumberException extends Exception {
    @Override
    public String getMessage() {
        return "Ошибка: сгенерировалось четное число.";
    }
}
