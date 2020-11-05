package com.sh.core.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * 向指定 URL 发送POST方法的请求
 *
 * @return 远程资源的响应结果
 */
public class HttpUtil {
	
	public static final String RES_URL = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=";
	
	/**
	 * 向指定 URL 发送POST方法的请求
	 *
	 * @param url
	 *            发送请求的 URL
	 * @param params
	 *            请求的参数集合
	 * @return 远程资源的响应结果
	 */
	@SuppressWarnings("unused")
	public static String sendPost(String url, Map<String, String> params) {
		OutputStreamWriter out = null;
		BufferedReader in = null;
		StringBuilder result = new StringBuilder();
		try {
			URL realUrl = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) realUrl.openConnection();
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// POST方法
			conn.setRequestMethod("POST");
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			conn.connect();
			// 获取URLConnection对象对应的输出流
			out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
			// 发送请求参数
			if (params != null) {
				StringBuilder param = new StringBuilder();
				for (Map.Entry<String, String> entry : params.entrySet()) {
					if (param.length() > 0) {
						param.append("&");
					}
					param.append(entry.getKey());
					param.append("=");
					param.append(entry.getValue());
					// System.out.println(entry.getKey()+":"+entry.getValue());
				}
				// System.out.println("param:"+param.toString());
				out.write(param.toString());
			}
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			String line;
			while ((line = in.readLine()) != null) {
				result.append(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result.toString();
	}
	
	 public static JSONObject httpsRequest(JSONObject jsonParam){
	        String aToken = "XROOKIETOKEN";
	        StringBuffer sb=new StringBuffer();
	        try {
	            ;
	            // 创建url资源
	            URL url = new URL(RES_URL + aToken);
	            // 建立http连接
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	            // 设置允许输出
	            conn.setDoOutput(true);
	            // 设置允许输入
	            conn.setDoInput(true);
	            // 设置不用缓存
	            conn.setUseCaches(false);
	            // 设置传递方式
	            conn.setRequestMethod("POST");
	            // 设置维持长连接
	            conn.setRequestProperty("Connection", "Keep-Alive");
	            // 设置文件字符集:
	            conn.setRequestProperty("Charset", "UTF-8");
	            // 转换为字节数组
	            byte[] data = (jsonParam.toString()).getBytes();
	            // 设置文件长度
	            conn.setRequestProperty("Content-Length", String.valueOf(data.length));
	            // 设置文件类型:
	            conn.setRequestProperty("contentType", "application/json");
	            // 开始连接请求
	            conn.connect();
	            OutputStream out = new DataOutputStream(conn.getOutputStream()) ;
	            // 写入请求的字符串
	            out.write((jsonParam.toString()).getBytes());
	            out.flush();
	            out.close();
	
	            System.out.println(conn.getResponseCode());
	
	            // 请求返回的状态
	            if (HttpURLConnection.HTTP_OK == conn.getResponseCode()){
	                System.out.println("连接成功");
	                // 请求返回的数据
	                InputStream in1 = conn.getInputStream();
	                try {
	                    String readLine=new String();
	                    BufferedReader responseReader=new BufferedReader(new InputStreamReader(in1,"UTF-8"));
	                    while((readLine=responseReader.readLine())!=null){
	                        sb.append(readLine).append("\n");
	                    }
	                    responseReader.close();
	                    System.out.println(sb.toString());
	
	                } catch (Exception e1) {
	                    e1.printStackTrace();
	                }
	            } else {
	                System.out.println("error++");
	            }
	
	        } catch (Exception e) {
	        	
	        }
	        return JSONObject.parseObject(sb.toString());
	    }

	
	public static JSONObject httpsRequest(JSONObject jsonParam,String requestSource){
        String aToken = "XROOKIETOKEN";
        StringBuffer sb = new StringBuffer();
        try {
            
            // 创建url资源
            URL url = new URL(RES_URL + aToken);
            // 建立http连接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 设置允许输出
            conn.setDoOutput(true);
            // 设置允许输入
            conn.setDoInput(true);
            // 设置不用缓存
            conn.setUseCaches(false);
            // 设置传递方式
            conn.setRequestMethod("POST");
            // 设置维持长连接
            conn.setRequestProperty("Connection", "Keep-Alive");
            // 设置文件字符集:
            conn.setRequestProperty("Charset", "UTF-8");
            // 转换为字节数组
            byte[] data = (jsonParam.toString()).getBytes();
            // 设置文件长度
            conn.setRequestProperty("Content-Length", String.valueOf(data.length));
            // 设置文件类型:
            conn.setRequestProperty("contentType", "application/json");
            // 开始连接请求
            conn.connect();
            OutputStream out = new DataOutputStream(conn.getOutputStream()) ;
            // 写入请求的字符串
            out.write((jsonParam.toString()).getBytes());
            out.flush();
            out.close();

            System.out.println(conn.getResponseCode());

            // 请求返回的状态
            if (HttpURLConnection.HTTP_OK == conn.getResponseCode()){
                System.out.println("连接成功");
                // 请求返回的数据
                InputStream in1 = conn.getInputStream();
                try {
                    String readLine = new String();
                    BufferedReader responseReader=new BufferedReader(new InputStreamReader(in1,"UTF-8"));
                    while((readLine=responseReader.readLine())!=null){
                        sb.append(readLine).append("\n");
                    }
                    responseReader.close();
                    System.out.println(sb.toString());

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            } else {
                System.out.println("error++");
            }

        } catch (Exception e) {
            
        }
        return JSONObject.parseObject(sb.toString());
    }
}
