package com.dio.persistence.entity;

import lombok.Data;

import java.time.OffsetDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Data
public class BlockEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private OffsetDateTime blockedAt;
    private String blockReason;
    private OffsetDateTime unblockedAt;
    private String unblockReason;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public OffsetDateTime getBlockedAt() {
		return blockedAt;
	}
	public void setBlockedAt(OffsetDateTime blockedAt) {
		this.blockedAt = blockedAt;
	}
	public String getBlockReason() {
		return blockReason;
	}
	public void setBlockReason(String blockReason) {
		this.blockReason = blockReason;
	}
	public OffsetDateTime getUnblockedAt() {
		return unblockedAt;
	}
	public void setUnblockedAt(OffsetDateTime unblockedAt) {
		this.unblockedAt = unblockedAt;
	}
	public String getUnblockReason() {
		return unblockReason;
	}
	public void setUnblockReason(String unblockReason) {
		this.unblockReason = unblockReason;
	}

}
