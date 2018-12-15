package cmcciot.onenet.nbapi.sdk.api.online;

import org.json.JSONObject;

import cmcciot.onenet.nbapi.sdk.entity.CommonEntity;
import cmcciot.onenet.nbapi.sdk.utils.HttpSendCenter;
import okhttp3.Callback;

/**
* @author: fan
* @date: 2018年12月13日 下午2:50:28
* @summary: 根据设备ID删除设备
*/
public class DelDeviceOpe extends BasicOpe {

	public DelDeviceOpe(String apiKey) {
		super(apiKey);
	}

	@Override
	public JSONObject operation(CommonEntity commonEntity, JSONObject body) {
		return HttpSendCenter.delete(apiKey, commonEntity.toUrl());
	}

	@Override
	public void operation(CommonEntity commonEntity, JSONObject body, Callback callback) {
		HttpSendCenter.deleteAsync(apiKey, commonEntity.toUrl(), callback);
	}

}
