interface Coder {
    void writeCode();
}

interface Designer {
    void designUI();
}

class Student implements Coder, Designer {

    public void writeCode() {
        System.out.println("Student writes Java code");
    }

    public void designUI() {
        System.out.println("Student designs user interface");
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.writeCode();
        s.designUI();
    }
}