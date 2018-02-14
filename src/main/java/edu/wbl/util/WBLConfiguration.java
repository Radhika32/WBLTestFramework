package edu.wbl.util;

public class WBLConfiguration {
	
	private String browser;
	private Browser _browser;
	private Device _device;
	
	private static WBLConfiguration config=null;
	
	public static WBLConfiguration loadConfiguration() {
		if(config != null) {
			config = new WBLConfiguration();
			Properties props = new Properties();
			if()
			
		}
		
	}
	
	private WBLConfiguration() {
		
	}
	
	public String get_url() {
		return _url;
	}
	
	public void set_url(String _url) {
		this._url = _url;
	}

	
	public String get_browser() {
		return _browser;
	}
	
	public void set_browser(String _browser) {
		this._url = _browser;
	}
	public String get_device() {
		return _device;
	}
	
	public void set_url(String _device) {
		this._device = _device;
	}

	
}
