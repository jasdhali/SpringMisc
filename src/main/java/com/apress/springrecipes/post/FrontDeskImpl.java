package com.apress.springrecipes.post;

import org.springframework.jms.core.support.JmsGatewaySupport;
import org.springframework.transaction.annotation.Transactional;

public class FrontDeskImpl extends JmsGatewaySupport implements FrontDesk {

    @Transactional
    public void sendMail(final Mail mail) {
        getJmsTemplate().convertAndSend(mail);
    }
    
    /*@Transactional
    public void browse(final Mail mail) {
    	
        getJmsTemplate().browse( new BrowserCallback<T>(){
        	@Override
        	public T doInJms(Session arg0, QueueBrowser arg1)
        			throws JMSException {
        		return null;
        	}
        });
    }*/
}
