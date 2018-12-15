package cmcciot.onenet.nbapi.sdk.entity;

import cmcciot.onenet.nbapi.sdk.config.Config;

/**
* @author: fan
* @date: 2018年12月15日 下午12:31:54
* @summary: 
*/
public class OfflineExecute extends CommonEntity {
	
	private String expiredTime;
	
	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}
	/**
    *
    * @param imei 设备IMEI号，必填
    * @param objId，下发命令的对象ID,必填
    * @param objInstId，下发命令的实例ID,必填
    * @param resId，下发命令的资源ID,必填
    */
   public OfflineExecute(String imei, Integer objId, Integer objInstId, Integer resId) {
       this.imei = imei;
       this.objId = objId;
       this.objInstId = objInstId;
       this.resId = resId;
   }
   @Override
   public String toUrl() {
       StringBuilder url = new StringBuilder(Config.getDomainName());
       url.append("/nbiot/execute/offline?imei=").append(this.imei);
       url.append("&obj_id=").append(this.objId);
       url.append("&obj_inst_id=").append(this.objInstId);
       url.append("&res_id=").append(this.resId);
       url.append("&expired_time=").append(expiredTime);
       return url.toString();
   }
}
