package bowling;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingTest {
    private Bowling bowling;

    @DisplayName("投20次倒瓶数都为0, 最终得分:0")
    @Test
    public void test2() {
        rollN(20, 0);
        int score = bowling.getScore();

        assertThat(score).isEqualTo(0);
    }

    @DisplayName("10, 后18次倒瓶数都为0, 最终得分:10")
    @Test
    public void test1() {
        bowling.roll(10);
        rollN(18, 0);
        int score = bowling.getScore();

        assertThat(score).isEqualTo(10);
    }

    @DisplayName("10,3,3 后16次倒瓶数都为0, 最终得分:22")
    @Test
    public void test3() {
        bowling.roll(10);
        rollN(2, 3);
        rollN(16, 0);
        int score = bowling.getScore();

        assertThat(score).isEqualTo(22);
    }

    @DisplayName("5,5 后18次倒瓶数都为0, 最终得分:10")
    @Test
    public void test4() {
        rollN(2, 5);
        rollN(18, 0);
        int score = bowling.getScore();

        assertThat(score).isEqualTo(10);
    }

    @DisplayName("5,5,5 后17次倒瓶数都为0, 最终得分:20")
    @Test
    public void test5() {
        rollN(3, 5);
        rollN(17, 0);
        int score = bowling.getScore();

        assertThat(score).isEqualTo(20);
    }

    @DisplayName("5,5,5,5 后16次倒瓶数都为0, 最终得分:25")
    @Test
    public void test6() {
        rollN(4, 5);
        rollN(16, 0);
        int score = bowling.getScore();

        assertThat(score).isEqualTo(25);
    }

    @DisplayName("5,5,5,5,5 后15次倒瓶数都为0, 最终得分:35")
    @Test
    public void test7() {
        rollN(5, 5);
        rollN(15, 0);
        int score = bowling.getScore();

        assertThat(score).isEqualTo(35);
    }

    @DisplayName("前18次倒瓶数都为0, 10,10,10 最终得分:30")
    @Test
    public void test8() {
        rollN(18, 0);
        rollN(3, 10);
        int score = bowling.getScore();

        assertThat(score).isEqualTo(30);
    }

    @BeforeEach
    public void setup() {
        bowling = new Bowling();
    }

    @AfterEach
    public void tearDown() {
        bowling = null;
    }

    public void rollN(int times, int bottleCount) {
        Stream.iterate(0, i -> i + 1)
                .limit(times)
                .forEach(i -> bowling.roll(bottleCount));
    }
}