public class App {
    public static void main(String[] args) throws Exception {
        PrototypeRegistry registry = new PrototypeRegistry();
        PrototypeRegistry registry2 = new PrototypeRegistry();
        Button redButton = new Button(50, 50, "Red","02125633");
        Button blueButton = new Button(40, 20, "Blue","0214855");
        registry.addItem("02125633", redButton);
        registry2.addItem("0214855", blueButton);
        Button cloned_Button_by_color = (Button)registry.getByColor("Red");
        Button cloned_Button_by_id= (Button) registry.getById("02125633");

        System.out.println("Cloned Button get by color: \n x= "+cloned_Button_by_color.getx()+" y= "+cloned_Button_by_color.gety()+" color= "+cloned_Button_by_color.getColor());
        
        System.out.println("Cloned Button get by ID: \n x= "+cloned_Button_by_id.getx()+" y= "+cloned_Button_by_id.gety()+" ID= "+cloned_Button_by_id.getId());
    }
}
