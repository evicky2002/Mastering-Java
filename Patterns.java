class Patterns {
    public void solidRectangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public void hollowRectangle(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == n - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
    }

    public void halfPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Patterns patterns = new Patterns();
        patterns.halfPyramid(10);
    }
}