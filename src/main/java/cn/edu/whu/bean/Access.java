package cn.edu.whu.bean;

import java.util.Date;

public class Access {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access.uris
     *
     * @mbggenerated
     */
    private String uris;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access.status
     *
     * @mbggenerated
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access.id
     *
     * @return the value of access.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access.id
     *
     * @param id the value for access.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access.title
     *
     * @return the value of access.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access.title
     *
     * @param title the value for access.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access.uris
     *
     * @return the value of access.uris
     *
     * @mbggenerated
     */
    public String getUris() {
        return uris;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access.uris
     *
     * @param uris the value for access.uris
     *
     * @mbggenerated
     */
    public void setUris(String uris) {
        this.uris = uris == null ? null : uris.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access.status
     *
     * @return the value of access.status
     *
     * @mbggenerated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access.status
     *
     * @param status the value for access.status
     *
     * @mbggenerated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access.create_time
     *
     * @return the value of access.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access.create_time
     *
     * @param createTime the value for access.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access.update_time
     *
     * @return the value of access.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access.update_time
     *
     * @param updateTime the value for access.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}