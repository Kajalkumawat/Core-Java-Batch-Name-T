public class OverloadmainMethod {
    public static void main(int a) {
        System.out.println(a);
    }

    public static void main(String name) {
        System.out.println("name");
    }

    public static void main(String[] args) {
        OverloadmainMethod ol=new OverloadmainMethod();
    }
}
