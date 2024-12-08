import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int cards[] = { 10, 0, 5, 3, 11, 7, 2};
        System.out.println("Before Selection sort: " + Arrays.toString(cards));
        SSort(cards);
        System.out.println("After Selection sort" +Arrays.toString(cards));

    }
    private static void SSort(int[] cards){
        for (int i = 0; i < cards.length-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < cards.length; j++) {
                if (cards[j] < cards[minIdx])
                    minIdx = j;

            }
            if (minIdx != i){
                int tempCard = cards[minIdx];
                cards[minIdx] = cards[i];
                cards[i] = tempCard;
            }
                  }
    }
}
