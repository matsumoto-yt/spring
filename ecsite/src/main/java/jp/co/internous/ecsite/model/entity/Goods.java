package jp.co.internous.ecsite.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table (name="goods")

public class Goods {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="goods_name")
	private String goodsName;
	
	@Column(name="price")
	private long price;
	
	@Column(name="update_at")
	private Timestamp updateAt;
	
	
	
	private void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	
	private void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	private void setPrice(long price) {
		this.price = price;
	}
	
	public long getPrice() {
		return price;
	}
	
	private void setUpdateAt(Timestamp updateAt) {
		this.updateAt = updateAt;
	}
	
	
	public Timestamp getUpdateAt() {
		return updateAt;
	}
}
