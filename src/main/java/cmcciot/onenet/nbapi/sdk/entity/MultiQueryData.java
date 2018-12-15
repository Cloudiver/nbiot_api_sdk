package cmcciot.onenet.nbapi.sdk.entity;

import java.util.List;

import cmcciot.onenet.nbapi.sdk.config.Config;

/**
* @author: fan
* @date: 2018年12月15日 上午11:13:18
* @summary: 批量查询设备最新数据
*/
public class MultiQueryData extends CommonEntity {

	private List<String> list;

	public MultiQueryData(List<String> list) {
		this.list = list;
	}
	
	@Override
	public String toUrl() {
		StringBuilder url = new StringBuilder(Config.domainName);
		url.append("/devices/datapoints?devIds=");
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
