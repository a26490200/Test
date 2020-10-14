package Factory;

import Dao.memberDao;
import Dao.porderDao;

public class factDao {

	private memberDao md;
	private porderDao pd;
	public memberDao getMd() {
		return md;
	}
	public void setMd(memberDao md) {
		this.md = md;
	}
	public porderDao getPd() {
		return pd;
	}
	public void setPd(porderDao pd) {
		this.pd = pd;
	}
	
	
}
