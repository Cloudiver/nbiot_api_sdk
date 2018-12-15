package cmcciot.onenet.nbapi.sdk.api.online;

import org.json.JSONObject;

import cmcciot.onenet.nbapi.sdk.entity.CommonEntity;
import cmcciot.onenet.nbapi.sdk.utils.HttpSendCenter;
import okhttp3.Callback;

/**
* @author: fan
* @date: 2018年12月15日 下午12:31:15
* @summary: 
*/
public class OfflineExecuteOpe extends BasicOpe {

	public OfflineExecuteOpe(String apiKey) {
		super(apiKey);
	}

	@Override
    public JSONObject operation(CommonEntity commonEntity, JSONObject body) {
        return HttpSendCenter.post(apiKey, commonEntity.toUrl(), body);
    }
    @Override
    public void operation(CommonEntity commonEntity, JSONObject body, Callback callback) {
        HttpSendCenter.postAsync(apiKey, commonEntity.toUrl(), body, callback);
    }
}
