package builder;

import model.BookingModel;

/*Blaze demo browser automation
 * Created script by Hanumanth 
 * Date:06-10-2021
 */
public class BookingDetails extends BookingModel {

    BookingModel bookingModel = new BookingModel();

    public BookingDetails(String[] bookingDetails){
        bookingModel.setDeparture(bookingDetails[0]);
        bookingModel.setDestination(bookingDetails[1]);
        bookingModel.setName(bookingDetails[2]);
        bookingModel.setAddress(bookingDetails[3]);
        bookingModel.setCity(bookingDetails[4]);
        bookingModel.setState(bookingDetails[5]);
        bookingModel.setZipCode(bookingDetails[6]);
        bookingModel.setCardType(bookingDetails[7]);
        bookingModel.setCardNumber(bookingDetails[8]);
        bookingModel.setMonth(bookingDetails[9]);
        bookingModel.setYear(bookingDetails[10]);
        bookingModel.setCardName(bookingDetails[11]);
    }

    public BookingModel getBookingDetails(){
        return bookingModel;
    }
}
