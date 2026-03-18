//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Name: ");
    String name = scanner.nextLine().trim();
    System.out.println("You are " + name);

    System.out.print("Age: ");
    byte age = scanner.nextByte();
    System.out.println("You are " + age);
}


