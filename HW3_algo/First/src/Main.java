import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[][] teams = {
                { 45, 31, 24, 22, 20, 17, 14, 13, 12, 10 },
                { 31, 18, 15, 12, 10, 8, 6, 4, 2, 1 },
                { 51, 30, 10, 9, 8, 7, 6, 5, 2, 1 }
        };

        int[] nationalTeam = mergeAll(teams);
        System.out.println(Arrays.toString(nationalTeam)); // [51, 45, 31, 31, 30, 24, 22, 20, 18, 17]
    }

    /** Метод для слияния всех команд в одну национальную */
    public static int[] mergeAll(int[][] teams) {
        int[] res = teams[0];
        for (int i = 1; i < teams.length; ++i) {
            res = merge(res, teams[i]);
        }
        return res;
    }

    /** Метод для слияния двух команд в одну */
    public static int[] merge(int[] teamA, int[] teamB) {
        int[] teamC = new int[10];
        int ia = 0;
        int ib = 0;
        int ic = 0;
        while (ic < 10) {   // когда ic станет 10, то гарантированно ia <= 10 и ib <= 10
            if (teamA[ia] >= teamB[ib]) {
                teamC[ic] = teamA[ia];
                ++ia;
                ++ic;
            } else {
                teamC[ic] = teamB[ib];
                ++ib;
                ++ic;
            }
        }
        return teamC;
    }
}
