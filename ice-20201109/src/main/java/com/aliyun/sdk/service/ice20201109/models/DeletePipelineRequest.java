// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePipelineRequest} extends {@link RequestModel}
 *
 * <p>DeletePipelineRequest</p>
 */
public class DeletePipelineRequest extends Request {
    @Query
    @NameInMap("PipelineId")
    @Validation(required = true)
    private String pipelineId;

    private DeletePipelineRequest(Builder builder) {
        super(builder);
        this.pipelineId = builder.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePipelineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    public static final class Builder extends Request.Builder<DeletePipelineRequest, Builder> {
        private String pipelineId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePipelineRequest request) {
            super(request);
            this.pipelineId = request.pipelineId;
        } 

        /**
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        @Override
        public DeletePipelineRequest build() {
            return new DeletePipelineRequest(this);
        } 

    } 

}
