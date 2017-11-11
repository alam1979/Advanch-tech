package com.usa.automation.factory;

import com.usa.automation.serviceLayer.configDataProvider;

public class dataProviderfactory {
	public static browserFactory getbrowser(){
		browserFactory getbrowser=new browserFactory();
		return getbrowser;
	}
	public static configDataProvider getConfig(){
		configDataProvider config=new configDataProvider();
		return config;
	}



	
}
