// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelOrderQueryResponseBody} extends {@link TeaModel}
 *
 * <p>HotelOrderQueryResponseBody</p>
 */
public class HotelOrderQueryResponseBody extends TeaModel {
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

    private HotelOrderQueryResponseBody(Builder builder) {
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

    public static HotelOrderQueryResponseBody create() {
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
         * module。
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

        public HotelOrderQueryResponseBody build() {
            return new HotelOrderQueryResponseBody(this);
        } 

    } 

    public static class HotelInfo extends TeaModel {
        @NameInMap("check_in")
        private Long checkIn;

        @NameInMap("check_out")
        private Long checkOut;

        @NameInMap("city")
        private String city;

        @NameInMap("city_ad_code")
        private String cityAdCode;

        @NameInMap("hotel_name")
        private String hotelName;

        @NameInMap("hotel_support_vat_invoice_type")
        private Integer hotelSupportVatInvoiceType;

        @NameInMap("night")
        private Integer night;

        @NameInMap("room_num")
        private Integer roomNum;

        @NameInMap("room_type")
        private String roomType;

        private HotelInfo(Builder builder) {
            this.checkIn = builder.checkIn;
            this.checkOut = builder.checkOut;
            this.city = builder.city;
            this.cityAdCode = builder.cityAdCode;
            this.hotelName = builder.hotelName;
            this.hotelSupportVatInvoiceType = builder.hotelSupportVatInvoiceType;
            this.night = builder.night;
            this.roomNum = builder.roomNum;
            this.roomType = builder.roomType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelInfo create() {
            return builder().build();
        }

        /**
         * @return checkIn
         */
        public Long getCheckIn() {
            return this.checkIn;
        }

        /**
         * @return checkOut
         */
        public Long getCheckOut() {
            return this.checkOut;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return cityAdCode
         */
        public String getCityAdCode() {
            return this.cityAdCode;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        /**
         * @return hotelSupportVatInvoiceType
         */
        public Integer getHotelSupportVatInvoiceType() {
            return this.hotelSupportVatInvoiceType;
        }

        /**
         * @return night
         */
        public Integer getNight() {
            return this.night;
        }

        /**
         * @return roomNum
         */
        public Integer getRoomNum() {
            return this.roomNum;
        }

        /**
         * @return roomType
         */
        public String getRoomType() {
            return this.roomType;
        }

        public static final class Builder {
            private Long checkIn; 
            private Long checkOut; 
            private String city; 
            private String cityAdCode; 
            private String hotelName; 
            private Integer hotelSupportVatInvoiceType; 
            private Integer night; 
            private Integer roomNum; 
            private String roomType; 

            /**
             * check_in.
             */
            public Builder checkIn(Long checkIn) {
                this.checkIn = checkIn;
                return this;
            }

            /**
             * check_out.
             */
            public Builder checkOut(Long checkOut) {
                this.checkOut = checkOut;
                return this;
            }

            /**
             * city.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * city_ad_code.
             */
            public Builder cityAdCode(String cityAdCode) {
                this.cityAdCode = cityAdCode;
                return this;
            }

            /**
             * hotel_name.
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * hotel_support_vat_invoice_type.
             */
            public Builder hotelSupportVatInvoiceType(Integer hotelSupportVatInvoiceType) {
                this.hotelSupportVatInvoiceType = hotelSupportVatInvoiceType;
                return this;
            }

            /**
             * night.
             */
            public Builder night(Integer night) {
                this.night = night;
                return this;
            }

            /**
             * room_num.
             */
            public Builder roomNum(Integer roomNum) {
                this.roomNum = roomNum;
                return this;
            }

            /**
             * room_type.
             */
            public Builder roomType(String roomType) {
                this.roomType = roomType;
                return this;
            }

            public HotelInfo build() {
                return new HotelInfo(this);
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

        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("corp_name")
        private String corpName;

        @NameInMap("depart_id")
        private String departId;

        @NameInMap("depart_name")
        private String departName;

        @NameInMap("extend_field")
        private String extendField;

        @NameInMap("gmt_create")
        private Long gmtCreate;

        @NameInMap("gmt_modified")
        private Long gmtModified;

        @NameInMap("id")
        private Long id;

        @NameInMap("itinerary_id")
        private String itineraryId;

        @NameInMap("order_status")
        private Integer orderStatus;

        @NameInMap("order_type")
        private Integer orderType;

        @NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @NameInMap("thirdpart_depart_id")
        private String thirdpartDepartId;

        @NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_name")
        private String userName;

        private OrderBaseInfo(Builder builder) {
            this.applyId = builder.applyId;
            this.btripTitle = builder.btripTitle;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.extendField = builder.extendField;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.itineraryId = builder.itineraryId;
            this.orderStatus = builder.orderStatus;
            this.orderType = builder.orderType;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.thirdpartDepartId = builder.thirdpartDepartId;
            this.thirdpartItineraryId = builder.thirdpartItineraryId;
            this.userId = builder.userId;
            this.userName = builder.userName;
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
         * @return extendField
         */
        public String getExtendField() {
            return this.extendField;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return itineraryId
         */
        public String getItineraryId() {
            return this.itineraryId;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return orderType
         */
        public Integer getOrderType() {
            return this.orderType;
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

        public static final class Builder {
            private String applyId; 
            private String btripTitle; 
            private String corpId; 
            private String corpName; 
            private String departId; 
            private String departName; 
            private String extendField; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String itineraryId; 
            private Integer orderStatus; 
            private Integer orderType; 
            private String thirdpartApplyId; 
            private String thirdpartDepartId; 
            private String thirdpartItineraryId; 
            private String userId; 
            private String userName; 

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
             * extend_field.
             */
            public Builder extendField(String extendField) {
                this.extendField = extendField;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_modified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * order_status.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * order_type.
             */
            public Builder orderType(Integer orderType) {
                this.orderType = orderType;
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

            public OrderBaseInfo build() {
                return new OrderBaseInfo(this);
            } 

        } 

    }
    public static class PassengerList extends TeaModel {
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

        private PassengerList(Builder builder) {
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

        public static PassengerList create() {
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

            public PassengerList build() {
                return new PassengerList(this);
            } 

        } 

    }
    public static class PriceInfoList extends TeaModel {
        @NameInMap("category_code")
        private Integer categoryCode;

        @NameInMap("gmt_create")
        private Long gmtCreate;

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
        public Long getGmtCreate() {
            return this.gmtCreate;
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
            private Long gmtCreate; 
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
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
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
    public static class Module extends TeaModel {
        @NameInMap("hotel_info")
        private HotelInfo hotelInfo;

        @NameInMap("invoice_info")
        private InvoiceInfo invoiceInfo;

        @NameInMap("order_base_info")
        private OrderBaseInfo orderBaseInfo;

        @NameInMap("passenger_list")
        private java.util.List < PassengerList> passengerList;

        @NameInMap("price_info_list")
        private java.util.List < PriceInfoList> priceInfoList;

        private Module(Builder builder) {
            this.hotelInfo = builder.hotelInfo;
            this.invoiceInfo = builder.invoiceInfo;
            this.orderBaseInfo = builder.orderBaseInfo;
            this.passengerList = builder.passengerList;
            this.priceInfoList = builder.priceInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return hotelInfo
         */
        public HotelInfo getHotelInfo() {
            return this.hotelInfo;
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
         * @return passengerList
         */
        public java.util.List < PassengerList> getPassengerList() {
            return this.passengerList;
        }

        /**
         * @return priceInfoList
         */
        public java.util.List < PriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        public static final class Builder {
            private HotelInfo hotelInfo; 
            private InvoiceInfo invoiceInfo; 
            private OrderBaseInfo orderBaseInfo; 
            private java.util.List < PassengerList> passengerList; 
            private java.util.List < PriceInfoList> priceInfoList; 

            /**
             * hotel_info.
             */
            public Builder hotelInfo(HotelInfo hotelInfo) {
                this.hotelInfo = hotelInfo;
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
             * passenger_list.
             */
            public Builder passengerList(java.util.List < PassengerList> passengerList) {
                this.passengerList = passengerList;
                return this;
            }

            /**
             * price_info_list.
             */
            public Builder priceInfoList(java.util.List < PriceInfoList> priceInfoList) {
                this.priceInfoList = priceInfoList;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
