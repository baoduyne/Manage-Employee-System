package com.mycompany.app.week3.code1;
class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 5;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

public class GlyphTest {
    public static void main(String[] args) {
        Glyph glyph = new RoundGlyph(10);
        glyph.draw();
    }
}
