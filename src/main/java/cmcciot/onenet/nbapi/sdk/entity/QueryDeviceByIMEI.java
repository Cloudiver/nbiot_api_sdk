package cmcciot.onenet.nbapi.sdk.entity;

import cmcciot.onenet.nbapi.sdk.config.Config;

/**
* @author: fan
* @date: 2018年12月14日 下午4:55:19
* @summary: 根据imei查询设备信息
*/
public class QueryDeviceByIMEI extends CommonEntity {
	
	public QueryDeviceByIMEI(String imei) {
		this.imei = imei;
	}

	@Override
	public String toUrl() {
		StringBuilder url = new StringBuilder(Config.domainName);
		url.append("/devices/getbyimei?imei=").append(imei);
		return url.toString();
	}

}
