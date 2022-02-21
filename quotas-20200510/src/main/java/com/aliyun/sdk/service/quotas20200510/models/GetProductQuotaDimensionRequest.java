// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductQuotaDimensionRequest} extends {@link RequestModel}
 *
 * <p>GetProductQuotaDimensionRequest</p>
 */
public class GetProductQuotaDimensionRequest extends Request {
    @Body
    @NameInMap("DependentDimensions")
    private java.util.List < DependentDimensions> dependentDimensions;

    @Body
    @NameInMap("DimensionKey")
    private String dimensionKey;

    @Body
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    private GetProductQuotaDimensionRequest(Builder builder) {
        super(builder);
        this.dependentDimensions = builder.dependentDimensions;
        this.dimensionKey = builder.dimensionKey;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductQuotaDimensionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dependentDimensions
     */
    public java.util.List < DependentDimensions> getDependentDimensions() {
        return this.dependentDimensions;
    }

    /**
     * @return dimensionKey
     */
    public String getDimensionKey() {
        return this.dimensionKey;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<GetProductQuotaDimensionRequest, Builder> {
        private java.util.List < DependentDimensions> dependentDimensions; 
        private String dimensionKey; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(GetProductQuotaDimensionRequest response) {
            super(response);
            this.dependentDimensions = response.dependentDimensions;
            this.dimensionKey = response.dimensionKey;
            this.productCode = response.productCode;
        } 

        /**
         * DependentDimensions.
         */
        public Builder dependentDimensions(java.util.List < DependentDimensions> dependentDimensions) {
            this.putBodyParameter("DependentDimensions", dependentDimensions);
            this.dependentDimensions = dependentDimensions;
            return this;
        }

        /**
         * DimensionKey.
         */
        public Builder dimensionKey(String dimensionKey) {
            this.putBodyParameter("DimensionKey", dimensionKey);
            this.dimensionKey = dimensionKey;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public GetProductQuotaDimensionRequest build() {
            return new GetProductQuotaDimensionRequest(this);
        } 

    } 

    public static class DependentDimensions extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private DependentDimensions(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DependentDimensions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DependentDimensions build() {
                return new DependentDimensions(this);
            } 

        } 

    }
}
