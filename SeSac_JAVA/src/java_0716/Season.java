package java_0716;
/*
* @author Jinhee
* @version 1.0.0
* @since jdk17
* */
public enum Season {
    spring(5), summer(100), fall(1000), winter(20);
    private int value;
    Season(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }

}
