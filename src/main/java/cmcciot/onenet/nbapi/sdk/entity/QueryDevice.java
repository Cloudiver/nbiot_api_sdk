package cmcciot.onenet.nbapi.sdk.entity;

import cmcciot.onenet.nbapi.sdk.config.Config;

/**
* @author: fan
* @date: 2018年12月13日 下午4:39:33
* @summary: 查询单个设备信息
*/
public class QueryDevice extends CommonEntity {
	
	private String deviceid;

	public QueryDevice(String deviceid) {
		this.deviceid = deviceid;
	}

	@Override
	public String toUrl() {
		StringBuilder url = new StringBuilder(Config.domainName);
		url.append("/devices/").append(deviceid);
		return url.toString();
	}

}
