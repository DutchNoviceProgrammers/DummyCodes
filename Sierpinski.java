import java.awt.*;
import java.util.*;
import java.awt.Polygon;
import javax.swing.*;

public class Sierpinski extends Canvas{
Random r = new Random();

public void paint(Graphics g){
int x = 512;
int x1 = 512;
int x2 = 146;
int x3 = 876;

int y = 382;
int y1 = 109;
int y2 = 654;
int y3 = 654;

int random;
int dx;
int dy;

Polygon tri = new Polygon();

tri.addPoint(x1, y1);
tri.addPoint(x2, y2);
tri.addPoint(x3, y3);

for(int i = 0; i < 200000; i++){
g.drawLine(x, y, x, y);
random = 1 + r.nextInt(3);

if (random == 1){
	dx = x - x1;
	dy = y - y1;
} else if(random == 2){
	dx = x - x2;
	dy = y - y2;
} else {
	dx = x - x3;
	dy = y - y3;
}
x = x - dx/2;
y = y - dy/2;
}
g.drawString("Sierpinski Triangle", 462, 484);
}

public static void main(String[] args){

Canvas canvas = new Sierpinski();
JFrame win = new JFrame("The Sierpinski triangle");
win.setSize(1024, 768);
win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

canvas.setBackground(Color.WHITE);
win.add(canvas);
win.setVisible(true);


}
}