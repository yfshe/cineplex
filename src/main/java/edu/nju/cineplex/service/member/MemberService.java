package edu.nju.cineplex.service.member;

import java.util.List;

import edu.nju.cineplex.vo.*;

public interface MemberService {
	
	public int member_login(LoginVO login);
	public boolean server_login(LoginVO login);
	public boolean manager_login(LoginVO login);
	public MemberBriefInfoVO member_register(RegisterVO Register);
	public MemberBriefInfoVO getMemberBriefInfo(int id);
	public MemberDetailInfoVO getMemberDetailInfo(int id);
	public boolean setMemberDetailInfo(MemberDetailInfoVO info);
	public boolean member_recharge(RechargeVO recharge);
	public List<CostRecordVO> getMemberCostRecords(int id, TimeRangeVO range);
	public boolean member_upgrade(UpgradeVO upgrade);
	public List<FilmBriefInfoVO> getMemberActivities(int id);
	public void member_delete(int id);

}
