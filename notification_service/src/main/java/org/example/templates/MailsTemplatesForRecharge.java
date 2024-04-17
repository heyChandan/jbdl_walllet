package org.example.templates;

import org.example.dto.MailComponents;
import org.springframework.stereotype.Service;

@Service
public class MailsTemplatesForRecharge {

    public static MailComponents getWalletCreationMailBody() {
       return MailComponents.builder()
               .mailSubject("Wallet Recharge Successful")
               .mailBody("Hi %s, \n " +
                       "Rs. %s recharged successfully in your wallet" +
                       "Thanks & Regards,\n" +
                       "JBDL Wallet Team")
               .build();
    }
}
