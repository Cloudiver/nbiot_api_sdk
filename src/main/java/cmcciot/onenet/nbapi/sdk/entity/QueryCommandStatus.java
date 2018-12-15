package cmcciot.onenet.nbapi.sdk.entity;

import cmcciot.onenet.nbapi.sdk.config.Config;

/**
* @author: fan
* @date: 2018年12月15日 下午12:45:03
* @summary: 查询指定命令执行状态
*/
public class QueryCommandStatus extends CommonEntity {
	
	private String uuid;
	
	public QueryCommandStatus(String imei,String uuid) {
		this.imei = imei;
		this.uuid = uuid;
	}

	@Override
	public String toUrl() {
		StringBuilder url = new StringBuilder(Config.domainName);
		url.append("/nbiot/offline/history/").append(this.uuid);
		url.append("?imei=").append(this.imei);
		return url.toString();
	}

}
