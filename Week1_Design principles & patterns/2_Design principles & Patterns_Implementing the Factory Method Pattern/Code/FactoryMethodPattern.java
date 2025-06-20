interface Item {
    void info();
}

class Pen implements Item {
    public void info() {
        System.out.println("Pen object created.");
    }
}

class Notebook implements Item {
    public void info() {
        System.out.println("Notebook object created.");
    }
}

class ItemFactory {
    public static Item getItem(String type) {
        if (type.equalsIgnoreCase("pen")) {
            return new Pen();
        } else if (type.equalsIgnoreCase("notebook")) {
            return new Notebook();
        }
        return null;
    }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {
        Item item1 = ItemFactory.getItem("pen");
        item1.info();
        Item item2 = ItemFactory.getItem("notebook");
        item2.info();
    }
}
