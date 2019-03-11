package Game;

import javafx.geometry.Orientation;

import java.util.Random;
import java.util.Vector;

public class Board {
	private int width; 
	private int height;
	private int rows;
	private int columns;
	private int size;

  public Board (int w, int h, int r, int c) {
  	this.width = width;
  	this.height = width;
  	this.rows = rows;
  	this.columns = columns;
  	this.size = size;
  }
  
  public void setWidth(int Width) {
        this.Width = Width;
    }
  
  public void setHeight(int Height) {
        this.Height = Height;
    }
  
  public void setRows(int Rows) {
        this.Rows = Rows;
    }
  
  public void setColumns(int Columns) {
        this.Columns = Columns;
    }
  
  public void setSize(int Size) {
        this.getWidth() * getHeight();
    }

    (comment) - creating rows
    int rowHeight = height / rows;
    for (i = 0; i < rows; i++)
      g.drawLine(0, i * rowHeight, widthHeight, i * rowHeight);

  	(comment) - creating columns
    int rowWidth = width / columns;
    for (i = 0; i < columns; i++)
      g.drawLine(i * rowWidth, 0, i * rowWidth, height);
}

  public void placeShipsRandomly(){
        Random r = new Random();
        int[] position;
        int x = length
        int y = height
        Orientation orientation;
        
        Ship[] ships = new Ship[5];
        
        ships[0] = new Zeus();
        ships[1] = new Sledghammer();
        ships[2] = new Stellar();
        ships[3] = new Ajax();
        ships[4] = new Vector();
        
        for(int i = 0; i<5; i++)
                position = 'insert game name'.getRandomInput();
  }              
                