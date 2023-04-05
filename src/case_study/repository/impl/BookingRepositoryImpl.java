package case_study.repository.impl;

import case_study.model.Booking;
import case_study.repository.IBookingRepository;
import case_study.util.ReadAndWrite;

import java.util.List;
import java.util.TreeSet;

public class BookingRepositoryImpl implements IBookingRepository {
    private final String PATH_FILE="src\\case_study\\data\\booking_data.csv";


    @Override
    public void add(Booking booking) {
    String string = booking.getToCSV();
        ReadAndWrite.writeStringToFile(PATH_FILE,string,true);
    }

    @Override
    public TreeSet<Booking> displayBooking() {
        TreeSet<Booking>bookingTreeSet1=new TreeSet<>();
        List<String>stringList=ReadAndWrite.readFileToListString(PATH_FILE);
        for (String s:stringList) {
            String [] string= s.split(",");
            bookingTreeSet1.add(new Booking(Integer.parseInt(string[0]),string[1],string[2],Integer.parseInt(string[3]),string[4],string[5]));
        }
        return bookingTreeSet1;
    }


}
