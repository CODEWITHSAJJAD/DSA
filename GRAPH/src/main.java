import java.util.*;
public class main {
	 public static void main(String[] args) {
		 	byArray g = new byArray();
	        Scanner scanner = new Scanner(System.in);
	        int choice, val;
	        String name, from, to, data;
	        do {
	            System.out.println("1. Insert Node");
	            System.out.println("2. Add edge");
	            System.out.println("3. Search ");
	            System.out.println("4. Display all rate");
	            System.out.println("5. Display ");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter data to insert: ");
	                    data = scanner.nextLine();
	                    g.addNode(data);
	                    break;
	                case 2:
	                    System.out.print("Enter from node: ");
	                    from = scanner.nextLine();
	                    System.out.print("Enter to node: ");
	                    to = scanner.nextLine();
	                    System.out.print("Enter value: ");
	                    val = scanner.nextInt();
	                    g.addEdge(from, to, val);
	                    break;
	                case 3:
	                    System.out.print("Enter  node name: ");
	                    name = scanner.nextLine();
	                    g.search(name);
	                    break;
	                case 4:
	                    g.displayRate();
	                    break;
	                case 5:
	                    g.displayNodes();
	                    break;
	                case 0:
	                    System.out.println("Exiting the program. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        } while (choice != 0);
	        scanner.close();
	    }
}
