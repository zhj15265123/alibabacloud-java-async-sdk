// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDedicatedLineRequest} extends {@link RequestModel}
 *
 * <p>GetDedicatedLineRequest</p>
 */
public class GetDedicatedLineRequest extends Request {
    @Query
    @NameInMap("DedicatedLineId")
    @Validation(required = true)
    private String dedicatedLineId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetDedicatedLineRequest(Builder builder) {
        super(builder);
        this.dedicatedLineId = builder.dedicatedLineId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDedicatedLineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dedicatedLineId
     */
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetDedicatedLineRequest, Builder> {
        private String dedicatedLineId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDedicatedLineRequest request) {
            super(request);
            this.dedicatedLineId = request.dedicatedLineId;
            this.instanceId = request.instanceId;
        } 

        /**
         * DedicatedLineId.
         */
        public Builder dedicatedLineId(String dedicatedLineId) {
            this.putQueryParameter("DedicatedLineId", dedicatedLineId);
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetDedicatedLineRequest build() {
            return new GetDedicatedLineRequest(this);
        } 

    } 

}
