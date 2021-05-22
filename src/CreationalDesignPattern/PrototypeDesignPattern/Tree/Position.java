package CreationalDesignPattern.PrototypeDesignPattern.Tree;


public final class Position implements Cloneable{

    private final Integer x;
    private final Integer y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }



    @Override
    public String toString() {
        return "Position [x=" + x + ", y=" + y + "]";
    }

    public Position getClone() {
    	
    	
    	Position positionNew = null;
		
		try {
			
			positionNew = (Position) super.clone();
			
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return positionNew;
    	
    } 
}