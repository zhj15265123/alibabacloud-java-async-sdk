// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagResourcesRequest} extends {@link RequestModel}
 *
 * <p>TagResourcesRequest</p>
 */
public class TagResourcesRequest extends Request {
    @Body
    @NameInMap("region_id")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("resource_ids")
    @Validation(required = true)
    private java.util.List < String > resourceIds;

    @Body
    @NameInMap("resource_type")
    @Validation(required = true)
    private String resourceType;

    @Body
    @NameInMap("tags")
    @Validation(required = true)
    private java.util.List < Tag > tags;

    private TagResourcesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceIds = builder.resourceIds;
        this.resourceType = builder.resourceType;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceIds
     */
    public java.util.List < String > getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tags
     */
    public java.util.List < Tag > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<TagResourcesRequest, Builder> {
        private String regionId; 
        private java.util.List < String > resourceIds; 
        private String resourceType; 
        private java.util.List < Tag > tags; 

        private Builder() {
            super();
        } 

        private Builder(TagResourcesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
            this.tags = request.tags;
        } 

        /**
         * The region ID of the resource.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("region_id", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The IDs of the resources that you want to label.
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.putBodyParameter("resource_ids", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * The type of resource that you want to label. Set the value to `CLUSTER`.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("resource_type", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The labels that you want to add to the resources in key-value pairs. You can add up to 20 labels. Note:
         * <p>
         * 
         * *   A value cannot be empty and can contain up to 128 characters.
         * *   A key or value must not start with `aliyun` or `acs:`.
         * *   A key or value must not contain `http://` or `https://`.
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public TagResourcesRequest build() {
            return new TagResourcesRequest(this);
        } 

    } 

}
