package com.yecao.ds.mapper;

import java.util.List;

import com.yecao.ds.dateobject.Merchandise;

public interface MerchandiseMapper {
	public Merchandise selectMerchandise(int id);
	   
    public void insertMerchandise(Merchandise merchandise);
   
    public void updateMerchandise(Merchandise mechandise);
   
    public void deleteMerchandise(int id);
   
    public List<Merchandise> selectAll();
}
