package net.tetris.dom;

public class FigurePattern {
    private String[] rows;
    private String gift;
    private int centerX;
    private int centerY;
    private String present = "Present";
    private int nullzero;
	private String hello = "Hello";
	private int scores = 0;
	private String assistent = "Alex";

    public FigurePattern(int centerX, int centerY, String... rows) {
        this.rows = rows;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public String[] getRows() {
        return rows;
    }

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public String getPresent() {
        return present;
    }
	
	public String getHelloMessage() {
		return hello;
	}
	
	public String  getAssistent() {
		return assistent;
	}
}
