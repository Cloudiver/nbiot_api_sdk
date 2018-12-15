package cmcciot.onenet.nbapi.sdk.entity;

import cmcciot.onenet.nbapi.sdk.config.Config;

/**
* @author: fan
* @date: 2018年12月15日 下午1:11:29
* @summary: 取消缓存命令
*/
public class CancelCommand extends CommonEntity {
	
	private String uuid;

	public CancelCommand(String imei, String uuid) {
		this.imei = imei;
		this.uuid = uuid;
	}

	@Override
	public String toUrl() {
		StringBuilder url = new StringBuilder(Config.domainName);
		url.append("/nbiot/offline/cancel/");
		url.append(this.uuid);
		url.append("?imei=").append(this.imei);
		return url.toString();
	}

}
