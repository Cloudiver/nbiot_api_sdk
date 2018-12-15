package cmcciot.onenet.nbapi.sdk.entity;

import cmcciot.onenet.nbapi.sdk.config.Config;

/**
* @author: fan
* @date: 2018年12月14日 下午5:53:28
* @summary: 查询数据
*/
public class QueryData extends CommonEntity {
	
	private String deviceid;

	public QueryData(String deviceid) {
		this.deviceid = deviceid;
	}

	@Override
	public String toUrl() {
		StringBuilder url = new StringBuilder(Config.domainName);
		url.append("/devices/").append(deviceid).append("/datapoints");
		return url.toString();
	}

}
