// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLiveLazyPullStreamInfoConfigRequest} extends {@link RequestModel}
 *
 * <p>SetLiveLazyPullStreamInfoConfigRequest</p>
 */
public class SetLiveLazyPullStreamInfoConfigRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PullAppName")
    private String pullAppName;

    @Query
    @NameInMap("PullDomainName")
    @Validation(required = true)
    private String pullDomainName;

    @Query
    @NameInMap("PullProtocol")
    @Validation(required = true)
    private String pullProtocol;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private SetLiveLazyPullStreamInfoConfigRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.pullAppName = builder.pullAppName;
        this.pullDomainName = builder.pullDomainName;
        this.pullProtocol = builder.pullProtocol;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveLazyPullStreamInfoConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pullAppName
     */
    public String getPullAppName() {
        return this.pullAppName;
    }

    /**
     * @return pullDomainName
     */
    public String getPullDomainName() {
        return this.pullDomainName;
    }

    /**
     * @return pullProtocol
     */
    public String getPullProtocol() {
        return this.pullProtocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetLiveLazyPullStreamInfoConfigRequest, Builder> {
        private String appName; 
        private String domainName; 
        private Long ownerId; 
        private String pullAppName; 
        private String pullDomainName; 
        private String pullProtocol; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveLazyPullStreamInfoConfigRequest response) {
            super(response);
            this.appName = response.appName;
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
            this.pullAppName = response.pullAppName;
            this.pullDomainName = response.pullDomainName;
            this.pullProtocol = response.pullProtocol;
            this.regionId = response.regionId;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PullAppName.
         */
        public Builder pullAppName(String pullAppName) {
            this.putQueryParameter("PullAppName", pullAppName);
            this.pullAppName = pullAppName;
            return this;
        }

        /**
         * PullDomainName.
         */
        public Builder pullDomainName(String pullDomainName) {
            this.putQueryParameter("PullDomainName", pullDomainName);
            this.pullDomainName = pullDomainName;
            return this;
        }

        /**
         * PullProtocol.
         */
        public Builder pullProtocol(String pullProtocol) {
            this.putQueryParameter("PullProtocol", pullProtocol);
            this.pullProtocol = pullProtocol;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetLiveLazyPullStreamInfoConfigRequest build() {
            return new SetLiveLazyPullStreamInfoConfigRequest(this);
        } 

    } 

}
