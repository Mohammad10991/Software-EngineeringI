package Airport.fire_department;


import Airport.Airport.Runway;
import Airport.Airport.RunwayID;
import Airport.Base.AlarmType;

public interface IFireDepartment
{
    void alarm(Runway runway,
               AlarmType alarmtype);

    boolean openEntrance(Entrance entrance);

    boolean closeEntrance(Entrance entrance);

    int assignFireFighter(FireTruck fireTruck);

	int alarm(RunwayID runwayID, AlarmType alarmType);
}
