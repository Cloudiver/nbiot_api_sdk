package cmcciot.onenet.nbapi.sdk.api.online;

import org.json.JSONObject;

import cmcciot.onenet.nbapi.sdk.entity.CommonEntity;
import cmcciot.onenet.nbapi.sdk.utils.HttpSendCenter;
import okhttp3.Callback;

/**
* @author: fan
* @date: 2018年12月15日 下午1:02:01
* @summary: 取消缓存命令
*/
public class CancelCommandOpe extends BasicOpe {

	public CancelCommandOpe(String apiKey) {
		super(apiKey);
	}

	@Override
	public JSONObject operation(CommonEntity commonEntity, JSONObject body) {
		return HttpSendCenter.put(apiKey, commonEntity.toUrl());
	}

	@Override
	public void operation(CommonEntity commonEntity, JSONObject body, Callback callback) {
		HttpSendCenter.putAsync(apiKey, commonEntity.toUrl(), body, callback);
	}

}
