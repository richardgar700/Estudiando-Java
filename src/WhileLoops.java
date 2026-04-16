//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner scanner = new Scanner(System.in);
    String input = "";
    while (!input.equals("quit")) {
        System.out.print("Input: ");
        input = scanner.next().toLowerCase();
        System.out.println(input);
    }

}


