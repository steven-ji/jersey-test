package com.ideal.jersey.device.dao;

import java.util.concurrent.ConcurrentHashMap;

import com.ideal.jersey.device.entity.Device;

public class DeviceDao {

	private ConcurrentHashMap<String, Device> fakeDB = new ConcurrentHashMap<String, Device>();

	public DeviceDao() {
		// 测试数据，初始化两个设备实例
		fakeDB.put("10.11.58.163", new Device("10.11.58.163"));
		fakeDB.put("10.11.58.164", new Device("10.11.58.164"));
	}
	
	public Device getDevice(String deviceIp) {
		return fakeDB.get(deviceIp);
	}

	public Device updateDevice(Device device) {
		String ip = device.getDeviceIp();
		fakeDB.put(ip, device);		
		return fakeDB.get(ip);
	}

}
