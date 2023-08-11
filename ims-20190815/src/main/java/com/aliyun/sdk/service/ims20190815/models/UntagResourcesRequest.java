// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UntagResourcesRequest} extends {@link RequestModel}
 *
 * <p>UntagResourcesRequest</p>
 */
public class UntagResourcesRequest extends Request {
    @Query
    @NameInMap("All")
    private Boolean all;

    @Query
    @NameInMap("ResourceId")
    private java.util.List < String > resourceId;

    @Query
    @NameInMap("ResourcePrincipalName")
    private java.util.List < String > resourcePrincipalName;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("TagKey")
    private java.util.List < String > tagKey;

    private UntagResourcesRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.resourceId = builder.resourceId;
        this.resourcePrincipalName = builder.resourcePrincipalName;
        this.resourceType = builder.resourceType;
        this.tagKey = builder.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return resourceId
     */
    public java.util.List < String > getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourcePrincipalName
     */
    public java.util.List < String > getResourcePrincipalName() {
        return this.resourcePrincipalName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tagKey
     */
    public java.util.List < String > getTagKey() {
        return this.tagKey;
    }

    public static final class Builder extends Request.Builder<UntagResourcesRequest, Builder> {
        private Boolean all; 
        private java.util.List < String > resourceId; 
        private java.util.List < String > resourcePrincipalName; 
        private String resourceType; 
        private java.util.List < String > tagKey; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourcesRequest request) {
            super(request);
            this.all = request.all;
            this.resourceId = request.resourceId;
            this.resourcePrincipalName = request.resourcePrincipalName;
            this.resourceType = request.resourceType;
            this.tagKey = request.tagKey;
        } 

        /**
         * Specifies whether to remove all tags from the resource. Valid values:
         * <p>
         * 
         * *   true: remove all tags from the resources.
         * *   false (default): does not remove all tags from the resources.
         * 
         * > This parameter takes effect only when TagKey.N is not set in the request.
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * The IDs of resources.
         * <p>
         * 
         * Valid values of N: 1 to 50. If the ResourceType parameter is set to user, the resource ID is the ID of the RAM user.
         * 
         * > You must specify only one of the following parameters: ResourceId and ResourcePrincipalName.
         */
        public Builder resourceId(java.util.List < String > resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The names of resources.
         * <p>
         * 
         * Valid values of N: 1 to 50. If the ResourceType parameter is set to user, the resource name is the name of the RAM user.
         * 
         * > You must specify only one of the following parameters: ResourceId and ResourcePrincipalName.
         */
        public Builder resourcePrincipalName(java.util.List < String > resourcePrincipalName) {
            this.putQueryParameter("ResourcePrincipalName", resourcePrincipalName);
            this.resourcePrincipalName = resourcePrincipalName;
            return this;
        }

        /**
         * The type of the resource. Valid value:
         * <p>
         * 
         * *   user: a RAM user
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The tag keys of resources.
         * <p>
         * 
         * Valid values of N: 1 to 20. N must be consecutive.
         */
        public Builder tagKey(java.util.List < String > tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        @Override
        public UntagResourcesRequest build() {
            return new UntagResourcesRequest(this);
        } 

    } 

}
