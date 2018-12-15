package cmcciot.onenet.nbapi.sdk.samples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cmcciot.onenet.nbapi.sdk.api.online.QueryCommandStatusOpe;
import cmcciot.onenet.nbapi.sdk.entity.QueryCommandStatus;

/**
 * Created by zhuocongbin
 * date 2018/3/15
 */
public class ApiSample {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiSample.class);
    public static void main(String[] args) {
        String apiKey = "********************";
        String imei = "1234567890";
        Integer objId = 3303;
        Integer objInstId = 0;
        Integer readResId = 5913;
        Integer executeResId = 5501;
        Integer writeResId = 5750;
        Integer writeMode = 2;
        // 创建新设备
//        CreateDeviceOpe deviceOpe = new CreateDeviceOpe(apiKey);
//        Device device = new Device("TestDevice", "1234567890", "000000000000001");
//        LOGGER.info(deviceOpe.operation(device, device.toJsonObject()).toString());
        // 即时命令-读设备资源
//        ReadOpe readOperation = new ReadOpe(apiKey);
//        Read read = new Read(imei, objId);
//        read.setObjInstId(objInstId);
//        read.setResId(readResId);
//        LOGGER.info(readOperation.operation(read, null).toString());
        // 即时命令-写设备资源
//        WriteOpe writeOpe = new WriteOpe(apiKey);
//        Write write = new Write(imei, objId, objInstId, writeMode);
//        JSONArray jsonArray = new JSONArray();
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("res_id", writeResId);
//        jsonObject.put("val", "data1");
//        jsonArray.put(jsonObject);
//        JSONObject data = new JSONObject();
//        data.put("data", jsonArray);
//        LOGGER.info(writeOpe.operation(write, data).toString());
        
        // 即时命令-命令下发
//        ExecuteOpe executeOpe = new ExecuteOpe(apiKey);
//        Execute execute = new Execute(imei, objId, objInstId, executeResId);
//        //下发命令内容，JSON格式
//        JSONObject body = new JSONObject();
//        body.put("args", "ping");
//        LOGGER.info(executeOpe.operation(execute, body).toString());
        
//      // 获取资源列表
//        ResourcesOpe resourcesOpe = new ResourcesOpe(apiKey);
//        Resources resources = new Resources(imei);
//        LOGGER.info(resourcesOpe.operation(resources, null).toString());
        
        // 订阅设备ID
//        ObserveOpe observeOpe = new ObserveOpe(apiKey);
//        Observe observe = new Observe(imei, objId, false);
//        LOGGER.info(observeOpe.operation(observe, null).toString());

        // 删除设备
//        DelDeviceOpe deldeviceope = new DelDeviceOpe(apiKey);
//        DelDevice deldevice = new DelDevice("506011035");
//        LOGGER.info(deldeviceope.operation(deldevice, null).toString());
        
        // 查看单个设备信息
//        QueryDeviceOpe querydeviceope = new QueryDeviceOpe(apiKey);
//        QueryDevice querydevice = new QueryDevice("505616414");
//        LOGGER.info(querydeviceope.operation(querydevice, null).toString());
        
        // 批量查询设备信息
//        List<String> list = new ArrayList<String>();
//        list.add("505616414");
//        list.add("506014090");
//        
//        MultiQueryDevicesOpe mquerydeviceope = new MultiQueryDevicesOpe(apiKey);
//        MultiQueryDevices mquerydevice = new MultiQueryDevices(list);
//        LOGGER.info(mquerydeviceope.operation(mquerydevice, null).toString());
        
        // 根据imei查询设备信息
//        QueryDeviceByIMEIOpe querydevicebyimeiope = new QueryDeviceByIMEIOpe(apiKey);
//        QueryDeviceByIMEI querydevicebyimei = new QueryDeviceByIMEI(imei);
//        LOGGER.info(querydevicebyimeiope.operation(querydevicebyimei, null).toString());
        
        // 查询数据
//        QueryDataOpe querydataope = new QueryDataOpe(apiKey);
//        QueryData querydata = new QueryData("505616414");  //data可能为空
//        LOGGER.info(querydataope.operation(querydata, null).toString());
        
        // 批量查询设备数据
//	      List<String> list = new ArrayList<String>();
//	      list.add("505616414");
//	      list.add("506014090");
//	      
//	      MultiQueryDataOpe mquerydataope = new MultiQueryDataOpe(apiKey);
//	      MultiQueryData mquerydata = new MultiQueryData(list);
//	      LOGGER.info(mquerydataope.operation(mquerydata, null).toString());  //没有数据的设备没有 datastreams 字段信息
        
        // 缓存命令-读设备资源
//        OfflineReadOpe offlinereadOpe = new OfflineReadOpe(apiKey);
//        OfflineRead offlineread = new OfflineRead(imei, objId);
//        offlineread.setObjInstId(objInstId);
//        offlineread.setResId(readResId);
//        offlineread.setExpiredTime("2018-12-15T12:16:00");//注意日期格式
//	      LOGGER.info(offlinereadOpe.operation(offlineread, null).toString());
        
        // 缓存命令-写设备资源
//        OfflineWriteOpe offlinewriteope = new OfflineWriteOpe(apiKey);
//        OfflineWrite offlinewrite = new OfflineWrite(imei,objId,objInstId,writeMode);
//        offlinewrite.setExpiredTime("2018-12-15T12:31:00");
//        JSONArray jsonArray = new JSONArray();
//	      JSONObject jsonObject = new JSONObject();
//	      jsonObject.put("res_id", writeResId);
//	      jsonObject.put("val", "data1");
//	      jsonArray.put(jsonObject);
//	      JSONObject data = new JSONObject();
//	      data.put("data", jsonArray);
//	      LOGGER.info(offlinewriteope.operation(offlinewrite, data).toString());
	    
	    // 缓存命令-命令下发
//        OfflineExecuteOpe offlineexecuteOpe = new OfflineExecuteOpe(apiKey);
//        OfflineExecute offlineexecute = new OfflineExecute(imei, objId, objInstId, executeResId);
//        offlineexecute.setExpiredTime("2018-12-15T13:55:00");
//	    // 下发命令内容，JSON格式
//	      JSONObject body = new JSONObject();
//	      body.put("args", "ping");
//	      LOGGER.info(offlineexecuteOpe.operation(offlineexecute, body).toString());
        
        // 查看缓存命令执行状态
        QueryCommandStatusOpe qcmdstatusope = new QueryCommandStatusOpe(apiKey);
        QueryCommandStatus qcmdstatus = new QueryCommandStatus(imei,"955fe792-796d-5913-9e0c-faaf047485de");
        LOGGER.info(qcmdstatusope.operation(qcmdstatus, null).toString());
        
        // 取消缓存命令
//        CancelCommandOpe cancelcmdope = new CancelCommandOpe(apiKey);
//        CancelCommand cancelcmd = new CancelCommand(imei,"955fe792-796d-5913-9e0c-faaf047485de");
//        LOGGER.info(cancelcmdope.operation(cancelcmd, null).toString());
    }
}
