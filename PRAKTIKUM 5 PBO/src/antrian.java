import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class antrian {
//msih salah

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Queue<Integer> queue = new LinkedList<>();
            char choice;

            do {
                System.out.println("Queue operations:");
                System.out.println("1. Insert");
                System.out.println("2. Remove");
                System.out.println("3. Peek");
                System.out.println("4. Check empty");
                System.out.println("5. Check full");
                System.out.println("6. Size");
                System.out.print("Your choice? (1-6): ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("Enter the element to insert: ");
                        int element = scanner.nextInt();
                        queue.add(element);
                        break;
                    case 2:
                        if (!queue.isEmpty()) {
                            System.out.println("Removed element: " + queue.poll());
                        } else {
                            System.out.println("Queue is empty");
                        }
                        break;
                    case 3:
                        if (!queue.isEmpty()) {
                            System.out.println("Peek element: " + queue.peek());
                        } else {
                            System.out.println("Queue is empty");
                        }
                        break;
                    case 4:
                        System.out.println("Queue is empty: " + queue.isEmpty());
                        break;
                    case 5://salah
                        // Since Queue in Java doesn't have a fixed size, it's always not full
                        System.out.println("Queue is full: false");
                        break;
                    case 6://salah
                        System.out.println("Size = " + queue.size());
                        System.out.print("Queue = ");
                        for (Integer item : queue) {
                            System.out.print(item + " ");
                        }
                        System.out.println();
                        break;
                    default:
                        System.out.println("Invalid choice");
                }

                System.out.print("Input data lagi [Y/T]? ");
                choice = scanner.next().charAt(0);
            } while (choice == 'Y' || choice == 'y');

            scanner.close();
        }


}
