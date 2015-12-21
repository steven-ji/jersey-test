package com.ideal.jersey.device;

import java.net.URI;

import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class DeviceResouceTest {

	/**
	 * Grizzly服务器类
	 */
	private HttpServer httpServer;
	/**
	 * JAX-RS2.0的客户端资源定位类
	 */
	private WebTarget target;
	
	public void setUp() throws Exception {
		httpServer = new HttpServer(){
			private String BASE_URI = "http://localhost:8080/device-service/";
			public HttpServer startServer() {
				// 加载资源
				final ResourceConfig rc = new ResourceConfig().packages("com.ideal.jersey.device");
				// 初始化Grizzly HTTP服务器
				return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
			}
		}.startServer();
	}
	
	
}
