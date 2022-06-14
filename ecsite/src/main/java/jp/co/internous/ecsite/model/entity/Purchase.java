package jp.co.internous.ecsite.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table (name="parchase")

public class Purchase {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="user_id")
	private long userId;
	
	@Column(name="goods_id")
	private long goodsId;
	
	@Column(name="goods_name")
	private String goodsName;
	
	@Column(name="item_count")
	private long itemCount;
	
	@Column(name="total")
	private long total;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	
	private void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	private void setUserId(long userId) {
		this.userId = userId;
	}
	
	public long getUserId() {
		return userId;
	}
	
	private void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}
	
	public long getgoodsId() {
		return goodsId;
	}
	
	private void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	
	private void setItemCount(long itemCount) {
		this.itemCount = itemCount;
	}
	
	public long getItemCount() {
		return itemCount;
	}
	
	private void setTotal(long total) {
		this.total = total;
	}
	
	public long getTotal() {
		return total;
	}
	
	
	private void setCreatedAt(Timestamp createdAT) {
		this.createdAt = createdAt;
	}
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	

}
