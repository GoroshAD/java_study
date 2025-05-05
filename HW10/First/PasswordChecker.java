public class PasswordChecker {
    private int minLength;
    private boolean minLengthSetted = false;
    private int maxRepeats = -1;
    private boolean maxRepeatsSetted = false;

    public void setMinLength(int minLength) {
        if (minLength < 0) {
            throw new IllegalArgumentException("отрицательное число");
        }
        this.minLength = minLength;
        this.minLengthSetted = true;
    }

    public void setMaxRepeats(int maxRepeats) {
        if (maxRepeats <= 0) {
            throw new IllegalArgumentException("отрицательное или нулевое число");
        }
        this.maxRepeats = maxRepeats;
        this.maxRepeatsSetted = true;
    }

    public boolean verify(String password) {
        if (!minLengthSetted) {
            throw new IllegalStateException("Отсутствует значение минимальной длины пароля");
        }
        if (!maxRepeatsSetted) {
            throw new IllegalStateException("Отсутствует значение количества максимального повторения символа");
        }
        if (password.length() < minLength) {
            return false;
        }
        if (password.isEmpty()) {
            return true;
        }
        char c = password.charAt(0);
        int i = 1;
        while (i < password.length()) {
            int tmpLength = 1;
            while (i < password.length() && password.charAt(i) == c) {
                ++tmpLength;
                ++i;
            }
            if (tmpLength > maxRepeats) {
                return false;
            }
            c = password.charAt(i);
            ++i;
        }
        return true;
    }
}
