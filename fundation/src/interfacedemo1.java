public class interfacedemo1 {
    public static void main(String[] args) {
        Bens bb = new Bens("gls350");
        bb.run();
        System.out.println(bb.getName());
    }
}

interface Car {
    void run();

    String getName();
}

class Bens implements Car {
    private String name;

    public Bens(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " running!");
    }

    @Override
    public String getName() {
        return name;
    }
}
