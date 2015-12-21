package com.ideal.jersey.device.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * 
 * 功能说明:Device类和XML格式的设备数据相互转换并在服务器和客户端之间传输.
 * 
 * @author jilingjun
 *
 * @Date 2015年12月20日 下午10:13:21
 *
 *
 * 版本号  |   作者   |  修改时间   |   修改内容
 *
 */
@XmlRootElement(name = "device")
public class Device {
	
	private String deviceIp;
	private int deviceStatus;
	
	public Device(){}
	
	public Device (String deviceIp){
		this.deviceIp = deviceIp;
	}

	public String getDeviceIp() {
		return deviceIp;
	}

	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}
	@XmlAttribute
	public int getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(int deviceStatus) {
		this.deviceStatus = deviceStatus;
	}
	
}
