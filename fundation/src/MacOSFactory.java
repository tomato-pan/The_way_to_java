public class MacOSFactory implements GUIFactory{
    @Override
    public Button01 creatButton() {
        return new MacOSButton02();
    }

    @Override
    public Checkbox creatCheckbox() {
        return new MacOSCheckbox();
    }
}
