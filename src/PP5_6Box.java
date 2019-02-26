public class PP5_6Box {
    public int width,height,depth;
    public boolean full;

    public PP5_6Box(int h,int w,int d){
        width = w;
        height = h;
        depth = d;
        full = false;
    }

    public void setWidth(int w){
        width = w;
    }

    public void setHeight(int h){
        height = h;
    }

    public void setDepth(int d){
        depth = d;
    }

    public void setFull(boolean f){
        full = f;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getDepth(){
        return depth;
    }

    public boolean getFull(){
        return full;
    }

    public String toString(){
        return "Height : " + height + " Width : " + width + " Depth : " +depth;
    }
}
