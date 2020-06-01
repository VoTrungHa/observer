/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp-pc
 */
//observer viet cho 1 class mà chưa biết class đó sử dụng để làm gì. 
// cập nhập giá trị tự động khi mà subject thây đổi. thường dung để thây đổi sự kiện
public class TiGia {// subject
    
    public float tigia;

    public TiGia(float tigia) {
        this.tigia = tigia;
    } 
    List<LangNgheThayDoiTiGia> khs=new ArrayList<>();// danh sách khách hàng đăng kí
    
    public void setTiGia(float khoangTD)
    {
        tigia+=khoangTD;
         khs.forEach(item->{
             item.CapNhapTiGia(tigia);
         });
    }
    
    public void them(LangNgheThayDoiTiGia kh) // them observer mà observer là con của langnghethaydoi
    {
        if(!khs.contains(kh))
        {
            khs.add(kh);
        }
    }
    public void xoa(LangNgheThayDoiTiGia kh)
    {
        if(khs.contains(kh))
        {
            khs.remove(kh);
        }
    }
    
    
    public static interface LangNgheThayDoiTiGia{// giao diện chỉ cho subject tigia
        public void CapNhapTiGia(float tigiamoi); 
    }
    
}
