    interface A {
        class B {
            void show() {
                System.out.println("B class method");
            }
        }
    }

    class C extends A.B {
        void show1() {
            System.out.println("class");
        }
    }

    public class InterfaceAdvanceConcept2 {
        public static void main(String[] args) {
            A.B p = new C();
            p.show();
        }
    }
