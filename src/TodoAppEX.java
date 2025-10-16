import java.util.ArrayList;
import java.util.Scanner;

public class TodoAppEX {
	public static void main(String[] args) {

		ArrayList<String> tasks = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n===== TO-DO LIST =====");
			System.out.println("1. Add Task");
			System.out.println("2. View Tasks");
			System.out.println("3. Delete Task");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.print("Enter task: ");
				String task = sc.nextLine();
				tasks.add(task);
				System.out.println(" Task added successfully!");

			} else if (choice == 2) {
				System.out.println("\n--- Your Tasks ---");
				if (tasks.isEmpty()) {
					System.out.println(" No tasks available!");
				} else {
					for (int i = 0; i < tasks.size(); i++) {
						System.out.println((i + 1) + ". " + tasks.get(i));
					}
				}

			} else if (choice == 3) {
				if (tasks.isEmpty()) {
					System.out.println(" No tasks to delete!");
				} else {
					System.out.print("Enter task number to delete: ");
					int index = sc.nextInt();
					sc.nextLine();
					if (index >= 1 && index <= tasks.size()) {
						System.out.println("Deleted: " + tasks.remove(index - 1));
					} else {
						System.out.println("Invalid task number!");
					}
				}

			} else if (choice == 4) {
				System.out.println("Exiting... Have a productive day!");
				break;

			} else {
				System.out.println("Invalid choice! Please select 1–4.");
			}
		}

		sc.close();
	}
}
