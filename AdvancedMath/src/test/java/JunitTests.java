import org.example.AdvMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

public class JunitTests {

    @Test
    @Tag("local")
    public void power_test()
    {

    }


    @Test
    @Tag("local")
    public void root_test()
    {
        System.out.println("Starting root testing:");
        Exception e = Assertions.assertThrows(IllegalArgumentException.class, ()->AdvMath.root(-1, 5));
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
