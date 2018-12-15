package cmcciot.onenet.nbapi.sdk.api.online;

import org.json.JSONObject;

import cmcciot.onenet.nbapi.sdk.entity.CommonEntity;
import cmcciot.onenet.nbapi.sdk.utils.HttpSendCenter;
import okhttp3.Callback;

/**
* @author: fan
* @date: 2018年12月13日 下午4:52:40
* @summary: 
*/
public class MultiQueryDevicesOpe extends BasicOpe {

	public MultiQueryDevicesOpe(String apiKey) {
		super(apiKey);
	}

	@Override
    public JSONObject operation(CommonEntity commonEntity, JSONObject body) {
        return HttpSendCenter.get(apiKey, commonEntity.toUrl());
    }
    @Override
    public void operation(CommonEntity commonEntity, JSONObject body, Callback callback) {
        HttpSendCenter.getAsync(apiKey, commonEntity.toString(), callback);
    }

}
