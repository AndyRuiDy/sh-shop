package com.sh.core.notify;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import lombok.Data;

/**
 * 支持SSL邮件发送
 * @author rooki
 *
 */
@Data
public class SslMailSender {

	private final Log logger = LogFactory.getLog(SslMailSender.class);

	private String fromAddress;
	private String fromName;
	private String toAddress;
	private String host;
	private String port;
	private String userName;
	private String password;
	private String sslEnabled;
	
	/**
	 * 默认发送邮件的核心功能实现
	 */
	public boolean sendMails(String subject, String content) {

		String[] toAddressList = toAddress.split(";");// 可能分号分隔了多个用户

		String messageId = EmailHelper.sendHtml(host, Integer.valueOf(port), userName, password,
				"true".equals(sslEnabled), fromAddress, fromName, toAddressList, subject, content);
		logger.info("邮件发送完成，messageId: {" + messageId + "}");
		if (StringUtils.isNotBlank(messageId)) {
			return true;
		} else {
			return false;
		}
	}
}
