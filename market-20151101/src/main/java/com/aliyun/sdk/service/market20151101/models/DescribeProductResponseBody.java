// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProductResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProductResponseBody</p>
 */
public class DescribeProductResponseBody extends TeaModel {
    @NameInMap("AuditFailMsg")
    private String auditFailMsg;

    @NameInMap("AuditStatus")
    private String auditStatus;

    @NameInMap("AuditTime")
    private Long auditTime;

    @NameInMap("Code")
    private String code;

    @NameInMap("Description")
    private String description;

    @NameInMap("FrontCategoryId")
    private Long frontCategoryId;

    @NameInMap("GmtCreated")
    private Long gmtCreated;

    @NameInMap("GmtModified")
    private Long gmtModified;

    @NameInMap("Name")
    private String name;

    @NameInMap("PicUrl")
    private String picUrl;

    @NameInMap("ProductExtras")
    private ProductExtras productExtras;

    @NameInMap("ProductSkus")
    private ProductSkus productSkus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Score")
    private Float score;

    @NameInMap("ShopInfo")
    private ShopInfo shopInfo;

    @NameInMap("ShortDescription")
    private String shortDescription;

    @NameInMap("Status")
    private String status;

    @NameInMap("SupplierPk")
    private Long supplierPk;

    @NameInMap("Type")
    private String type;

    @NameInMap("UseCount")
    private Long useCount;

