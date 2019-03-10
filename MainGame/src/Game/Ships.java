package Game;

public class Ship {
    private String name;
    private int number;
    private int length;

    public Ship(String name, int number, int length){
    this.name = name;
  	this.number = number;
  	this.length = length;
    }

    public String getName(){
        return name;
    }
    
    public int getNumber(){
        return number;
    }
    
    public int getLength(){
        return length;
    }
}
