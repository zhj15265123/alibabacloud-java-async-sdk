// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmAddressPoolAvailableConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeDnsGtmAddressPoolAvailableConfigRequest</p>
 */
public class DescribeDnsGtmAddressPoolAvailableConfigRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    private DescribeDnsGtmAddressPoolAvailableConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmAddressPoolAvailableConfigRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeDnsGtmAddressPoolAvailableConfigRequest, Builder> {
        private String instanceId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDnsGtmAddressPoolAvailableConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The language to return some response parameters. Default value: en. Valid values: en, zh, and ja.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeDnsGtmAddressPoolAvailableConfigRequest build() {
            return new DescribeDnsGtmAddressPoolAvailableConfigRequest(this);
        } 

    } 

}
