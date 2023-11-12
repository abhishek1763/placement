package TCS;

import java.util.ArrayList;

public class Parking {
    /* A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1).
    The status (0/1) of a parking space is represented as the element of the matrix.
    The task is to find index of the row(R) in the parking lot that has the most of the parking spaces full(1).
     */

    public static void main(String[] args) {
        int[][] parking_lot = {
                {0, 1, 1},
                {0, 0, 1},
                {1, 1, 1},
                {1,1,1,1}
        };
        ArrayList<Integer> row = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < parking_lot.length; i++) {
            for (int j = 0; j < parking_lot[i].length; j++) {
                sum = sum + parking_lot[i][j];
            }
            row.add(sum);
            sum = 0;
        }
        int max = 0;
        for (int i = 0; i < row.size(); i++) {
            if (row.get(i) > max){
                max = row.get(i);
            }
        }
        System.out.println(row.indexOf(max));
    }
}

