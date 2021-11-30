public class WindowsFactory implements GUIFactory{
    @Override
    public Checkbox creatCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Button01 creatButton() {
        return new WindowsButton03();
    }
}
