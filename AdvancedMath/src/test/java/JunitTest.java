import org.example.AdvMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

public class JunitTest {

    @ParameterizedTest
    @ValueSource(doubles={0.0, 1.0, -2.5, 7.4})
    @Tag("local")
    public void power_test(double n)
    {
        System.out.println("Starting pow testing with argument "+n+":");
        Exception e = Assertions.assertThrows(IllegalArgumentException.class, ()->AdvMath.pow(-5, -5));
        Assumptions.assumeTrue(e.getMessage().equals("Power cannot be less than zero!"));
        System.out.println("    Power exception success!");
        Assumptions.assumeTrue(AdvMath.pow(n, 0)==1);
        System.out.println("    Power 0 success!");
        Assertions.assertTrue(AdvMath.pow(n, 5)==n*n*n*n*n);
        System.out.println("    Power 5 success!");
    }


    @Test
    @Tag("local")
    public void root_test()
    {
        System.out.println("Starting root testing:");
        Exception e = Assertions.assertThrows(IllegalArgumentException.class, ()->AdvMath.root(-5, 5));
        Assumptions.assumeTrue(e.getMessage().equals("Number cannot be less than zero!"));
        System.out.println("    Number exception success!");
        e = Assertions.assertThrows(IllegalArgumentException.class, ()->AdvMath.root(5, -2));
        Assumptions.assumeTrue(e.getMessage().equals("Power cannot be zero or less!"));
        e = Assertions.assertThrows(IllegalArgumentException.class, ()->AdvMath.root(5, 0));
        Assumptions.assumeTrue(e.getMessage().equals("Power cannot be zero or less!"));
        System.out.println("    Power exception success!");
        Assertions.assertTrue(Math.abs(AdvMath.root(70, 145)-1.02973)<=AdvMath.eps);
        System.out.println("    Calculation sample is correct!");
    }


}
