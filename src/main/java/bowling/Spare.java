package bowling;

/**
 * @author 孙继峰
 * @since 2020/10/28
 */
public class Spare extends AbsFrame {
    public Spare(int[] rolls, int frameIndex) {
        super(rolls, frameIndex);
    }

    @Override
    public int getScore() {
        return 10 + rolls[frameIndex + 2];
    }

    @Override
    public int getIndexGap() {
        return 2;
    }
}
