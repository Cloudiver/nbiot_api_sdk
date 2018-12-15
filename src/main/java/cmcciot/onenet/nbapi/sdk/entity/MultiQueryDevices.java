package cmcciot.onenet.nbapi.sdk.entity;

import java.util.List;

import cmcciot.onenet.nbapi.sdk.config.Config;

/**
* @author: fan
* @date: 2018年12月13日 下午4:53:10
* @summary: 批量查询设备状态
*/
public class MultiQueryDevices extends CommonEntity {
	
	private List<String> list;

	public MultiQueryDevices(List<String> list) {
		this.list = list;
	}

	@Override
	public String toUrl() {
		StringBuilder url = new StringBuilder(Config.domainName);
		url.append("/devices/status?devIds=");
		int i = 0;
		for (String device : list) {
			i++;
			if(i != list.size()) {
				url.append(device + ",");
			}else {
				url.append(device);
			}
		}
		return url.toString();
	}

}
