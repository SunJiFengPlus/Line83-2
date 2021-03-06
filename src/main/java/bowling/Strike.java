package bowling;

/**
 * @author 孙继峰
 * @since 2020/10/27
 */
public class Strike extends AbstractFrame {
    public Strike(int[] rolls, int frameIndex) {
        super(rolls, frameIndex);
    }

    @Override
    public int getScore() {
        return 10 + rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    @Override
    public int getIndexGap() {
        return 1;
    }
}
