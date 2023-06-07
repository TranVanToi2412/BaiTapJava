package Hinhhoc;
import java.util.Scanner;
public class DIEM {
    Scanner sc = new Scanner(System.in);
    private int x, y;
    DIEM(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void NHAPDIEM(){
        System.out.println("Nhap x :");
        x = sc.nextInt();
        System.out.println("Nhap y :");
        y = sc.nextInt();
    }
    public void inDiem(){
        System.out.println("Toa do x , y la : " + x + "," + y);
    }
}
