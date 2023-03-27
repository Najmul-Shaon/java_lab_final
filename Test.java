public class Test {
    private int valueOne;
    private int valueTwo;
    public void setData(int v1, int v2) {
        valueOne = v1;
        valueTwo = v2;
    }
    public void getData() {
        System.out.println("Value One: " + valueOne);
        System.out.println("Value Two: " + valueTwo);
    }
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 20;
        Test obj = new Test();
        obj.setData(value1, value2);
        obj.getData();
    }
}
