public class Rectangle extends Shape {
    public float width;
    public float height;
    public Rectangle(){}
    public Rectangle(Rectangle target){
        super(target);
        if(target!=null){
            this.width= target.width;
        this.height= target.height;
        }  
    }
    public Shape clone(){
        return new Rectangle(this);
    }
    public boolean equals(Object obj2){
        if(!(obj2 instanceof Rectangle)||!super.equals(obj2)){
            return false;
        }
        Rectangle shape2 = (Rectangle) obj2;
        return shape2.height==height && shape2.width==width;
    }
}
