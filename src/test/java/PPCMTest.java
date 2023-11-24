import org.example.PPCM;
import org.junit.Assert;
import org.junit.Test;

public class PPCMTest {


    @Test
    public void assertReturnNegativeNumberWhenFirstOrSecondNumberEqualsToZero(){

        Assert.assertEquals(-1, new PPCM(0,10).computePPCM());
        Assert.assertEquals(-1, new PPCM(10,0).computePPCM());
    }

    @Test
    public void assertReturnNegativeNumberWhenFirstAndSecondNumberEqualsToZero(){

        Assert.assertEquals(-1, new PPCM(0,0).computePPCM());
    }

    @Test
    public void assertReturnOneNumberWhenFirstAndSecondNumberEqualsToOne(){

        Assert.assertEquals(1, new PPCM(1,1).computePPCM());
    }

    @Test
    public void assertPPCMOfTwoAndThreeIsSix(){

        Assert.assertEquals(6, new PPCM(2,3).computePPCM());
    }

    @Test
    public void assertPPCMOfSixAndEighteenIsEighteen(){

        Assert.assertEquals(18, new PPCM(6,18).computePPCM());
    }

    @Test
    public void assertPPCMOfEighteenAndTwelveIsThirtySix(){

        Assert.assertEquals(36, new PPCM(12,18).computePPCM());
    }

    @Test
    public void assertPPCMOfEighteenAndFifteenIsNinety(){

        Assert.assertEquals(90, new PPCM(15,18).computePPCM());
    }

    @Test
    public void assertPPCMOfEighteenAndFifteenIsFourteen(){
        Assert.assertEquals(14, new PPCM(7,14).computePPCM());
    }

    @Test
    public void assertPPCMOfSesenteenAndSeventeenIsSeventeen(){

        Assert.assertEquals(17, new PPCM(17,17).computePPCM());
    }
}