    private DescribeProductResponseBody(Builder builder) {
        this.auditFailMsg = builder.auditFailMsg;
        this.auditStatus = builder.auditStatus;
        this.auditTime = builder.auditTime;
        this.code = builder.code;
        this.description = builder.description;
        this.frontCategoryId = builder.frontCategoryId;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.name = builder.name;
        this.picUrl = builder.picUrl;
        this.productExtras = builder.productExtras;
        this.productSkus = builder.productSkus;
        this.requestId = builder.requestId;
        this.score = builder.score;
        this.shopInfo = builder.shopInfo;
        this.shortDescription = builder.shortDescription;
        this.status = builder.status;
        this.supplierPk = builder.supplierPk;
        this.type = builder.type;
        this.useCount = builder.useCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductResponseBody create() {
        return builder().build();
    }

    /**
     * @return auditFailMsg
     */
    public String getAuditFailMsg() {
        return this.auditFailMsg;
    }

    /**
     * @return auditStatus
     */
    public String getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return auditTime
     */
    public Long getAuditTime() {
        return this.auditTime;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return frontCategoryId
     */
    public Long getFrontCategoryId() {
        return this.frontCategoryId;
    }

    /**
     * @return gmtCreated
     */
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return picUrl
     */
    public String getPicUrl() {
        return this.picUrl;
    }

    /**
     * @return productExtras
     */
    public ProductExtras getProductExtras() {
        return this.productExtras;
    }

    /**
     * @return productSkus
     */
    public ProductSkus getProductSkus() {
        return this.productSkus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return score
     */
    public Float getScore() {
        return this.score;
    }

    /**
     * @return shopInfo
     */
    public ShopInfo getShopInfo() {
        return this.shopInfo;
    }

    /**
     * @return shortDescription
     */
    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return supplierPk
     */
    public Long getSupplierPk() {
        return this.supplierPk;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return useCount
     */
    public Long getUseCount() {
        return this.useCount;
    }

    public static final class Builder {
        private String auditFailMsg; 
        private String auditStatus; 
        private Long auditTime; 
        private String code; 
        private String description; 
        private Long frontCategoryId; 
        private Long gmtCreated; 
        private Long gmtModified; 
        private String name; 
        private String picUrl; 
        private ProductExtras productExtras; 
        private ProductSkus productSkus; 
        private String requestId; 
        private Float score; 
        private ShopInfo shopInfo; 
        private String shortDescription; 
        private String status; 
        private Long supplierPk; 
        private String type; 
        private Long useCount; 

        /**
         * AuditFailMsg.
         */
        public Builder auditFailMsg(String auditFailMsg) {
            this.auditFailMsg = auditFailMsg;
            return this;
        }

        /**
         * AuditStatus.
         */
        public Builder auditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * AuditTime.
         */
        public Builder auditTime(Long auditTime) {
            this.auditTime = auditTime;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * FrontCategoryId.
         */
        public Builder frontCategoryId(Long frontCategoryId) {
            this.frontCategoryId = frontCategoryId;
            return this;
        }

        /**
         * GmtCreated.
         */
        public Builder gmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * PicUrl.
         */
        public Builder picUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }

        /**
         * ProductExtras.
         */
        public Builder productExtras(ProductExtras productExtras) {
            this.productExtras = productExtras;
            return this;
        }

        /**
         * ProductSkus.
         */
        public Builder productSkus(ProductSkus productSkus) {
            this.productSkus = productSkus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Score.
         */
        public Builder score(Float score) {
            this.score = score;
            return this;
        }

        /**
         * ShopInfo.
         */
        public Builder shopInfo(ShopInfo shopInfo) {
            this.shopInfo = shopInfo;
            return this;
        }

        /**
         * ShortDescription.
         */
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SupplierPk.
         */
        public Builder supplierPk(Long supplierPk) {
            this.supplierPk = supplierPk;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * UseCount.
         */
        public Builder useCount(Long useCount) {
            this.useCount = useCount;
            return this;
        }

        public DescribeProductResponseBody build() {
            return new DescribeProductResponseBody(this);
        } 

    } 

    public static class ProductExtra extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Label")
        private String label;

        @NameInMap("Order")
        private Integer order;

        @NameInMap("Type")
        private String type;

        @NameInMap("Values")
        private String values;

        private ProductExtra(Builder builder) {
            this.key = builder.key;
            this.label = builder.label;
            this.order = builder.order;
            this.type = builder.type;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductExtra create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return values
         */
        public String getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String label; 
            private Integer order; 
            private String type; 
            private String values; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Order.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(String values) {
                this.values = values;
                return this;
            }

            public ProductExtra build() {
                return new ProductExtra(this);
            } 

        } 

    }
    public static class ProductExtras extends TeaModel {
        @NameInMap("ProductExtra")
        private java.util.List < ProductExtra> productExtra;

        private ProductExtras(Builder builder) {
            this.productExtra = builder.productExtra;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductExtras create() {
            return builder().build();
        }

        /**
         * @return productExtra
         */
        public java.util.List < ProductExtra> getProductExtra() {
            return this.productExtra;
        }

        public static final class Builder {
            private java.util.List < ProductExtra> productExtra; 

            /**
             * ProductExtra.
             */
            public Builder productExtra(java.util.List < ProductExtra> productExtra) {
                this.productExtra = productExtra;
                return this;
            }

            public ProductExtras build() {
                return new ProductExtras(this);
            } 

        } 

    }
    public static class PropertyValue extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Max")
        private String max;

        @NameInMap("Min")
        private String min;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Step")
        private String step;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private PropertyValue(Builder builder) {
            this.displayName = builder.displayName;
            this.max = builder.max;
            this.min = builder.min;
            this.remark = builder.remark;
            this.step = builder.step;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyValue create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return max
         */
        public String getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public String getMin() {
            return this.min;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return step
         */
        public String getStep() {
            return this.step;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String displayName; 
            private String max; 
            private String min; 
            private String remark; 
            private String step; 
            private String type; 
            private String value; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Max.
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(String min) {
                this.min = min;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(String step) {
                this.step = step;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PropertyValue build() {
                return new PropertyValue(this);
            } 

        } 

    }
    public static class PropertyValues extends TeaModel {
        @NameInMap("PropertyValue")
        private java.util.List < PropertyValue> propertyValue;

        private PropertyValues(Builder builder) {
            this.propertyValue = builder.propertyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyValues create() {
            return builder().build();
        }

        /**
         * @return propertyValue
         */
        public java.util.List < PropertyValue> getPropertyValue() {
            return this.propertyValue;
        }

        public static final class Builder {
            private java.util.List < PropertyValue> propertyValue; 

            /**
             * PropertyValue.
             */
            public Builder propertyValue(java.util.List < PropertyValue> propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            public PropertyValues build() {
                return new PropertyValues(this);
            } 

        } 

    }
    public static class Property extends TeaModel {
        @NameInMap("DisplayUnit")
        private String displayUnit;

        @NameInMap("Key")
        private String key;

        @NameInMap("Name")
        private String name;

        @NameInMap("PropertyValues")
        private PropertyValues propertyValues;

        @NameInMap("ShowType")
        private String showType;

        private Property(Builder builder) {
            this.displayUnit = builder.displayUnit;
            this.key = builder.key;
            this.name = builder.name;
            this.propertyValues = builder.propertyValues;
            this.showType = builder.showType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Property create() {
            return builder().build();
        }

        /**
         * @return displayUnit
         */
        public String getDisplayUnit() {
            return this.displayUnit;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return propertyValues
         */
        public PropertyValues getPropertyValues() {
            return this.propertyValues;
        }

        /**
         * @return showType
         */
        public String getShowType() {
            return this.showType;
        }

        public static final class Builder {
            private String displayUnit; 
            private String key; 
            private String name; 
            private PropertyValues propertyValues; 
            private String showType; 

            /**
             * DisplayUnit.
             */
            public Builder displayUnit(String displayUnit) {
                this.displayUnit = displayUnit;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PropertyValues.
             */
            public Builder propertyValues(PropertyValues propertyValues) {
                this.propertyValues = propertyValues;
                return this;
            }

            /**
             * ShowType.
             */
            public Builder showType(String showType) {
                this.showType = showType;
                return this;
            }

            public Property build() {
                return new Property(this);
            } 

        } 

    }
    public static class Properties extends TeaModel {
        @NameInMap("Property")
        private java.util.List < Property> property;

        private Properties(Builder builder) {
            this.property = builder.property;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return property
         */
        public java.util.List < Property> getProperty() {
            return this.property;
        }

        public static final class Builder {
            private java.util.List < Property> property; 

            /**
             * Property.
             */
            public Builder property(java.util.List < Property> property) {
                this.property = property;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Properties")
        private Properties properties;

        private Module(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
            this.name = builder.name;
            this.properties = builder.properties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return properties
         */
        public Properties getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private String code; 
            private String id; 
            private String name; 
            private Properties properties; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
    public static class Modules extends TeaModel {
        @NameInMap("Module")
        private java.util.List < Module> module;

        private Modules(Builder builder) {
            this.module = builder.module;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Modules create() {
            return builder().build();
        }

        /**
         * @return module
         */
        public java.util.List < Module> getModule() {
            return this.module;
        }

        public static final class Builder {
            private java.util.List < Module> module; 

            /**
             * Module.
             */
            public Builder module(java.util.List < Module> module) {
                this.module = module;
                return this;
            }

            public Modules build() {
                return new Modules(this);
            } 

        } 

    }
    public static class OrderPeriod extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("PeriodType")
        private String periodType;

        private OrderPeriod(Builder builder) {
            this.name = builder.name;
            this.periodType = builder.periodType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderPeriod create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return periodType
         */
        public String getPeriodType() {
            return this.periodType;
        }

        public static final class Builder {
            private String name; 
            private String periodType; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PeriodType.
             */
            public Builder periodType(String periodType) {
                this.periodType = periodType;
                return this;
            }

            public OrderPeriod build() {
                return new OrderPeriod(this);
            } 

        } 

    }
    public static class OrderPeriods extends TeaModel {
        @NameInMap("OrderPeriod")
        private java.util.List < OrderPeriod> orderPeriod;

        private OrderPeriods(Builder builder) {
            this.orderPeriod = builder.orderPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderPeriods create() {
            return builder().build();
        }

        /**
         * @return orderPeriod
         */
        public java.util.List < OrderPeriod> getOrderPeriod() {
            return this.orderPeriod;
        }

        public static final class Builder {
            private java.util.List < OrderPeriod> orderPeriod; 

            /**
             * OrderPeriod.
             */
            public Builder orderPeriod(java.util.List < OrderPeriod> orderPeriod) {
                this.orderPeriod = orderPeriod;
                return this;
            }

            public OrderPeriods build() {
                return new OrderPeriods(this);
            } 

        } 

    }
    public static class ProductSku extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("Code")
        private String code;

        @NameInMap("Constraints")
        private String constraints;

        @NameInMap("Hidden")
        private Boolean hidden;

        @NameInMap("Modules")
        private Modules modules;

        @NameInMap("Name")
        private String name;

        @NameInMap("OrderPeriods")
        private OrderPeriods orderPeriods;

        private ProductSku(Builder builder) {
            this.chargeType = builder.chargeType;
            this.code = builder.code;
            this.constraints = builder.constraints;
            this.hidden = builder.hidden;
            this.modules = builder.modules;
            this.name = builder.name;
            this.orderPeriods = builder.orderPeriods;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductSku create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return constraints
         */
        public String getConstraints() {
            return this.constraints;
        }

        /**
         * @return hidden
         */
        public Boolean getHidden() {
            return this.hidden;
        }

        /**
         * @return modules
         */
        public Modules getModules() {
            return this.modules;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orderPeriods
         */
        public OrderPeriods getOrderPeriods() {
            return this.orderPeriods;
        }

        public static final class Builder {
            private String chargeType; 
            private String code; 
            private String constraints; 
            private Boolean hidden; 
            private Modules modules; 
            private String name; 
            private OrderPeriods orderPeriods; 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Constraints.
             */
            public Builder constraints(String constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * Hidden.
             */
            public Builder hidden(Boolean hidden) {
                this.hidden = hidden;
                return this;
            }

            /**
             * Modules.
             */
            public Builder modules(Modules modules) {
                this.modules = modules;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OrderPeriods.
             */
            public Builder orderPeriods(OrderPeriods orderPeriods) {
                this.orderPeriods = orderPeriods;
                return this;
            }

            public ProductSku build() {
                return new ProductSku(this);
            } 

        } 

    }
    public static class ProductSkus extends TeaModel {
        @NameInMap("ProductSku")
        private java.util.List < ProductSku> productSku;

        private ProductSkus(Builder builder) {
            this.productSku = builder.productSku;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductSkus create() {
            return builder().build();
        }

        /**
         * @return productSku
         */
        public java.util.List < ProductSku> getProductSku() {
            return this.productSku;
        }

        public static final class Builder {
            private java.util.List < ProductSku> productSku; 

            /**
             * ProductSku.
             */
            public Builder productSku(java.util.List < ProductSku> productSku) {
                this.productSku = productSku;
                return this;
            }

            public ProductSkus build() {
                return new ProductSkus(this);
            } 

        } 

    }
    public static class Telephones extends TeaModel {
        @NameInMap("Telephone")
        private java.util.List < String > telephone;

        private Telephones(Builder builder) {
            this.telephone = builder.telephone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Telephones create() {
            return builder().build();
        }

        /**
         * @return telephone
         */
        public java.util.List < String > getTelephone() {
            return this.telephone;
        }

        public static final class Builder {
            private java.util.List < String > telephone; 

            /**
             * Telephone.
             */
            public Builder telephone(java.util.List < String > telephone) {
                this.telephone = telephone;
                return this;
            }

            public Telephones build() {
                return new Telephones(this);
            } 

        } 

    }
    public static class WangWang extends TeaModel {
        @NameInMap("Remark")
        private String remark;

        @NameInMap("UserName")
        private String userName;

        private WangWang(Builder builder) {
            this.remark = builder.remark;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WangWang create() {
            return builder().build();
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String remark; 
            private String userName; 

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public WangWang build() {
                return new WangWang(this);
            } 

        } 

    }
    public static class WangWangs extends TeaModel {
        @NameInMap("WangWang")
        private java.util.List < WangWang> wangWang;

        private WangWangs(Builder builder) {
            this.wangWang = builder.wangWang;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WangWangs create() {
            return builder().build();
        }

        /**
         * @return wangWang
         */
        public java.util.List < WangWang> getWangWang() {
            return this.wangWang;
        }

        public static final class Builder {
            private java.util.List < WangWang> wangWang; 

            /**
             * WangWang.
             */
            public Builder wangWang(java.util.List < WangWang> wangWang) {
                this.wangWang = wangWang;
                return this;
            }

            public WangWangs build() {
                return new WangWangs(this);
            } 

        } 

    }
    public static class ShopInfo extends TeaModel {
        @NameInMap("Emails")
        private String emails;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Telephones")
        private Telephones telephones;

        @NameInMap("WangWangs")
        private WangWangs wangWangs;

        private ShopInfo(Builder builder) {
            this.emails = builder.emails;
            this.id = builder.id;
            this.name = builder.name;
            this.telephones = builder.telephones;
            this.wangWangs = builder.wangWangs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShopInfo create() {
            return builder().build();
        }

        /**
         * @return emails
         */
        public String getEmails() {
            return this.emails;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return telephones
         */
        public Telephones getTelephones() {
            return this.telephones;
        }

        /**
         * @return wangWangs
         */
        public WangWangs getWangWangs() {
            return this.wangWangs;
        }

        public static final class Builder {
            private String emails; 
            private Long id; 
            private String name; 
            private Telephones telephones; 
            private WangWangs wangWangs; 

            /**
             * Emails.
             */
            public Builder emails(String emails) {
                this.emails = emails;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Telephones.
             */
            public Builder telephones(Telephones telephones) {
                this.telephones = telephones;
                return this;
            }

            /**
             * WangWangs.
             */
            public Builder wangWangs(WangWangs wangWangs) {
                this.wangWangs = wangWangs;
                return this;
            }

            public ShopInfo build() {
                return new ShopInfo(this);
            } 

        } 

    }
}
