package Spring.Boot.FlightReservation.Util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.DriverManager;

import org.springframework.stereotype.Component;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import Spring.Boot.FlightReservation.Entity.Reservation;

@Component
public class PDFGenerator {
public void generateItinerary(Reservation reservation, String filepath) {
	Document document = new Document();
	try {
		PdfWriter.getInstance(document, new FileOutputStream(filepath));
		document.open();
		document.add(generateTable(reservation));
		document.close();
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
private PdfPTable generateTable(Reservation reservation) {
	PdfPTable table = new PdfPTable(2);
	
	PdfPCell cell;
	
	cell = new PdfPCell(new Phrase("Flight Itinerary"));
	cell.setColspan(2);
	table.addCell(cell);
	
	cell=new PdfPCell(new Phrase("Flight Detils"));
	cell.setColspan(2);
	table.addCell(cell);
	
	table.addCell("Airlines ");
	table.addCell(reservation.getFlight().getOperatingAirlines());
	
	table.addCell("Deperture City");
	table.addCell(reservation.getFlight().getDepurtureCity());
	
	table.addCell("Arrival City");
	table.addCell(reservation.getFlight().getArrivalCity());
	
	table.addCell("Flight Number");
	table.addCell(reservation.getFlight().getFlightNumber());
	
	table.addCell("Deperture City");
	table.addCell(reservation.getFlight().getDepurtureCity());
	
	table.addCell("Deperture Time");
	table.addCell(reservation.getFlight().getEstimatedDepurtureTime());
	
	cell = new PdfPCell(new Phrase("Passenger Details"));
	cell.setColspan(2);
	
	table.addCell("First Name");
	table.addCell(reservation.getPassenger().getFirst_Name());
	
	table.addCell("Middle Name");
	table.addCell(reservation.getPassenger().getMiddle_Name());
	
	table.addCell("Last name");
	table.addCell(reservation.getPassenger().getLast_Name());
	
	table.addCell("Email");
	table.addCell(reservation.getPassenger().getEmail());
	
	table.addCell("Phone Number");
	table.addCell(reservation.getPassenger().getPhoneNo());
	
	return table;
}
	
}
