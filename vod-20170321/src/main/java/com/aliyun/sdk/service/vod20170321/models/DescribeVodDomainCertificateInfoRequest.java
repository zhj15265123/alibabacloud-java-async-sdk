// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodDomainCertificateInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodDomainCertificateInfoRequest</p>
 */
public class DescribeVodDomainCertificateInfoRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeVodDomainCertificateInfoRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainCertificateInfoRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeVodDomainCertificateInfoRequest, Builder> {
        private String domainName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodDomainCertificateInfoRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
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

        @Override
        public DescribeVodDomainCertificateInfoRequest build() {
            return new DescribeVodDomainCertificateInfoRequest(this);
        } 

    } 

}
