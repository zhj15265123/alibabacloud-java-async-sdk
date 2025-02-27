// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListProjectRequest} extends {@link RequestModel}
 *
 * <p>ListProjectRequest</p>
 */
public class ListProjectRequest extends Request {
    @Path
    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("offset")
    private Integer offset;

    @Query
    @NameInMap("projectName")
    private String projectName;

    @Query
    @NameInMap("size")
    private Integer size;

    private ListProjectRequest(Builder builder) {
        super(builder);
        this.resourceGroupId = builder.resourceGroupId;
        this.offset = builder.offset;
        this.projectName = builder.projectName;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListProjectRequest, Builder> {
        private String resourceGroupId; 
        private Integer offset; 
        private String projectName; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectRequest request) {
            super(request);
            this.resourceGroupId = request.resourceGroupId;
            this.offset = request.offset;
            this.projectName = request.projectName;
            this.size = request.size;
        } 

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putPathParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * projectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListProjectRequest build() {
            return new ListProjectRequest(this);
        } 

    } 

}
