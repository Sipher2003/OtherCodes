public class Maze {

    public static void main(String[] args) {
        // System.out.println(count(3, 3));

        // path("", 3, 3);
        diagonalpath("", 5, 3);
    }

    // count number of paths
    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    // print all paths
    static void path(String s, int r, int c) {
        if (c == 1 && r == 1) {
            System.out.println(s);
            return;
        }

        if (r > 1) {
            path(s + 'd', r - 1, c);
        }

        if (c > 1) {
            path(s + 'r', r, c - 1);
        }
    }

    // include diagonal paths
    static void diagonalpath(String s, int r, int c) {
        if (c == 1 && r == 1) {
            System.out.println(s);
            return;
        }

        if (r > 1 && c > 1) {
            diagonalpath(s + 'D', r - 1, c - 1);
        }

        if (r > 1) {
            diagonalpath(s + 'V', r - 1, c);
        }

        if (c > 1) {
            path(s + 'r', r, c - 1);
        }
    }

}
