package com.hrishi.problems;

import java.util.*;

public class RecruitmentTimeSlot {

    static class TimeSlot {
        int startTime;
        int endTIme;
        boolean slotBooked;
        Slot slot;

        public TimeSlot(int startTime, int endTIme, boolean slotBooked, Slot slot) {
            this.startTime = startTime;
            this.endTIme = endTIme;
            this.slotBooked = slotBooked;
            this.slot = slot;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTIme() {
            return endTIme;
        }

        public void setEndTIme(int endTIme) {
            this.endTIme = endTIme;
        }

        public boolean isSlotBooked() {
            return slotBooked;
        }

        public void setSlotBooked(boolean slotBooked) {
            this.slotBooked = slotBooked;
        }

        public Slot getSlot() {
            return slot;
        }

        public void setSlot(Slot slot) {
            this.slot = slot;
        }

        public String toString() {
            return "TimeSlot{" +
                    "startTime=" + startTime +
                    ", endTIme=" + endTIme +
                    ", slotBooked=" + slotBooked +
                    ", slot=" + slot +
                    '}';
        }
    }

    public static void main(String[] args) {
        TimeSlot[] timeSlots = new TimeSlot[9];
        timeSlots[0] = new TimeSlot(9,10,false,null);
        timeSlots[1] = new TimeSlot(10,11,false,null);
        timeSlots[2] = new TimeSlot(11,12,false,null);
        timeSlots[3] = new TimeSlot(12,13,false,null);
        timeSlots[4] = new TimeSlot(13,14,false,null);
        timeSlots[5] = new TimeSlot(14,15,false,null);
        timeSlots[6] = new TimeSlot(15,16,false,null);
        timeSlots[7] = new TimeSlot(16,17,false,null);
        timeSlots[8] = new TimeSlot(17,18,false,null);

        List<Slot> candidateSlots = new ArrayList<>(List.of(new Slot(9, 10), new Slot(16, 17), new Slot(13, 18),
                new Slot(13, 14), new Slot(9, 10), new Slot(9, 18), new Slot(10, 18), new Slot(10, 11)));



//        System.out.println("candidateSlots 0 = " + candidateSlots);
        candidateSlots.sort(new TimeComparator());
//        System.out.println("candidateSlots 1 = " + candidateSlots);
        candidateSlots.sort(new TimeDifferenceComparator());
        System.out.println("Starting candidateSlots = " + candidateSlots);

        for(int j=0; j< candidateSlots.size(); j++) {
            for(int i=0; i< timeSlots.length; i++) {
                if(null != candidateSlots.get(j)
                        && timeSlots[i].startTime >= candidateSlots.get(j).startTime
                        && timeSlots[i].endTIme <= candidateSlots.get(j).endTime
                        && !timeSlots[i].slotBooked) {
                    timeSlots[i].slot = candidateSlots.get(j);
                    timeSlots[i].setSlotBooked(true);
                    candidateSlots.set(j, null);
                }
            }
        }

        for(TimeSlot timeSlot : timeSlots) {
            System.out.println("timeSlot = " + timeSlot);
        }
        System.out.println("After booking = " + candidateSlots);
    }

    record Slot(int startTime, int endTime){};

    static class TimeComparator implements Comparator<Slot> {

        @Override
        public int compare(Slot o1, Slot o2) {
            return o1.startTime - o2.startTime;
        }
    }

    static class TimeDifferenceComparator implements Comparator<Slot> {

        @Override
        public int compare(Slot o1, Slot o2) {
            return (o1.endTime - o1.startTime) - (o2.endTime - o2.startTime);
        }
    }

}
