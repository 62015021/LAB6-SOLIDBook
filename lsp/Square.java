package solid.lsp;
public class Square extends Shapes{

    Square(int side) {
        this.setSide(side);
    }

    @Override
    public int getArea() {
        return super.getArea();
    }
    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }
    
    public int getSide() {
      return super.getWidth();
    }
}
