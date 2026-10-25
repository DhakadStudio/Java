interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {

    public void showFather() {
        System.out.println("Father's method");
    }

    public void showMother() {
        System.out.println("Mother's method");
    }

    public static void main(String[] args) {
        Child c = new Child();

        c.showFather();
        c.showMother();
    }
}