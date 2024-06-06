package com.mycompany.app.week1;

public class aliasing {
    int i;
    static void f(aliasing m) {
        m.i = 15;
    }
    public static void main(String[] args) {
        aliasing n = new aliasing();
        n.i = 14;
        f(n);
    }
}
