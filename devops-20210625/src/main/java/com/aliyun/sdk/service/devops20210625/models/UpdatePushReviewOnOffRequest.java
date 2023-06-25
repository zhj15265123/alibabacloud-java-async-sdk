// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePushReviewOnOffRequest} extends {@link RequestModel}
 *
 * <p>UpdatePushReviewOnOffRequest</p>
 */
public class UpdatePushReviewOnOffRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private Long repositoryId;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("trunkMode")
    @Validation(required = true)
    private Boolean trunkMode;

    private UpdatePushReviewOnOffRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.organizationId = builder.organizationId;
        this.trunkMode = builder.trunkMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePushReviewOnOffRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return trunkMode
     */
    public Boolean getTrunkMode() {
        return this.trunkMode;
    }

    public static final class Builder extends Request.Builder<UpdatePushReviewOnOffRequest, Builder> {
        private Long repositoryId; 
        private String organizationId; 
        private Boolean trunkMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePushReviewOnOffRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.organizationId = request.organizationId;
            this.trunkMode = request.trunkMode;
        } 

        /**
         * repositoryId.
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * trunkMode.
         */
        public Builder trunkMode(Boolean trunkMode) {
            this.putQueryParameter("trunkMode", trunkMode);
            this.trunkMode = trunkMode;
            return this;
        }

        @Override
        public UpdatePushReviewOnOffRequest build() {
            return new UpdatePushReviewOnOffRequest(this);
        } 

    } 

}
