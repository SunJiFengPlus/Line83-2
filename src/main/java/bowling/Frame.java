package bowling;

/**
 * @author 孙继峰
 * @since 2020/10/27
 */
public interface Frame {
    /**
     * 获取本轮掷球得分
     */
    int getScore();

    /**
     * 获取轮次间隔
     */
    int getIndexGap();
}
