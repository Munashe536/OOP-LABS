


class Payment {
    final double amount;
    Payment(double amount) { this.amount = amount; }
}

class CardPayment extends Payment {
    final String cardNumber;
    CardPayment(double amount, String cardNumber) { super(amount); this.cardNumber = cardNumber; }
}

class MobileMoneyPayment extends Payment {
    final String phone;
    MobileMoneyPayment(double amount, String phone) { super(amount); this.phone = phone; }
}

class PaymentProcessor {

    void pay(Payment p) {
        if (p instanceof CardPayment c) {
            System.out.printf("Charging card ending %s: %.2f%n",
                    c.cardNumber.substring(c.cardNumber.length() - 4), c.amount);
        } else if (p instanceof MobileMoneyPayment m) {
            System.out.printf("Requesting mobile money from %s: %.2f%n", m.phone, m.amount);
        } else {
            throw new IllegalArgumentException("Unsupported payment type: " + p.getClass().getSimpleName());
        }
    }
}


abstract class Payment2 {
    final double amount;
    Payment2(double amount) { this.amount = amount; }
    abstract void process();                
}

class CardPayment2 extends Payment2 {
    final String cardNumber;
    CardPayment2(double amount, String cardNumber) { super(amount); this.cardNumber = cardNumber; }
    @Override void process() {
        System.out.printf("Charging card ending %s: %.2f%n",
                cardNumber.substring(cardNumber.length() - 4), amount);
    }
}

class MobileMoneyPayment2 extends Payment2 {
    final String phone;
    MobileMoneyPayment2(double amount, String phone) { super(amount); this.phone = phone; }
    @Override void process() {
        System.out.printf("Requesting mobile money from %s: %.2f%n", phone, amount);
    }
}

class CashPayment2 extends Payment2 {
    CashPayment2(double amount) { super(amount); }
    @Override void process() { System.out.printf("Collecting cash at the counter: %.2f%n", amount); }
}

public class PaymentDemo {
    public static void main(String[] args) {
        System.out.println("--- Design 1: instanceof ---");
        PaymentProcessor proc = new PaymentProcessor();
        proc.pay(new CardPayment(120.50, "4111111111111234"));
        proc.pay(new MobileMoneyPayment(35.00, "+263771234567"));
        try {
            proc.pay(new Payment(10));        
        } catch (IllegalArgumentException e) {
            System.out.println("Failed at run time: " + e.getMessage());
        }

        System.out.println("\n--- Design 2: polymorphic process() ---");
        Payment2[] payments = {
            new CardPayment2(120.50, "4111111111111234"),
            new MobileMoneyPayment2(35.00, "+263771234567"),
            new CashPayment2(10.00)
        };
        for (Payment2 p : payments) {
            p.process();                       
        }

        System.out.println("\nCOMPARISON:");
        System.out.println(" Design 1: logic centralised in one place, easy to read for 2 types,");
        System.out.println("           but every new payment type means EDITING pay() (an easy-to-forget");
        System.out.println("           else-if) and unknown types only fail at RUN TIME.");
        System.out.println(" Design 2: adding a type = adding a class (open for extension, closed for");
        System.out.println("           modification); the compiler forces every subclass to implement");
        System.out.println("           process(). Slight cost: payment classes now hold processing code.");
        System.out.println(" instanceof is still right when you cannot change the classes (library types).");
    }
}
