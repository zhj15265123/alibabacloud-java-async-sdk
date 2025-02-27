// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainOrderQueryV2ResponseBody} extends {@link TeaModel}
 *
 * <p>TrainOrderQueryV2ResponseBody</p>
 */
public class TrainOrderQueryV2ResponseBody extends TeaModel {
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

    private TrainOrderQueryV2ResponseBody(Builder builder) {
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

    public static TrainOrderQueryV2ResponseBody create() {
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
         * requestId
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
         * traceId
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TrainOrderQueryV2ResponseBody build() {
            return new TrainOrderQueryV2ResponseBody(this);
        } 

    } 

    public static class ChangeTicketInfoList extends TeaModel {
        @NameInMap("change_coach_no")
        private String changeCoachNo;

        @NameInMap("change_gap_fee")
        private Double changeGapFee;

        @NameInMap("change_handling_fee")
        private Double changeHandlingFee;

        @NameInMap("change_seat_no")
        private String changeSeatNo;

        @NameInMap("change_seat_type_name")
        private String changeSeatTypeName;

        @NameInMap("change_service_fee")
        private Double changeServiceFee;

        @NameInMap("change_train_no")
        private String changeTrainNo;

        @NameInMap("change_train_type_name")
        private String changeTrainTypeName;

        @NameInMap("check_in_time")
        private String checkInTime;

        @NameInMap("check_out_time")
        private String checkOutTime;

        @NameInMap("end_time")
        private String endTime;

        @NameInMap("from_city_name")
        private String fromCityName;

        @NameInMap("from_station_name")
        private String fromStationName;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modify")
        private String gmtModify;

        @NameInMap("origin_ticket_no")
        private String originTicketNo;

        @NameInMap("out_ticket_status")
        private String outTicketStatus;

        @NameInMap("segment_index")
        private Integer segmentIndex;

        @NameInMap("start_time")
        private String startTime;

        @NameInMap("ticket_no")
        private String ticketNo;

        @NameInMap("to_city_name")
        private String toCityName;

        @NameInMap("to_station_name")
        private String toStationName;

        @NameInMap("use_ticket")
        private String useTicket;

        @NameInMap("user_id")
        private String userId;

        private ChangeTicketInfoList(Builder builder) {
            this.changeCoachNo = builder.changeCoachNo;
            this.changeGapFee = builder.changeGapFee;
            this.changeHandlingFee = builder.changeHandlingFee;
            this.changeSeatNo = builder.changeSeatNo;
            this.changeSeatTypeName = builder.changeSeatTypeName;
            this.changeServiceFee = builder.changeServiceFee;
            this.changeTrainNo = builder.changeTrainNo;
            this.changeTrainTypeName = builder.changeTrainTypeName;
            this.checkInTime = builder.checkInTime;
            this.checkOutTime = builder.checkOutTime;
            this.endTime = builder.endTime;
            this.fromCityName = builder.fromCityName;
            this.fromStationName = builder.fromStationName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.originTicketNo = builder.originTicketNo;
            this.outTicketStatus = builder.outTicketStatus;
            this.segmentIndex = builder.segmentIndex;
            this.startTime = builder.startTime;
            this.ticketNo = builder.ticketNo;
            this.toCityName = builder.toCityName;
            this.toStationName = builder.toStationName;
            this.useTicket = builder.useTicket;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeTicketInfoList create() {
            return builder().build();
        }

        /**
         * @return changeCoachNo
         */
        public String getChangeCoachNo() {
            return this.changeCoachNo;
        }

        /**
         * @return changeGapFee
         */
        public Double getChangeGapFee() {
            return this.changeGapFee;
        }

        /**
         * @return changeHandlingFee
         */
        public Double getChangeHandlingFee() {
            return this.changeHandlingFee;
        }

        /**
         * @return changeSeatNo
         */
        public String getChangeSeatNo() {
            return this.changeSeatNo;
        }

        /**
         * @return changeSeatTypeName
         */
        public String getChangeSeatTypeName() {
            return this.changeSeatTypeName;
        }

        /**
         * @return changeServiceFee
         */
        public Double getChangeServiceFee() {
            return this.changeServiceFee;
        }

        /**
         * @return changeTrainNo
         */
        public String getChangeTrainNo() {
            return this.changeTrainNo;
        }

        /**
         * @return changeTrainTypeName
         */
        public String getChangeTrainTypeName() {
            return this.changeTrainTypeName;
        }

        /**
         * @return checkInTime
         */
        public String getCheckInTime() {
            return this.checkInTime;
        }

        /**
         * @return checkOutTime
         */
        public String getCheckOutTime() {
            return this.checkOutTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return fromCityName
         */
        public String getFromCityName() {
            return this.fromCityName;
        }

        /**
         * @return fromStationName
         */
        public String getFromStationName() {
            return this.fromStationName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return originTicketNo
         */
        public String getOriginTicketNo() {
            return this.originTicketNo;
        }

        /**
         * @return outTicketStatus
         */
        public String getOutTicketStatus() {
            return this.outTicketStatus;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        /**
         * @return toCityName
         */
        public String getToCityName() {
            return this.toCityName;
        }

        /**
         * @return toStationName
         */
        public String getToStationName() {
            return this.toStationName;
        }

        /**
         * @return useTicket
         */
        public String getUseTicket() {
            return this.useTicket;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String changeCoachNo; 
            private Double changeGapFee; 
            private Double changeHandlingFee; 
            private String changeSeatNo; 
            private String changeSeatTypeName; 
            private Double changeServiceFee; 
            private String changeTrainNo; 
            private String changeTrainTypeName; 
            private String checkInTime; 
            private String checkOutTime; 
            private String endTime; 
            private String fromCityName; 
            private String fromStationName; 
            private String gmtCreate; 
            private String gmtModify; 
            private String originTicketNo; 
            private String outTicketStatus; 
            private Integer segmentIndex; 
            private String startTime; 
            private String ticketNo; 
            private String toCityName; 
            private String toStationName; 
            private String useTicket; 
            private String userId; 

            /**
             * change_coach_no.
             */
            public Builder changeCoachNo(String changeCoachNo) {
                this.changeCoachNo = changeCoachNo;
                return this;
            }

            /**
             * change_gap_fee.
             */
            public Builder changeGapFee(Double changeGapFee) {
                this.changeGapFee = changeGapFee;
                return this;
            }

            /**
             * change_handling_fee.
             */
            public Builder changeHandlingFee(Double changeHandlingFee) {
                this.changeHandlingFee = changeHandlingFee;
                return this;
            }

            /**
             * change_seat_no.
             */
            public Builder changeSeatNo(String changeSeatNo) {
                this.changeSeatNo = changeSeatNo;
                return this;
            }

            /**
             * change_seat_type_name.
             */
            public Builder changeSeatTypeName(String changeSeatTypeName) {
                this.changeSeatTypeName = changeSeatTypeName;
                return this;
            }

            /**
             * change_service_fee.
             */
            public Builder changeServiceFee(Double changeServiceFee) {
                this.changeServiceFee = changeServiceFee;
                return this;
            }

            /**
             * change_train_no.
             */
            public Builder changeTrainNo(String changeTrainNo) {
                this.changeTrainNo = changeTrainNo;
                return this;
            }

            /**
             * change_train_type_name.
             */
            public Builder changeTrainTypeName(String changeTrainTypeName) {
                this.changeTrainTypeName = changeTrainTypeName;
                return this;
            }

            /**
             * check_in_time.
             */
            public Builder checkInTime(String checkInTime) {
                this.checkInTime = checkInTime;
                return this;
            }

            /**
             * check_out_time.
             */
            public Builder checkOutTime(String checkOutTime) {
                this.checkOutTime = checkOutTime;
                return this;
            }

            /**
             * end_time.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * from_city_name.
             */
            public Builder fromCityName(String fromCityName) {
                this.fromCityName = fromCityName;
                return this;
            }

            /**
             * from_station_name.
             */
            public Builder fromStationName(String fromStationName) {
                this.fromStationName = fromStationName;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_modify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * origin_ticket_no.
             */
            public Builder originTicketNo(String originTicketNo) {
                this.originTicketNo = originTicketNo;
                return this;
            }

            /**
             * out_ticket_status.
             */
            public Builder outTicketStatus(String outTicketStatus) {
                this.outTicketStatus = outTicketStatus;
                return this;
            }

            /**
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            /**
             * start_time.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
             * to_city_name.
             */
            public Builder toCityName(String toCityName) {
                this.toCityName = toCityName;
                return this;
            }

            /**
             * to_station_name.
             */
            public Builder toStationName(String toStationName) {
                this.toStationName = toStationName;
                return this;
            }

            /**
             * use_ticket.
             */
            public Builder useTicket(String useTicket) {
                this.useTicket = useTicket;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ChangeTicketInfoList build() {
                return new ChangeTicketInfoList(this);
            } 

        } 

    }
    public static class InvoiceInfo extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("title")
        private String title;

        private InvoiceInfo(Builder builder) {
            this.id = builder.id;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvoiceInfo create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long id; 
            private String title; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public InvoiceInfo build() {
                return new InvoiceInfo(this);
            } 

        } 

    }
    public static class OrderBaseInfo extends TeaModel {
        @NameInMap("apply_id")
        private String applyId;

        @NameInMap("btrip_title")
        private String btripTitle;

        @NameInMap("contact_name")
        private String contactName;

        @NameInMap("contact_phone")
        private String contactPhone;

        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("corp_name")
        private String corpName;

        @NameInMap("depart_id")
        private String departId;

        @NameInMap("depart_name")
        private String departName;

        @NameInMap("exceed_apply_id")
        private String exceedApplyId;

        @NameInMap("exceed_thirdpart_apply_id")
        private String exceedThirdpartApplyId;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modify")
        private String gmtModify;

        @NameInMap("itinerary_id")
        private String itineraryId;

        @NameInMap("order_id")
        private Long orderId;

        @NameInMap("order_status")
        private Integer orderStatus;

        @NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @NameInMap("thirdpart_depart_id")
        private String thirdpartDepartId;

        @NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @NameInMap("trip_type")
        private Integer tripType;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_nick")
        private String userNick;

        private OrderBaseInfo(Builder builder) {
            this.applyId = builder.applyId;
            this.btripTitle = builder.btripTitle;
            this.contactName = builder.contactName;
            this.contactPhone = builder.contactPhone;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.exceedApplyId = builder.exceedApplyId;
            this.exceedThirdpartApplyId = builder.exceedThirdpartApplyId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.itineraryId = builder.itineraryId;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.thirdpartDepartId = builder.thirdpartDepartId;
            this.thirdpartItineraryId = builder.thirdpartItineraryId;
            this.tripType = builder.tripType;
            this.userId = builder.userId;
            this.userNick = builder.userNick;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderBaseInfo create() {
            return builder().build();
        }

        /**
         * @return applyId
         */
        public String getApplyId() {
            return this.applyId;
        }

        /**
         * @return btripTitle
         */
        public String getBtripTitle() {
            return this.btripTitle;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return contactPhone
         */
        public String getContactPhone() {
            return this.contactPhone;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return corpName
         */
        public String getCorpName() {
            return this.corpName;
        }

        /**
         * @return departId
         */
        public String getDepartId() {
            return this.departId;
        }

        /**
         * @return departName
         */
        public String getDepartName() {
            return this.departName;
        }

        /**
         * @return exceedApplyId
         */
        public String getExceedApplyId() {
            return this.exceedApplyId;
        }

        /**
         * @return exceedThirdpartApplyId
         */
        public String getExceedThirdpartApplyId() {
            return this.exceedThirdpartApplyId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return itineraryId
         */
        public String getItineraryId() {
            return this.itineraryId;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return thirdpartApplyId
         */
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        /**
         * @return thirdpartDepartId
         */
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
        }

        /**
         * @return thirdpartItineraryId
         */
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        /**
         * @return tripType
         */
        public Integer getTripType() {
            return this.tripType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userNick
         */
        public String getUserNick() {
            return this.userNick;
        }

        public static final class Builder {
            private String applyId; 
            private String btripTitle; 
            private String contactName; 
            private String contactPhone; 
            private String corpId; 
            private String corpName; 
            private String departId; 
            private String departName; 
            private String exceedApplyId; 
            private String exceedThirdpartApplyId; 
            private String gmtCreate; 
            private String gmtModify; 
            private String itineraryId; 
            private Long orderId; 
            private Integer orderStatus; 
            private String thirdpartApplyId; 
            private String thirdpartDepartId; 
            private String thirdpartItineraryId; 
            private Integer tripType; 
            private String userId; 
            private String userNick; 

            /**
             * apply_id.
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * btrip_title.
             */
            public Builder btripTitle(String btripTitle) {
                this.btripTitle = btripTitle;
                return this;
            }

            /**
             * contact_name.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * contact_phone.
             */
            public Builder contactPhone(String contactPhone) {
                this.contactPhone = contactPhone;
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
             * corp_name.
             */
            public Builder corpName(String corpName) {
                this.corpName = corpName;
                return this;
            }

            /**
             * depart_id.
             */
            public Builder departId(String departId) {
                this.departId = departId;
                return this;
            }

            /**
             * depart_name.
             */
            public Builder departName(String departName) {
                this.departName = departName;
                return this;
            }

            /**
             * exceed_apply_id.
             */
            public Builder exceedApplyId(String exceedApplyId) {
                this.exceedApplyId = exceedApplyId;
                return this;
            }

            /**
             * exceed_thirdpart_apply_id.
             */
            public Builder exceedThirdpartApplyId(String exceedThirdpartApplyId) {
                this.exceedThirdpartApplyId = exceedThirdpartApplyId;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_modify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * itinerary_id.
             */
            public Builder itineraryId(String itineraryId) {
                this.itineraryId = itineraryId;
                return this;
            }

            /**
             * order_id.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * order_status.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * thirdpart_apply_id.
             */
            public Builder thirdpartApplyId(String thirdpartApplyId) {
                this.thirdpartApplyId = thirdpartApplyId;
                return this;
            }

            /**
             * thirdpart_depart_id.
             */
            public Builder thirdpartDepartId(String thirdpartDepartId) {
                this.thirdpartDepartId = thirdpartDepartId;
                return this;
            }

            /**
             * thirdpart_itinerary_id.
             */
            public Builder thirdpartItineraryId(String thirdpartItineraryId) {
                this.thirdpartItineraryId = thirdpartItineraryId;
                return this;
            }

            /**
             * trip_type.
             */
            public Builder tripType(Integer tripType) {
                this.tripType = tripType;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * user_nick.
             */
            public Builder userNick(String userNick) {
                this.userNick = userNick;
                return this;
            }

            public OrderBaseInfo build() {
                return new OrderBaseInfo(this);
            } 

        } 

    }
    public static class PassengerInfoList extends TeaModel {
        @NameInMap("cost_center_id")
        private Long costCenterId;

        @NameInMap("cost_center_name")
        private String costCenterName;

        @NameInMap("cost_center_number")
        private String costCenterNumber;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_id")
        private Long projectId;

        @NameInMap("project_title")
        private String projectTitle;

        @NameInMap("thirdpart_cost_center_id")
        private String thirdpartCostCenterId;

        @NameInMap("thirdpart_project_id")
        private String thirdpartProjectId;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_name")
        private String userName;

        @NameInMap("user_type")
        private Integer userType;

        private PassengerInfoList(Builder builder) {
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.costCenterNumber = builder.costCenterNumber;
            this.projectCode = builder.projectCode;
            this.projectId = builder.projectId;
            this.projectTitle = builder.projectTitle;
            this.thirdpartCostCenterId = builder.thirdpartCostCenterId;
            this.thirdpartProjectId = builder.thirdpartProjectId;
            this.userId = builder.userId;
            this.userName = builder.userName;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerInfoList create() {
            return builder().build();
        }

        /**
         * @return costCenterId
         */
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return costCenterNumber
         */
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        /**
         * @return projectCode
         */
        public String getProjectCode() {
            return this.projectCode;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectTitle
         */
        public String getProjectTitle() {
            return this.projectTitle;
        }

        /**
         * @return thirdpartCostCenterId
         */
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        /**
         * @return thirdpartProjectId
         */
        public String getThirdpartProjectId() {
            return this.thirdpartProjectId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userType
         */
        public Integer getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private Long costCenterId; 
            private String costCenterName; 
            private String costCenterNumber; 
            private String projectCode; 
            private Long projectId; 
            private String projectTitle; 
            private String thirdpartCostCenterId; 
            private String thirdpartProjectId; 
            private String userId; 
            private String userName; 
            private Integer userType; 

            /**
             * cost_center_id.
             */
            public Builder costCenterId(Long costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * cost_center_name.
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
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
             * project_code.
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
                return this;
            }

            /**
             * project_id.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * project_title.
             */
            public Builder projectTitle(String projectTitle) {
                this.projectTitle = projectTitle;
                return this;
            }

            /**
             * thirdpart_cost_center_id.
             */
            public Builder thirdpartCostCenterId(String thirdpartCostCenterId) {
                this.thirdpartCostCenterId = thirdpartCostCenterId;
                return this;
            }

            /**
             * thirdpart_project_id.
             */
            public Builder thirdpartProjectId(String thirdpartProjectId) {
                this.thirdpartProjectId = thirdpartProjectId;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * user_name.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * user_type.
             */
            public Builder userType(Integer userType) {
                this.userType = userType;
                return this;
            }

            public PassengerInfoList build() {
                return new PassengerInfoList(this);
            } 

        } 

    }
    public static class PriceInfoList extends TeaModel {
        @NameInMap("category_code")
        private Integer categoryCode;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("passenger_name")
        private String passengerName;

        @NameInMap("pay_type")
        private Integer payType;

        @NameInMap("price")
        private Double price;

        @NameInMap("trade_id")
        private String tradeId;

        @NameInMap("type")
        private Integer type;

        private PriceInfoList(Builder builder) {
            this.categoryCode = builder.categoryCode;
            this.gmtCreate = builder.gmtCreate;
            this.passengerName = builder.passengerName;
            this.payType = builder.payType;
            this.price = builder.price;
            this.tradeId = builder.tradeId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfoList create() {
            return builder().build();
        }

        /**
         * @return categoryCode
         */
        public Integer getCategoryCode() {
            return this.categoryCode;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        /**
         * @return payType
         */
        public Integer getPayType() {
            return this.payType;
        }

        /**
         * @return price
         */
        public Double getPrice() {
            return this.price;
        }

        /**
         * @return tradeId
         */
        public String getTradeId() {
            return this.tradeId;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer categoryCode; 
            private String gmtCreate; 
            private String passengerName; 
            private Integer payType; 
            private Double price; 
            private String tradeId; 
            private Integer type; 

            /**
             * category_code.
             */
            public Builder categoryCode(Integer categoryCode) {
                this.categoryCode = categoryCode;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * passenger_name.
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            /**
             * pay_type.
             */
            public Builder payType(Integer payType) {
                this.payType = payType;
                return this;
            }

            /**
             * price.
             */
            public Builder price(Double price) {
                this.price = price;
                return this;
            }

            /**
             * trade_id.
             */
            public Builder tradeId(String tradeId) {
                this.tradeId = tradeId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public PriceInfoList build() {
                return new PriceInfoList(this);
            } 

        } 

    }
    public static class RefundTicketInfoList extends TeaModel {
        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modify")
        private String gmtModify;

        @NameInMap("refund_fee")
        private Double refundFee;

        @NameInMap("refund_service_fee")
        private Double refundServiceFee;

        @NameInMap("ticket_no")
        private String ticketNo;

        @NameInMap("user_id")
        private String userId;

        private RefundTicketInfoList(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.refundFee = builder.refundFee;
            this.refundServiceFee = builder.refundServiceFee;
            this.ticketNo = builder.ticketNo;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundTicketInfoList create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return refundFee
         */
        public Double getRefundFee() {
            return this.refundFee;
        }

        /**
         * @return refundServiceFee
         */
        public Double getRefundServiceFee() {
            return this.refundServiceFee;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModify; 
            private Double refundFee; 
            private Double refundServiceFee; 
            private String ticketNo; 
            private String userId; 

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_modify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
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
             * refund_service_fee.
             */
            public Builder refundServiceFee(Double refundServiceFee) {
                this.refundServiceFee = refundServiceFee;
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
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public RefundTicketInfoList build() {
                return new RefundTicketInfoList(this);
            } 

        } 

    }
    public static class TrainTicketInfos extends TeaModel {
        @NameInMap("changed")
        private Boolean changed;

        @NameInMap("check_in_time")
        private String checkInTime;

        @NameInMap("check_out_time")
        private String checkOutTime;

        @NameInMap("coach_no")
        private String coachNo;

        @NameInMap("end_time")
        private String endTime;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modify")
        private String gmtModify;

        @NameInMap("out_ticket_status")
        private String outTicketStatus;

        @NameInMap("pay_type")
        private Integer payType;

        @NameInMap("seat_no")
        private String seatNo;

        @NameInMap("seat_type_name")
        private String seatTypeName;

        @NameInMap("segment_index")
        private Integer segmentIndex;

        @NameInMap("service_fee")
        private Double serviceFee;

        @NameInMap("start_time")
        private String startTime;

        @NameInMap("ticket_no")
        private String ticketNo;

        @NameInMap("ticket_price")
        private Double ticketPrice;

        @NameInMap("ticket_status")
        private Integer ticketStatus;

        @NameInMap("train_type_name")
        private String trainTypeName;

        @NameInMap("use_ticket")
        private String useTicket;

        @NameInMap("user_id")
        private String userId;

        private TrainTicketInfos(Builder builder) {
            this.changed = builder.changed;
            this.checkInTime = builder.checkInTime;
            this.checkOutTime = builder.checkOutTime;
            this.coachNo = builder.coachNo;
            this.endTime = builder.endTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.outTicketStatus = builder.outTicketStatus;
            this.payType = builder.payType;
            this.seatNo = builder.seatNo;
            this.seatTypeName = builder.seatTypeName;
            this.segmentIndex = builder.segmentIndex;
            this.serviceFee = builder.serviceFee;
            this.startTime = builder.startTime;
            this.ticketNo = builder.ticketNo;
            this.ticketPrice = builder.ticketPrice;
            this.ticketStatus = builder.ticketStatus;
            this.trainTypeName = builder.trainTypeName;
            this.useTicket = builder.useTicket;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainTicketInfos create() {
            return builder().build();
        }

        /**
         * @return changed
         */
        public Boolean getChanged() {
            return this.changed;
        }

        /**
         * @return checkInTime
         */
        public String getCheckInTime() {
            return this.checkInTime;
        }

        /**
         * @return checkOutTime
         */
        public String getCheckOutTime() {
            return this.checkOutTime;
        }

        /**
         * @return coachNo
         */
        public String getCoachNo() {
            return this.coachNo;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return outTicketStatus
         */
        public String getOutTicketStatus() {
            return this.outTicketStatus;
        }

        /**
         * @return payType
         */
        public Integer getPayType() {
            return this.payType;
        }

        /**
         * @return seatNo
         */
        public String getSeatNo() {
            return this.seatNo;
        }

        /**
         * @return seatTypeName
         */
        public String getSeatTypeName() {
            return this.seatTypeName;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        /**
         * @return serviceFee
         */
        public Double getServiceFee() {
            return this.serviceFee;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        /**
         * @return ticketPrice
         */
        public Double getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return ticketStatus
         */
        public Integer getTicketStatus() {
            return this.ticketStatus;
        }

        /**
         * @return trainTypeName
         */
        public String getTrainTypeName() {
            return this.trainTypeName;
        }

        /**
         * @return useTicket
         */
        public String getUseTicket() {
            return this.useTicket;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Boolean changed; 
            private String checkInTime; 
            private String checkOutTime; 
            private String coachNo; 
            private String endTime; 
            private String gmtCreate; 
            private String gmtModify; 
            private String outTicketStatus; 
            private Integer payType; 
            private String seatNo; 
            private String seatTypeName; 
            private Integer segmentIndex; 
            private Double serviceFee; 
            private String startTime; 
            private String ticketNo; 
            private Double ticketPrice; 
            private Integer ticketStatus; 
            private String trainTypeName; 
            private String useTicket; 
            private String userId; 

            /**
             * changed.
             */
            public Builder changed(Boolean changed) {
                this.changed = changed;
                return this;
            }

            /**
             * check_in_time.
             */
            public Builder checkInTime(String checkInTime) {
                this.checkInTime = checkInTime;
                return this;
            }

            /**
             * check_out_time.
             */
            public Builder checkOutTime(String checkOutTime) {
                this.checkOutTime = checkOutTime;
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
             * end_time.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_modify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * out_ticket_status.
             */
            public Builder outTicketStatus(String outTicketStatus) {
                this.outTicketStatus = outTicketStatus;
                return this;
            }

            /**
             * pay_type.
             */
            public Builder payType(Integer payType) {
                this.payType = payType;
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
             * seat_type_name.
             */
            public Builder seatTypeName(String seatTypeName) {
                this.seatTypeName = seatTypeName;
                return this;
            }

            /**
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
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
             * start_time.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
             * ticket_price.
             */
            public Builder ticketPrice(Double ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * ticket_status.
             */
            public Builder ticketStatus(Integer ticketStatus) {
                this.ticketStatus = ticketStatus;
                return this;
            }

            /**
             * train_type_name.
             */
            public Builder trainTypeName(String trainTypeName) {
                this.trainTypeName = trainTypeName;
                return this;
            }

            /**
             * use_ticket.
             */
            public Builder useTicket(String useTicket) {
                this.useTicket = useTicket;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TrainTicketInfos build() {
                return new TrainTicketInfos(this);
            } 

        } 

    }
    public static class TrainInfoList extends TeaModel {
        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("dep_time")
        private String depTime;

        @NameInMap("from_city_ad_code")
        private String fromCityAdCode;

        @NameInMap("from_city_name")
        private String fromCityName;

        @NameInMap("from_station_name")
        private String fromStationName;

        @NameInMap("item_id")
        private Long itemId;

        @NameInMap("run_time")
        private Long runTime;

        @NameInMap("to_city_ad_code")
        private String toCityAdCode;

        @NameInMap("to_city_name")
        private String toCityName;

        @NameInMap("to_station_name")
        private String toStationName;

        @NameInMap("train_no")
        private String trainNo;

        @NameInMap("train_ticket_infos")
        private java.util.List < TrainTicketInfos> trainTicketInfos;

        private TrainInfoList(Builder builder) {
            this.arrTime = builder.arrTime;
            this.depTime = builder.depTime;
            this.fromCityAdCode = builder.fromCityAdCode;
            this.fromCityName = builder.fromCityName;
            this.fromStationName = builder.fromStationName;
            this.itemId = builder.itemId;
            this.runTime = builder.runTime;
            this.toCityAdCode = builder.toCityAdCode;
            this.toCityName = builder.toCityName;
            this.toStationName = builder.toStationName;
            this.trainNo = builder.trainNo;
            this.trainTicketInfos = builder.trainTicketInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainInfoList create() {
            return builder().build();
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return fromCityAdCode
         */
        public String getFromCityAdCode() {
            return this.fromCityAdCode;
        }

        /**
         * @return fromCityName
         */
        public String getFromCityName() {
            return this.fromCityName;
        }

        /**
         * @return fromStationName
         */
        public String getFromStationName() {
            return this.fromStationName;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return runTime
         */
        public Long getRunTime() {
            return this.runTime;
        }

        /**
         * @return toCityAdCode
         */
        public String getToCityAdCode() {
            return this.toCityAdCode;
        }

        /**
         * @return toCityName
         */
        public String getToCityName() {
            return this.toCityName;
        }

        /**
         * @return toStationName
         */
        public String getToStationName() {
            return this.toStationName;
        }

        /**
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        /**
         * @return trainTicketInfos
         */
        public java.util.List < TrainTicketInfos> getTrainTicketInfos() {
            return this.trainTicketInfos;
        }

        public static final class Builder {
            private String arrTime; 
            private String depTime; 
            private String fromCityAdCode; 
            private String fromCityName; 
            private String fromStationName; 
            private Long itemId; 
            private Long runTime; 
            private String toCityAdCode; 
            private String toCityName; 
            private String toStationName; 
            private String trainNo; 
            private java.util.List < TrainTicketInfos> trainTicketInfos; 

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * dep_time.
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * from_city_ad_code.
             */
            public Builder fromCityAdCode(String fromCityAdCode) {
                this.fromCityAdCode = fromCityAdCode;
                return this;
            }

            /**
             * from_city_name.
             */
            public Builder fromCityName(String fromCityName) {
                this.fromCityName = fromCityName;
                return this;
            }

            /**
             * from_station_name.
             */
            public Builder fromStationName(String fromStationName) {
                this.fromStationName = fromStationName;
                return this;
            }

            /**
             * itemId
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * run_time.
             */
            public Builder runTime(Long runTime) {
                this.runTime = runTime;
                return this;
            }

            /**
             * to_city_ad_code.
             */
            public Builder toCityAdCode(String toCityAdCode) {
                this.toCityAdCode = toCityAdCode;
                return this;
            }

            /**
             * to_city_name.
             */
            public Builder toCityName(String toCityName) {
                this.toCityName = toCityName;
                return this;
            }

            /**
             * to_station_name.
             */
            public Builder toStationName(String toStationName) {
                this.toStationName = toStationName;
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
             * train_ticket_infos.
             */
            public Builder trainTicketInfos(java.util.List < TrainTicketInfos> trainTicketInfos) {
                this.trainTicketInfos = trainTicketInfos;
                return this;
            }

            public TrainInfoList build() {
                return new TrainInfoList(this);
            } 

        } 

    }
    public static class TrainTransferInfo extends TeaModel {
        @NameInMap("cost_time")
        private String costTime;

        @NameInMap("end_time")
        private String endTime;

        @NameInMap("from_city_ad_code")
        private String fromCityAdCode;

        @NameInMap("from_city_name")
        private String fromCityName;

        @NameInMap("from_station_name")
        private String fromStationName;

        @NameInMap("middle_city")
        private String middleCity;

        @NameInMap("middle_city_ad_code")
        private String middleCityAdCode;

        @NameInMap("middle_date")
        private String middleDate;

        @NameInMap("middle_station")
        private String middleStation;

        @NameInMap("middle_type")
        private String middleType;

        @NameInMap("start_time")
        private String startTime;

        @NameInMap("to_city_ad_code")
        private String toCityAdCode;

        @NameInMap("to_city_name")
        private String toCityName;

        @NameInMap("to_station_name")
        private String toStationName;

        @NameInMap("wait_time")
        private String waitTime;

        private TrainTransferInfo(Builder builder) {
            this.costTime = builder.costTime;
            this.endTime = builder.endTime;
            this.fromCityAdCode = builder.fromCityAdCode;
            this.fromCityName = builder.fromCityName;
            this.fromStationName = builder.fromStationName;
            this.middleCity = builder.middleCity;
            this.middleCityAdCode = builder.middleCityAdCode;
            this.middleDate = builder.middleDate;
            this.middleStation = builder.middleStation;
            this.middleType = builder.middleType;
            this.startTime = builder.startTime;
            this.toCityAdCode = builder.toCityAdCode;
            this.toCityName = builder.toCityName;
            this.toStationName = builder.toStationName;
            this.waitTime = builder.waitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainTransferInfo create() {
            return builder().build();
        }

        /**
         * @return costTime
         */
        public String getCostTime() {
            return this.costTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return fromCityAdCode
         */
        public String getFromCityAdCode() {
            return this.fromCityAdCode;
        }

        /**
         * @return fromCityName
         */
        public String getFromCityName() {
            return this.fromCityName;
        }

        /**
         * @return fromStationName
         */
        public String getFromStationName() {
            return this.fromStationName;
        }

        /**
         * @return middleCity
         */
        public String getMiddleCity() {
            return this.middleCity;
        }

        /**
         * @return middleCityAdCode
         */
        public String getMiddleCityAdCode() {
            return this.middleCityAdCode;
        }

        /**
         * @return middleDate
         */
        public String getMiddleDate() {
            return this.middleDate;
        }

        /**
         * @return middleStation
         */
        public String getMiddleStation() {
            return this.middleStation;
        }

        /**
         * @return middleType
         */
        public String getMiddleType() {
            return this.middleType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return toCityAdCode
         */
        public String getToCityAdCode() {
            return this.toCityAdCode;
        }

        /**
         * @return toCityName
         */
        public String getToCityName() {
            return this.toCityName;
        }

        /**
         * @return toStationName
         */
        public String getToStationName() {
            return this.toStationName;
        }

        /**
         * @return waitTime
         */
        public String getWaitTime() {
            return this.waitTime;
        }

        public static final class Builder {
            private String costTime; 
            private String endTime; 
            private String fromCityAdCode; 
            private String fromCityName; 
            private String fromStationName; 
            private String middleCity; 
            private String middleCityAdCode; 
            private String middleDate; 
            private String middleStation; 
            private String middleType; 
            private String startTime; 
            private String toCityAdCode; 
            private String toCityName; 
            private String toStationName; 
            private String waitTime; 

            /**
             * cost_time.
             */
            public Builder costTime(String costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * end_time.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * from_city_ad_code.
             */
            public Builder fromCityAdCode(String fromCityAdCode) {
                this.fromCityAdCode = fromCityAdCode;
                return this;
            }

            /**
             * from_city_name.
             */
            public Builder fromCityName(String fromCityName) {
                this.fromCityName = fromCityName;
                return this;
            }

            /**
             * from_station_name.
             */
            public Builder fromStationName(String fromStationName) {
                this.fromStationName = fromStationName;
                return this;
            }

            /**
             * middle_city.
             */
            public Builder middleCity(String middleCity) {
                this.middleCity = middleCity;
                return this;
            }

            /**
             * middle_city_ad_code.
             */
            public Builder middleCityAdCode(String middleCityAdCode) {
                this.middleCityAdCode = middleCityAdCode;
                return this;
            }

            /**
             * middle_date.
             */
            public Builder middleDate(String middleDate) {
                this.middleDate = middleDate;
                return this;
            }

            /**
             * middle_station.
             */
            public Builder middleStation(String middleStation) {
                this.middleStation = middleStation;
                return this;
            }

            /**
             * middle_type.
             */
            public Builder middleType(String middleType) {
                this.middleType = middleType;
                return this;
            }

            /**
             * start_time.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * to_city_ad_code.
             */
            public Builder toCityAdCode(String toCityAdCode) {
                this.toCityAdCode = toCityAdCode;
                return this;
            }

            /**
             * to_city_name.
             */
            public Builder toCityName(String toCityName) {
                this.toCityName = toCityName;
                return this;
            }

            /**
             * to_station_name.
             */
            public Builder toStationName(String toStationName) {
                this.toStationName = toStationName;
                return this;
            }

            /**
             * wait_time.
             */
            public Builder waitTime(String waitTime) {
                this.waitTime = waitTime;
                return this;
            }

            public TrainTransferInfo build() {
                return new TrainTransferInfo(this);
            } 

        } 

    }
    public static class TrainOrderInfo extends TeaModel {
        @NameInMap("train_info_list")
        private java.util.List < TrainInfoList> trainInfoList;

        @NameInMap("train_transfer_info")
        private TrainTransferInfo trainTransferInfo;

        private TrainOrderInfo(Builder builder) {
            this.trainInfoList = builder.trainInfoList;
            this.trainTransferInfo = builder.trainTransferInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainOrderInfo create() {
            return builder().build();
        }

        /**
         * @return trainInfoList
         */
        public java.util.List < TrainInfoList> getTrainInfoList() {
            return this.trainInfoList;
        }

        /**
         * @return trainTransferInfo
         */
        public TrainTransferInfo getTrainTransferInfo() {
            return this.trainTransferInfo;
        }

        public static final class Builder {
            private java.util.List < TrainInfoList> trainInfoList; 
            private TrainTransferInfo trainTransferInfo; 

            /**
             * train_info_list.
             */
            public Builder trainInfoList(java.util.List < TrainInfoList> trainInfoList) {
                this.trainInfoList = trainInfoList;
                return this;
            }

            /**
             * train_transfer_info.
             */
            public Builder trainTransferInfo(TrainTransferInfo trainTransferInfo) {
                this.trainTransferInfo = trainTransferInfo;
                return this;
            }

            public TrainOrderInfo build() {
                return new TrainOrderInfo(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("change_ticket_info_list")
        private java.util.List < ChangeTicketInfoList> changeTicketInfoList;

        @NameInMap("invoice_info")
        private InvoiceInfo invoiceInfo;

        @NameInMap("order_base_info")
        private OrderBaseInfo orderBaseInfo;

        @NameInMap("passenger_info_list")
        private java.util.List < PassengerInfoList> passengerInfoList;

        @NameInMap("price_info_list")
        private java.util.List < PriceInfoList> priceInfoList;

        @NameInMap("refund_ticket_info_list")
        private java.util.List < RefundTicketInfoList> refundTicketInfoList;

        @NameInMap("train_order_info")
        private TrainOrderInfo trainOrderInfo;

        private Module(Builder builder) {
            this.changeTicketInfoList = builder.changeTicketInfoList;
            this.invoiceInfo = builder.invoiceInfo;
            this.orderBaseInfo = builder.orderBaseInfo;
            this.passengerInfoList = builder.passengerInfoList;
            this.priceInfoList = builder.priceInfoList;
            this.refundTicketInfoList = builder.refundTicketInfoList;
            this.trainOrderInfo = builder.trainOrderInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return changeTicketInfoList
         */
        public java.util.List < ChangeTicketInfoList> getChangeTicketInfoList() {
            return this.changeTicketInfoList;
        }

        /**
         * @return invoiceInfo
         */
        public InvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        /**
         * @return orderBaseInfo
         */
        public OrderBaseInfo getOrderBaseInfo() {
            return this.orderBaseInfo;
        }

        /**
         * @return passengerInfoList
         */
        public java.util.List < PassengerInfoList> getPassengerInfoList() {
            return this.passengerInfoList;
        }

        /**
         * @return priceInfoList
         */
        public java.util.List < PriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        /**
         * @return refundTicketInfoList
         */
        public java.util.List < RefundTicketInfoList> getRefundTicketInfoList() {
            return this.refundTicketInfoList;
        }

        /**
         * @return trainOrderInfo
         */
        public TrainOrderInfo getTrainOrderInfo() {
            return this.trainOrderInfo;
        }

        public static final class Builder {
            private java.util.List < ChangeTicketInfoList> changeTicketInfoList; 
            private InvoiceInfo invoiceInfo; 
            private OrderBaseInfo orderBaseInfo; 
            private java.util.List < PassengerInfoList> passengerInfoList; 
            private java.util.List < PriceInfoList> priceInfoList; 
            private java.util.List < RefundTicketInfoList> refundTicketInfoList; 
            private TrainOrderInfo trainOrderInfo; 

            /**
             * change_ticket_info_list.
             */
            public Builder changeTicketInfoList(java.util.List < ChangeTicketInfoList> changeTicketInfoList) {
                this.changeTicketInfoList = changeTicketInfoList;
                return this;
            }

            /**
             * invoice_info.
             */
            public Builder invoiceInfo(InvoiceInfo invoiceInfo) {
                this.invoiceInfo = invoiceInfo;
                return this;
            }

            /**
             * order_base_info.
             */
            public Builder orderBaseInfo(OrderBaseInfo orderBaseInfo) {
                this.orderBaseInfo = orderBaseInfo;
                return this;
            }

            /**
             * passenger_info_list.
             */
            public Builder passengerInfoList(java.util.List < PassengerInfoList> passengerInfoList) {
                this.passengerInfoList = passengerInfoList;
                return this;
            }

            /**
             * price_info_list.
             */
            public Builder priceInfoList(java.util.List < PriceInfoList> priceInfoList) {
                this.priceInfoList = priceInfoList;
                return this;
            }

            /**
             * refund_ticket_info_list.
             */
            public Builder refundTicketInfoList(java.util.List < RefundTicketInfoList> refundTicketInfoList) {
                this.refundTicketInfoList = refundTicketInfoList;
                return this;
            }

            /**
             * train_order_info.
             */
            public Builder trainOrderInfo(TrainOrderInfo trainOrderInfo) {
                this.trainOrderInfo = trainOrderInfo;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
