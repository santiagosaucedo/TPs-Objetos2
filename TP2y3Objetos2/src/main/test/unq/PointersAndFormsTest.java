package unq;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PointersAndFormsTest {
        private Square sucuare;
        private Rectangle rectangle;
        private Point point;
        private Point point00;

        @BeforeEach
        public void setUp(){
            point00 = new Point();
            point = new Point(1,2);
            sucuare = new Square(point , 4);
            rectangle = new Rectangle(point00, 5, 10);

        }

        @Test
        public void isVertical(){
            assertTrue(rectangle.isVertical());
        }

        @Test
        public void squareAreaIsCorrect(){
            int totalArea = sucuare.getArea();
            assertEquals(16, totalArea);
        }

        @Test
        public void rectangleThrowsErrorWithInvalidDimensions() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                new Rectangle(point00, 0, 5);});
            assertEquals("not valid width or height", exception.getMessage());
        }

        @Test
        public void rectangleThrowsErrorWithNullOrigin() {
            assertThrows(IllegalArgumentException.class, () -> {
                new Rectangle(null, 10, 5);
            });
        }


}
