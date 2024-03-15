package lsp1;

import lsp1.shape.Quadrilateral;
import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Quadrilateral rectangle = new Square(5);
        ShapeView view = new ShapeView(rectangle);
        view.showArea();
    }
}
