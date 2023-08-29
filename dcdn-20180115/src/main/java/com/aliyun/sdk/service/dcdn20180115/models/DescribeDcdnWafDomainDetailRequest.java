// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafDomainDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafDomainDetailRequest</p>
 */
public class DescribeDcdnWafDomainDetailRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    private DescribeDcdnWafDomainDetailRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafDomainDetailRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnWafDomainDetailRequest, Builder> {
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnWafDomainDetailRequest request) {
            super(request);
            this.domainName = request.domainName;
        } 

        /**
         * The accelerated domain name. You can specify only one domain name in each request. Exact match is supported.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public DescribeDcdnWafDomainDetailRequest build() {
            return new DescribeDcdnWafDomainDetailRequest(this);
        } 

    } 

}
