// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmRecoveryPlanRequest} extends {@link RequestModel}
 *
 * <p>DescribeGtmRecoveryPlanRequest</p>
 */
public class DescribeGtmRecoveryPlanRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RecoveryPlanId")
    @Validation(required = true)
    private Long recoveryPlanId;

    private DescribeGtmRecoveryPlanRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.recoveryPlanId = builder.recoveryPlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmRecoveryPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return recoveryPlanId
     */
    public Long getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    public static final class Builder extends Request.Builder<DescribeGtmRecoveryPlanRequest, Builder> {
        private String lang; 
        private Long recoveryPlanId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGtmRecoveryPlanRequest request) {
            super(request);
            this.lang = request.lang;
            this.recoveryPlanId = request.recoveryPlanId;
        } 

        /**
         * The language used by the user.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the disaster recovery plan that you want to query.
         */
        public Builder recoveryPlanId(Long recoveryPlanId) {
            this.putQueryParameter("RecoveryPlanId", recoveryPlanId);
            this.recoveryPlanId = recoveryPlanId;
            return this;
        }

        @Override
        public DescribeGtmRecoveryPlanRequest build() {
            return new DescribeGtmRecoveryPlanRequest(this);
        } 

    } 

}
