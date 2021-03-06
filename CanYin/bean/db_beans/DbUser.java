package db_beans;
import java.io.Serializable;
import java.util.Date;

import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Model class of db_user.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Table("db_user")
public class DbUser implements Serializable {
	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** ID. */
	@Id
	private Integer id;

	/** groupID. */
	private Integer groupid;

	/** loginName. */

	private String loginname;

	/** loginPWD. */
	private String loginpwd;

	/** showName. */
	private String showname;

	/** loginIP. */
	private String loginip;

	/** lastTime. */
	private Date lasttime;

	/** status. */
	private Integer status;

	/** wxID. */
	private String wxid;

	/** contactInfo. */
	private String contactinfo;

	/** creatTime. */
	private Date creattime;

	/** cardID. */
	private String cardid;

	/** userType. */
	private String usertype;

	/** departmentID. */
	private Integer departmentid;

	/**
	 * Constructor.
	 */
	public DbUser() {
	}

	/**
	 * Set the ID.
	 * 
	 * @param id
	 *            ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * Set the groupID.
	 * 
	 * @param groupid
	 *            groupID
	 */
	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}

	/**
	 * Get the groupID.
	 * 
	 * @return groupID
	 */
	public Integer getGroupid() {
		return this.groupid;
	}

	/**
	 * Set the loginName.
	 * 
	 * @param loginname
	 *            loginName
	 */
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	/**
	 * Get the loginName.
	 * 
	 * @return loginName
	 */
	public String getLoginname() {
		return this.loginname;
	}

	/**
	 * Set the loginPWD.
	 * 
	 * @param loginpwd
	 *            loginPWD
	 */
	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}

	/**
	 * Get the loginPWD.
	 * 
	 * @return loginPWD
	 */
	public String getLoginpwd() {
		return this.loginpwd;
	}

	/**
	 * Set the showName.
	 * 
	 * @param showname
	 *            showName
	 */
	public void setShowname(String showname) {
		this.showname = showname;
	}

	/**
	 * Get the showName.
	 * 
	 * @return showName
	 */
	public String getShowname() {
		return this.showname;
	}

	/**
	 * Set the loginIP.
	 * 
	 * @param loginip
	 *            loginIP
	 */
	public void setLoginip(String loginip) {
		this.loginip = loginip;
	}

	/**
	 * Get the loginIP.
	 * 
	 * @return loginIP
	 */
	public String getLoginip() {
		return this.loginip;
	}

	/**
	 * Set the lastTime.
	 * 
	 * @param lasttime
	 *            lastTime
	 */
	public void setLasttime(Date lasttime) {
		this.lasttime = lasttime;
	}

	/**
	 * Get the lastTime.
	 * 
	 * @return lastTime
	 */
	public Date getLasttime() {
		return this.lasttime;
	}

	/**
	 * Set the status.
	 * 
	 * @param status
	 *            status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * Get the status.
	 * 
	 * @return status
	 */
	public Integer getStatus() {
		return this.status;
	}

	/**
	 * Set the wxID.
	 * 
	 * @param wxid
	 *            wxID
	 */
	public void setWxid(String wxid) {
		this.wxid = wxid;
	}

	/**
	 * Get the wxID.
	 * 
	 * @return wxID
	 */
	public String getWxid() {
		return this.wxid;
	}

	/**
	 * Set the contactInfo.
	 * 
	 * @param contactinfo
	 *            contactInfo
	 */
	public void setContactinfo(String contactinfo) {
		this.contactinfo = contactinfo;
	}

	/**
	 * Get the contactInfo.
	 * 
	 * @return contactInfo
	 */
	public String getContactinfo() {
		return this.contactinfo;
	}

	/**
	 * Set the creatTime.
	 * 
	 * @param creattime
	 *            creatTime
	 */
	public void setCreattime(Date creattime) {
		System.out.println(creattime);
		this.creattime = creattime;
	}

	/**
	 * Get the creatTime.
	 * 
	 * @return creatTime
	 */
	public Date getCreattime() {
		if(this.creattime==null){
			return new Date();
		}
		return this.creattime;
	}

	/**
	 * Set the cardID.
	 * 
	 * @param cardid
	 *            cardID
	 */
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}

	/**
	 * Get the cardID.
	 * 
	 * @return cardID
	 */
	public String getCardid() {
		return this.cardid;
	}

	/**
	 * Set the userType.
	 * 
	 * @param usertype
	 *            userType
	 */
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	/**
	 * Get the userType.
	 * 
	 * @return userType
	 */
	public String getUsertype() {
		return this.usertype;
	}

	/**
	 * Set the departmentID.
	 * 
	 * @param departmentid
	 *            departmentID
	 */
	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	/**
	 * Get the departmentID.
	 * 
	 * @return departmentID
	 */
	public Integer getDepartmentid() {
		return this.departmentid;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		DbUser other = (DbUser) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}
