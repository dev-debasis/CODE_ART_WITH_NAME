public class Debasis {
    public static void main(String... args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < n - 1 || j == n - 1 && i > 0 && i < n - 1 || i == n - 1 && j < n - 1) { // D
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print("   ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == (n - 1) / 2 || i == n - 1) { // E
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print("   ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < n - 1 || i == (n - 1) / 2 && j < n - 1 || i == n - 1 && j < n - 1
                        || j == n - 1 && i > 0 && i < (n - 1) / 2 || j == n - 1 && i > (n - 1) / 2 && i < n - 1) { // B
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print("   ");
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 || i == 0 && j > 0 && j < n - 1 || j == n - 1 && i > 0 || i == (n - 1) / 2) { // A
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print("   ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 && i <= (n - 1) / 2 || i == (n - 1) / 2
                        || j == n - 1 && i >= (n - 1) / 2) { // S
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print("   ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == (n - 1) / 2) { // I
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print("   ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 && i <= (n - 1) / 2 || i == (n - 1) / 2
                        || j == n - 1 && i >= (n - 1) / 2) { // S
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.println(" ");
        }

    }
}
