// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightModifyOtaSearchV2ResponseBody} extends {@link TeaModel}
 *
 * <p>FlightModifyOtaSearchV2ResponseBody</p>
 */
public class FlightModifyOtaSearchV2ResponseBody extends TeaModel {
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

    private FlightModifyOtaSearchV2ResponseBody(Builder builder) {
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

    public static FlightModifyOtaSearchV2ResponseBody create() {
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
         * module
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

        public FlightModifyOtaSearchV2ResponseBody build() {
            return new FlightModifyOtaSearchV2ResponseBody(this);
        } 

    } 

    public static class CabinClassInfo extends TeaModel {
        @NameInMap("cabin_class")
        private String cabinClass;

        @NameInMap("class_name")
        private String className;

        @NameInMap("inner_cabin_class")
        private Integer innerCabinClass;

        @NameInMap("quantity")
        private String quantity;

        private CabinClassInfo(Builder builder) {
            this.cabinClass = builder.cabinClass;
            this.className = builder.className;
            this.innerCabinClass = builder.innerCabinClass;
            this.quantity = builder.quantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CabinClassInfo create() {
            return builder().build();
        }

        /**
         * @return cabinClass
         */
        public String getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return className
         */
        public String getClassName() {
            return this.className;
        }

        /**
         * @return innerCabinClass
         */
        public Integer getInnerCabinClass() {
            return this.innerCabinClass;
        }

        /**
         * @return quantity
         */
        public String getQuantity() {
            return this.quantity;
        }

        public static final class Builder {
            private String cabinClass; 
            private String className; 
            private Integer innerCabinClass; 
            private String quantity; 

            /**
             * cabin_class.
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * class_name.
             */
            public Builder className(String className) {
                this.className = className;
                return this;
            }

            /**
             * inner_cabin_class
             */
            public Builder innerCabinClass(Integer innerCabinClass) {
                this.innerCabinClass = innerCabinClass;
                return this;
            }

            /**
             * quantity.
             */
            public Builder quantity(String quantity) {
                this.quantity = quantity;
                return this;
            }

            public CabinClassInfo build() {
                return new CabinClassInfo(this);
            } 

        } 

    }
    public static class ReShopPriceInfoDTO extends TeaModel {
        @NameInMap("re_shop_adult_change_fee")
        private Integer reShopAdultChangeFee;

        @NameInMap("re_shop_adult_price")
        private Integer reShopAdultPrice;

        @NameInMap("re_shop_adult_price_gap")
        private Integer reShopAdultPriceGap;

        @NameInMap("re_shop_child_change_fee")
        private Integer reShopChildChangeFee;

        @NameInMap("re_shop_child_price")
        private Integer reShopChildPrice;

        @NameInMap("re_shop_child_price_gap")
        private Integer reShopChildPriceGap;

        @NameInMap("re_shop_inf_change_fee")
        private Integer reShopInfChangeFee;

        @NameInMap("re_shop_inf_price")
        private Integer reShopInfPrice;

        @NameInMap("re_shop_inf_price_gap")
        private Integer reShopInfPriceGap;

        private ReShopPriceInfoDTO(Builder builder) {
            this.reShopAdultChangeFee = builder.reShopAdultChangeFee;
            this.reShopAdultPrice = builder.reShopAdultPrice;
            this.reShopAdultPriceGap = builder.reShopAdultPriceGap;
            this.reShopChildChangeFee = builder.reShopChildChangeFee;
            this.reShopChildPrice = builder.reShopChildPrice;
            this.reShopChildPriceGap = builder.reShopChildPriceGap;
            this.reShopInfChangeFee = builder.reShopInfChangeFee;
            this.reShopInfPrice = builder.reShopInfPrice;
            this.reShopInfPriceGap = builder.reShopInfPriceGap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReShopPriceInfoDTO create() {
            return builder().build();
        }

        /**
         * @return reShopAdultChangeFee
         */
        public Integer getReShopAdultChangeFee() {
            return this.reShopAdultChangeFee;
        }

        /**
         * @return reShopAdultPrice
         */
        public Integer getReShopAdultPrice() {
            return this.reShopAdultPrice;
        }

        /**
         * @return reShopAdultPriceGap
         */
        public Integer getReShopAdultPriceGap() {
            return this.reShopAdultPriceGap;
        }

        /**
         * @return reShopChildChangeFee
         */
        public Integer getReShopChildChangeFee() {
            return this.reShopChildChangeFee;
        }

        /**
         * @return reShopChildPrice
         */
        public Integer getReShopChildPrice() {
            return this.reShopChildPrice;
        }

        /**
         * @return reShopChildPriceGap
         */
        public Integer getReShopChildPriceGap() {
            return this.reShopChildPriceGap;
        }

        /**
         * @return reShopInfChangeFee
         */
        public Integer getReShopInfChangeFee() {
            return this.reShopInfChangeFee;
        }

        /**
         * @return reShopInfPrice
         */
        public Integer getReShopInfPrice() {
            return this.reShopInfPrice;
        }

        /**
         * @return reShopInfPriceGap
         */
        public Integer getReShopInfPriceGap() {
            return this.reShopInfPriceGap;
        }

        public static final class Builder {
            private Integer reShopAdultChangeFee; 
            private Integer reShopAdultPrice; 
            private Integer reShopAdultPriceGap; 
            private Integer reShopChildChangeFee; 
            private Integer reShopChildPrice; 
            private Integer reShopChildPriceGap; 
            private Integer reShopInfChangeFee; 
            private Integer reShopInfPrice; 
            private Integer reShopInfPriceGap; 

            /**
             * re_shop_adult_change_fee.
             */
            public Builder reShopAdultChangeFee(Integer reShopAdultChangeFee) {
                this.reShopAdultChangeFee = reShopAdultChangeFee;
                return this;
            }

            /**
             * re_shop_adult_price.
             */
            public Builder reShopAdultPrice(Integer reShopAdultPrice) {
                this.reShopAdultPrice = reShopAdultPrice;
                return this;
            }

            /**
             * re_shop_adult_price_gap.
             */
            public Builder reShopAdultPriceGap(Integer reShopAdultPriceGap) {
                this.reShopAdultPriceGap = reShopAdultPriceGap;
                return this;
            }

            /**
             * re_shop_child_change_fee.
             */
            public Builder reShopChildChangeFee(Integer reShopChildChangeFee) {
                this.reShopChildChangeFee = reShopChildChangeFee;
                return this;
            }

            /**
             * re_shop_child_price.
             */
            public Builder reShopChildPrice(Integer reShopChildPrice) {
                this.reShopChildPrice = reShopChildPrice;
                return this;
            }

            /**
             * re_shop_child_price_gap.
             */
            public Builder reShopChildPriceGap(Integer reShopChildPriceGap) {
                this.reShopChildPriceGap = reShopChildPriceGap;
                return this;
            }

            /**
             * re_shop_inf_change_fee.
             */
            public Builder reShopInfChangeFee(Integer reShopInfChangeFee) {
                this.reShopInfChangeFee = reShopInfChangeFee;
                return this;
            }

            /**
             * re_shop_inf_price.
             */
            public Builder reShopInfPrice(Integer reShopInfPrice) {
                this.reShopInfPrice = reShopInfPrice;
                return this;
            }

            /**
             * re_shop_inf_price_gap.
             */
            public Builder reShopInfPriceGap(Integer reShopInfPriceGap) {
                this.reShopInfPriceGap = reShopInfPriceGap;
                return this;
            }

            public ReShopPriceInfoDTO build() {
                return new ReShopPriceInfoDTO(this);
            } 

        } 

    }
    public static class PriceInfoDTO extends TeaModel {
        @NameInMap("adult_price")
        private Integer adultPrice;

        @NameInMap("adult_tax")
        private Integer adultTax;

        @NameInMap("adult_total_price")
        private Integer adultTotalPrice;

        @NameInMap("before_control_price")
        private Integer beforeControlPrice;

        @NameInMap("child_price")
        private Integer childPrice;

        @NameInMap("child_tax")
        private Integer childTax;

        @NameInMap("child_total_price")
        private Integer childTotalPrice;

        @NameInMap("infant_price")
        private Integer infantPrice;

        @NameInMap("infant_tax")
        private Integer infantTax;

        @NameInMap("infant_total_price")
        private Integer infantTotalPrice;

        @NameInMap("original_adult_price")
        private Integer originalAdultPrice;

        @NameInMap("original_adult_total_price")
        private Integer originalAdultTotalPrice;

        @NameInMap("re_shop_price_info_d_t_o")
        private ReShopPriceInfoDTO reShopPriceInfoDTO;

        private PriceInfoDTO(Builder builder) {
            this.adultPrice = builder.adultPrice;
            this.adultTax = builder.adultTax;
            this.adultTotalPrice = builder.adultTotalPrice;
            this.beforeControlPrice = builder.beforeControlPrice;
            this.childPrice = builder.childPrice;
            this.childTax = builder.childTax;
            this.childTotalPrice = builder.childTotalPrice;
            this.infantPrice = builder.infantPrice;
            this.infantTax = builder.infantTax;
            this.infantTotalPrice = builder.infantTotalPrice;
            this.originalAdultPrice = builder.originalAdultPrice;
            this.originalAdultTotalPrice = builder.originalAdultTotalPrice;
            this.reShopPriceInfoDTO = builder.reShopPriceInfoDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfoDTO create() {
            return builder().build();
        }

        /**
         * @return adultPrice
         */
        public Integer getAdultPrice() {
            return this.adultPrice;
        }

        /**
         * @return adultTax
         */
        public Integer getAdultTax() {
            return this.adultTax;
        }

        /**
         * @return adultTotalPrice
         */
        public Integer getAdultTotalPrice() {
            return this.adultTotalPrice;
        }

        /**
         * @return beforeControlPrice
         */
        public Integer getBeforeControlPrice() {
            return this.beforeControlPrice;
        }

        /**
         * @return childPrice
         */
        public Integer getChildPrice() {
            return this.childPrice;
        }

        /**
         * @return childTax
         */
        public Integer getChildTax() {
            return this.childTax;
        }

        /**
         * @return childTotalPrice
         */
        public Integer getChildTotalPrice() {
            return this.childTotalPrice;
        }

        /**
         * @return infantPrice
         */
        public Integer getInfantPrice() {
            return this.infantPrice;
        }

        /**
         * @return infantTax
         */
        public Integer getInfantTax() {
            return this.infantTax;
        }

        /**
         * @return infantTotalPrice
         */
        public Integer getInfantTotalPrice() {
            return this.infantTotalPrice;
        }

        /**
         * @return originalAdultPrice
         */
        public Integer getOriginalAdultPrice() {
            return this.originalAdultPrice;
        }

        /**
         * @return originalAdultTotalPrice
         */
        public Integer getOriginalAdultTotalPrice() {
            return this.originalAdultTotalPrice;
        }

        /**
         * @return reShopPriceInfoDTO
         */
        public ReShopPriceInfoDTO getReShopPriceInfoDTO() {
            return this.reShopPriceInfoDTO;
        }

        public static final class Builder {
            private Integer adultPrice; 
            private Integer adultTax; 
            private Integer adultTotalPrice; 
            private Integer beforeControlPrice; 
            private Integer childPrice; 
            private Integer childTax; 
            private Integer childTotalPrice; 
            private Integer infantPrice; 
            private Integer infantTax; 
            private Integer infantTotalPrice; 
            private Integer originalAdultPrice; 
            private Integer originalAdultTotalPrice; 
            private ReShopPriceInfoDTO reShopPriceInfoDTO; 

            /**
             * adult_price.
             */
            public Builder adultPrice(Integer adultPrice) {
                this.adultPrice = adultPrice;
                return this;
            }

            /**
             * adult_tax.
             */
            public Builder adultTax(Integer adultTax) {
                this.adultTax = adultTax;
                return this;
            }

            /**
             * adult_total_price.
             */
            public Builder adultTotalPrice(Integer adultTotalPrice) {
                this.adultTotalPrice = adultTotalPrice;
                return this;
            }

            /**
             * before_control_price.
             */
            public Builder beforeControlPrice(Integer beforeControlPrice) {
                this.beforeControlPrice = beforeControlPrice;
                return this;
            }

            /**
             * child_price.
             */
            public Builder childPrice(Integer childPrice) {
                this.childPrice = childPrice;
                return this;
            }

            /**
             * child_tax.
             */
            public Builder childTax(Integer childTax) {
                this.childTax = childTax;
                return this;
            }

            /**
             * child_total_price.
             */
            public Builder childTotalPrice(Integer childTotalPrice) {
                this.childTotalPrice = childTotalPrice;
                return this;
            }

            /**
             * infant_price.
             */
            public Builder infantPrice(Integer infantPrice) {
                this.infantPrice = infantPrice;
                return this;
            }

            /**
             * infant_tax.
             */
            public Builder infantTax(Integer infantTax) {
                this.infantTax = infantTax;
                return this;
            }

            /**
             * infant_total_price.
             */
            public Builder infantTotalPrice(Integer infantTotalPrice) {
                this.infantTotalPrice = infantTotalPrice;
                return this;
            }

            /**
             * original_adult_price.
             */
            public Builder originalAdultPrice(Integer originalAdultPrice) {
                this.originalAdultPrice = originalAdultPrice;
                return this;
            }

            /**
             * original_adult_total_price.
             */
            public Builder originalAdultTotalPrice(Integer originalAdultTotalPrice) {
                this.originalAdultTotalPrice = originalAdultTotalPrice;
                return this;
            }

            /**
             * re_shop_price_info_d_t_o.
             */
            public Builder reShopPriceInfoDTO(ReShopPriceInfoDTO reShopPriceInfoDTO) {
                this.reShopPriceInfoDTO = reShopPriceInfoDTO;
                return this;
            }

            public PriceInfoDTO build() {
                return new PriceInfoDTO(this);
            } 

        } 

    }
    public static class AgentInfo extends TeaModel {
        @NameInMap("attribute_show_info_map")
        private java.util.Map < String, java.util.List<ModuleAgentInfoAttributeShowInfoMapValue>> attributeShowInfoMap;

        @NameInMap("best_discount")
        private Double bestDiscount;

        @NameInMap("cabin_class_info")
        private CabinClassInfo cabinClassInfo;

        @NameInMap("cabin_code")
        private Integer cabinCode;

        @NameInMap("cabin_name")
        private String cabinName;

        @NameInMap("item_id")
        private String itemId;

        @NameInMap("modify_type_desc")
        private String modifyTypeDesc;

        @NameInMap("modify_type_name")
        private String modifyTypeName;

        @NameInMap("price_info_d_t_o")
        private PriceInfoDTO priceInfoDTO;

        @NameInMap("quantity")
        private Integer quantity;

        @NameInMap("support_child_ticket")
        private Boolean supportChildTicket;

        private AgentInfo(Builder builder) {
            this.attributeShowInfoMap = builder.attributeShowInfoMap;
            this.bestDiscount = builder.bestDiscount;
            this.cabinClassInfo = builder.cabinClassInfo;
            this.cabinCode = builder.cabinCode;
            this.cabinName = builder.cabinName;
            this.itemId = builder.itemId;
            this.modifyTypeDesc = builder.modifyTypeDesc;
            this.modifyTypeName = builder.modifyTypeName;
            this.priceInfoDTO = builder.priceInfoDTO;
            this.quantity = builder.quantity;
            this.supportChildTicket = builder.supportChildTicket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentInfo create() {
            return builder().build();
        }

        /**
         * @return attributeShowInfoMap
         */
        public java.util.Map < String, java.util.List<ModuleAgentInfoAttributeShowInfoMapValue>> getAttributeShowInfoMap() {
            return this.attributeShowInfoMap;
        }

        /**
         * @return bestDiscount
         */
        public Double getBestDiscount() {
            return this.bestDiscount;
        }

        /**
         * @return cabinClassInfo
         */
        public CabinClassInfo getCabinClassInfo() {
            return this.cabinClassInfo;
        }

        /**
         * @return cabinCode
         */
        public Integer getCabinCode() {
            return this.cabinCode;
        }

        /**
         * @return cabinName
         */
        public String getCabinName() {
            return this.cabinName;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return modifyTypeDesc
         */
        public String getModifyTypeDesc() {
            return this.modifyTypeDesc;
        }

        /**
         * @return modifyTypeName
         */
        public String getModifyTypeName() {
            return this.modifyTypeName;
        }

        /**
         * @return priceInfoDTO
         */
        public PriceInfoDTO getPriceInfoDTO() {
            return this.priceInfoDTO;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return supportChildTicket
         */
        public Boolean getSupportChildTicket() {
            return this.supportChildTicket;
        }

        public static final class Builder {
            private java.util.Map < String, java.util.List<ModuleAgentInfoAttributeShowInfoMapValue>> attributeShowInfoMap; 
            private Double bestDiscount; 
            private CabinClassInfo cabinClassInfo; 
            private Integer cabinCode; 
            private String cabinName; 
            private String itemId; 
            private String modifyTypeDesc; 
            private String modifyTypeName; 
            private PriceInfoDTO priceInfoDTO; 
            private Integer quantity; 
            private Boolean supportChildTicket; 

            /**
             * attribute_show_info_map.
             */
            public Builder attributeShowInfoMap(java.util.Map < String, java.util.List<ModuleAgentInfoAttributeShowInfoMapValue>> attributeShowInfoMap) {
                this.attributeShowInfoMap = attributeShowInfoMap;
                return this;
            }

            /**
             * best_discount.
             */
            public Builder bestDiscount(Double bestDiscount) {
                this.bestDiscount = bestDiscount;
                return this;
            }

            /**
             * cabin_class_info.
             */
            public Builder cabinClassInfo(CabinClassInfo cabinClassInfo) {
                this.cabinClassInfo = cabinClassInfo;
                return this;
            }

            /**
             * cabin_code.
             */
            public Builder cabinCode(Integer cabinCode) {
                this.cabinCode = cabinCode;
                return this;
            }

            /**
             * cabin_name.
             */
            public Builder cabinName(String cabinName) {
                this.cabinName = cabinName;
                return this;
            }

            /**
             * item_id
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * modify_type_desc.
             */
            public Builder modifyTypeDesc(String modifyTypeDesc) {
                this.modifyTypeDesc = modifyTypeDesc;
                return this;
            }

            /**
             * modify_type_name.
             */
            public Builder modifyTypeName(String modifyTypeName) {
                this.modifyTypeName = modifyTypeName;
                return this;
            }

            /**
             * price_info_d_t_o.
             */
            public Builder priceInfoDTO(PriceInfoDTO priceInfoDTO) {
                this.priceInfoDTO = priceInfoDTO;
                return this;
            }

            /**
             * quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * support_child_ticket.
             */
            public Builder supportChildTicket(Boolean supportChildTicket) {
                this.supportChildTicket = supportChildTicket;
                return this;
            }

            public AgentInfo build() {
                return new AgentInfo(this);
            } 

        } 

    }
    public static class DepAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        private String airportCode;

        @NameInMap("airport_name")
        private String airportName;

        @NameInMap("airport_short_name")
        private String airportShortName;

        @NameInMap("terminal")
        private String terminal;

        private DepAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.airportShortName = builder.airportShortName;
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DepAirportInfo create() {
            return builder().build();
        }

        /**
         * @return airportCode
         */
        public String getAirportCode() {
            return this.airportCode;
        }

        /**
         * @return airportName
         */
        public String getAirportName() {
            return this.airportName;
        }

        /**
         * @return airportShortName
         */
        public String getAirportShortName() {
            return this.airportShortName;
        }

        /**
         * @return terminal
         */
        public String getTerminal() {
            return this.terminal;
        }

        public static final class Builder {
            private String airportCode; 
            private String airportName; 
            private String airportShortName; 
            private String terminal; 

            /**
             * airport_code.
             */
            public Builder airportCode(String airportCode) {
                this.airportCode = airportCode;
                return this;
            }

            /**
             * airport_name.
             */
            public Builder airportName(String airportName) {
                this.airportName = airportName;
                return this;
            }

            /**
             * airport_short_name.
             */
            public Builder airportShortName(String airportShortName) {
                this.airportShortName = airportShortName;
                return this;
            }

            /**
             * terminal.
             */
            public Builder terminal(String terminal) {
                this.terminal = terminal;
                return this;
            }

            public DepAirportInfo build() {
                return new DepAirportInfo(this);
            } 

        } 

    }
    public static class ArrAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        private String airportCode;

        @NameInMap("airport_name")
        private String airportName;

        @NameInMap("airport_short_name")
        private String airportShortName;

        @NameInMap("terminal")
        private String terminal;

        private ArrAirportInfo(Builder builder) {
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.airportShortName = builder.airportShortName;
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArrAirportInfo create() {
            return builder().build();
        }

        /**
         * @return airportCode
         */
        public String getAirportCode() {
            return this.airportCode;
        }

        /**
         * @return airportName
         */
        public String getAirportName() {
            return this.airportName;
        }

        /**
         * @return airportShortName
         */
        public String getAirportShortName() {
            return this.airportShortName;
        }

        /**
         * @return terminal
         */
        public String getTerminal() {
            return this.terminal;
        }

        public static final class Builder {
            private String airportCode; 
            private String airportName; 
            private String airportShortName; 
            private String terminal; 

            /**
             * airport_code.
             */
            public Builder airportCode(String airportCode) {
                this.airportCode = airportCode;
                return this;
            }

            /**
             * airport_name.
             */
            public Builder airportName(String airportName) {
                this.airportName = airportName;
                return this;
            }

            /**
             * airport_short_name.
             */
            public Builder airportShortName(String airportShortName) {
                this.airportShortName = airportShortName;
                return this;
            }

            /**
             * terminal.
             */
            public Builder terminal(String terminal) {
                this.terminal = terminal;
                return this;
            }

            public ArrAirportInfo build() {
                return new ArrAirportInfo(this);
            } 

        } 

    }
    public static class AirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        private String airlineCode;

        @NameInMap("airline_chinese_name")
        private String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        private String airlineChineseShortName;

        @NameInMap("airline_icon")
        private String airlineIcon;

        @NameInMap("cheap_flight")
        private Boolean cheapFlight;

        private AirlineInfo(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineChineseName = builder.airlineChineseName;
            this.airlineChineseShortName = builder.airlineChineseShortName;
            this.airlineIcon = builder.airlineIcon;
            this.cheapFlight = builder.cheapFlight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AirlineInfo create() {
            return builder().build();
        }

        /**
         * @return airlineCode
         */
        public String getAirlineCode() {
            return this.airlineCode;
        }

        /**
         * @return airlineChineseName
         */
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        /**
         * @return airlineChineseShortName
         */
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        /**
         * @return airlineIcon
         */
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        /**
         * @return cheapFlight
         */
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineChineseName; 
            private String airlineChineseShortName; 
            private String airlineIcon; 
            private Boolean cheapFlight; 

            /**
             * airline_code.
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * airline_chinese_name.
             */
            public Builder airlineChineseName(String airlineChineseName) {
                this.airlineChineseName = airlineChineseName;
                return this;
            }

            /**
             * airline_chinese_short_name.
             */
            public Builder airlineChineseShortName(String airlineChineseShortName) {
                this.airlineChineseShortName = airlineChineseShortName;
                return this;
            }

            /**
             * airline_icon.
             */
            public Builder airlineIcon(String airlineIcon) {
                this.airlineIcon = airlineIcon;
                return this;
            }

            /**
             * cheap_flight.
             */
            public Builder cheapFlight(Boolean cheapFlight) {
                this.cheapFlight = cheapFlight;
                return this;
            }

            public AirlineInfo build() {
                return new AirlineInfo(this);
            } 

        } 

    }
    public static class OperatingAirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        private String airlineCode;

        @NameInMap("airline_chinese_name")
        private String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        private String airlineChineseShortName;

        @NameInMap("airline_icon")
        private String airlineIcon;

        @NameInMap("cheap_flight")
        private Boolean cheapFlight;

        private OperatingAirlineInfo(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineChineseName = builder.airlineChineseName;
            this.airlineChineseShortName = builder.airlineChineseShortName;
            this.airlineIcon = builder.airlineIcon;
            this.cheapFlight = builder.cheapFlight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperatingAirlineInfo create() {
            return builder().build();
        }

        /**
         * @return airlineCode
         */
        public String getAirlineCode() {
            return this.airlineCode;
        }

        /**
         * @return airlineChineseName
         */
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        /**
         * @return airlineChineseShortName
         */
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        /**
         * @return airlineIcon
         */
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        /**
         * @return cheapFlight
         */
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineChineseName; 
            private String airlineChineseShortName; 
            private String airlineIcon; 
            private Boolean cheapFlight; 

            /**
             * airline_code.
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * airline_chinese_name.
             */
            public Builder airlineChineseName(String airlineChineseName) {
                this.airlineChineseName = airlineChineseName;
                return this;
            }

            /**
             * airline_chinese_short_name.
             */
            public Builder airlineChineseShortName(String airlineChineseShortName) {
                this.airlineChineseShortName = airlineChineseShortName;
                return this;
            }

            /**
             * airline_icon.
             */
            public Builder airlineIcon(String airlineIcon) {
                this.airlineIcon = airlineIcon;
                return this;
            }

            /**
             * cheap_flight.
             */
            public Builder cheapFlight(Boolean cheapFlight) {
                this.cheapFlight = cheapFlight;
                return this;
            }

            public OperatingAirlineInfo build() {
                return new OperatingAirlineInfo(this);
            } 

        } 

    }
    public static class FlightSharedInfo extends TeaModel {
        @NameInMap("operating_flight_no")
        private String operatingFlightNo;

        @NameInMap("operating_airline_info")
        private OperatingAirlineInfo operatingAirlineInfo;

        private FlightSharedInfo(Builder builder) {
            this.operatingFlightNo = builder.operatingFlightNo;
            this.operatingAirlineInfo = builder.operatingAirlineInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightSharedInfo create() {
            return builder().build();
        }

        /**
         * @return operatingFlightNo
         */
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        /**
         * @return operatingAirlineInfo
         */
        public OperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        public static final class Builder {
            private String operatingFlightNo; 
            private OperatingAirlineInfo operatingAirlineInfo; 

            /**
             * operating_flight_no.
             */
            public Builder operatingFlightNo(String operatingFlightNo) {
                this.operatingFlightNo = operatingFlightNo;
                return this;
            }

            /**
             * operating_airline_info.
             */
            public Builder operatingAirlineInfo(OperatingAirlineInfo operatingAirlineInfo) {
                this.operatingAirlineInfo = operatingAirlineInfo;
                return this;
            }

            public FlightSharedInfo build() {
                return new FlightSharedInfo(this);
            } 

        } 

    }
    public static class FlightStopInfo extends TeaModel {
        @NameInMap("stop_city_name")
        private String stopCityName;

        @NameInMap("stop_arr_time")
        private String stopArrTime;

        @NameInMap("stop_dep_time")
        private String stopDepTime;

        @NameInMap("stop_city_code")
        private String stopCityCode;

        @NameInMap("stop_airport")
        private String stopAirport;

        @NameInMap("stop_arr_term")
        private String stopArrTerm;

        @NameInMap("stop_dep_term")
        private String stopDepTerm;

        private FlightStopInfo(Builder builder) {
            this.stopCityName = builder.stopCityName;
            this.stopArrTime = builder.stopArrTime;
            this.stopDepTime = builder.stopDepTime;
            this.stopCityCode = builder.stopCityCode;
            this.stopAirport = builder.stopAirport;
            this.stopArrTerm = builder.stopArrTerm;
            this.stopDepTerm = builder.stopDepTerm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightStopInfo create() {
            return builder().build();
        }

        /**
         * @return stopCityName
         */
        public String getStopCityName() {
            return this.stopCityName;
        }

        /**
         * @return stopArrTime
         */
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        /**
         * @return stopDepTime
         */
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        /**
         * @return stopCityCode
         */
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        /**
         * @return stopAirport
         */
        public String getStopAirport() {
            return this.stopAirport;
        }

        /**
         * @return stopArrTerm
         */
        public String getStopArrTerm() {
            return this.stopArrTerm;
        }

        /**
         * @return stopDepTerm
         */
        public String getStopDepTerm() {
            return this.stopDepTerm;
        }

        public static final class Builder {
            private String stopCityName; 
            private String stopArrTime; 
            private String stopDepTime; 
            private String stopCityCode; 
            private String stopAirport; 
            private String stopArrTerm; 
            private String stopDepTerm; 

            /**
             * stop_city_name.
             */
            public Builder stopCityName(String stopCityName) {
                this.stopCityName = stopCityName;
                return this;
            }

            /**
             * stop_arr_time.
             */
            public Builder stopArrTime(String stopArrTime) {
                this.stopArrTime = stopArrTime;
                return this;
            }

            /**
             * stop_dep_time.
             */
            public Builder stopDepTime(String stopDepTime) {
                this.stopDepTime = stopDepTime;
                return this;
            }

            /**
             * stop_city_code.
             */
            public Builder stopCityCode(String stopCityCode) {
                this.stopCityCode = stopCityCode;
                return this;
            }

            /**
             * stop_airport.
             */
            public Builder stopAirport(String stopAirport) {
                this.stopAirport = stopAirport;
                return this;
            }

            /**
             * stop_arr_term.
             */
            public Builder stopArrTerm(String stopArrTerm) {
                this.stopArrTerm = stopArrTerm;
                return this;
            }

            /**
             * stop_dep_term.
             */
            public Builder stopDepTerm(String stopDepTerm) {
                this.stopDepTerm = stopDepTerm;
                return this;
            }

            public FlightStopInfo build() {
                return new FlightStopInfo(this);
            } 

        } 

    }
    public static class FlightSegmentInfos extends TeaModel {
        @NameInMap("journey_seq")
        private Integer journeySeq;

        @NameInMap("segment_seq")
        private Integer segmentSeq;

        @NameInMap("flight_no")
        private String flightNo;

        @NameInMap("dep_city_code")
        private String depCityCode;

        @NameInMap("arr_city_code")
        private String arrCityCode;

        @NameInMap("dep_city_name")
        private String depCityName;

        @NameInMap("arr_city_name")
        private String arrCityName;

        @NameInMap("dep_airport_info")
        private DepAirportInfo depAirportInfo;

        @NameInMap("arr_airport_info")
        private ArrAirportInfo arrAirportInfo;

        @NameInMap("dep_time")
        private String depTime;

        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("airline_info")
        private AirlineInfo airlineInfo;

        @NameInMap("share")
        private Boolean share;

        @NameInMap("flight_shared_info")
        private FlightSharedInfo flightSharedInfo;

        @NameInMap("stop")
        private Boolean stop;

        @NameInMap("flight_stop_info")
        private FlightStopInfo flightStopInfo;

        @NameInMap("transfer_time")
        private Integer transferTime;

        @NameInMap("duration")
        private Integer duration;

        @NameInMap("manufacturer")
        private String manufacturer;

        @NameInMap("flight_type")
        private String flightType;

        @NameInMap("flight_size")
        private String flightSize;

        @NameInMap("meal_desc")
        private String mealDesc;

        @NameInMap("on_time_rate")
        private String onTimeRate;

        private FlightSegmentInfos(Builder builder) {
            this.journeySeq = builder.journeySeq;
            this.segmentSeq = builder.segmentSeq;
            this.flightNo = builder.flightNo;
            this.depCityCode = builder.depCityCode;
            this.arrCityCode = builder.arrCityCode;
            this.depCityName = builder.depCityName;
            this.arrCityName = builder.arrCityName;
            this.depAirportInfo = builder.depAirportInfo;
            this.arrAirportInfo = builder.arrAirportInfo;
            this.depTime = builder.depTime;
            this.arrTime = builder.arrTime;
            this.airlineInfo = builder.airlineInfo;
            this.share = builder.share;
            this.flightSharedInfo = builder.flightSharedInfo;
            this.stop = builder.stop;
            this.flightStopInfo = builder.flightStopInfo;
            this.transferTime = builder.transferTime;
            this.duration = builder.duration;
            this.manufacturer = builder.manufacturer;
            this.flightType = builder.flightType;
            this.flightSize = builder.flightSize;
            this.mealDesc = builder.mealDesc;
            this.onTimeRate = builder.onTimeRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightSegmentInfos create() {
            return builder().build();
        }

        /**
         * @return journeySeq
         */
        public Integer getJourneySeq() {
            return this.journeySeq;
        }

        /**
         * @return segmentSeq
         */
        public Integer getSegmentSeq() {
            return this.segmentSeq;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return depCityName
         */
        public String getDepCityName() {
            return this.depCityName;
        }

        /**
         * @return arrCityName
         */
        public String getArrCityName() {
            return this.arrCityName;
        }

        /**
         * @return depAirportInfo
         */
        public DepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        /**
         * @return arrAirportInfo
         */
        public ArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return airlineInfo
         */
        public AirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        /**
         * @return share
         */
        public Boolean getShare() {
            return this.share;
        }

        /**
         * @return flightSharedInfo
         */
        public FlightSharedInfo getFlightSharedInfo() {
            return this.flightSharedInfo;
        }

        /**
         * @return stop
         */
        public Boolean getStop() {
            return this.stop;
        }

        /**
         * @return flightStopInfo
         */
        public FlightStopInfo getFlightStopInfo() {
            return this.flightStopInfo;
        }

        /**
         * @return transferTime
         */
        public Integer getTransferTime() {
            return this.transferTime;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return manufacturer
         */
        public String getManufacturer() {
            return this.manufacturer;
        }

        /**
         * @return flightType
         */
        public String getFlightType() {
            return this.flightType;
        }

        /**
         * @return flightSize
         */
        public String getFlightSize() {
            return this.flightSize;
        }

        /**
         * @return mealDesc
         */
        public String getMealDesc() {
            return this.mealDesc;
        }

        /**
         * @return onTimeRate
         */
        public String getOnTimeRate() {
            return this.onTimeRate;
        }

        public static final class Builder {
            private Integer journeySeq; 
            private Integer segmentSeq; 
            private String flightNo; 
            private String depCityCode; 
            private String arrCityCode; 
            private String depCityName; 
            private String arrCityName; 
            private DepAirportInfo depAirportInfo; 
            private ArrAirportInfo arrAirportInfo; 
            private String depTime; 
            private String arrTime; 
            private AirlineInfo airlineInfo; 
            private Boolean share; 
            private FlightSharedInfo flightSharedInfo; 
            private Boolean stop; 
            private FlightStopInfo flightStopInfo; 
            private Integer transferTime; 
            private Integer duration; 
            private String manufacturer; 
            private String flightType; 
            private String flightSize; 
            private String mealDesc; 
            private String onTimeRate; 

            /**
             * journey_seq.
             */
            public Builder journeySeq(Integer journeySeq) {
                this.journeySeq = journeySeq;
                return this;
            }

            /**
             * segment_seq.
             */
            public Builder segmentSeq(Integer segmentSeq) {
                this.segmentSeq = segmentSeq;
                return this;
            }

            /**
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
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
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
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
             * arr_city_name.
             */
            public Builder arrCityName(String arrCityName) {
                this.arrCityName = arrCityName;
                return this;
            }

            /**
             * dep_airport_info.
             */
            public Builder depAirportInfo(DepAirportInfo depAirportInfo) {
                this.depAirportInfo = depAirportInfo;
                return this;
            }

            /**
             * arr_airport_info.
             */
            public Builder arrAirportInfo(ArrAirportInfo arrAirportInfo) {
                this.arrAirportInfo = arrAirportInfo;
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
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * airline_info.
             */
            public Builder airlineInfo(AirlineInfo airlineInfo) {
                this.airlineInfo = airlineInfo;
                return this;
            }

            /**
             * share.
             */
            public Builder share(Boolean share) {
                this.share = share;
                return this;
            }

            /**
             * flight_shared_info.
             */
            public Builder flightSharedInfo(FlightSharedInfo flightSharedInfo) {
                this.flightSharedInfo = flightSharedInfo;
                return this;
            }

            /**
             * stop.
             */
            public Builder stop(Boolean stop) {
                this.stop = stop;
                return this;
            }

            /**
             * flight_stop_info.
             */
            public Builder flightStopInfo(FlightStopInfo flightStopInfo) {
                this.flightStopInfo = flightStopInfo;
                return this;
            }

            /**
             * transfer_time.
             */
            public Builder transferTime(Integer transferTime) {
                this.transferTime = transferTime;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * manufacturer.
             */
            public Builder manufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
                return this;
            }

            /**
             * flight_type.
             */
            public Builder flightType(String flightType) {
                this.flightType = flightType;
                return this;
            }

            /**
             * flight_size.
             */
            public Builder flightSize(String flightSize) {
                this.flightSize = flightSize;
                return this;
            }

            /**
             * meal_desc.
             */
            public Builder mealDesc(String mealDesc) {
                this.mealDesc = mealDesc;
                return this;
            }

            /**
             * on_time_rate.
             */
            public Builder onTimeRate(String onTimeRate) {
                this.onTimeRate = onTimeRate;
                return this;
            }

            public FlightSegmentInfos build() {
                return new FlightSegmentInfos(this);
            } 

        } 

    }
    public static class PassengerCount extends TeaModel {
        @NameInMap("adult_passenger_num")
        private Integer adultPassengerNum;

        @NameInMap("child_passenger_num")
        private Integer childPassengerNum;

        @NameInMap("infant_passenger_num")
        private Integer infantPassengerNum;

        private PassengerCount(Builder builder) {
            this.adultPassengerNum = builder.adultPassengerNum;
            this.childPassengerNum = builder.childPassengerNum;
            this.infantPassengerNum = builder.infantPassengerNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerCount create() {
            return builder().build();
        }

        /**
         * @return adultPassengerNum
         */
        public Integer getAdultPassengerNum() {
            return this.adultPassengerNum;
        }

        /**
         * @return childPassengerNum
         */
        public Integer getChildPassengerNum() {
            return this.childPassengerNum;
        }

        /**
         * @return infantPassengerNum
         */
        public Integer getInfantPassengerNum() {
            return this.infantPassengerNum;
        }

        public static final class Builder {
            private Integer adultPassengerNum; 
            private Integer childPassengerNum; 
            private Integer infantPassengerNum; 

            /**
             * adult_passenger_num.
             */
            public Builder adultPassengerNum(Integer adultPassengerNum) {
                this.adultPassengerNum = adultPassengerNum;
                return this;
            }

            /**
             * child_passenger_num.
             */
            public Builder childPassengerNum(Integer childPassengerNum) {
                this.childPassengerNum = childPassengerNum;
                return this;
            }

            /**
             * infant_passenger_num.
             */
            public Builder infantPassengerNum(Integer infantPassengerNum) {
                this.infantPassengerNum = infantPassengerNum;
                return this;
            }

            public PassengerCount build() {
                return new PassengerCount(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("agent_info")
        private AgentInfo agentInfo;

        @NameInMap("cache_key")
        private String cacheKey;

        @NameInMap("flight_segment_infos")
        private java.util.List < java.util.List < FlightSegmentInfos> > flightSegmentInfos;

        @NameInMap("passenger_count")
        private PassengerCount passengerCount;

        @NameInMap("session_id")
        private String sessionId;

        private Module(Builder builder) {
            this.agentInfo = builder.agentInfo;
            this.cacheKey = builder.cacheKey;
            this.flightSegmentInfos = builder.flightSegmentInfos;
            this.passengerCount = builder.passengerCount;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return agentInfo
         */
        public AgentInfo getAgentInfo() {
            return this.agentInfo;
        }

        /**
         * @return cacheKey
         */
        public String getCacheKey() {
            return this.cacheKey;
        }

        /**
         * @return flightSegmentInfos
         */
        public java.util.List < java.util.List < FlightSegmentInfos> > getFlightSegmentInfos() {
            return this.flightSegmentInfos;
        }

        /**
         * @return passengerCount
         */
        public PassengerCount getPassengerCount() {
            return this.passengerCount;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private AgentInfo agentInfo; 
            private String cacheKey; 
            private java.util.List < java.util.List < FlightSegmentInfos> > flightSegmentInfos; 
            private PassengerCount passengerCount; 
            private String sessionId; 

            /**
             * agent_info.
             */
            public Builder agentInfo(AgentInfo agentInfo) {
                this.agentInfo = agentInfo;
                return this;
            }

            /**
             * cache_key.
             */
            public Builder cacheKey(String cacheKey) {
                this.cacheKey = cacheKey;
                return this;
            }

            /**
             * flight_segment_infos.
             */
            public Builder flightSegmentInfos(java.util.List < java.util.List < FlightSegmentInfos> > flightSegmentInfos) {
                this.flightSegmentInfos = flightSegmentInfos;
                return this;
            }

            /**
             * passenger_count.
             */
            public Builder passengerCount(PassengerCount passengerCount) {
                this.passengerCount = passengerCount;
                return this;
            }

            /**
             * session_id.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
