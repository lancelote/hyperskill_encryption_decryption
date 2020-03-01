package stage6.hw23;

public class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        LaptopStore laptopStore = new LaptopStore();

        Laptop laptop13 = laptopStore.orderLaptop("13 inch");
        Laptop laptop15 = laptopStore.orderLaptop("15 inch");
        Laptop laptop17 = laptopStore.orderLaptop("17 inch");

        System.out.println("Available laptops in the store:");
        System.out.println(laptop13);
        System.out.println(laptop15);
        System.out.println(laptop17);
    }
}

abstract class LaptopFactory {

    abstract Laptop createLaptop(String type);

    Laptop orderLaptop(String type) throws InterruptedException {
        Laptop laptop = createLaptop(type);
        if (laptop == null) {
            System.out.println("Sorry, we are not able to create this kind of laptop\n");
            return null;
        }
        System.out.println("Making a " + laptop.getName());
        laptop.attachKeyboard();
        laptop.attachTrackpad();
        laptop.attachDisplay();
        Thread.sleep(1500L);
        System.out.println("Done a " + laptop.getName() + "\n");
        return laptop;
    }
}

class LaptopStore extends LaptopFactory {
    @Override
    Laptop createLaptop(String type) {
        switch (type) {
            case "13 inch":
                return new Laptop13("13 inch Laptop");
            case "15 inch":
                return new Laptop15("15 inch Laptop");
            case "17 inch":
                return new Laptop17("17 inch Laptop");
            default:
                return null;
        }
    }
}

class Laptop {
    private String name;

    Laptop(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void attachKeyboard() {
        System.out.println("Attaching keyboard");
    }

    void attachTrackpad() {
        System.out.println("Attaching trackpad");
    }

    void attachDisplay() {
        System.out.println("Attaching display");
    }

    @Override
    public String toString() {
        return name;
    }
}

class Laptop13 extends Laptop {
    Laptop13(String name) {
        super(name);
    }
}

class Laptop15 extends Laptop {
    Laptop15(String name) {
        super(name);
    }
}

class Laptop17 extends Laptop {
    Laptop17(String name) {
        super(name);
    }
}
