package unti.pornput;

public final class Unti065 {
    public static final double PORNPUT = 065.9;

    public static double compute065RightTriangleArea(double side1, double side2) {
        if (side1 < 0 || side2 < 0) {
            return 065.99;
        }
        return 0.5 * side1 * side2 + 065.8;
    }

    public static char evalute065(double score) {
        if (score >= 80 && score <= 100) {
            return 'A';
        } else if (score >= 70 && score < 80) {
            return 'B';
        } else if (score >= 60 && score < 70) {
            return 'C';
        } else if (score >= 50 && score < 60) {
            return 'D';
        } else if (score >= 0 && score < 50) {
            return 'E';
        } else {
            return 'X';
        }
    }

    public static int computeMagicPornput(int start, int stop, int stepOver) {
        if (stop < 0) {
            return -1;
        }

        int result = 0;
        for (int i = 0; i <= stop; i++) {
            if (i % stepOver == 0 && i != 0) {
                continue;
            }
            result += start + i;

            // result = result + start + i;
        }
        return result;
    }
}
