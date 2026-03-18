//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    final byte PERCENT = 100;        // las constnates se definen en mayusculas acompañado de final  //
    final byte MONTHS_IN_YEAR = 12;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Principal: ");
    int amountOfMoney = scanner.nextInt();
    //System.out.println("Amount of Money " + amountOfMoney);

    System.out.print("Annual Interes Rate: ");
    float annualInterstRate = scanner.nextFloat(); // 5.00
    float montlyInterestRate =  (annualInterstRate / PERCENT) / MONTHS_IN_YEAR;

    System.out.print("Period (Years): ");
    int years = scanner.nextInt();
    int amountOfPayments = years * MONTHS_IN_YEAR;


    double mortage = amountOfMoney * (montlyInterestRate * Math.pow(1 + montlyInterestRate, amountOfPayments)) / (Math.pow(1 + montlyInterestRate, amountOfPayments) - 1);

   NumberFormat currency = NumberFormat.getCurrencyInstance(); // esta clase es abstracta no se puede instanciar
    String result = currency.format(mortage); // devuelve un string y se almacena como string

//String result = NumberFormat.getCurrencyInstance().format(mortage); // segunda forma
   System.out.println("Pago mensual: " + result);
}


