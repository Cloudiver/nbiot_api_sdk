package cmcciot.onenet.nbapi.sdk.entity;

import cmcciot.onenet.nbapi.sdk.config.Config;

/**
* @author: fan
* @date: 2018年12月13日 下午2:56:06
* @summary: 
*/
public class DelDevice extends CommonEntity {
	
	private String deviceId;

	public DelDevice(String deviceId) {
		this.deviceId = deviceId;
	}

	@Override
	public String toUrl() {
		StringBuilder url = new StringBuilder(Config.domainName);
		url.append("/devices/").append(deviceId);
		return url.toString();
	}

}
