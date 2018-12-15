package cmcciot.onenet.nbapi.sdk.entity;

import cmcciot.onenet.nbapi.sdk.config.Config;

/**
* @author: fan
* @date: 2018年12月15日 下午12:03:25
* @summary: 
*/
public class OfflineRead extends CommonEntity {

	private String expiredTime;  //命令缓存时间
	
	public void setObjInstId(Integer objInstId) {
        this.objInstId = objInstId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }
    
    public void setExpiredTime(String expiredTime) {
    	this.expiredTime = expiredTime;
    }

    /**
     * @param imei 设备IMEI
     * @param objId 读对象ID
     *              其他可选参数Object Instance ID,Rescource ID可以通过相关set函数设置
     */
    public OfflineRead(String imei, Integer objId) {
        this.imei = imei;
        this.objId = objId;
    }
    @Override
    public String toUrl() {
        StringBuilder url = new StringBuilder(Config.getDomainName());
        url.append("/nbiot/offline?imei=").append(this.imei);
        url.append("&obj_id=").append(this.objId);
        if (this.objInstId != null) {
            url.append("&obj_inst_id=").append(this.objInstId);
        }
        if (this.resId != null) {
            url.append("&res_id=").append(this.resId);
        }
        url.append("&expired_time=").append(expiredTime);
        return url.toString();
    }

}
