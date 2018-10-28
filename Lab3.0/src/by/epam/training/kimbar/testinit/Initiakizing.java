package by.epam.training.kimbar.testinit;

class Test {

    String name = "abc";

    public Test() {
        test();
    }
    public void test() {
        System.out.println(name);
    }
}
class C extends Test {
    String name = "ggg";

    public C() {
        test();
    }
    @Override
    public void test() {
        System.out.println(name);

    }

}

class A {

    public static void main(String[] args) {
        new C();//Выведит null ggg т.к  будет след  логика вход в родительский класс инициализация поля потом конструктор переход в метод C распечатка нуль значения т.к поле name не
        // было проинициализированно потом после 1 вызова будет 2 вызов который проинициализирует поле name внтутри C и выведит ggg
    }
}
