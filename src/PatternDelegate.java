//  1) Простейший делегат
class A {
    void draw() {
        System.out.println("SimpleDelegate!");
    }
}

class B {
    private A a = new A();
    void draw() {
        a.draw();
    }
}

// 2) Продвинутый делегат

interface Primitive {
    void draw();
}

class Square implements  Primitive {
    public void draw() {
        System.out.println("Draw Square!");
    }
}

class Line implements  Primitive {
    public void draw() {
        System.out.println("Draw Line!");
    }
}

class Circle implements  Primitive {
    public void draw() {
        System.out.println("Draw Circle!");
    }
}

class Painter {
    Primitive primitive;

    //Метод - СЕТ МУТТАТОР
    void setPrimitive(Primitive p) {
        primitive = p;
    }

    void painterDrawVersion() {
        primitive.draw();
    }
}

public class PatternDelegate {
    public static void main(String[] args) {
        B b = new B();
        b.draw();

        Painter painter = new Painter();

        painter.setPrimitive(new Circle());
        painter.painterDrawVersion();

        painter.setPrimitive(new Square());
        painter.painterDrawVersion();

        painter.setPrimitive(new Line());
        painter.painterDrawVersion();
    }
}

