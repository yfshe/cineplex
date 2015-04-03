package edu.nju.cineplex.service.statistic;

import edu.nju.cineplex.vo.*;

public interface StatisticService {
	
	public UsageStatisticVO getUsageStatistic(TimeRangeVO range);
	public RevenueStatisticVO getRevenueStatistic(TimeRangeVO range);
	public MemberStatisticVO getMemberStatistic(TimeRangeVO range);

}
