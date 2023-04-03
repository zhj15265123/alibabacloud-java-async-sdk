// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeGtmInstanceRequest</p>
 */
public class DescribeGtmInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NeedDetailAttributes")
    private Boolean needDetailAttributes;

    private DescribeGtmInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.needDetailAttributes = builder.needDetailAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmInstanceRequest create() {
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

    /**
     * @return needDetailAttributes
     */
    public Boolean getNeedDetailAttributes() {
        return this.needDetailAttributes;
    }

    public static final class Builder extends Request.Builder<DescribeGtmInstanceRequest, Builder> {
        private String instanceId; 
        private String lang; 
        private Boolean needDetailAttributes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGtmInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.needDetailAttributes = request.needDetailAttributes;
        } 

        /**
         * The ID of the GTM instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The language of the values of specific response parameters.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Specifies whether additional information is required. Default value: **false**. If the value is **true**, the AccessStrategyNum and AddressPoolNum parameters are returned.
         */
        public Builder needDetailAttributes(Boolean needDetailAttributes) {
            this.putQueryParameter("NeedDetailAttributes", needDetailAttributes);
            this.needDetailAttributes = needDetailAttributes;
            return this;
        }

        @Override
        public DescribeGtmInstanceRequest build() {
            return new DescribeGtmInstanceRequest(this);
        } 

    } 

}
