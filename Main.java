class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Umur harus lebih dari 18 tahun.");
        } else {
            System.out.println("Lolos verivikasi umur.");
        }
    }
}
