package com.example.ArtConnect.model;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private String artworkId;
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getArtworkId() {
		return artworkId;
	}
	public void setArtworkId(String artworkId) {
		this.artworkId = artworkId;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	private String buyerId;
    private String status; // pending/completed
    private Date createdAt;

    // getters and setters
}
