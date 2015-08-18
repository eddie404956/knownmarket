package com.yecao.ds.mapper;

import java.util.List;

import com.yecao.ds.dateobject.Coupon;
import com.yecao.ds.dateobject.Merchandise;
import com.yecao.ds.dateobject.Price;
import com.yecao.ds.dateobject.Product;

public interface MerchandiseMapper {
	public Merchandise selectMerchandise(int id);
	   
    public void insertMerchandise(Merchandise merchandise);
   
    public void updateMerchandise(Merchandise mechandise);
   
    public void deleteMerchandise(int id);
   
    public List<Merchandise> selectAll();
    
    public void insertPrice(Price price);
    
    public void insertProduct(Product product);
    
    public void insertCoupon(Coupon coupon);
}
