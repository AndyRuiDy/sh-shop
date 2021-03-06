package com.sh.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class ShRefundTrace {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sh_refund_trace
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sh_refund_trace
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean IS_DELETED = true;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_refund_trace.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_refund_trace.order_id
     *
     * @mbg.generated
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_refund_trace.order_sn
     *
     * @mbg.generated
     */
    private String orderSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_refund_trace.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_refund_trace.refund_reason
     *
     * @mbg.generated
     */
    private String refundReason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_refund_trace.has_picture
     *
     * @mbg.generated
     */
    private Boolean hasPicture;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_refund_trace.pic_urls
     *
     * @mbg.generated
     */
    private String picUrls;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_refund_trace.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_refund_trace.approve_msg
     *
     * @mbg.generated
     */
    private String approveMsg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_refund_trace.approve_time
     *
     * @mbg.generated
     */
    private LocalDateTime approveTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_refund_trace.freight_msg
     *
     * @mbg.generated
     */
    private String freightMsg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_refund_trace.refund_time
     *
     * @mbg.generated
     */
    private LocalDateTime refundTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_refund_trace.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_refund_trace.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_refund_trace.id
     *
     * @return the value of sh_refund_trace.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_refund_trace.id
     *
     * @param id the value for sh_refund_trace.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_refund_trace.order_id
     *
     * @return the value of sh_refund_trace.order_id
     *
     * @mbg.generated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_refund_trace.order_id
     *
     * @param orderId the value for sh_refund_trace.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_refund_trace.order_sn
     *
     * @return the value of sh_refund_trace.order_sn
     *
     * @mbg.generated
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_refund_trace.order_sn
     *
     * @param orderSn the value for sh_refund_trace.order_sn
     *
     * @mbg.generated
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_refund_trace.status
     *
     * @return the value of sh_refund_trace.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_refund_trace.status
     *
     * @param status the value for sh_refund_trace.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_refund_trace.refund_reason
     *
     * @return the value of sh_refund_trace.refund_reason
     *
     * @mbg.generated
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_refund_trace.refund_reason
     *
     * @param refundReason the value for sh_refund_trace.refund_reason
     *
     * @mbg.generated
     */
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_refund_trace.has_picture
     *
     * @return the value of sh_refund_trace.has_picture
     *
     * @mbg.generated
     */
    public Boolean getHasPicture() {
        return hasPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_refund_trace.has_picture
     *
     * @param hasPicture the value for sh_refund_trace.has_picture
     *
     * @mbg.generated
     */
    public void setHasPicture(Boolean hasPicture) {
        this.hasPicture = hasPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_refund_trace.pic_urls
     *
     * @return the value of sh_refund_trace.pic_urls
     *
     * @mbg.generated
     */
    public String getPicUrls() {
        return picUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_refund_trace.pic_urls
     *
     * @param picUrls the value for sh_refund_trace.pic_urls
     *
     * @mbg.generated
     */
    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_refund_trace.add_time
     *
     * @return the value of sh_refund_trace.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_refund_trace.add_time
     *
     * @param addTime the value for sh_refund_trace.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_refund_trace.approve_msg
     *
     * @return the value of sh_refund_trace.approve_msg
     *
     * @mbg.generated
     */
    public String getApproveMsg() {
        return approveMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_refund_trace.approve_msg
     *
     * @param approveMsg the value for sh_refund_trace.approve_msg
     *
     * @mbg.generated
     */
    public void setApproveMsg(String approveMsg) {
        this.approveMsg = approveMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_refund_trace.approve_time
     *
     * @return the value of sh_refund_trace.approve_time
     *
     * @mbg.generated
     */
    public LocalDateTime getApproveTime() {
        return approveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_refund_trace.approve_time
     *
     * @param approveTime the value for sh_refund_trace.approve_time
     *
     * @mbg.generated
     */
    public void setApproveTime(LocalDateTime approveTime) {
        this.approveTime = approveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_refund_trace.freight_msg
     *
     * @return the value of sh_refund_trace.freight_msg
     *
     * @mbg.generated
     */
    public String getFreightMsg() {
        return freightMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_refund_trace.freight_msg
     *
     * @param freightMsg the value for sh_refund_trace.freight_msg
     *
     * @mbg.generated
     */
    public void setFreightMsg(String freightMsg) {
        this.freightMsg = freightMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_refund_trace.refund_time
     *
     * @return the value of sh_refund_trace.refund_time
     *
     * @mbg.generated
     */
    public LocalDateTime getRefundTime() {
        return refundTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_refund_trace.refund_time
     *
     * @param refundTime the value for sh_refund_trace.refund_time
     *
     * @mbg.generated
     */
    public void setRefundTime(LocalDateTime refundTime) {
        this.refundTime = refundTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_refund_trace.update_time
     *
     * @return the value of sh_refund_trace.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_refund_trace.update_time
     *
     * @param updateTime the value for sh_refund_trace.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_refund_trace.deleted
     *
     * @return the value of sh_refund_trace.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_refund_trace.deleted
     *
     * @param deleted the value for sh_refund_trace.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_refund_trace
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", status=").append(status);
        sb.append(", refundReason=").append(refundReason);
        sb.append(", hasPicture=").append(hasPicture);
        sb.append(", picUrls=").append(picUrls);
        sb.append(", addTime=").append(addTime);
        sb.append(", approveMsg=").append(approveMsg);
        sb.append(", approveTime=").append(approveTime);
        sb.append(", freightMsg=").append(freightMsg);
        sb.append(", refundTime=").append(refundTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_refund_trace
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ShRefundTrace other = (ShRefundTrace) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderSn() == null ? other.getOrderSn() == null : this.getOrderSn().equals(other.getOrderSn()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRefundReason() == null ? other.getRefundReason() == null : this.getRefundReason().equals(other.getRefundReason()))
            && (this.getHasPicture() == null ? other.getHasPicture() == null : this.getHasPicture().equals(other.getHasPicture()))
            && (this.getPicUrls() == null ? other.getPicUrls() == null : this.getPicUrls().equals(other.getPicUrls()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getApproveMsg() == null ? other.getApproveMsg() == null : this.getApproveMsg().equals(other.getApproveMsg()))
            && (this.getApproveTime() == null ? other.getApproveTime() == null : this.getApproveTime().equals(other.getApproveTime()))
            && (this.getFreightMsg() == null ? other.getFreightMsg() == null : this.getFreightMsg().equals(other.getFreightMsg()))
            && (this.getRefundTime() == null ? other.getRefundTime() == null : this.getRefundTime().equals(other.getRefundTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_refund_trace
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderSn() == null) ? 0 : getOrderSn().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRefundReason() == null) ? 0 : getRefundReason().hashCode());
        result = prime * result + ((getHasPicture() == null) ? 0 : getHasPicture().hashCode());
        result = prime * result + ((getPicUrls() == null) ? 0 : getPicUrls().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getApproveMsg() == null) ? 0 : getApproveMsg().hashCode());
        result = prime * result + ((getApproveTime() == null) ? 0 : getApproveTime().hashCode());
        result = prime * result + ((getFreightMsg() == null) ? 0 : getFreightMsg().hashCode());
        result = prime * result + ((getRefundTime() == null) ? 0 : getRefundTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_refund_trace
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? IS_DELETED : NOT_DELETED);
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table sh_refund_trace
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        orderId("order_id", "orderId", "INTEGER", false),
        orderSn("order_sn", "orderSn", "VARCHAR", false),
        status("status", "status", "TINYINT", true),
        refundReason("refund_reason", "refundReason", "VARCHAR", false),
        hasPicture("has_picture", "hasPicture", "BIT", false),
        picUrls("pic_urls", "picUrls", "VARCHAR", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        approveMsg("approve_msg", "approveMsg", "VARCHAR", false),
        approveTime("approve_time", "approveTime", "TIMESTAMP", false),
        freightMsg("freight_msg", "freightMsg", "VARCHAR", false),
        refundTime("refund_time", "refundTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        deleted("deleted", "deleted", "BIT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sh_refund_trace
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sh_refund_trace
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sh_refund_trace
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sh_refund_trace
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sh_refund_trace
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sh_refund_trace
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sh_refund_trace
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sh_refund_trace
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sh_refund_trace
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sh_refund_trace
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sh_refund_trace
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sh_refund_trace
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sh_refund_trace
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sh_refund_trace
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sh_refund_trace
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}