// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainNsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainNsRequest</p>
 */
public class DescribeDomainNsRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    private DescribeDomainNsRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainNsRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeDomainNsRequest, Builder> {
        private String domainName; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainNsRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
        } 

        /**
         * Indicates whether all the name servers were Alibaba Cloud DNS servers.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The domain name that you want to resolve.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeDomainNsRequest build() {
            return new DescribeDomainNsRequest(this);
        } 

    } 

}
