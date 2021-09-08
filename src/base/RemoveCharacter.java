package base;

public class RemoveCharacter {

    static int isPossible(String word) {
        int[] frequency = new int[26];

        for (int i = 0; i < word.length(); i++) {
            int num = Character.getNumericValue(word.charAt(i)) - Character.getNumericValue('a');
            frequency[num]++;
        }

        int minFreq = Integer.MAX_VALUE, maxFreq = Integer.MIN_VALUE;
        for (int i = 0; i < frequency.length; i++) {
            if(frequency[i] != 0 && frequency[i] < minFreq) {
                minFreq = frequency[i];
            }
            if (frequency[i] != 0 && frequency[i] > maxFreq) {
                maxFreq = frequency[i];
            }
        }

        return maxFreq-minFreq <= 1 ? 1 : 0;
    }

    public static void main(String[] args) {
        String word = "xxxxxyyz";
        System.out.println(isPossible(word));
    }
}
