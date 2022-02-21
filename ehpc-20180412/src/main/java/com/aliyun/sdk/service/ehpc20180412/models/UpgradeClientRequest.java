// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeClientRequest} extends {@link RequestModel}
 *
 * <p>UpgradeClientRequest</p>
 */
public class UpgradeClientRequest extends Request {
    @Query
    @NameInMap("ClientVersion")
    private String clientVersion;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    private UpgradeClientRequest(Builder builder) {
        super(builder);
        this.clientVersion = builder.clientVersion;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeClientRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<UpgradeClientRequest, Builder> {
        private String clientVersion; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeClientRequest response) {
            super(response);
            this.clientVersion = response.clientVersion;
            this.clusterId = response.clusterId;
        } 

        /**
         * ClientVersion.
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public UpgradeClientRequest build() {
            return new UpgradeClientRequest(this);
        } 

    } 

}
