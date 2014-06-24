package db_beans;
import java.io.Serializable;
import java.util.Date;

import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * Model class of db_table.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Table("db_table")
public class DbTable implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	@Id
	private Integer id;

	/** Alias. */
	private String alias;

	/** TableName. */
	private String tablename;

	/** TableType. */
	private String tabletype;

	/** Position. */
	private String position;

	/** Limit. */
	private Float limit;

	/** AllowPeople. */
	private Integer allowpeople;

	/** State. */
	private String state;

	/** IsOrder. */
	private Integer isorder;

	/** SalesID. */
	private String salesid;

	/** waiter. */
	private String waiter;

	/** Prepay. */
	private Float prepay;

	/** StartTime. */
	private Date starttime;

	/** FinishTime. */
	private Date finishtime;

	/** Desrc. */
	private String desrc;

	/** Reserve. */
	private String reserve;

	/** Permission. */
	private Integer permission;

	/** UserID. */
	private Integer userid;

	/**
	 * Constructor.
	 */
	public DbTable() {
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
	 * Set the Alias.
	 * 
	 * @param alias
	 *            Alias
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * Get the Alias.
	 * 
	 * @return Alias
	 */
	public String getAlias() {
		return this.alias;
	}

	/**
	 * Set the TableName.
	 * 
	 * @param tablename
	 *            TableName
	 */
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	/**
	 * Get the TableName.
	 * 
	 * @return TableName
	 */
	public String getTablename() {
		return this.tablename;
	}

	/**
	 * Set the TableType.
	 * 
	 * @param tabletype
	 *            TableType
	 */
	public void setTabletype(String tabletype) {
		this.tabletype = tabletype;
	}

	/**
	 * Get the TableType.
	 * 
	 * @return TableType
	 */
	public String getTabletype() {
		return this.tabletype;
	}

	/**
	 * Set the Position.
	 * 
	 * @param position
	 *            Position
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * Get the Position.
	 * 
	 * @return Position
	 */
	public String getPosition() {
		return this.position;
	}

	/**
	 * Set the Limit.
	 * 
	 * @param limit
	 *            Limit
	 */
	public void setLimit(Float limit) {
		this.limit = limit;
	}

	/**
	 * Get the Limit.
	 * 
	 * @return Limit
	 */
	public Float getLimit() {
		return this.limit;
	}

	/**
	 * Set the AllowPeople.
	 * 
	 * @param allowpeople
	 *            AllowPeople
	 */
	public void setAllowpeople(Integer allowpeople) {
		this.allowpeople = allowpeople;
	}

	/**
	 * Get the AllowPeople.
	 * 
	 * @return AllowPeople
	 */
	public Integer getAllowpeople() {
		return this.allowpeople;
	}

	/**
	 * Set the State.
	 * 
	 * @param state
	 *            State
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Get the State.
	 * 
	 * @return State
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * Set the IsOrder.
	 * 
	 * @param isorder
	 *            IsOrder
	 */
	public void setIsorder(Integer isorder) {
		this.isorder = isorder;
	}

	/**
	 * Get the IsOrder.
	 * 
	 * @return IsOrder
	 */
	public Integer getIsorder() {
		return this.isorder;
	}

	/**
	 * Set the SalesID.
	 * 
	 * @param salesid
	 *            SalesID
	 */
	public void setSalesid(String salesid) {
		this.salesid = salesid;
	}


	/**
	 * Get the SalesID.
	 * 
	 * @return SalesID
	 */
	public String getSalesid() {
		return this.salesid;
	}

	/**
	 * Set the waiter.
	 * 
	 * @param waiter
	 *            waiter
	 */
	public void setWaiter(String waiter) {
		this.waiter = waiter;
	}
	public void setWaiter(int waiter) {
		/*
		 * waiter dd=new waiter()
		 * this.waiter =dd.getwaitername();
		 */
		
		this.waiter = String.valueOf(waiter);
	}

	/**
	 * Get the waiter.
	 * 
	 * @return waiter
	 */
	public String getWaiter() {
		return this.waiter;
	}

	/**
	 * Set the Prepay.
	 * 
	 * @param prepay
	 *            Prepay
	 */
	public void setPrepay(Float prepay) {
		this.prepay = prepay;
	}

	/**
	 * Get the Prepay.
	 * 
	 * @return Prepay
	 */
	public Float getPrepay() {
		return this.prepay;
	}

	/**
	 * Set the StartTime.
	 * 
	 * @param starttime
	 *            StartTime
	 */
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	/**
	 * Get the StartTime.
	 * 
	 * @return StartTime
	 */
	public Date getStarttime() {
		return this.starttime;
	}

	/**
	 * Set the FinishTime.
	 * 
	 * @param finishtime
	 *            FinishTime
	 */
	public void setFinishtime(Date finishtime) {
		this.finishtime = finishtime;
	}

	/**
	 * Get the FinishTime.
	 * 
	 * @return FinishTime
	 */
	public Date getFinishtime() {
		return this.finishtime;
	}

	/**
	 * Set the Desrc.
	 * 
	 * @param desrc
	 *            Desrc
	 */
	public void setDesrc(String desrc) {
		this.desrc = desrc;
	}

	/**
	 * Get the Desrc.
	 * 
	 * @return Desrc
	 */
	public String getDesrc() {
		return this.desrc;
	}

	/**
	 * Set the Reserve.
	 * 
	 * @param reserve
	 *            Reserve
	 */
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	/**
	 * Get the Reserve.
	 * 
	 * @return Reserve
	 */
	public String getReserve() {
		return this.reserve;
	}

	/**
	 * Set the Permission.
	 * 
	 * @param permission
	 *            Permission
	 */
	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	/**
	 * Get the Permission.
	 * 
	 * @return Permission
	 */
	public Integer getPermission() {
		return this.permission;
	}

	/**
	 * Set the UserID.
	 * 
	 * @param userid
	 *            UserID
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	/**
	 * Get the UserID.
	 * 
	 * @return UserID
	 */
	public Integer getUserid() {
		return this.userid;
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
		DbTable other = (DbTable) obj;
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
