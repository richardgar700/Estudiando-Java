//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


   // Primero tengo que tomar el numero del usuario.
    Scanner scanner = new Scanner(System.in);

    System.out.print("Inserte un numero: ");
    int numero = scanner.nextByte();
    // Segundo :  si el numero es divisible por 5 , devuelve fizz
    if (numero % 5 == 0 && numero % 3 == 0){
        System.out.println("FizzBuzz");
    } else if (numero % 5 == 0) {
        System.out.println("Fizz");
    } else if (numero % 3 == 0) {
        System.out.println("Buzz");
    }else if (numero <= 0){
        System.out.println(numero);
    } else {
        System.out.println("No aplica");
    }
    // Tercero : si el numero es divisible por 3 , devuelve buzz
    // Cuarto : si el numero es divisible por 5 y 3 devuelve FizzBuzz
    // Quinto : si el numero es divisible por 2 solo devuelve el numero
}


