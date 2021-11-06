package pkg;

public class ModifierTest {
    private void messageInside() {
        System.out.println("This Private");
    }

    public void messageOutside() {
        System.out.println("This public");
        messageOutside();
    }
    protected  void messageProtected() {
        System.out.println("This Protected");
    }
}
