package PC;

public class Resolution {
    private int vertical, horizontal;
    public Resolution(int vt, int ht){
        this.vertical = vt;
        this.horizontal = ht;
    }

    public int getVertical(){
        return vertical;
    }

    public int getHorizontal(){
        return horizontal;
    }

    public void setVertical(int vt){
        this.vertical = vt;
    }

    public void setHorizontal(int ht){
        this.horizontal = ht;
    }

    @Override
    public String toString(){
        return "( " + horizontal + " x " + vertical + ") ";
    }
}
