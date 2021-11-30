public class Application {
    private Button01 button;
    private Checkbox checkbox;

    public  Application(GUIFactory factory){
        button = factory.creatButton();
        checkbox = factory.creatCheckbox();
    }
    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
