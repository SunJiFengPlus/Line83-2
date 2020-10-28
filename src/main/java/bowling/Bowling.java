package bowling;

// Please don't modify the class name.
public class Bowling {
    int[] rolls = new int[21];
    int rollsIndex = 0;

    // Please don't modify the signature of this method.
    public void roll(int n) {
        this.rolls[rollsIndex] = n;
        this.rollsIndex++;
    }

    // Please don't modify the signature of this method.
    public int getScore() {
        int score = 0;
        int frameIndex = 0;
        for (int round = 0, finalRound = 10; round < finalRound; round++) {
            AbstractFrame frame = AbstractFrame.of(rolls, frameIndex);
            score += frame.getScore();
            frameIndex += frame.getIndexGap();
        }
        return score;
    }
}
