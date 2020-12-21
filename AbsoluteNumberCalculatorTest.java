import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    public void test(){
        int number=0;
        int exp= 0;
        int result= AbsoluteNumberCalculator.find(number);
        assertEquals(exp,result);
    }

    @Test
    public void test2(){
        int number=1;
        int exp=1;
        int result=AbsoluteNumberCalculator.find(number);
        assertEquals(exp,result);
    }
    @Test
    public void test3(){
        int number =-1;
        int exp = 1;
        int result= AbsoluteNumberCalculator.find(number);
        assertEquals(exp,result);
    }

}