import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class queue {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> antrian = new LinkedList<>();

        char pilih;
        do {
            System.out.println("Queue Operations : ");
            System.out.println("1. Inset");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Check Full");
            System.out.println("6. Size");
            System.out.println("Your Choice? ");
            int seleksi = scanner.nextInt();

            switch (seleksi)
            {
                case 1:
                    System.out.println("Enter number of elements to insert : ");
                    int numelements = scanner.nextInt();
                    for (int i = 0; i<numelements; i++)
                    {
                        System.out.print("Enter element " + (i + 1) + ":");
                        int element = scanner.nextInt();
                        antrian.offer(element);
                    }
                    break;

                case 2:
                    if (!antrian.isEmpty())
                    {
                        int removeelements = antrian.poll();
                        System.out.println("Removed Elements : "+removeelements);
                    }else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 3:
                    if (!antrian.isEmpty())
                    {
                        int peekelement = antrian.peek();
                        System.out.println("Peeked Elements : "+peekelement);
                    }else {
                        System.out.println("Queue is empety");
                    }
                    break;
                case 4:
                    if (antrian.isEmpty())
                    {
                        System.out.println("Queue is empety");
                    }else {
                        System.out.println("Queue is not empety");
                    }
                    break;
                case 5:
                    System.out.println("Queue cannot become full");
                    break;
                case 6:
                    System.out.println("Size = " + antrian.size());
                    System.out.println("Queue = " + antrian);
                    break;
                default:
                    System.out.println("Invalid Option");
            }
            System.out.println("Do you want to continue (Type y or n)? ");
            pilih = scanner.next().charAt(0);
        }while (pilih == 'y' || pilih == 'Y');
        scanner.close();
    }
}
