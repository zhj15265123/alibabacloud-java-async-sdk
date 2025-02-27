// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ForceSwitchRequest} extends {@link RequestModel}
 *
 * <p>ForceSwitchRequest</p>
 */
public class ForceSwitchRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("fsmId")
    @Validation(required = true)
    private String fsmId;

    private ForceSwitchRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.fsmId = builder.fsmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForceSwitchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return fsmId
     */
    public String getFsmId() {
        return this.fsmId;
    }

    public static final class Builder extends Request.Builder<ForceSwitchRequest, Builder> {
        private String instanceId; 
        private String fsmId; 

        private Builder() {
            super();
        } 

        private Builder(ForceSwitchRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.fsmId = request.fsmId;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the task.
         */
        public Builder fsmId(String fsmId) {
            this.putPathParameter("fsmId", fsmId);
            this.fsmId = fsmId;
            return this;
        }

        @Override
        public ForceSwitchRequest build() {
            return new ForceSwitchRequest(this);
        } 

    } 

}
