// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetEntityTagsRequest} extends {@link RequestModel}
 *
 * <p>SetEntityTagsRequest</p>
 */
public class SetEntityTagsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("QualifiedName")
    @Validation(required = true)
    private String qualifiedName;

    @Body
    @NameInMap("Tags")
    private java.util.List < UserEntityTag > tags;

    private SetEntityTagsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.qualifiedName = builder.qualifiedName;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetEntityTagsRequest create() {
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
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    /**
     * @return tags
     */
    public java.util.List < UserEntityTag > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<SetEntityTagsRequest, Builder> {
        private String regionId; 
        private String qualifiedName; 
        private java.util.List < UserEntityTag > tags; 

        private Builder() {
            super();
        } 

        private Builder(SetEntityTagsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.qualifiedName = request.qualifiedName;
            this.tags = request.tags;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * QualifiedName.
         */
        public Builder qualifiedName(String qualifiedName) {
            this.putQueryParameter("QualifiedName", qualifiedName);
            this.qualifiedName = qualifiedName;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < UserEntityTag > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putBodyParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public SetEntityTagsRequest build() {
            return new SetEntityTagsRequest(this);
        } 

    } 

}
