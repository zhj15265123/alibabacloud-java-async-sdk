// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodeInstanceTypeRequest} extends {@link RequestModel}
 *
 * <p>ListNodeInstanceTypeRequest</p>
 */
public class ListNodeInstanceTypeRequest extends Request {
    @Query
    @NameInMap("BizRegionId")
    private String bizRegionId;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("NodeInstanceType")
    private String nodeInstanceType;

    @Query
    @NameInMap("OsType")
    private String osType;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    private ListNodeInstanceTypeRequest(Builder builder) {
        super(builder);
        this.bizRegionId = builder.bizRegionId;
        this.language = builder.language;
        this.nodeInstanceType = builder.nodeInstanceType;
        this.osType = builder.osType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeInstanceTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return nodeInstanceType
     */
    public String getNodeInstanceType() {
        return this.nodeInstanceType;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<ListNodeInstanceTypeRequest, Builder> {
        private String bizRegionId; 
        private String language; 
        private String nodeInstanceType; 
        private String osType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(ListNodeInstanceTypeRequest request) {
            super(request);
            this.bizRegionId = request.bizRegionId;
            this.language = request.language;
            this.nodeInstanceType = request.nodeInstanceType;
            this.osType = request.osType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
        } 

        /**
         * BizRegionId.
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * NodeInstanceType.
         */
        public Builder nodeInstanceType(String nodeInstanceType) {
            this.putQueryParameter("NodeInstanceType", nodeInstanceType);
            this.nodeInstanceType = nodeInstanceType;
            return this;
        }

        /**
         * OsType.
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public ListNodeInstanceTypeRequest build() {
            return new ListNodeInstanceTypeRequest(this);
        } 

    } 

}
