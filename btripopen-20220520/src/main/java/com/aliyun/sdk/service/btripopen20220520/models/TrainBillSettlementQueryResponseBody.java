// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainBillSettlementQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TrainBillSettlementQueryResponseBody</p>
 */
public class TrainBillSettlementQueryResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private TrainBillSettlementQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainBillSettlementQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TrainBillSettlementQueryResponseBody build() {
            return new TrainBillSettlementQueryResponseBody(this);
        } 

    } 

    public static class DataList extends TeaModel {
        @NameInMap("alipay_trade_no")
        private String alipayTradeNo;

        @NameInMap("apply_arr_city_code")
        private String applyArrCityCode;

        @NameInMap("apply_arr_city_name")
        private String applyArrCityName;

        @NameInMap("apply_dep_city_code")
        private String applyDepCityCode;

        @NameInMap("apply_dep_city_name")
        private String applyDepCityName;

        @NameInMap("apply_extend_field")
        private String applyExtendField;

        @NameInMap("apply_id")
        private String applyId;

        @NameInMap("arr_city_code")
        private String arrCityCode;

        @NameInMap("arr_city_name")
        private String arrCityName;

        @NameInMap("arr_date")
        private String arrDate;

        @NameInMap("arr_station")
        private String arrStation;

        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("bill_record_time")
        private String billRecordTime;

        @NameInMap("book_time")
        private String bookTime;

        @NameInMap("booker_id")
        private String bookerId;

        @NameInMap("booker_job_no")
        private String bookerJobNo;

        @NameInMap("booker_name")
        private String bookerName;

        @NameInMap("business_trip_result")
        private String businessTripResult;

        @NameInMap("capital_direction")
        private String capitalDirection;

        @NameInMap("cascade_department")
        private String cascadeDepartment;

        @NameInMap("change_fee")
        private Double changeFee;

        @NameInMap("change_result")
        private String changeResult;

        @NameInMap("coach_no")
        private String coachNo;

        @NameInMap("cost_center")
        private String costCenter;

        @NameInMap("cost_center_number")
        private String costCenterNumber;

        @NameInMap("coupon")
        private Double coupon;

        @NameInMap("dep_city_code")
        private String depCityCode;

        @NameInMap("dep_city_name")
        private String depCityName;

        @NameInMap("department")
        private String department;

        @NameInMap("department_id")
        private String departmentId;

        @NameInMap("dept_date")
        private String deptDate;

        @NameInMap("dept_station")
        private String deptStation;

        @NameInMap("dept_time")
        private String deptTime;

        @NameInMap("exceed_reason")
        private String exceedReason;

        @NameInMap("fee_type")
        private String feeType;

        @NameInMap("index")
        private String index;

        @NameInMap("invoice_title")
        private String invoiceTitle;

        @NameInMap("is_transfer_order")
        private String isTransferOrder;

        @NameInMap("order_id")
        private String orderId;

        @NameInMap("order_price")
        private Double orderPrice;

        @NameInMap("over_apply_id")
        private String overApplyId;

        @NameInMap("primary_id")
        private Long primaryId;

        @NameInMap("print_ticket_price")
        private Double printTicketPrice;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_name")
        private String projectName;

        @NameInMap("refund_fee")
        private Double refundFee;

        @NameInMap("refund_reason")
        private String refundReason;

        @NameInMap("remark")
        private String remark;

        @NameInMap("reserve_mode")
        private String reserveMode;

        @NameInMap("run_time")
        private String runTime;

        @NameInMap("seat_no")
        private String seatNo;

        @NameInMap("seat_type")
        private String seatType;

        @NameInMap("service_fee")
        private Double serviceFee;

        @NameInMap("settlement_fee")
        private Double settlementFee;

        @NameInMap("settlement_grant_fee")
        private Double settlementGrantFee;

        @NameInMap("settlement_time")
        private String settlementTime;

        @NameInMap("settlement_type")
        private String settlementType;

        @NameInMap("short_ticket_no")
        private String shortTicketNo;

        @NameInMap("status")
        private Integer status;

        @NameInMap("tax_rate")
        private String taxRate;

        @NameInMap("third_itinerary_id")
        private String thirdItineraryId;

        @NameInMap("ticket_corp_pay_price")
        private String ticketCorpPayPrice;

        @NameInMap("ticket_no")
        private String ticketNo;

        @NameInMap("ticket_person_pay_price")
        private String ticketPersonPayPrice;

        @NameInMap("ticket_price")
        private Double ticketPrice;

        @NameInMap("train_no")
        private String trainNo;

        @NameInMap("train_type")
        private String trainType;

        @NameInMap("traveler_id")
        private String travelerId;

        @NameInMap("traveler_job_no")
        private String travelerJobNo;

        @NameInMap("traveler_member_type_name")
        private String travelerMemberTypeName;

        @NameInMap("traveler_name")
        private String travelerName;

        @NameInMap("voucher_type")
        private Integer voucherType;

        private DataList(Builder builder) {
            this.alipayTradeNo = builder.alipayTradeNo;
            this.applyArrCityCode = builder.applyArrCityCode;
            this.applyArrCityName = builder.applyArrCityName;
            this.applyDepCityCode = builder.applyDepCityCode;
            this.applyDepCityName = builder.applyDepCityName;
            this.applyExtendField = builder.applyExtendField;
            this.applyId = builder.applyId;
            this.arrCityCode = builder.arrCityCode;
            this.arrCityName = builder.arrCityName;
            this.arrDate = builder.arrDate;
            this.arrStation = builder.arrStation;
            this.arrTime = builder.arrTime;
            this.billRecordTime = builder.billRecordTime;
            this.bookTime = builder.bookTime;
            this.bookerId = builder.bookerId;
            this.bookerJobNo = builder.bookerJobNo;
            this.bookerName = builder.bookerName;
            this.businessTripResult = builder.businessTripResult;
            this.capitalDirection = builder.capitalDirection;
            this.cascadeDepartment = builder.cascadeDepartment;
            this.changeFee = builder.changeFee;
            this.changeResult = builder.changeResult;
            this.coachNo = builder.coachNo;
            this.costCenter = builder.costCenter;
            this.costCenterNumber = builder.costCenterNumber;
            this.coupon = builder.coupon;
            this.depCityCode = builder.depCityCode;
            this.depCityName = builder.depCityName;
            this.department = builder.department;
            this.departmentId = builder.departmentId;
            this.deptDate = builder.deptDate;
            this.deptStation = builder.deptStation;
            this.deptTime = builder.deptTime;
            this.exceedReason = builder.exceedReason;
            this.feeType = builder.feeType;
            this.index = builder.index;
            this.invoiceTitle = builder.invoiceTitle;
            this.isTransferOrder = builder.isTransferOrder;
            this.orderId = builder.orderId;
            this.orderPrice = builder.orderPrice;
            this.overApplyId = builder.overApplyId;
            this.primaryId = builder.primaryId;
            this.printTicketPrice = builder.printTicketPrice;
            this.projectCode = builder.projectCode;
            this.projectName = builder.projectName;
            this.refundFee = builder.refundFee;
            this.refundReason = builder.refundReason;
            this.remark = builder.remark;
            this.reserveMode = builder.reserveMode;
            this.runTime = builder.runTime;
            this.seatNo = builder.seatNo;
            this.seatType = builder.seatType;
            this.serviceFee = builder.serviceFee;
            this.settlementFee = builder.settlementFee;
            this.settlementGrantFee = builder.settlementGrantFee;
            this.settlementTime = builder.settlementTime;
            this.settlementType = builder.settlementType;
            this.shortTicketNo = builder.shortTicketNo;
            this.status = builder.status;
            this.taxRate = builder.taxRate;
            this.thirdItineraryId = builder.thirdItineraryId;
            this.ticketCorpPayPrice = builder.ticketCorpPayPrice;
            this.ticketNo = builder.ticketNo;
            this.ticketPersonPayPrice = builder.ticketPersonPayPrice;
            this.ticketPrice = builder.ticketPrice;
            this.trainNo = builder.trainNo;
            this.trainType = builder.trainType;
            this.travelerId = builder.travelerId;
            this.travelerJobNo = builder.travelerJobNo;
            this.travelerMemberTypeName = builder.travelerMemberTypeName;
            this.travelerName = builder.travelerName;
            this.voucherType = builder.voucherType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return alipayTradeNo
         */
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        /**
         * @return applyArrCityCode
         */
        public String getApplyArrCityCode() {
            return this.applyArrCityCode;
        }

        /**
         * @return applyArrCityName
         */
        public String getApplyArrCityName() {
            return this.applyArrCityName;
        }

        /**
         * @return applyDepCityCode
         */
        public String getApplyDepCityCode() {
            return this.applyDepCityCode;
        }

        /**
         * @return applyDepCityName
         */
        public String getApplyDepCityName() {
            return this.applyDepCityName;
        }

        /**
         * @return applyExtendField
         */
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        /**
         * @return applyId
         */
        public String getApplyId() {
            return this.applyId;
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return arrCityName
         */
        public String getArrCityName() {
            return this.arrCityName;
        }

        /**
         * @return arrDate
         */
        public String getArrDate() {
            return this.arrDate;
        }

        /**
         * @return arrStation
         */
        public String getArrStation() {
            return this.arrStation;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return billRecordTime
         */
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        /**
         * @return bookTime
         */
        public String getBookTime() {
            return this.bookTime;
        }

        /**
         * @return bookerId
         */
        public String getBookerId() {
            return this.bookerId;
        }

        /**
         * @return bookerJobNo
         */
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        /**
         * @return bookerName
         */
        public String getBookerName() {
            return this.bookerName;
        }

        /**
         * @return businessTripResult
         */
        public String getBusinessTripResult() {
            return this.businessTripResult;
        }

        /**
         * @return capitalDirection
         */
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        /**
         * @return cascadeDepartment
         */
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        /**
         * @return changeFee
         */
        public Double getChangeFee() {
            return this.changeFee;
        }

        /**
         * @return changeResult
         */
        public String getChangeResult() {
            return this.changeResult;
        }

        /**
         * @return coachNo
         */
        public String getCoachNo() {
            return this.coachNo;
        }

        /**
         * @return costCenter
         */
        public String getCostCenter() {
            return this.costCenter;
        }

        /**
         * @return costCenterNumber
         */
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        /**
         * @return coupon
         */
        public Double getCoupon() {
            return this.coupon;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return depCityName
         */
        public String getDepCityName() {
            return this.depCityName;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return departmentId
         */
        public String getDepartmentId() {
            return this.departmentId;
        }

        /**
         * @return deptDate
         */
        public String getDeptDate() {
            return this.deptDate;
        }

        /**
         * @return deptStation
         */
        public String getDeptStation() {
            return this.deptStation;
        }

        /**
         * @return deptTime
         */
        public String getDeptTime() {
            return this.deptTime;
        }

        /**
         * @return exceedReason
         */
        public String getExceedReason() {
            return this.exceedReason;
        }

        /**
         * @return feeType
         */
        public String getFeeType() {
            return this.feeType;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return isTransferOrder
         */
        public String getIsTransferOrder() {
            return this.isTransferOrder;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderPrice
         */
        public Double getOrderPrice() {
            return this.orderPrice;
        }

        /**
         * @return overApplyId
         */
        public String getOverApplyId() {
            return this.overApplyId;
        }

        /**
         * @return primaryId
         */
        public Long getPrimaryId() {
            return this.primaryId;
        }

        /**
         * @return printTicketPrice
         */
        public Double getPrintTicketPrice() {
            return this.printTicketPrice;
        }

        /**
         * @return projectCode
         */
        public String getProjectCode() {
            return this.projectCode;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return refundFee
         */
        public Double getRefundFee() {
            return this.refundFee;
        }

        /**
         * @return refundReason
         */
        public String getRefundReason() {
            return this.refundReason;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return reserveMode
         */
        public String getReserveMode() {
            return this.reserveMode;
        }

        /**
         * @return runTime
         */
        public String getRunTime() {
            return this.runTime;
        }

        /**
         * @return seatNo
         */
        public String getSeatNo() {
            return this.seatNo;
        }

        /**
         * @return seatType
         */
        public String getSeatType() {
            return this.seatType;
        }

        /**
         * @return serviceFee
         */
        public Double getServiceFee() {
            return this.serviceFee;
        }

        /**
         * @return settlementFee
         */
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        /**
         * @return settlementGrantFee
         */
        public Double getSettlementGrantFee() {
            return this.settlementGrantFee;
        }

        /**
         * @return settlementTime
         */
        public String getSettlementTime() {
            return this.settlementTime;
        }

        /**
         * @return settlementType
         */
        public String getSettlementType() {
            return this.settlementType;
        }

        /**
         * @return shortTicketNo
         */
        public String getShortTicketNo() {
            return this.shortTicketNo;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taxRate
         */
        public String getTaxRate() {
            return this.taxRate;
        }

        /**
         * @return thirdItineraryId
         */
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        /**
         * @return ticketCorpPayPrice
         */
        public String getTicketCorpPayPrice() {
            return this.ticketCorpPayPrice;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        /**
         * @return ticketPersonPayPrice
         */
        public String getTicketPersonPayPrice() {
            return this.ticketPersonPayPrice;
        }

        /**
         * @return ticketPrice
         */
        public Double getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        /**
         * @return trainType
         */
        public String getTrainType() {
            return this.trainType;
        }

        /**
         * @return travelerId
         */
        public String getTravelerId() {
            return this.travelerId;
        }

        /**
         * @return travelerJobNo
         */
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        /**
         * @return travelerMemberTypeName
         */
        public String getTravelerMemberTypeName() {
            return this.travelerMemberTypeName;
        }

        /**
         * @return travelerName
         */
        public String getTravelerName() {
            return this.travelerName;
        }

        /**
         * @return voucherType
         */
        public Integer getVoucherType() {
            return this.voucherType;
        }

        public static final class Builder {
            private String alipayTradeNo; 
            private String applyArrCityCode; 
            private String applyArrCityName; 
            private String applyDepCityCode; 
            private String applyDepCityName; 
            private String applyExtendField; 
            private String applyId; 
            private String arrCityCode; 
            private String arrCityName; 
            private String arrDate; 
            private String arrStation; 
            private String arrTime; 
            private String billRecordTime; 
            private String bookTime; 
            private String bookerId; 
            private String bookerJobNo; 
            private String bookerName; 
            private String businessTripResult; 
            private String capitalDirection; 
            private String cascadeDepartment; 
            private Double changeFee; 
            private String changeResult; 
            private String coachNo; 
            private String costCenter; 
            private String costCenterNumber; 
            private Double coupon; 
            private String depCityCode; 
            private String depCityName; 
            private String department; 
            private String departmentId; 
            private String deptDate; 
            private String deptStation; 
            private String deptTime; 
            private String exceedReason; 
            private String feeType; 
            private String index; 
            private String invoiceTitle; 
            private String isTransferOrder; 
            private String orderId; 
            private Double orderPrice; 
            private String overApplyId; 
            private Long primaryId; 
            private Double printTicketPrice; 
            private String projectCode; 
            private String projectName; 
            private Double refundFee; 
            private String refundReason; 
            private String remark; 
            private String reserveMode; 
            private String runTime; 
            private String seatNo; 
            private String seatType; 
            private Double serviceFee; 
            private Double settlementFee; 
            private Double settlementGrantFee; 
            private String settlementTime; 
            private String settlementType; 
            private String shortTicketNo; 
            private Integer status; 
            private String taxRate; 
            private String thirdItineraryId; 
            private String ticketCorpPayPrice; 
            private String ticketNo; 
            private String ticketPersonPayPrice; 
            private Double ticketPrice; 
            private String trainNo; 
            private String trainType; 
            private String travelerId; 
            private String travelerJobNo; 
            private String travelerMemberTypeName; 
            private String travelerName; 
            private Integer voucherType; 

            /**
             * alipay_trade_no.
             */
            public Builder alipayTradeNo(String alipayTradeNo) {
                this.alipayTradeNo = alipayTradeNo;
                return this;
            }

            /**
             * apply_arr_city_code.
             */
            public Builder applyArrCityCode(String applyArrCityCode) {
                this.applyArrCityCode = applyArrCityCode;
                return this;
            }

            /**
             * apply_arr_city_name.
             */
            public Builder applyArrCityName(String applyArrCityName) {
                this.applyArrCityName = applyArrCityName;
                return this;
            }

            /**
             * apply_dep_city_code.
             */
            public Builder applyDepCityCode(String applyDepCityCode) {
                this.applyDepCityCode = applyDepCityCode;
                return this;
            }

            /**
             * apply_dep_city_name.
             */
            public Builder applyDepCityName(String applyDepCityName) {
                this.applyDepCityName = applyDepCityName;
                return this;
            }

            /**
             * 审批扩展自定义字段
             */
            public Builder applyExtendField(String applyExtendField) {
                this.applyExtendField = applyExtendField;
                return this;
            }

            /**
             * apply_id.
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * arr_city_name.
             */
            public Builder arrCityName(String arrCityName) {
                this.arrCityName = arrCityName;
                return this;
            }

            /**
             * arr_date.
             */
            public Builder arrDate(String arrDate) {
                this.arrDate = arrDate;
                return this;
            }

            /**
             * arr_station.
             */
            public Builder arrStation(String arrStation) {
                this.arrStation = arrStation;
                return this;
            }

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * bill_record_time.
             */
            public Builder billRecordTime(String billRecordTime) {
                this.billRecordTime = billRecordTime;
                return this;
            }

            /**
             * book_time.
             */
            public Builder bookTime(String bookTime) {
                this.bookTime = bookTime;
                return this;
            }

            /**
             * booker_id.
             */
            public Builder bookerId(String bookerId) {
                this.bookerId = bookerId;
                return this;
            }

            /**
             * booker_job_no.
             */
            public Builder bookerJobNo(String bookerJobNo) {
                this.bookerJobNo = bookerJobNo;
                return this;
            }

            /**
             * booker_name.
             */
            public Builder bookerName(String bookerName) {
                this.bookerName = bookerName;
                return this;
            }

            /**
             * business_trip_result.
             */
            public Builder businessTripResult(String businessTripResult) {
                this.businessTripResult = businessTripResult;
                return this;
            }

            /**
             * capital_direction.
             */
            public Builder capitalDirection(String capitalDirection) {
                this.capitalDirection = capitalDirection;
                return this;
            }

            /**
             * cascade_department.
             */
            public Builder cascadeDepartment(String cascadeDepartment) {
                this.cascadeDepartment = cascadeDepartment;
                return this;
            }

            /**
             * change_fee.
             */
            public Builder changeFee(Double changeFee) {
                this.changeFee = changeFee;
                return this;
            }

            /**
             * change_result.
             */
            public Builder changeResult(String changeResult) {
                this.changeResult = changeResult;
                return this;
            }

            /**
             * coach_no.
             */
            public Builder coachNo(String coachNo) {
                this.coachNo = coachNo;
                return this;
            }

            /**
             * cost_center.
             */
            public Builder costCenter(String costCenter) {
                this.costCenter = costCenter;
                return this;
            }

            /**
             * cost_center_number.
             */
            public Builder costCenterNumber(String costCenterNumber) {
                this.costCenterNumber = costCenterNumber;
                return this;
            }

            /**
             * coupon.
             */
            public Builder coupon(Double coupon) {
                this.coupon = coupon;
                return this;
            }

            /**
             * dep_city_code.
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * dep_city_name.
             */
            public Builder depCityName(String depCityName) {
                this.depCityName = depCityName;
                return this;
            }

            /**
             * department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * department_id.
             */
            public Builder departmentId(String departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * dept_date.
             */
            public Builder deptDate(String deptDate) {
                this.deptDate = deptDate;
                return this;
            }

            /**
             * dept_station.
             */
            public Builder deptStation(String deptStation) {
                this.deptStation = deptStation;
                return this;
            }

            /**
             * dept_time.
             */
            public Builder deptTime(String deptTime) {
                this.deptTime = deptTime;
                return this;
            }

            /**
             * exceed_reason.
             */
            public Builder exceedReason(String exceedReason) {
                this.exceedReason = exceedReason;
                return this;
            }

            /**
             * fee_type.
             */
            public Builder feeType(String feeType) {
                this.feeType = feeType;
                return this;
            }

            /**
             * index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * invoice_title.
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
                return this;
            }

            /**
             * is_transfer_order.
             */
            public Builder isTransferOrder(String isTransferOrder) {
                this.isTransferOrder = isTransferOrder;
                return this;
            }

            /**
             * order_id.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * order_price.
             */
            public Builder orderPrice(Double orderPrice) {
                this.orderPrice = orderPrice;
                return this;
            }

            /**
             * over_apply_id.
             */
            public Builder overApplyId(String overApplyId) {
                this.overApplyId = overApplyId;
                return this;
            }

            /**
             * primary_id.
             */
            public Builder primaryId(Long primaryId) {
                this.primaryId = primaryId;
                return this;
            }

            /**
             * print_ticket_price.
             */
            public Builder printTicketPrice(Double printTicketPrice) {
                this.printTicketPrice = printTicketPrice;
                return this;
            }

            /**
             * project_code.
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
                return this;
            }

            /**
             * project_name.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * refund_fee.
             */
            public Builder refundFee(Double refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * refund_reason.
             */
            public Builder refundReason(String refundReason) {
                this.refundReason = refundReason;
                return this;
            }

            /**
             * remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * reserve_mode.
             */
            public Builder reserveMode(String reserveMode) {
                this.reserveMode = reserveMode;
                return this;
            }

            /**
             * run_time.
             */
            public Builder runTime(String runTime) {
                this.runTime = runTime;
                return this;
            }

            /**
             * seat_no.
             */
            public Builder seatNo(String seatNo) {
                this.seatNo = seatNo;
                return this;
            }

            /**
             * seat_type.
             */
            public Builder seatType(String seatType) {
                this.seatType = seatType;
                return this;
            }

            /**
             * service_fee.
             */
            public Builder serviceFee(Double serviceFee) {
                this.serviceFee = serviceFee;
                return this;
            }

            /**
             * settlement_fee.
             */
            public Builder settlementFee(Double settlementFee) {
                this.settlementFee = settlementFee;
                return this;
            }

            /**
             * settlement_grant_fee.
             */
            public Builder settlementGrantFee(Double settlementGrantFee) {
                this.settlementGrantFee = settlementGrantFee;
                return this;
            }

            /**
             * settlement_time.
             */
            public Builder settlementTime(String settlementTime) {
                this.settlementTime = settlementTime;
                return this;
            }

            /**
             * settlement_type.
             */
            public Builder settlementType(String settlementType) {
                this.settlementType = settlementType;
                return this;
            }

            /**
             * short_ticket_no.
             */
            public Builder shortTicketNo(String shortTicketNo) {
                this.shortTicketNo = shortTicketNo;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 税率
             */
            public Builder taxRate(String taxRate) {
                this.taxRate = taxRate;
                return this;
            }

            /**
             * third_itinerary_id.
             */
            public Builder thirdItineraryId(String thirdItineraryId) {
                this.thirdItineraryId = thirdItineraryId;
                return this;
            }

            /**
             * ticket_corp_pay_price.
             */
            public Builder ticketCorpPayPrice(String ticketCorpPayPrice) {
                this.ticketCorpPayPrice = ticketCorpPayPrice;
                return this;
            }

            /**
             * ticket_no.
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            /**
             * ticket_person_pay_price.
             */
            public Builder ticketPersonPayPrice(String ticketPersonPayPrice) {
                this.ticketPersonPayPrice = ticketPersonPayPrice;
                return this;
            }

            /**
             * ticket_price.
             */
            public Builder ticketPrice(Double ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * train_no.
             */
            public Builder trainNo(String trainNo) {
                this.trainNo = trainNo;
                return this;
            }

            /**
             * train_type.
             */
            public Builder trainType(String trainType) {
                this.trainType = trainType;
                return this;
            }

            /**
             * traveler_id.
             */
            public Builder travelerId(String travelerId) {
                this.travelerId = travelerId;
                return this;
            }

            /**
             * traveler_job_no.
             */
            public Builder travelerJobNo(String travelerJobNo) {
                this.travelerJobNo = travelerJobNo;
                return this;
            }

            /**
             * traveler_member_type_name.
             */
            public Builder travelerMemberTypeName(String travelerMemberTypeName) {
                this.travelerMemberTypeName = travelerMemberTypeName;
                return this;
            }

            /**
             * traveler_name.
             */
            public Builder travelerName(String travelerName) {
                this.travelerName = travelerName;
                return this;
            }

            /**
             * voucher_type.
             */
            public Builder voucherType(Integer voucherType) {
                this.voucherType = voucherType;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("category")
        private Integer category;

        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("data_list")
        private java.util.List < DataList> dataList;

        @NameInMap("period_end")
        private String periodEnd;

        @NameInMap("period_start")
        private String periodStart;

        @NameInMap("total_num")
        private Long totalNum;

        private Module(Builder builder) {
            this.category = builder.category;
            this.corpId = builder.corpId;
            this.dataList = builder.dataList;
            this.periodEnd = builder.periodEnd;
            this.periodStart = builder.periodStart;
            this.totalNum = builder.totalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public Integer getCategory() {
            return this.category;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return dataList
         */
        public java.util.List < DataList> getDataList() {
            return this.dataList;
        }

        /**
         * @return periodEnd
         */
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        /**
         * @return periodStart
         */
        public String getPeriodStart() {
            return this.periodStart;
        }

        /**
         * @return totalNum
         */
        public Long getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private Integer category; 
            private String corpId; 
            private java.util.List < DataList> dataList; 
            private String periodEnd; 
            private String periodStart; 
            private Long totalNum; 

            /**
             * category.
             */
            public Builder category(Integer category) {
                this.category = category;
                return this;
            }

            /**
             * corp_id.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * data_list.
             */
            public Builder dataList(java.util.List < DataList> dataList) {
                this.dataList = dataList;
                return this;
            }

            /**
             * period_end.
             */
            public Builder periodEnd(String periodEnd) {
                this.periodEnd = periodEnd;
                return this;
            }

            /**
             * period_start.
             */
            public Builder periodStart(String periodStart) {
                this.periodStart = periodStart;
                return this;
            }

            /**
             * total_num.
             */
            public Builder totalNum(Long totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
