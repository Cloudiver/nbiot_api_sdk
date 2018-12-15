package cmcciot.onenet.nbapi.sdk.api.online;

import org.json.JSONObject;

import cmcciot.onenet.nbapi.sdk.entity.CommonEntity;
import cmcciot.onenet.nbapi.sdk.utils.HttpSendCenter;
import okhttp3.Callback;

/**
* @author: fan
* @date: 2018年12月15日 下午12:42:20
* @summary: 查询指定命令执行状态
*/
public class QueryCommandStatusOpe extends BasicOpe {

	public QueryCommandStatusOpe(String apiKey) {
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
