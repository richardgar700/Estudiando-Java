//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

     //Ternary operators es un if y else en una sola linea. se usan cuando la logica es simple

    /*
    int numero = 0;
    String resultado = (numero > 0) ? "POSITIVO" : "NEGATIVO";
    System.out.println(resultado);

     */

    int numero = 0;

    String resultado = (numero > 0) ? "POSITIVO" :
            (numero < 0) ? "NEGATIVO" :
                    "CERO";

    System.out.println(resultado);


}


