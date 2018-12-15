package cmcciot.onenet.nbapi.sdk.entity;

import cmcciot.onenet.nbapi.sdk.config.Config;

/**
* @author: fan
* @date: 2018年12月15日 下午12:20:07
* @summary: 
*/
public class OfflineWrite extends CommonEntity {

	private Integer mode;
	
	private String expiredTime;
	
	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

    /**
     * @param imei 设备IMEI
     * @param objId 写对象ID
     * @param objInstId 写实例ID
     * @param mode 写的模式（1：replace，2：partial update）
     */
    public OfflineWrite(String imei, Integer objId, Integer objInstId, Integer mode) {
        this.imei = imei;
        this.objId = objId;
        this.objInstId = objInstId;
        this.mode = mode;
    }
    public String toUrl() {
        StringBuilder url = new StringBuilder(Config.getDomainName());
        url.append("/nbiot/offline?imei=").append(this.imei);
        url.append("&obj_id=").append(this.objId);
        url.append("&obj_inst_id=").append(this.objInstId);
        url.append("&mode=").append(this.mode);
        url.append("&expired_time=").append(this.expiredTime);
        return url.toString();
    }

}
