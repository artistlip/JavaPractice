import java.util.Scanner;
class Scanner_massive_index_18_04 {
    public static void main (String[] args) {

        String[] actress = {"Audrey Bittoni", "Sasha Grey", "Peta Jensen", "Madison Ivy", "Ava Addams"}; // Массив
        System.out.println("Посмотрите порнушку с 5 разными актрисами.");

        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("Введите индекс актрисы, которую хотите переместить в рейтинге:");
        System.out.println("1-"+actress[0]);
            System.out.println("2-"+actress[1]);
            System.out.println("3-"+actress[2]);
            System.out.println("4-"+actress[3]);
            System.out.println("5-"+actress[4]);
        System.out.println("6-Выход");

        // Считайте из консоли индекс актрисы, которое нужно переместить
        int firstIndex = scanner.nextInt()-1;
        if (firstIndex==5) {
            System.out.println("Ваш рейтинг порноактрис:");
            System.out.println("1-"+actress[0]);
            System.out.println("2-"+actress[1]);
            System.out.println("3-"+actress[2]);
            System.out.println("4-"+actress[3]);
            System.out.println("5-"+actress[4]);
            System.out.println("Выход");
            break;
        } else {
        System.out.println("Введите позицию, на которую хотите его переместить, от 1 до 5 (или 6 для выхода):");
        // Объявите переменную secondIndex для нового положения (индекса) актрисы, считайте его из консоли
        int secondIndex = scanner.nextInt()-1;
        if (secondIndex==5) {
            System.out.println("Ваш рейтинг порноактрис:");
            System.out.println("1-"+actress[0]);
            System.out.println("2-"+actress[1]);
            System.out.println("3-"+actress[2]);
            System.out.println("4-"+actress[3]);
            System.out.println("5-"+actress[4]);
            System.out.println("Выход");
            break;
        } else {
        // Сохраните значение актрисы под индексом firstIndex в переменную swap
        String swap = actress [firstIndex];

        // Присвойте актрисе с индексом firstIndex значение актрисы под индексом secondIndex
       actress [firstIndex] = actress [secondIndex];

        // Присвойте актрисе с индексом secondIndex значение переменной swap
        actress [secondIndex] = swap;

        System.out.println("Ваш рейтинг порноактрис:");
        System.out.println("1-"+actress[0]);
        System.out.println("2-"+actress[1]);
        System.out.println("3-"+actress[2]);
        System.out.println("4-"+actress[3]);
        System.out.println("5-"+actress[4]);
    }
}
        }
        scanner.close();
}
}
