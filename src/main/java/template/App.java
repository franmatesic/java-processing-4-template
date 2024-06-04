package template;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class App extends PApplet {

    private PImage logo;

    @Override
    public void settings() {
        size(1280, 720);
    }

    @Override
    public void setup() {
        logo = loadImage("processing-logo.png");

        textAlign(PConstants.CENTER, PConstants.CENTER);
    }

    @Override
    public void draw() {
        background(255);

        image(logo, width * 0.5F - 128, 32, 256, 256);

        fill(0);
        textSize(64);
        text("Intellij Processing 4 template", width * 0.5F, height * 0.5F);
    }
}
