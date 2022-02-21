// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveRecordNotifyConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveRecordNotifyConfigRequest</p>
 */
public class UpdateLiveRecordNotifyConfigRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("NeedStatusNotify")
    private Boolean needStatusNotify;

    @Query
    @NameInMap("NotifyUrl")
    private String notifyUrl;

    @Query
    @NameInMap("OnDemandUrl")
    private String onDemandUrl;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private UpdateLiveRecordNotifyConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.needStatusNotify = builder.needStatusNotify;
        this.notifyUrl = builder.notifyUrl;
        this.onDemandUrl = builder.onDemandUrl;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveRecordNotifyConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return needStatusNotify
     */
    public Boolean getNeedStatusNotify() {
        return this.needStatusNotify;
    }

    /**
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * @return onDemandUrl
     */
    public String getOnDemandUrl() {
        return this.onDemandUrl;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<UpdateLiveRecordNotifyConfigRequest, Builder> {
        private String domainName; 
        private Boolean needStatusNotify; 
        private String notifyUrl; 
        private String onDemandUrl; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveRecordNotifyConfigRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.needStatusNotify = response.needStatusNotify;
            this.notifyUrl = response.notifyUrl;
            this.onDemandUrl = response.onDemandUrl;
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
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
         * NeedStatusNotify.
         */
        public Builder needStatusNotify(Boolean needStatusNotify) {
            this.putQueryParameter("NeedStatusNotify", needStatusNotify);
            this.needStatusNotify = needStatusNotify;
            return this;
        }

        /**
         * NotifyUrl.
         */
        public Builder notifyUrl(String notifyUrl) {
            this.putQueryParameter("NotifyUrl", notifyUrl);
            this.notifyUrl = notifyUrl;
            return this;
        }

        /**
         * OnDemandUrl.
         */
        public Builder onDemandUrl(String onDemandUrl) {
            this.putQueryParameter("OnDemandUrl", onDemandUrl);
            this.onDemandUrl = onDemandUrl;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public UpdateLiveRecordNotifyConfigRequest build() {
            return new UpdateLiveRecordNotifyConfigRequest(this);
        } 

    } 

}
