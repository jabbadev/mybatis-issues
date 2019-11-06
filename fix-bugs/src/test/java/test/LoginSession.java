package test;

import java.math.BigDecimal;

public class LoginSession {
	private BigDecimal id;
	private BigDecimal userId;
	private String sessionId;

	public BigDecimal getId() {
		return id;
	}

	public BigDecimal getUserId() {
		return userId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	public String toString() {
		return "LoginSession [id=" + id + ", userId=" + userId + ", sessionId=" + sessionId + "]";
	}
}
