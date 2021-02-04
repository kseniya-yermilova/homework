import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount salary = new BankAccount("4567847284595555", 10000.0);
        System.out.println("Сумма на зарплатном счету: " + salary.credit(10000.0));
        Scanner scanner = new Scanner(System.in);
        debitSalary(salary, scanner);
        double sum;
    }

    private static void debitSalary(BankAccount salary, Scanner scanner) {
        System.out.println("Введите сумму снятия с зарплатного счета: ");
        double sum = scanner.nextDouble();
        try {
            System.out.println("Остаток на зарплатном счету: " + salary.debit(sum));
        }
        catch (AmountExceededException e) {
            System.out.println("Сумма снятия превышает остаток на счету.");
            debitSalary(salary, scanner);
        }
    }
}
