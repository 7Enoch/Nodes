package ��;
public class demo5 {
    public static void main(String[] args) {
        System.out.print("���Կ�ʼ");

        double c = 0;
        double t = 100000;
        for (int i = 0; i < t; i++) {
            if (0.3 > Math.random()) {
                c++;
            }

        }
        System.out.print(" ����Ϊ��" + c / t+"    \n ");
        System.out.print("===================================\n");
        c = 0;
        double x = 0.7;
        for (int i = 0; i < t; i++) {
            if (x > toXpaw2()) {
                c++;
            }

        }
        System.out.println(" ����Ϊ��" + c / t);
        System.out.print(" ����Ϊ��" + Math.pow(x,2)); 
    }

    public static double toXpaw2() {
        return Math.max(Math.random(), Math.random());

    }

}