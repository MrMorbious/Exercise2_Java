public class Shape {
    private String color = "red";
    private boolean filled = true;
    
    public Shape(){
        
    }
    public Shape(String color , boolean filled){
        this.color = "green";
        this.filled = true;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    @Override
    public String toString(){
        String cont = filled ? "filled" : "Not filled";
        return ("A Shape with color of " + getColor() +" and "+cont);
    }
}
    
    




