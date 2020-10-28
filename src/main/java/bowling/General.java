package bowling;

/**
 * @author 孙继峰
 * @since 2020/10/28
 */
public class General extends AbstractFrame {
    public General(int[] rolls, int frameIndex) {
        super(rolls, frameIndex);
    }

    @Override
    public int getScore() {
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }

    @Override
    public int getIndexGap() {
        return 2;
    }
}
