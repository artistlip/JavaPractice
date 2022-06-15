/*
Простая справочная система.
 */
public class Help_30_04 {
    public static void main (String [] args)
    throws java.io.IOException {

        char choice;

        System.out.print("Справка\n 1. if\n 2. switch\nВыберите: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("Инструкция if:\n");
                System.out.println("if(условие) инструкция;");
                System.out.println("else инструкция;");
                break;
            case '2':
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println(" case константа:");
                System.out.println("  последовательность инструкций");
                System.out.println("  break");
                System.out.println(" // ...");
                break;
            default:
                System.out.print("Запрос не найден.");

        }
    }
}
