// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMetaCategoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetaCategoryRequest</p>
 */
public class UpdateMetaCategoryRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("CategoryId")
    @Validation(required = true)
    private Long categoryId;

    @Body
    @NameInMap("Comment")
    private String comment;

    @Body
    @NameInMap("Name")
    private String name;

    private UpdateMetaCategoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.categoryId = builder.categoryId;
        this.comment = builder.comment;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetaCategoryRequest create() {
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
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateMetaCategoryRequest, Builder> {
        private String regionId; 
        private Long categoryId; 
        private String comment; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetaCategoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.categoryId = request.categoryId;
            this.comment = request.comment;
            this.name = request.name;
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
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateMetaCategoryRequest build() {
            return new UpdateMetaCategoryRequest(this);
        } 

    } 

}
