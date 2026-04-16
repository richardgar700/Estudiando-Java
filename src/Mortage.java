//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner scanner = new Scanner(System.in);

    final byte PERCENT = 100;
    final byte MONTHS_IN_YEAR = 12;
    int amountOfMoney = 0;

    while (true){
        System.out.print("Principal: ");
        amountOfMoney = scanner.nextInt(); // 200,000
        if (amountOfMoney >= 1000 && amountOfMoney <= 1_000_000)
            break;
        System.out.println("Enter a value between 1000 and 1,000,000");
    }

    System.out.print("Annual Interes Rate: ");
    float annualInterstRate = scanner.nextFloat(); // 5.00

    System.out.print("Period (Years): ");
    int years = scanner.nextInt(); // 30

    float montlyInterestRate =  (annualInterstRate / PERCENT / MONTHS_IN_YEAR);

    int amountOfPayments = years * MONTHS_IN_YEAR;

    double mortage = amountOfMoney * (montlyInterestRate * Math.pow(1 + montlyInterestRate, amountOfPayments)) / (Math.pow(1 + montlyInterestRate, amountOfPayments) - 1);

    NumberFormat currency = NumberFormat.getCurrencyInstance(); // esta clase es abstracta no se puede instanciar
    String result = currency.format(mortage); // devuelve un string y se almacena como string

    //String result = NumberFormat.getCurrencyInstance().format(mortage); // segunda forma

    System.out.println("Pago mensual: " + result);
}


