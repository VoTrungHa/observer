/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author hp-pc
 */
public class NhaDauTuB implements TiGia.LangNgheThayDoiTiGia{

    public float tigia;  
// biến subject để nhận các phương thức bên trong class TiGia

    public NhaDauTuB(float tigia) {
        this.tigia = tigia;
         
    }
    public void DangKy(TiGia tg)
    {
        tg.them(this);
    }
    public void HuyDangKy(TiGia tg)
    {
        tg.xoa(this);
    }
            
   
     
    @Override
    public void CapNhapTiGia(float tigiamoi) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if(tigiamoi>tigia)
        {
            System.out.println("Nhà đầu tư A bán ra");
        }
        else if(tigiamoi<tigiamoi)
        {
            System.out.println("Nhà đầu tư A mua vào it");
        }
        else
        {
            System.out.println("Nhà đầu tư A bán hết");
        }
        tigia=tigiamoi;
    
    }
    
    
}

