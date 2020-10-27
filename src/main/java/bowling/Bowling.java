package bowling;

// Please don't modify the class name.
public class Bowling {
    int score;
    int rolls[] = new int[21];
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
		for(int frame = 0; frame < 10; frame++ ) {
			if ( isStrike(frameIndex) ) {
				score += strikeBonus(frameIndex);
				frameIndex += 1;
			} else if ( isSpare(frameIndex) ) {
				score += spareBonus(frameIndex);
				frameIndex += 2;
			} else {
				score += sumOfBallsInFrame(frameIndex);
				frameIndex += 2;
			}
		}
		return score;
    }

	private int sumOfBallsInFrame(int frameIndex) {
		return rolls[frameIndex] + rolls[frameIndex+1];
	}

	private int spareBonus(int frameIndex) {
		return 10 + rolls[frameIndex+2];
	}

	private int strikeBonus(int frameIndex) {
		return 10 + rolls[frameIndex+1] + rolls[frameIndex+2];
	}

	private boolean isStrike(int frameIndex) {
		return rolls[frameIndex] == 10;
	}

	private boolean isSpare(int frameIndex) {
		return rolls[frameIndex] + rolls[frameIndex+1] == 10;
	}
}
