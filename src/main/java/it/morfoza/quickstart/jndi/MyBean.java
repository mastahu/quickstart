package it.morfoza.quickstart.jndi;

public class MyBean {

    private String foo = "Default Foo";
    private int bar = 0;

    public String getFoo() {
        return (this.foo);
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public int getBar() {
        return (this.bar);
    }

    public void setBar(int bar) {
        this.bar = bar;
    }
}
