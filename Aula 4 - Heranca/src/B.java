public class B extends A{
    private int j;

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void showJ(){
        System.out.println("j = " + j);
    }

    public void soma(){
        System.out.println("i + j = " + (getI() + j));
    }
}
