package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int j = 0; j < (height + 1) / 2; j++) {
            for (int i = 0; i < height / 2; i++) {
                if (i >= j) {
                    System.out.print(8);
                } else {
                    System.out.print(' ');
                }
            }
            for (int i = height / 2; i < height; i++) {
                if (i <= height - j - 1) {
                    System.out.print(8);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        for (int j = 0; j < height / 2; j++) {
            for (int i = 0; i < height / 2; i++) {
                if (i >= height / 2 - 1 - j) {
                    System.out.print(8);
                } else {
                    System.out.print(' ');
                }
            }
            for (int i = height / 2; i < height; i++) {
                if (i <= (height + 1) / 2 + j) {
                    System.out.print(8);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
