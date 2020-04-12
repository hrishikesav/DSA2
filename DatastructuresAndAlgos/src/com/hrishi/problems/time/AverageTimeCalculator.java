package com.hrishi.problems.time;

public class AverageTimeCalculator {

	public static void main(String[] args) {
		
		String times = "06:25:00 07:15:00 04:30:00 06:00:00 07:25:00 06:35:00 05:40:00";
		System.out.println(calculateAverageOfTime(times));
	}
	
	public static String calculateAverageOfTime(String timeInHHmmss) {
	    String[] split = timeInHHmmss.split(" ");
	    long seconds = 0;
	    for (String timestr : split) {
	        String[] hhmmss = timestr.split(":");
	        seconds += Integer.valueOf(hhmmss[0]) * 60 * 60;
	        seconds += Integer.valueOf(hhmmss[1]) * 60;
	        seconds += Integer.valueOf(hhmmss[2]);
	    }
	    seconds /= split.length;
	    long hh = seconds / 60 / 60;
	    long mm = (seconds / 60) % 60;
	    long ss = seconds % 60;
	    return String.format("%02d:%02d:%02d", hh,mm,ss);
	}

}
