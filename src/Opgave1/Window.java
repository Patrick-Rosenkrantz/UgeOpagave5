package Opgave1;

public class Window {
    private int widthCM;
    private int heightCM;

    public Window(int heightCM, int widthCM){
        this.heightCM = heightCM;
        this.widthCM = widthCM;
    }

    public int getAreaCM2(){
        int area;
        area = heightCM+ widthCM;
        return area;
    }

    public String toString(){
        return "The window has an area of: "+ getAreaCM2();
    }
}
