package module3;

import processing.core.*;
import java.util.*;

public class MyPApplet extends PApplet 
{
private String URL = "https://thumbs.dreamstime.com/b/la-jolla-kalifornien-california-usa-juni-große-teure-wohnungen-sitzen-auf-bluffs-und-felsen-einer-bucht-159545496.jpg";
private PImage backgroundImg; 
	
public void setup() 
{
	size(200,200);
	backgroundImg = loadImage (URL, "jpg");
	
}

public void draw() {
	
	//Resizing in order to make it fit. Height = Instance variable of PApplet (equals height of canvas);
	backgroundImg.resize(0,height);
	image(backgroundImg, 0, 0);
	int h = 12 - hour();
	float a = sq(h);
	float b = sqrt(a);
	Integer t = (int) b;
    int zero = color(255,255,0);
	int one = color(255,255- (255/12)*1, 0);
	int two = color(255,255- (255/12)*2, 0);
	int three = color(255,255- (255/12)*3, 0);
	int four = color(255,255- (255/12)*4, 0);
	int five = color(255,255- (255/12)*5, 0);
	int six = color(255,255- (255/12)*6, 0);
	int seven = color(200,255- (255/12)*7, 0);
	int eight = color(200,255- (255/12)*8, 0);
	int nine = color(200,255- (255/12)*9, 0);
	int ten = color(40,255- (255/12)*10, 0);
	int eleven = color(255,255,255);
	int twelve = color (0,0,0);
	int[] time = {zero, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve};			
    fill (time[t]);
	//fill(255,209,0);
	ellipse(width/4, height/5, width/5, height/5);
 }
	
}
