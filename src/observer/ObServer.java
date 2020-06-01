/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Scanner;

/**
 *
 * @author hp-pc
 */

// thây đổi trạng thái cho tất cả thằng đk nó
public class ObServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TiGia tg=new TiGia(100);
        NhaDauTuA a=new NhaDauTuA(100);
        a.DangKy(tg);
        while (true) {            
            Scanner scanner=new Scanner(System.in);
            System.out.println("Nhập tỉ giá mới");
            float f=scanner.nextFloat();
            tg.setTiGia(f);
            System.out.println("Tiếp tục thì nhấn yes/no");
            String kt=scanner.next();
            if(kt.equalsIgnoreCase("no"))
            {
                break;
            }
        }
    }
    
}
