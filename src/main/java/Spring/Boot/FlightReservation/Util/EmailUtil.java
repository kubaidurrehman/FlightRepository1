package Spring.Boot.FlightReservation.Util;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.itextpdf.text.log.SysoCounter;

import Spring.Boot.FlightReservation.Entity.Passenger;

@Component
public class EmailUtil {

	@Autowired
	JavaMailSender sender;
	
	public void sendItinerary(String toAddress, String filePath) {
		
		MimeMessage message = sender.createMimeMessage();
		
		try {
			
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
			System.out.println(toAddress);
			
			messageHelper.setTo(toAddress);
			messageHelper.setSubject("Itinerary for your Flight.");
			messageHelper.setText("Please find your Itinary attached.");
			messageHelper.addAttachment("Itinearary", new File(filePath));
			sender.send(message);
			System.out.println(messageHelper.toString());
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
