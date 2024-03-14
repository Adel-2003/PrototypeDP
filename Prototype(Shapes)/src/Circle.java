public class Circle extends Shape{
    public float radius;
    public Circle(){}
    public Circle(Circle target){
    super(target);
    if(target!=null){
        this.radius = target.radius;
    }
    }
    public Shape clone(){
        return new Circle(this);
    }
    public boolean equals(Object obj2){
        if(!(obj2 instanceof Circle) || !super.equals(obj2)){
            return false;
        }
        Circle shape2 = (Circle) obj2;
        return shape2.radius==radius;
    }
}
