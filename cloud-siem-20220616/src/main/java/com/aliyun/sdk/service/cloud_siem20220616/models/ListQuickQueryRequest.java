// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuickQueryRequest} extends {@link RequestModel}
 *
 * <p>ListQuickQueryRequest</p>
 */
public class ListQuickQueryRequest extends Request {
    @Body
    @NameInMap("Offset")
    private Integer offset;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private ListQuickQueryRequest(Builder builder) {
        super(builder);
        this.offset = builder.offset;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuickQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListQuickQueryRequest, Builder> {
        private Integer offset; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListQuickQueryRequest request) {
            super(request);
            this.offset = request.offset;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putBodyParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListQuickQueryRequest build() {
            return new ListQuickQueryRequest(this);
        } 

    } 

}
