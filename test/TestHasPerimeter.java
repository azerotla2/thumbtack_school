package test;

import net.thumbtack.school.figures.v3.Ellipse;
import net.thumbtack.school.figures.v3.FilledEllipse;
import net.thumbtack.school.fillStyle.v3.FillStyle;
import net.thumbtack.school.fillStyle.v3.FillStyleException;
import net.thumbtack.school.iface.v3.HasPerimeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHasPerimeter {

    private static final double DOUBLE_EPS = 1E-6;

    @Test
    public void testComparePerimeter1() {
        HasPerimeter ellipse1 = new Ellipse(0, 0, 10, 10);
        HasPerimeter ellipse2 = new Ellipse(10, 10, 10, 10);
        assertEquals(ellipse1.getPerimeter(), ellipse2.getPerimeter(), DOUBLE_EPS);
    }

    @Test
    public void testComparePerimeter2() throws FillStyleException {
        HasPerimeter ellipse1 = new Ellipse(0, 0, 10, 10);
        HasPerimeter ellipse2 = new FilledEllipse(0, 0, 10, 10, FillStyle.SOLID_RED);
        assertEquals(ellipse1.getPerimeter(), ellipse2.getPerimeter(), DOUBLE_EPS);
    }
}
