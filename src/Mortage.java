//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner scanner = new Scanner(System.in);

    final int percent = 100;

    System.out.print("Principal: ");
    int amountOfMoney = scanner.nextInt(); // 200,000
    //System.out.println("Amount of Money " + amountOfMoney);

    System.out.print("Annual Interes Rate: ");
    float annualInterstRate = scanner.nextFloat(); // 5.00
    //System.out.println("Interes rate " + annualInterstRate);

    System.out.print("Period (Years): ");
    int years = scanner.nextInt(); // 30

    float montlyInterestRate =  (annualInterstRate / 100) / 12;
    //System.out.println(montlyInterestRate);
  
    int amountOfPayments = years * 12;

    double mortage = amountOfMoney * (montlyInterestRate * Math.pow(1 + montlyInterestRate, amountOfPayments)) / (Math.pow(1 + montlyInterestRate, amountOfPayments) - 1);

    System.out.println("Pago mensual: " + mortage);
}


