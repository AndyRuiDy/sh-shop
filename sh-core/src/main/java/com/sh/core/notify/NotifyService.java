package com.sh.core.notify;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Async;

import lombok.Setter;

/**
 * 商城通知服务类
 */
public class NotifyService {
	
	@Setter
    private MailSender mailSender;
	
	@Setter
    private String sendFrom;
	
	@Setter
    private String sendTo;

	@Setter
    private SmsSender smsSender;
    
    @Setter
    private SslMailSender sslMailSender;
    
    @Setter
    private List<Map<String, String>> smsTemplate = new ArrayList<>();

    @Setter
    private List<Map<String, String>> wxTemplate = new ArrayList<>();

    public boolean isMailEnable() {
        return mailSender != null;
    }

    public boolean isSmsEnable() {
        return smsSender != null;
    }

    /**
     * 短信消息通知
     *
     * @param phoneNumber 接收通知的电话号码
     * @param message     短消息内容，这里短消息内容必须已经在短信平台审核通过
     */
    @Async
    public void notifySms(String phoneNumber, String message) {
        if (smsSender == null)
            return;

        smsSender.send(phoneNumber, message);
    }

    /**
     * 短信模版消息通知
     *
     * @param phoneNumber 接收通知的电话号码
     * @param notifyType  通知类别，通过该枚举值在配置文件中获取相应的模版ID
     * @param params      通知模版内容里的参数，类似"您的验证码为{1}"中{1}的值
     */
    @Async
    public void notifySmsTemplate(String phoneNumber, NotifyType notifyType, String[] params) {
        if (smsSender == null) {
            return;
        }

        String templateIdStr = getTemplateId(notifyType, smsTemplate);
        if (templateIdStr == null) {
            return;
        }

        smsSender.sendWithTemplate(phoneNumber, templateIdStr, params);
    }

    /**
     * 以同步的方式发送短信模版消息通知
     *
     * @param phoneNumber 接收通知的电话号码
     * @param notifyType  通知类别，通过该枚举值在配置文件中获取相应的模版ID
     * @param params      通知模版内容里的参数，类似"您的验证码为{1}"中{1}的值
     * @return
     */
    public SmsResult notifySmsTemplateSync(String phoneNumber, NotifyType notifyType, String[] params) {
        if (smsSender == null)
            return null;

        return smsSender.sendWithTemplate(phoneNumber, getTemplateId(notifyType, smsTemplate), params);
    }

    /**
     * 邮件消息通知,
     * 接收者在spring.mail.sendto中指定
     *
     * @param subject 邮件标题
     * @param content 邮件内容
     */
    @Async
    public void notifyMail(String subject, String content) {
        if (mailSender == null)
            return;

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(sendFrom);
        message.setTo(sendTo);
        message.setSubject(subject);
        message.setText(content);
        mailSender.send(message);
    }
    
	/**
	 * 发送ssl邮件
	 * 
	 * @param subject
	 *            邮件标题
	 * @param content
	 *            邮件内容
	 */
	@Async
	public void notifySslMail(String subject, String content) {
		if (sslMailSender == null)
			return;
		sslMailSender.sendMails(subject, content);
	}

    private String getTemplateId(NotifyType notifyType, List<Map<String, String>> values) {
        for (Map<String, String> item : values) {
            String notifyTypeStr = notifyType.getType();

            if (item.get("name").equals(notifyTypeStr))
                return item.get("templateId");
        }
        return null;
    }

}
