public class Button implements Prototype {
    private int x;
    private int y;
    private String color;
    private String id;

    public Button(int x , int y , String color , String id){
        this.x=x;
        this.y=y;
        this.color=color;
        this.id=id;
    }

    public Button(Button prototype){
        this.x= prototype.x;
        this.y= prototype.y;
        this.color= prototype.color;
        this.id = prototype.id;
    }

    public int getx(){
        return x;
    }

    public int gety(){
        return y;
    }

    public String getId(){
        return id;
    }

    public String getColor(){
        return color;
    }

    public Button clone(){
        return new Button(this);
    }
}
