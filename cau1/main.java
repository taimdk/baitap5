package cau1;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("1.quacam");
        System.out.println("2.quatao");
        System.out.println("3.quacamphong");
        System.out.println("4.camsanh");
        System.out.println("chon so ");
        Scanner sc = new Scanner(System.in);
        int chon=sc.nextInt();
        switch (chon) {
            case 1:
                quacam qc = new quacam();
                System.out.println(""+qc.xuatten());
                System.out.println("nhap so ki can mua");
                qc.setCannang(sc.nextDouble());
                System.out.println("gia ban la: "+qc.giaban());
           
                break;
            case 2:
                quatao qt = new quatao();
                System.out.println(""+qt.xuatten()); 
                System.out.println("nhap so ki");
                qt.setCannang(sc.nextDouble());
                System.out.println("gia ban la"+qt.giaban());
                break;
            case 3:
                quacamphong qcp = new quacamphong();
                System.out.println(""+qcp.xuatten());
                System.out.println("nhap so ki");
                qcp.setCannang(sc.nextDouble());
                System.out.println(""+qcp.giaban());
                break;
            case 4:
                camsanh cs = new camsanh();
                System.out.println(""+cs.xuatten());
                System.out.println("nhap so ki");   
                cs.setCannang(sc.nextDouble());
                System.out.println(""+cs.giaban());
                break;
            default:
                System.out.println("ban da nhap sai");
                
        }
    }    
}