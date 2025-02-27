// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAppRequest} extends {@link RequestModel}
 *
 * <p>RemoveAppRequest</p>
 */
public class RemoveAppRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("appId")
    @Validation(required = true)
    private Integer appId;

    private RemoveAppRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return appId
     */
    public Integer getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<RemoveAppRequest, Builder> {
        private String appGroupIdentity; 
        private Integer appId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveAppRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.appId = request.appId;
        } 

        /**
         * "my_app_group_name"
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * 110116134
         */
        public Builder appId(Integer appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public RemoveAppRequest build() {
            return new RemoveAppRequest(this);
        } 

    } 

}
