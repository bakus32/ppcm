import org.example.Division;
import org.junit.Assert;
import org.junit.Test;

public class DivisionTest {


    @Test(expected = IllegalArgumentException.class)
    public void assertThrowIllegalArgumentExceptionWhenNumberEqualsToZero(){
        new Division(0).computeDivion();
    }

    @Test
    public void assertReturnOneWhenNumberEqualsToOne(){
        Assert.assertArrayEquals(new int[]{1}, new Division(1).computeDivion());
    }

    @Test
    public void assertReturnTwoWhenNumberEqualsToTwo(){
        Assert.assertArrayEquals(new int[]{2}, new Division(2).computeDivion());
    }

    @Test
    public void assertReturnThreeWhenNumberEqualsToThree(){
        Assert.assertArrayEquals(new int[]{3}, new Division(3).computeDivion());
    }

    @Test
    public void assertReturnFiveWhenNumberEqualsToFive(){
        Assert.assertArrayEquals(new int[]{5}, new Division(5).computeDivion());
    }

    @Test
    public void assertReturnElevenWhenNumberEqualsToEleven(){
        Assert.assertArrayEquals(new int[]{11}, new Division(11).computeDivion());
    }

    @Test
    public void assertReturnTwoAndThreeWhenNumberEqualsToSix(){
        Assert.assertArrayEquals(new int[]{2,3}, new Division(6).computeDivion());
    }

    @Test
    public void assertReturnTwoAndTwoWhenNumberEqualsToFour(){
        Assert.assertArrayEquals(new int[]{2,3}, new Division(6).computeDivion());
    }

    @Test
    public void assertReturnTwoThreeAndThreeWhenNumberEqualsToEighteen(){
        Assert.assertArrayEquals(new int[]{2,3,3}, new Division(18).computeDivion());
    }

    @Test
    public void assertReturnThreeThreeAndThreeWhenNumberEqualsToEighteen(){
        Assert.assertArrayEquals(new int[]{3,3,3}, new Division(27).computeDivion());
    }

    @Test
    public void assertReturnSevenAndSevenWhenNumberEqualsToEighteen(){
        Assert.assertArrayEquals(new int[]{7,7}, new Division(49).computeDivion());
    }

    @Test
    public void assertReturn2ThreeAndThirteenWhenNumberEqualsToSeventyEight(){
        Assert.assertArrayEquals(new int[]{2,3,13}, new Division(78).computeDivion());
    }

}
