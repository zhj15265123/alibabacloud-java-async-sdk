// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckCloudResourceAuthorizedResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCloudResourceAuthorizedResponseBody</p>
 */
public class CheckCloudResourceAuthorizedResponseBody extends TeaModel {
    @NameInMap("AuthorizationState")
    private Integer authorizationState;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoleArn")
    private String roleArn;

    private CheckCloudResourceAuthorizedResponseBody(Builder builder) {
        this.authorizationState = builder.authorizationState;
        this.requestId = builder.requestId;
        this.roleArn = builder.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCloudResourceAuthorizedResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorizationState
     */
    public Integer getAuthorizationState() {
        return this.authorizationState;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static final class Builder {
        private Integer authorizationState; 
        private String requestId; 
        private String roleArn; 

        /**
         * The authorization status. Valid values:
         * <p>
         * 
         * *   **1**: authorized
         * *   **0**: not authorized
         */
        public Builder authorizationState(Integer authorizationState) {
            this.authorizationState = authorizationState;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the RAM role. A RAM role is a virtual identity that you can create within your Alibaba Cloud account. For more information, see [RAM role overview](~~93689~~).
         * <p>
         * 
         * >  This parameter is available only when the instance runs MySQL.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public CheckCloudResourceAuthorizedResponseBody build() {
            return new CheckCloudResourceAuthorizedResponseBody(this);
        } 

    } 

}
