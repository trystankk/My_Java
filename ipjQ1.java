//Open AssignmentQ1 class
/* First open public class follow by public static void main string  arguments. ‘if’ to check is there’s an argument in it. 
    Set ‘N’ as the argument and convert from string to integer. Then use ‘for’ to run the loop to execute times  
    that ‘N’ argument has specific. ‘x’ is row and ‘y’ is column. Number of N input is how many times ‘for’ loop run 
    and print the ‘.’ and ‘*’ accordingly from the formular.  The digits of ‘N’ should comment in the command line.*/

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
