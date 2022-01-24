//Open AssignmentQ1 class
public class ipjQ1 {
    public static void main(String [] args) {

        // Check if there is an argument
        if (args.length == 1) {
            // Set N as the argument and convert string to integer
            int N = Integer.parseInt(args[0]);
            // 'for' loop will execute number of times that N argument specific
            for (int x = 1; x <= N; x++) {  // 'N' receive input
                for (int y = 1; y <= x; y++) {
                    System.out.print(". ");     // Print instead of println,because println will line up in one line
                }
                for (int y = x; y < N; y++) {
                    System.out.print("* ");
                }
                System.out.println();       // To print the result in the loop.
            }
        } else {
            // If no digits indicate in command line, this print statement will execute.
            System.out.println("Please provide above number in the command line.");
        }
    }
}