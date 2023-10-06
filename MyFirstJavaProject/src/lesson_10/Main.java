package lesson_10;

class A {
    public String[] getSdlc() {
        return sdlc;
    }

    String sdlc[] = {
            "requirement analysis",
            "design",
            "development",
            "testing",
            "implementation",
            "maintenance"
    };
}
class B extends A {
    public String[] getSdlc() {
        return sdlc;
    }

    private String sdlc[] = {
            "r","d","d","t","i","m"
    };
}
class C extends B {
    public String[] getSdlc() {
        return sdlc;
    }

    String sdlc[] = {
             "s","d","l","c"
    };
}
public class Main {
	public static void main(String args[]) {
        int x = 2;
        int y = 0;
        for (; y < 10; ++y) {
            if (y % x == 0)
                continue;
            else if (y == 8)
                break;
            else

                System.out.print(y + " ");
        }
    }
}
