import java.util.Scanner;
public class PascalTriangle {

    private static int findElement(int r, int c){
        if(c == 0 || c == r) return 1;
        else return findElement(r-1, c-1) + findElement(r-1, c);
    }

    private static void printTringle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(findElement(i, j) + " ");
            }
            System.out.println();
        }
    }

    private static void printRow(int row){
        for(int j = 0; j <= row; j++){
            System.out.println(findElement(row, j) + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("what you want to do :");
        System.out.println("1. print pascal triangle");
        System.out.println("2. find element in pascal triangle");
        System.out.println("3. Print entire row");
        System.out.println("4. exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1: printTringle();
            case 2: 
            System.out.println("ent er row no.");
            int row = sc.nextInt();
            System.out.println("enter column no.");
            int col = sc.nextInt();
            System.out.println("element at ("+row+","+col+") is "+findElement(row,col));
            case 3:
            System.out.println("enter row no.");
            int row1 = sc.nextInt();
            printRow(row1);
            case 4:
            System.out.println("Good bye!");
        }
    }
}
