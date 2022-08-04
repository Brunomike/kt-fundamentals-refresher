package rsk.java;

public class Organizer {
    boolean closeMeeting(Meeting meeting) {
        if (meeting.canClose) return meeting.close();
        return false;
    }

    public static void main(String[] args) {
        Organizer org = new Organizer();
        Meeting m = new Meeting();
        Boolean result=org.closeMeeting(null);
        System.out.println(result);
    }
}

class Meeting {
    public boolean canClose;

    public boolean close() {
        return false;
    }
}
