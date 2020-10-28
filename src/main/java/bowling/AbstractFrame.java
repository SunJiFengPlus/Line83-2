package bowling;

/**
 * @author 孙继峰
 * @since 2020/10/27
 */
public abstract class AbstractFrame implements Frame {
    public static final int ALL_BALL = 10;

    int[] rolls;
    int frameIndex;

    public AbstractFrame(int[] rolls, int frameIndex){
        this.rolls = rolls;
        this.frameIndex = frameIndex;
    }

    public static AbstractFrame of(int[] rolls, int frameIndex) {
        if (rolls[frameIndex] == ALL_BALL) {
            return new Strike(rolls, frameIndex);
        } else if (rolls[frameIndex] + rolls[frameIndex + 1] == ALL_BALL) {
            return new Spare(rolls, frameIndex);
        } else {
            return new General(rolls, frameIndex);
        }
    }
}
