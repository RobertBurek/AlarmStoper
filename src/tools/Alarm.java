package tools;

import java.time.LocalTime;

public class Alarm {
    private LocalTime alarm;
    private boolean isAlarmTak = false;

    public LocalTime getAlarm() {
        return alarm;
    }

    public void setAlarm(LocalTime alarm) {
        this.alarm = alarm;
    }

    public boolean getIsAlarmOn() {
        return isAlarmTak;
    }

    public void setAlarmOn(boolean alarmTak) {
        isAlarmTak = alarmTak;
    }
}
