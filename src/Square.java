class Square extends Rectangle{
    private double side;
    public Square(double side){
        super(side, side);
    }
    public Square(double side,String color , boolean filled){
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    @Override
    public void setWidth(double side){
        this.side = side;
    }
    @Override
    public void setLength(double side){
        this.side = side;
    }
    @Override
    public String toString(){
        return "A Square with side = "+getSide()+", which is a subclass of"+super.toString();
    }
}