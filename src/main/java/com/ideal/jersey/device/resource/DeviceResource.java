package com.ideal.jersey.device.resource;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.ideal.jersey.device.dao.DeviceDao;
import com.ideal.jersey.device.entity.Device;

/**
 * 
 * 功能说明:资源类，用于公布设备的REST API
 *
 * @author jilingjun
 *
 * @Date 2015年12月20日 下午10:17:36
 *
 *
 * 版本号  |   作者   |  修改时间   |   修改内容
 *
 */
@Path(value = "device")
public class DeviceResource {

	private final DeviceDao deviceDao;
	public DeviceResource() {
		deviceDao = new DeviceDao();
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Device get(@QueryParam("ip") final String deviceIp) {
		Device result = null;
		if (deviceIp != null) {
			result = deviceDao.getDevice(deviceIp);
		}
		return result;
	}
	
	@PUT
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Device put (final Device device) {
		Device result = null;
		if (device != null) {
			result = deviceDao.updateDevice(device);
		}
		return result;
	}
}
