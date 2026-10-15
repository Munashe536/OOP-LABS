 
public class RectangleDemo {
    public static void main(String[] args) {
        // EXPLAIN: new Rectangle[5] creates 5 EMPTY slots (all null) - not 5 rectangles yet
        Rectangle[] rects = new Rectangle[5];
        double[][] sizes = { {2, 3}, {5, 4}, {10, 1.5}, {3, 3}, {7, 2.5} };

        for (int i = 0; i < rects.length; i++) {
            rects[i] = new Rectangle();            // EXPLAIN: now each slot refers to an object
            rects[i].set(sizes[i][0], sizes[i][1]);
            rects[i].display();
        }

        // EXPLAIN: keep a REFERENCE to the best rectangle seen so far
        Rectangle largest = rects[0];
        for (Rectangle r : rects) {
            if (r.area() > largest.area()) {
                largest = r;
            }
        }
        System.out.println("\nLargest area:");
        largest.display();
    }
}
