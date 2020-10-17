package io.github.lvgocc.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GraphicsTest {
    @Test
    void graphicsTest() throws CloneNotSupportedException {
        Size size = new Size(1, 2);
        Graphics graphics = new Graphics("red", "circular", size);
        Graphics clone = graphics.clone();
        size.height = 3;
        size.width = 5;
        System.out.println("graphics = " + graphics);
        // 判断两个对象是否不同
        Assertions.assertNotSame(graphics, clone);
        clone.setColor("blue");
        clone.setShape("square");
        System.out.println("clone = " + clone);
    }
}
