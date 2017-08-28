package framgiavn.project01.web.action;

import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.PlayerBusiness;
import framgiavn.project01.web.info.PlayerInfo;

public class PlayerAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(PlayerAction.class);
	private PlayerBusiness playerBusiness;
	private PlayerInfo playerBean;
	private List<PlayerInfo> players;
	
	public PlayerBusiness getPlayerBusiness() {
		return playerBusiness;
	}

	public void setPlayerBusiness(PlayerBusiness playerBusiness) {
		this.playerBusiness = playerBusiness;
	}

	public PlayerInfo getPlayerBean() {
		return playerBean;
	}

	public void setPlayerBean(PlayerInfo playerBean) {
		this.playerBean = playerBean;
	}

	public List<PlayerInfo> getPlayers() {
		return players;
	}

	public void setPlayers(List<PlayerInfo> players) {
		this.players = players;
	}

	public String addPlayer() {
		playerBusiness.addPlayer(playerBean);
		return SUCCESS;
	}
	
	public String findPlayerByName() {
		players = playerBusiness.findPlayerByName(playerBean.getName());
		return SUCCESS;
	}
	
	public String findPlayerByNation() {
		players = playerBusiness.findPlayerByNation(playerBean.getNationality());
		return SUCCESS;
	}
	
	public String findPlayerByRegion() {
		players = playerBusiness.findPlayerByRegion(playerBean.getRegion());
		return SUCCESS;
	}
	
	public String showAllPlayer() {
		return SUCCESS;
	}
	
}
