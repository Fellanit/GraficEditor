package graficEditor;

public class ShapesNamesTest {
    public static void main(String[] args) {
NamePooler namePooler = new NamePooler();

Shape nameCircle = new Circle();
Shape nameQuad = new Quad();
Shape nameTriangle = new Triangle();
Shape nameTrapeze = new Trapeze();
Shape nameRectangle = new Rectangle();

namePooler.displayName(nameCircle);
namePooler.displayName(nameQuad);
namePooler.displayName(nameTriangle);
namePooler.displayName(nameTrapeze);
namePooler.displayName(nameRectangle);
    }
}
