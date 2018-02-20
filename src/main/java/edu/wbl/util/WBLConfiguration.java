package edu.wbl.util;

import java.util.Properties;

public class WBLConfiguration {
	
	private String browser;
	private Browser _browser;
	private Device _device;
	
	private static WBLConfiguration config=null;
	
	public static WBLConfiguration loadConfiguration(String type) throws IOException{
		if(config != null) {
			config = new WBLConfiguration();
			Properties props = new Properties();
			props.load(new FileReader(new File("config.properties"))
		        config.set_url(props.getProperty("url"));
		        switch(props.getProperty("browser").toLowerCase()){
				case "chrome" : config.set_browser(Browser.CHROME);
				                break;
				case "ie" : config.set_browser(Browser.IE);
				                break;
				case "firefox" : config.set_browser(Browser.FIREFOX);
				                break;
			}
		}
		return config;
	}
	
	private WBLConfiguration() {
		_url = "";
		_browser = Browser.CHROME;
		_device = Device.DESKTOP;
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
