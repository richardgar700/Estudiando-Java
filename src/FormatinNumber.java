//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
     // 11111222
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result = currency.format(123545676.890);
    System.out.println(result);
     // clases abstractas no se le crea objeto, no se instancia
}


