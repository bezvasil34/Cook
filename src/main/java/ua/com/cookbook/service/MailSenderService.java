package ua.com.cookbook.service;

/**
 * Created by koko on 30.10.16.
 */
public interface MailSenderService {

    void sendMail(String content, String email, String mailBody);
}
