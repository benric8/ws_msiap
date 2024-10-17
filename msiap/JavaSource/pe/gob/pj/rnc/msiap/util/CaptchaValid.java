package pe.gob.pj.rnc.msiap.util;

import java.io.Serializable;

public class CaptchaValid implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean success;
	private String challenge_ts;
	private String hostname;
	
	public final boolean getSuccess() {
		return success;
	}
	public final void setSuccess(boolean success) {
		this.success = success;
	}
	public final String getChallenge_ts() {
		return challenge_ts;
	}
	public final void setChallenge_ts(String challenge_ts) {
		this.challenge_ts = challenge_ts;
	}
	public final String getHostname() {
		return hostname;
	}
	public final void setHostname(String hostname) {
		this.hostname = hostname;
	}
	
	
}
